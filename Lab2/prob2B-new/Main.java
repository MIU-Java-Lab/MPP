import Lab2.Order;
import Lab2.OrderLine;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(5, "29 November");

        order.addOrderLine(order, 1, 1.2, "good");
        order.addOrderLine(order,2, 2.2, "bad");

        order.printOrderLineInfo();

        List<OrderLine> orderLines = order.getOrderLines();
        OrderLine firstOrderLine = orderLines.get(0);

        firstOrderLine.printOrderInfo();
    }
}