public class Order {

    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void display() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }

    public class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tracking Number : " + trackingNumber);
    }
}
}