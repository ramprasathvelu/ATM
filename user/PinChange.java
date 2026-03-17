package user;

import admin.Logs;
import java.util.Scanner;
public class PinChange {
    Scanner sc = new Scanner(System.in);
    public int P(int oldPin,String user){
        System.out.print("Enter New PIN: ");
        int pnew = sc.nextInt();
        System.out.println("PIN successfully changed");
        Logs.addLog("User Changed PIN");
        return pnew;
    }

}