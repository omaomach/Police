/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author macho
 */
public class PoliceFile {
    
    String passFile = "passFile.txt";

    void createUserFile(String pStation, String pOfficer, String iDate) {
        
        String oneLine = pStation+" "+pOfficer+" " +iDate+ "\n";
        byte data[] = oneLine.getBytes();
        try{
            File usersFile = new File(passFile);
            if (!usersFile.exists()){
                    OutputStream outPassFile = new FileOutputStream(passFile);
                    outPassFile.write(data,0,data.length);
            }else{
                OutputStream outPassFile = new FileOutputStream(passFile,true);
                 outPassFile.write(data,0,data.length);
            }
        }catch(IOException e) {
         System.out.print("Exception: " +e.getMessage());
        
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
