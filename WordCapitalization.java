import java.util.Locale;
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char firstLetter=word.charAt(0);
        if((int)firstLetter>=97 && word.length()>1){
            word=Character.toUpperCase(firstLetter)+word.substring(1,word.length());
        }else if(word.length()==1){
            word=Character.toUpperCase(firstLetter)+"";
        }
        System.out.println(word);

    }
}
