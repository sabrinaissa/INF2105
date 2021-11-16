import java.util.Scanner;

public class Operant {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("First number: ");
       double number1 = input.nextDouble();
       System.out.println("Second number: ");
       double number2 = input.nextDouble();
       double sumation = number1 + number2;
       System.out.println("sum is : " +sumation);
       double multiple = number1*number2;
       System.out.println("Product is : " + multiple);
       double difference = number1 - number2;
       System.out.println("Th difference is: " + difference);
       double division = number1 / number2;
       System.out.println("The division is: " + division);
   } 
}

OUPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Operant.java
PS C:\Users\SABRINA\Desktop\javaquestions> java Operant      
First number:
20
Second number:
10
sum is : 30.0
Product is : 200.0
Th difference is: 10.0
The division is: 2.0
