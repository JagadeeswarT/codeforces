import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/318/A"/>
 */
public class EvenOdds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        if(k<=(n+1)/2){
            System.out.println(k*2-1);
        }else{
            System.out.println((k-(n+1)/2)*2);
        }
    }
}
