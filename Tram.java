import java.util.Scanner;

/**
 * <a href="https://codeforces.com/problemset/problem/116/A"/>
 */
public class Tram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int minCapacity=0;
        int totalPassengers=0;
        int totalStops=sc.nextInt();
        for(int i=0;i<totalStops;i++){
            int exit=sc.nextInt();
            int enter=sc.nextInt();
            if(exit==0){
                totalPassengers+=enter;
            }else{
                totalPassengers-=exit;
                totalPassengers+=enter;
            }
            if(minCapacity<=totalPassengers){
                minCapacity=totalPassengers;
            }
        }
        System.out.println(minCapacity);
    }
}