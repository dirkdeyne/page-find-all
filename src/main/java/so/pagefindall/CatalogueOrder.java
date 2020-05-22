package so.pagefindall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CatalogueOrder {
    @Id
    private Long id;
    private String name;
    private String orderStatus;

    public CatalogueOrder(){}

    public CatalogueOrder(Long id, String name, String orderStatus) {
        this.id = id;
        this.name = name;
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
