import java.util.Locale;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next().toLowerCase();
        String result="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e'|| word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u'|| word.charAt(i)=='y'){
                continue;
            }else{
                result+="."+word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
