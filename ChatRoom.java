import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/58/A"/>
 */
public class ChatRoom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        Character[] hello={'h','e','l','l','o'};
        int index=0;
        char lookingFor=hello[index];
        for(char c:word.toCharArray()){
            if(c==lookingFor && index==4){
                System.out.println("YES");
                return;
            }else if(c==lookingFor){
                index++;
                lookingFor=hello[index];
            }
        }
        System.out.println("NO");
    }
}
