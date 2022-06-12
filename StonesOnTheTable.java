import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/266/A"/>
 *
 */
public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfStones=sc.nextInt();
        String colors=sc.next();
        char[] arr=colors.toCharArray();
        int count=0;
        for(int i=1;i<colors.length();i++){
            if(arr[i]==arr[i-1]){
                ++count;
            }
        }
        System.out.println(count);
    }
}
