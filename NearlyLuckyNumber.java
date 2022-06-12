import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/110/A"/>
 */
public class NearlyLuckyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long checkLuckyNumber=sc.nextLong();
        int count=0;
        while(checkLuckyNumber>0){
            long lastDigit=checkLuckyNumber%10;
            if(lastDigit==7 || lastDigit==4){
                count+=1;
            }
            checkLuckyNumber/=10;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
