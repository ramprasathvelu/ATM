package user;

import admin.Admin;
import admin.Logs;
import db.TransactionLogger;
import java.util.Scanner;

public class Deposit {
    Scanner sc = new Scanner(System.in);
    public int D(int b,String user){
        System.out.print("Enter amount to deposit: ");
        int a;
        try {
            a = sc.nextInt();
        } 
        catch (Exception e) {
            System.out.println("Invalid! Try Again");
            return 0;
        }
        if(a % 100 == 0){
            b += a;
            Logs.addLog("User Deposited: "+a);
            TransactionLogger.logTransaction(user,"Deposit",a,Admin.atmBalance);
        }
        else{
            System.out.println("Deposit amount must be multiple of 100");
        }
        return b;
    }

}