import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/580/A"/>
 */
public class KefaAndFirstSteps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int maxCount=1;
        int count=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }else{
                count=1;
            }
        }
        System.out.println(maxCount);


    }
}
