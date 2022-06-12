import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/791/A"/>
 */
public class BearAndBigBrother {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int countYears=0;
        while(a<=b){
            countYears++;
            a=a*3;
            b=b*2;
        }
        System.out.println(countYears);
    }
}
