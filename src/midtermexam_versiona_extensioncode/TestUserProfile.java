/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Amr
 */
public class TestUserProfile {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Plese enter your name");
        String name = input.nextLine();
        
        System.out.println("Plese enter your favoutite Genre");
        String genre = input.nextLine();
        
        UserProfile user = new UserProfile(name,genre);
        
        for(int i=0; i<4; i++){
            System.out.println(user.genres[i]);
        }
        
        System.out.println("Your profile is created"
                + user.getUserID() + user.getGenre());
    }
}
