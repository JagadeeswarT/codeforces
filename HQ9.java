import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/133/A"/>
 */
public class HQ9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        for(char c: word.toCharArray()){
            if(c==72||c==81||c==57){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
