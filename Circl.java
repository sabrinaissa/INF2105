import java.util.Scanner;

public class Circl {
    public static void main(String[] args) {
        final double Pi = 3.14159;
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = input.nextDouble();

        double diameter = 2 * radius;
        System.out.println("Diameter of circle is: " + diameter);
        double circumference = 2 * Pi * radius;
        System.out.println("Circumference is : " + circumference);
        double area = Pi * radius*radius;
        System.out.println("Area is: " + area);

    }
}

OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Circl.java  
PS C:\Users\SABRINA\Desktop\javaquestions> java Circl        
Enter radius of circle: 
6
Diameter of circle is: 12.0
Circumference is : 37.699079999999995
Area is: 113.09723999999999
PS C:\Users\SABRINA\Desktop\javaquestions> 