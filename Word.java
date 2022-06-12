import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/59/A"/>
 */
public class Word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char[] arr=word.toCharArray();
        int lowerCaseCount=0;
        for(char c:arr){
            if(c>=97){
                lowerCaseCount++;
            }
        }
        int upperCaseCount=word.length()-lowerCaseCount;
        if(upperCaseCount>lowerCaseCount){
            System.out.println(word.toUpperCase());
        }else{
            System.out.println(word.toLowerCase());
        }
    }
}
