import java.util.Arrays;
import java.util.Scanner;


/**
 * <a href="https://codeforces.com/problemset/problem/160/A"/>
 */
public class Twins {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalNumberOfCoins=sc.nextInt();
        int[] arr=new int[totalNumberOfCoins];
        int totalValueOfCoins=0;
        for(int i=0;i<totalNumberOfCoins;i++){
            arr[i]=sc.nextInt();
            totalValueOfCoins+=arr[i];
        }
        totalValueOfCoins/=2;
        Arrays.sort(arr);
        int coinsCount=0;
        int total=0;
        for(int i=totalNumberOfCoins-1;i>0;i--){
            total+=arr[i];
            if(total>totalValueOfCoins){
                break;
            }else{
                coinsCount++;
            }
        }
        System.out.println(coinsCount+1);
    }
}
