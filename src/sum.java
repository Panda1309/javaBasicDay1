import java.sql.SQLOutput;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        System.out.println("Sum "+(num1+num2));

    }
}
