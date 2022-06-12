import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int statementCount=sc.nextInt();
        int X=0;
        for(int i=0;i<statementCount;i++){
            String statement=sc.next();
            if(statement.charAt(0)=='+' || statement.charAt(statement.length()-1)=='+'){
                X++;
            }else{
                X--;
            }
        }
        System.out.println(X);
    }
}
