import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles: ");
        double miles = input.nextDouble();
        System.out.println("Enter number of gallon of gas: ");
        double gallon = input.nextDouble();
        double MPG = (miles / gallon);
        System.out.println("Miles per gallon is: " + MPG);
    }
}

OUTPUTPS C:\Users\SABRINA\Desktop\javaquestions> javac Miles.java
PS C:\Users\SABRINA\Desktop\javaquestions> java Miles
Enter number of miles: 
19
Enter number of gallon of gas: 
3
Miles per gallon is: 6.333333333333333
PS C:\Users\SABRINA\Desktop\javaquestions> 
