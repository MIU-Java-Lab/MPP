package Lab2;

public class OrderLine {
    private int orderLineNum;
    private double price;
    private String quality;

    private Order order;

     OrderLine(Order orderRef, int id, double price, String quality) {
        this.orderLineNum = id;
        this.price = price;
        this.quality = quality;
        order = orderRef;
    }

    public void printOrderInfo() {
        System.out.println(order.getOrderInfo());
    }

    public String getOrderLineInfo() {
        return "Line id: " + Integer.toString(orderLineNum) + "\n" + "Line price: " + price + "\n" + "Quality: " + quality;
    }
}
