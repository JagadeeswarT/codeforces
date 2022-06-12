import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/344/A"/>
 */
public class Magnets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfMagnets=sc.nextInt();
        int[] arr=new int[numberOfMagnets];
        int totalGroups=1;
        for(int i=0;i<numberOfMagnets;i++){
            arr[i]=sc.nextInt();
            if(i>0 && arr[i]!=arr[i-1]){
                totalGroups++;
            }
        }
        System.out.println(totalGroups);


    }
}
