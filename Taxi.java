import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/158/B"/>
 */

//Pending
public class Taxi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }

        System.out.println((int)Math.ceil(sum/4));

    }
}
