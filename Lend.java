import java.util.Scanner;

public class Lend {
    public static void main(String[] args) {
        double totalAcre;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total square feet of land: ");
        double squareFeet = input.nextDouble();
        totalAcre = squareFeet/43560;
        System.out.println("Total acres is: " + totalAcre);
    }
}


OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Lend.java
PS C:\Users\SABRINA\Desktop\javaquestions> java Lend      
Enter total square feet of land: 
238990
Total acres is: 5.486455463728191
