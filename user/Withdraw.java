package user;
import admin.*;
import db.TransactionLogger;
import java.util.Scanner;
public class Withdraw {
    Scanner sc = new Scanner(System.in);
    public int W(int b,String user){
        System.out.print("Enter amount to withdraw: ");
        int a;
        try {
            a = sc.nextInt();
        } 
        catch (Exception e) {
            System.out.println("Invalid! Try Again");
            return 0;
        }
        if (Admin.atmBalance>=a) {
            if(a % 100 == 0 && a <= b){
                b -= a;
                Admin.atmBalance-=a;
                Logs.addLog("User withdrew: " + a);
                TransactionLogger.logTransaction(user,"Withdraw",a,Admin.atmBalance);
            }
            else{
                System.out.println("Invalid amount or insufficient balance");
                Logs.addLog("Failed withdrawal attempt: " + a);
            }
        }
        else{
            System.out.println("Sorry! Limited Amount in ATM or Empty");
            System.out.println("TRY AGAIN LATER");
            Logs.addLog("Failed withdrawal attempt: " + a);
        }
        return b;
    }

}