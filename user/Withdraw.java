package user;
import java.util.*;
public class Withdraw {
    public int W(int b){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%100==0 && b>=a){
            b-=a;
        }
        else{
            System.out.println("Invalid Amount or Insufficient Balance");
        }
        return b;
    }
}
