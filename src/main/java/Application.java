import coffee.order.CoffeeOrderBoard;

public class Application {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add("Petro Petrovich");
        orderBoard.add("Vasya");
        orderBoard.add("Vlada");
        orderBoard.add("Bob Marley");
        orderBoard.add("Petro Petrovith");

        orderBoard.draw();
        System.out.println("\nDeliveryng next order: ");
        orderBoard.deliver();
        orderBoard.draw();
        System.out.println("\nDeliveryng order with number: ");
        orderBoard.deliver(3);
        orderBoard.draw();
    }
}
