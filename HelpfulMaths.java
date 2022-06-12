import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        inputString=inputString.replace("+","");
        char[] arr=inputString.toCharArray();
        Arrays.sort(arr);
        String result="";
        for(int i=0;i<inputString.length();i++){
            if(i==0){
                result+=arr[i];
            }else{
                result+="+"+arr[i];
            }
        }
        System.out.println(result);
    }
}
