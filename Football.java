import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/96/A"/>
 */
public class Football {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String playerPositions=sc.next();
        char[] arr=playerPositions.toCharArray();
        int count=1;
        int maxCount=0;
        for(int i=1;i<playerPositions.length();i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(maxCount<=count){
                    maxCount=count;
                }
                continue;
            }
            count=1;
        }
        if(maxCount>=7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
