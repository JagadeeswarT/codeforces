import java.util.Scanner;


/**
 * <a href="https://codeforces.com/problemset/problem/467/A"/>
 */
public class GeorgeAndAccommodation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfRooms=sc.nextInt();
        int totalRooms=0;
        for(int i=0;i<numberOfRooms;i++){
            int peopleLivingIn=sc.nextInt();
            int roomAccommodate=sc.nextInt();
            if((roomAccommodate-peopleLivingIn)>=2){
                totalRooms++;
            }
        }
        System.out.println(totalRooms);
    }
}
