import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/61/A"/>
 */
public class UltraFastMathematician {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String binary1=sc.next();
        String binary2=sc.next();
        String result="";
        for(int i=0;i<binary1.length();i++){
            if(binary1.charAt(i)==binary2.charAt(i)){
                result+='0';
            }else{
                result+='1';
            }
        }
        System.out.println(result);
    }
}
