import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double purch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of purchase: ");
        purch = input.nextDouble();
        System.out.println("The purchase is: " +purch);
        double stateSalestax = purch * 0.04;
        System.out.println("State sales is: " + stateSalestax);
        double countySalestax = purch * 0.02;
        System.out.println("County sales is: " + countySalestax);
        double TotalSalesTax = stateSalestax + countySalestax;
        System.out.println("Total sales tax is: " + TotalSalesTax);
        double TotalofSales = purch + TotalSalesTax;
        System.out.println("Total of sales: " + TotalofSales);
    }
}

OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac SalesTax.java
PS C:\Users\SABRINA\Desktop\javaquestions> java SalesTax      
Enter amount of purchase: 
1000
The purchase is: 1000.0
State sales is: 40.0    
County sales is: 20.0   
Total sales tax is: 60.0
Total of sales: 1060.0  
PS C:\Users\SABRINA\Desktop\javaquestions> 