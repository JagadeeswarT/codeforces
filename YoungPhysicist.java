import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/69/A"/>
 */
public class YoungPhysicist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        boolean flag=false;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                int val=sc.nextInt();
                arr[i][j]=val;
            }
        }
        for(int j=0;j<3;j++){
            for(int i=0;i<n;i++){
                sum+=arr[i][j];
            }
            if(sum!=0){
                break;
            }else{
                flag=true;
                sum=0;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
