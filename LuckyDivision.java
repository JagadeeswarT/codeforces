import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/122/A"/>
 */
public class LuckyDivision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int[] arr={4,7,44,47,74,77,444,477,447,474,777,744,774,747};
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
