import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/617/A"/>
 */
public class Elephant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int count=0;
        if(distance/5>=0 && distance>=5){
            count+=distance/5;
            distance-=count*5;
        }
        if(distance/4>=0 && distance>=4){
            count+=distance/4;
            distance-=count*4;
        }
        if(distance/3>=0 && distance>=3){
            count+=distance/3;
            distance-=count*3;
        }
        if(distance/2>=0 && distance>=2){
            count+=distance/2;
            distance-=count*2;
        }
        if(distance/1>=0 && distance>=1){
            count+=distance;
        }
        System.out.println(count);

    }
}
