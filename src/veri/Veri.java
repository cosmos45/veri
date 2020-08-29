/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author omkarzende
 */
public class Veri {

    /**
     * @param args the command line arguments
     */
    
   
    
//    private static Scanner x;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String username = "omkar";
        String password = "zende";
        
        
        
        Veri(username,password);
    }
    
   
     
    public static void Veri(String username, String password){
        
        
        boolean found = false;
        String tempUsername ="";
        String tempPassword ="";
    
    
    try {
        
        
        String desktop = System.getProperty ("user.home") + "/NetBeansProjects/aessss/";

        File myFile = new File (desktop + "passwords.txt");
        Scanner x = new Scanner (myFile);
        x.useDelimiter("[,\n]");
        
        while(x.hasNext() && !found)
        {
            tempUsername = x.next();
            tempPassword = x.next();
            
            if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
            {
                found = true;
            }
        }
        x.close();
        System.out.print(found);
        
    }
    catch(FileNotFoundException e) {
        System.out.print("error");
        
    }
}
    
}
