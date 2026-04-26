/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginn;

import java.util.Scanner;


public class Loginn {
    
    static String name="stacy";
   static String Email="stacy@gmail.com";
   static String password="stacy2255";

    public static void main(String[] args) {
       
    
        Scanner s = new Scanner(System.in);
       System.out.println("enter your name");
       name = s.nextLine();
       System.out.println("enter your Email");
       Email = s.nextLine();
       System.out.println("enter your password");
       password = s.nextLine();
       
       if(name==name  && password==password && Email==Email){
           System.out.println("login successful");
       }
       else{
           System.out.println("invalid iogin");
       }
    }
    
}
