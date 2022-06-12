import java.util.Scanner;

/**
 *<a href="https://codeforces.com/problemset/problem/486/A"/>
 */
public class CalculatingFunction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long res=0;
        if(n%2==0){
            res=n/2;
        }else{
            res=(-1)*(n/2+1);
        }
        System.out.println(res);
    }
}
