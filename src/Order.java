import java.time.LocalDate;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;

    public Order(long id, String status, LocalDate orderDate) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
    }

    public Order(long id, String sakalatka, Object o) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
