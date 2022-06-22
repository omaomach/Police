/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import java.util.Scanner;

/**
 *
 * @author macho
 */
public class Police {

    User logged;
    
    void screenPrint(String string) {
        System.out.print(string);
    }
    
    public static void main(String[] args) {
        
        Police police = new Police();
        police.screenPrint("Press 1 to Enter Crime Occurence \n");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        switch (option) { 
            case 1:
                police.logged = new User();
                police.logged.station();
                break;
                   
            default:
                police.screenPrint("Wrong Input");    
        }
        
        // TODO code application logic here
    }
    
}
