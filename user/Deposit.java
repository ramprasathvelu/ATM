package user;
import java.util.*;
public class Deposit {
    public int D(int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to Deposit: ");
        int a = sc.nextInt();
        if(a%100==0){
            b+=a;
        }
        return b;
    }
}
