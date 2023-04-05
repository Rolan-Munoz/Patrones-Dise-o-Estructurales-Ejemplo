package Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redSquare = new RedShapeDecorator(new Square());

        System.out.println("Drawing circle:");
        circle.draw();

        System.out.println("\nDrawing red circle:");
        redCircle.draw();

        System.out.println("\nDrawing red square:");
        redSquare.draw();
    }
}
