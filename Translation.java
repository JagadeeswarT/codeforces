import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/41/A"/>
 */
public class Translation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        String t=sc.next();
        char[] arr=word.toCharArray();
        String result="";
        for(char c: arr){
            result=c+result;
        }
        if(result.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
