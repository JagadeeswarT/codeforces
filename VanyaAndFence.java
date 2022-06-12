import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/677/A"/>
 */
public class VanyaAndFence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fenceHeight=sc.nextInt();
        int totalWidth=0;
        for(int i=0;i<n;i++){
            int heightOfPerson=sc.nextInt();
            if(heightOfPerson>fenceHeight){
                totalWidth+=2;
            }else{
                totalWidth+=1;
            }
        }
        System.out.println(totalWidth);
    }
}
