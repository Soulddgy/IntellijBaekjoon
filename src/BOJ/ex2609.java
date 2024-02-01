package BOJ;
import java.util.Scanner;
public class ex2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
        int lcm = a*b/gcd(a,b);
        System.out.println(lcm);



    }
    static int gcd(int a, int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

}
