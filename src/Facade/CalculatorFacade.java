package Facade;

// Clase que actúa como fachada para otros servicios
public class CalculatorFacade {

    // Servicios subyacentes
    private AdditionService additionService;
    private MultiplicationService multiplicationService;

    public CalculatorFacade() {
        additionService = new AdditionService();
        multiplicationService = new MultiplicationService();
    }

    // Interfaz simplificada para realizar una operación de suma
    public int add(int num1, int num2) {
        return additionService.add(num1, num2);
    }

    // Interfaz simplificada para realizar una operación de multiplicación
    public int multiply(int num1, int num2) {
        return multiplicationService.multiply(num1, num2);
    }
}

