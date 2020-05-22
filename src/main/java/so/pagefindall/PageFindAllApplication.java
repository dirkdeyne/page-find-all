package so.pagefindall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PageFindAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageFindAllApplication.class, args);
	}

	@Autowired
	CatalogueOrderRepository repo;

	@EventListener(ApplicationReadyEvent.class)
	public void init() {
		Set<CatalogueOrder> orders = new HashSet<>();
		for (Long number=1L; number<=100; number++) {
			CatalogueOrder co = new CatalogueOrder(number, "order_" + number, (number%2 == 0) ? "ready" : "delayed" );
			orders.add(co);
		}
		repo.saveAll(orders);
	}
}
