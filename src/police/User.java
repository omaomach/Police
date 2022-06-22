
package police;

import java.util.Scanner;



public class User {
    
    String pStation, pOfficer,iDate,month,year;
    
    
    void screenPrint(String string){
        System.out.print(string);
    } 
            


    void station() {
        
        Scanner station = new Scanner(System.in);
        screenPrint("Police Station: \n");
        String pStation = station.nextLine();
        screenPrint("Name of Police Officer: \n");
        String pOfficer = station.nextLine();
        screenPrint("Date of Incident(DD MM YYYY): \n");     
        String iDate = station.next();
        String month = station.next();
        String year = station.next();
        screenPrint(pStation +"/" +year +"/" +month +"/" +iDate +"/" +1 +"-" +pOfficer);
        
        
      
    }

    
}
