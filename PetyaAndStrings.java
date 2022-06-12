import java.util.Locale;
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String firstString=sc.next().toLowerCase();
        String secondString=sc.next().toLowerCase();
        int result=0;
        for(int i=0;i<firstString.length();i++){
            if((int)firstString.charAt(i)> (int)secondString.charAt(i)){
                result=1;
                break;
            }else if((int)firstString.charAt(i)< (int)secondString.charAt(i)){
                result=-1;
                break;
            }
        }
        System.out.println(result);

    }
}
