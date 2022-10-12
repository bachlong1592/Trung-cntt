package Pizza;

public class PizzaClient {
    public void run() {
        Pizza circle1 = new Pizza(10, new Circle(3));
        Pizza rectangle1 = new Pizza(7.5, new Rectangle(3, 10));
        PizzaDeal gia1 = new PizzaDeal();
        System.out.println(circle1 + " Gia tot hon " + rectangle1 + ": " + gia1.betterDeal(circle1, rectangle1));
    }
    public static void main(String[] args) {
        new PizzaClient().run();
    }
}
