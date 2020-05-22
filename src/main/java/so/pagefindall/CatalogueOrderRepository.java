package so.pagefindall;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RepositoryRestResource
public interface CatalogueOrderRepository extends JpaRepository<CatalogueOrder, Long>,QuerydslPredicateExecutor<CatalogueOrder> {

    @GetMapping("/orderStatusNot")
    Page<CatalogueOrder> findByOrderStatusNot(String orderStatus, Pageable page);
}