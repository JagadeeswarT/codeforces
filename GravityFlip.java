import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/405/A"/>
 */
public class GravityFlip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
