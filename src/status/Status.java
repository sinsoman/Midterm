/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Use enumerators to avoid input errors
 * and print the status details. 
 * @author srinivsi date:June 24th
 * @modifier sinsoman
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code");
    String code = in.next();
    StausUser t= new StausUser();
    t.statusDetail(code); 
    }
    
}
