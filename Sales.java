import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        double profite;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total amount of sales: ");
        double TotalSales = input.nextDouble();
        profite = TotalSales* 0.23;
        System.out.println("Profit is: " + profite);

    }
}

OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Sales.java
PS C:\Users\SABRINA\Desktop\javaquestions> java Sales      
Enter total amount of sales: 
12
Profit is: 2.7600000000000002
PS C:\Users\SABRINA\Desktop\javaquestions> 
