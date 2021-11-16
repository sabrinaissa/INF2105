import java.util.Scanner;

public class Tipp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter charge of food: ");
        double charge = input.nextDouble();
        double Tipp= charge * 0.15;
        System.out.println("Tip is: " + Tipp);
        double Taxee = charge * 0.07;
        System.out.println("tax is: " + Taxee);
        double totaltaxee =  Tipp + Taxee;
        System.out.println("Total is : " + totaltaxee);
    }
}

 OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Tipp.java
PS C:\Users\SABRINA\Desktop\javaquestions> java Tipp      
Enter charge of food: 
50000
Tip is: 7500.0
tax is: 3500.0000000000005
Total is : 11000.0
PS C:\Users\SABRINA\Desktop\javaquestions>
