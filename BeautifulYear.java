import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/271/A"/>
 */
public class BeautifulYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        while(true){
            year++;
            String y=String.valueOf(year);
            if(y.charAt(0)!=y.charAt(1)&&y.charAt(0)!=y.charAt(2)&&y.charAt(0)!=y.charAt(3)&&y.charAt(1)!=y.charAt(2)&&y.charAt(1)!=y.charAt(3)&&y.charAt(2)!=y.charAt(3)){
                System.out.println(year);
                break;
            }
        }

    }
}
