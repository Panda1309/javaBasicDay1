import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all three co-efficients of Quadratic equation");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        double d=((b*b)-(4*a*c));
        if(d>0)
        {
            double sq=Math.sqrt(d);
            double r1=(-b+sq)/(2*a);
            double r2=(-b-sq)/(2*a);
            System.out.println("Both roots are Different");
            System.out.println("Root 1 = "+r1);
            System.out.println("Root 2 = "+r2);
        }
        else if(d==0)
        {
            System.out.println("Both roots are equal");
            double sq=Math.sqrt(d);
            double r1=(-b+sq)/(2*a);
            double r2=r1;
            System.out.println("Roots are "+r1);
        }
        else
            System.out.println("Can't find the roots because roots are imaginary");
    }
}
