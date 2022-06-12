import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        long a=sc.nextInt();


        long firstLineFlagStones= (int) Math.ceil(n/a);
        long iterationLength=(int) Math.ceil(m/a);
        long totalFlagStones=firstLineFlagStones*iterationLength;

        System.out.println(totalFlagStones);

    }
}
