import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int answer = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int operand1 = scanner.nextInt();
        System.out.println("What operation?");
        char operation = scanner.next().charAt(0);
        System.out.println("Enter second number:");
        int operand2 = scanner.nextInt();

        switch (operation) {
            case '+' : answer = operand1 + operand2;
                break;
            case '-' : answer = operand1 - operand2;
                break;
            case '*' : answer = operand1 * operand2;
                break;
            case '/' : answer = operand1 / operand2;
                break;
            default:
                System.out.println("I don’t know these symbols:(");
        };
        System.out.println(operand1+" "+operation+" "+operand2+" = "+answer);
    }
}
