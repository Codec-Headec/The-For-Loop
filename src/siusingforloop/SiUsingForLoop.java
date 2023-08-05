package siusingforloop;
import java.util.*;

public class SiUsingForLoop{
    public static void main(String[] args) {
        float p, r, si;
        int n, count;
        Scanner sc;

        sc = new Scanner(System.in);
        for (count = 1; count <= 3; count++)
        {
            System.out.println("Enter value of p, n, and r:");
            p = sc.nextFloat();
            n = sc.nextInt();
            r = sc.nextFloat();
            si = p * n * r / 100;
            System.out.println("Simple Interest = Rs."+si);
        }
    }
}