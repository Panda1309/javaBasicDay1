import java.util.Scanner;
public class PrintInteger {
    public static void main(String [] args)
    {
        System.out.println("Enter any integer");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("You have entered  "+num);
    }
}
