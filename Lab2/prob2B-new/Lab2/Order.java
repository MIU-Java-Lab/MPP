package Lab2;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String[] QUALITIES = {"good", "bad"};

    private int orderNum;
    private String orderDate;
    private List<OrderLine> orderLines;

    public Order(int id, String date) {
        orderNum = id;
        orderDate = date;
        orderLines = new ArrayList<>();
    }

    public void addOrderLine(Order order, int id, double price, String quality) {
        OrderLine line = new OrderLine(order, id, price, quality);
        orderLines.add(line);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void printOrderLineInfo() {
        for (int i=0; i<orderLines.size(); i++) {
            OrderLine line = orderLines.get(i);
            System.out.println(line.getOrderLineInfo());
        }
    }

    public String getOrderInfo() {
        return "Order Info: " + orderNum + "; " + orderDate;
    }
}
