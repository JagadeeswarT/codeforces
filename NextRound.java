import java.util.Scanner;

public class NextRound {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] scores=new int[n+1];
        int count=0;
        int minScore=0;
        for(int i=1;i<=n;i++){
            int score=sc.nextInt();
            scores[i]=score;
            if(i==k){
                minScore=score;
            }
        }
        for(int j=1;j<=n;j++){
            if(scores[j]>=minScore && scores[j]>0){
                count++;
            }
        }

        System.out.println(count);
    }
}
