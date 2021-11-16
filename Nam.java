import java.util.Scanner;

public class Nam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firsname = input.nextLine();
        System.out.println("Enter last name: ");
        String lastname = input.nextLine();

        System.out.println("Welcome " + firsname +" "+ lastname + '!');
    }
}


OUTPUT
PS C:\Users\SABRINA\Desktop\javaquestions> javac Nam.java  
PS C:\Users\SABRINA\Desktop\javaquestions> java Nam.java 
Enter first name: 
sabrina
Enter last name: 
issa
Welcome sabrina issa!
