import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/1030/A"/>
 */
public class InSearchOfAnEasyProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int iteration=sc.nextInt();
        for(int i=0;i<iteration;i++){
            int n=sc.nextInt();
            if(n==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
