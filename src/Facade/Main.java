package Facade;

// Clase principal donde se usa la fachada para realizar una operación de suma y una operación de multiplicación
public class Main {

    public static void main(String[] args) {
        CalculatorFacade calculatorFacade = new CalculatorFacade();

        int result1 = calculatorFacade.add(2, 3);
        System.out.println("2 + 3 = " + result1);

        int result2 = calculatorFacade.multiply(4, 5);
        System.out.println("4 * 5 = " + result2);
    }
}
