import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/266/B"/>
 */
public class QueueAtTheSchool {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int stringCount=sc.nextInt();
        int time=sc.nextInt();
        String queue=sc.next();
        char[] arr=queue.toCharArray();
        char swap;
        for(int i=0;i<time;i++){
            for(int j=1;j<queue.length();){
                if(arr[j-1]=='B'&& arr[j]=='G'){
                    swap=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=swap;
                    j+=2;
                }else{
                    j+=1;
                }
            }
        }
        System.out.println(arr);
    }
}
