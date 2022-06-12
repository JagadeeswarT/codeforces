import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/734/A"/>
 */
public class AntonAndDanik {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String word=sc.next();
        int winsOfAnton=0;
        int winsOfDanik=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='A'){
                winsOfAnton++;
            }else{
                winsOfDanik++;
            }
        }
        if(winsOfAnton>winsOfDanik){
            System.out.println("Anton");
        }else if(winsOfAnton<winsOfDanik){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

    }
}
