import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("First integer: ");
        double x = input.nextDouble();
        System.out.println("Second integer: ");
        double y = input.nextDouble();

        double quotient = x / y;
        System.out.println("Quotient is: " + quotient);
        double remainder = x % y;
        System.out.println("remainder is: " + remainder);
    }
}

OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Integer.java  
PS C:\Users\SABRINA\Desktop\javaquestions> java Integer        
First integer: 
20
Second integer: 
5
Quotient is: 4.0
remainder is: 0.0
PS C:\Users\SABRINA\Desktop\javaquestions> 
