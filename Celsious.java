import java.util.Scanner;

public class Celsious {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        double celc = input.nextDouble();
        double F = (9/5) * celc +32;
        System.out.println("Fahrenheit is: " + F);
    }
}

 
