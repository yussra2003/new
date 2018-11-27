/********************************************************************
 * Programmer:	Yussra Abdo M.
 * Class:  CS20S
 *
 * Assignment: static methods
 *
 * Description: this program will, given a year, compute the next year with 
 *              distinct digits
 *
 * Input: a year should be entered from the key board buffer
 *
 * Output: the next distinct year from the input entered.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class UsingStaticMethods {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin = " ";				// string data input from keyboard
    	String strout = "";				// processed info string to be output
    	String bannerForWindow= " ";			// string to print banner to message dialogs
        String value = "";
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        int startingYear = 0;
        int distinctYear = 0;
        int duplicates = 0;
    	
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
        
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
        printBanner();  //cal printBanner method
        fileBanner(fout);   //call fileBanner method
    	bannerForWindow = windowBanner();     //cal windowBanner method
    	
    	
 	    	
    // ************************ get input **********************
    	prompt = "Enter a year\n\n";	
    	
    	//strin = JOptionPane.showInputDialog(bannerForWindow + prompt);
        
  
          strin = getYear(bannerForWindow, prompt);
          value = (Integer.parseInt(strin) + 1) + "";
         // System.out.println(value);
        
    // ************************ processing ***************************
    
    while (getduplicates (value)){  
        value = (Integer.parseInt(value)) + 1 + "";
    }// end while strin no null
       
    // ************************ print output ****************************
    
     System.out.printf("%15s %20s" , "Start year:" , "distinct year:" + "\n");
     
     System.out.printf("%15s %21s", strin, value + "\n\n");  
     
    
        JOptionPane.showMessageDialog(null, bannerForWindow + strout);
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
    
    //************************ Static methods *******************
        
       /********************************************************
       *  Purpose: to check if a number is duplicated
       * Interface: bannerForWindow ---> ban output banner
       *            prompt ---> prmt input prompt
       * Returns: an integer value
       * ******************************************************/
    
        public static boolean getduplicates(String value){
        for(int i = 0; i < value.length(); i++)
            for(int j = i + 1; j < value.length(); j++)
                if (value.charAt(i) == value.charAt(j))                   
                    return true;
                  return false;
        }
     /********************************************************
       *  Purpose: get an integer from the keyboard buffer
       * Interface: bannerForWindow ---> ban output banner
       *            prompt ---> prmt input prompt
       * Returns: an integer value
       * ******************************************************/
        
        public static String getYear(String ban, String prmt){
            String year;
            
            year = (JOptionPane.showInputDialog(ban + prmt));
            
            return year;
            
        } //end get integer
        
      /********************************************************
       *  Purpose: create a banner string than can be used to
       *        print the banner to a message dialog or the console
       *        window
       * Interface: no parameters
       * Returns: no returns
       * ******************************************************/
      
        public static String windowBanner(){
            String bannerOut = "";
            
            bannerOut = "*******************************************\n";
            bannerOut += "Name: Yussra Abdo\n";
            bannerOut += "Class: CS20S\n";
            bannerOut += "Assignment: Using Staic Methods\n";
            bannerOut += "*******************************************\n\n";
            
            return bannerOut;
        }// end window banner
        
        /********************************************************
       *  Purpose: print a banner to the output file
       * Interface: no parameters
       * Returns: no returns
       * ******************************************************/
        
        public static void printBanner(){
            System.out.println("*******************************************");
            System.out.println("Name: Yussra Abdo");
            System.out.println("Class:CS20S");
            System.out.println("Assignment: Using static methods");
            System.out.println("*******************************************");
        }//end print banner
        
        
        /********************************************************
       *  Purpose: print banner to the output file
       * Interface: print writer fout
       * Returns: no returns
       * ******************************************************/
        public static void fileBanner(PrintWriter fout){
           fout.println("*******************************************");
           fout.println("Name:	Yussra Abdo");
           fout.println("Class:	CS20S");
           fout.println("Assignment: using static methods");
           fout.println("*******************************************"); 
        }//end bannerOut
        
    
}  // end class
