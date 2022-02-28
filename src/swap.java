import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        /*int temp;
        temp=num1;
        num1=num2;
        num2=temp;*/
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Swapped numbers = "+num1);
        System.out.println(num2);
    }
}
