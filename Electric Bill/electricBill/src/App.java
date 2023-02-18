import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Previous Reading: ");
        double previousAmount = input.nextDouble();

        System.out.println("Please Enter Present Reading: ");
        double presentAmount = input.nextDouble();

        double difference = Math.abs(presentAmount - previousAmount);
        System.out.println("Your KiloWatt Per Hour: " + difference);

        System.out.println("Please Enter Total Sales/Billed Amount: ");
        double otherInputAmount = input.nextDouble();

        System.out.println("Please Enter Billed KilloWatt Per Hour: ");
        double otherAmount = input.nextDouble();

        double quotient = Math.abs(otherInputAmount / otherAmount);
        System.out.println("Your Peso/KilloWatt per Hour: " + quotient);

        double result = Math.abs(difference * quotient);

        System.out.println("Your Total Bill Is: " + result);
    }
}
