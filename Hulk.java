import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/705/A"/>
 */
public class Hulk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String text="";
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                text+="I hate";
            }else{
                text+="I love";
            }
            if(i>0 && i<n){
                text+=" that ";
            }
            if(i==n){
                text+=" it";
            }
        }
        System.out.println(text);
    }
}
