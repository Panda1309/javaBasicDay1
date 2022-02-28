import java.util.Scanner;
public class ASCII
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character to print ASCII value");
        char c = sc.next().charAt(0);
        int ascii = c;
        System.out.println(ascii);
    }
}