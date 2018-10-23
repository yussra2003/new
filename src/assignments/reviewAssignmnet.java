/********************************************************************
 * Programmer:	Yussra Abdo M.
 * Class:  CS20S
 *
 * Assignment: Review Assignment
 * Program Name:  Review Assignment
 *
 * Description: this program is suppose to read 16 bit base 2 numbers from text/data file.
 *              then covert the 16 bit base 2 numbers to base 10, then output
 *              result to the file or window.
 *
 * Input: the input is data from a text file
 *
 * Output: the output is a base 10 converted from a base 2 16 bit number
 *          to a consol window
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
import static java.lang.Math.pow;
 

public class reviewAssignmnet {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        int base10Digit = 0;            //the converted base 2 number 
        int base10Value = 0;            //the total sum in the end of the loops
        int sum = 0;
    
    // ********** declaration of variables **********
    
    	String strin = "";				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        
        int magnitude = strin.length();         //
        
        char binDigit = '1';
    	
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	BufferedReader fin = new BufferedReader(new FileReader("dataTextfile.rtf"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name: Yussra Abdo M.");
    	System.out.println("Class:CS20S");
    	System.out.println("Assignment:	Review Assignment");
    	System.out.println("*******************************************");

    	//bannerOut = "*******************************************\n";
    	//bannerOut += "Name:		your name here\n";
    	//bannerOut += "Class:		CS20S\n";
    	//bannerOut += "Assignment:	Ax Qy\n";
    	//bannerOut += "*******************************************\n\n";
    	
 	    	
    // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";	
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";
    
    	
    	strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
    	//String[] tokens = strin.split(delim);
    	

    // ************************ processing ***************************
    
        strin =  fin.readLine();            // readin first data item
        //System.out.println(strin);          
    
    while (strin != null){              
        System.out.println(strin);
        
        magnitude = strin.length();
        
        base10Digit = 0;
        magnitude--;
          
        for(int i = 0; i <= magnitude; i++){
            binDigit = strin.charAt(i);
            base10Digit = Integer.parseInt(String.valueOf(binDigit));
           
            base10Value = base10Digit * (int)pow(2, (magnitude - i));
            System.out.print(base10Value);
            
            sum += base10Value;
        }// end for int  i 0 -  magnitude
      
        strin = fin.readLine();
        
        System.out.println("\nsum: " + sum +"\n");
        sum = 0;
        
    }// end while strin no null
    
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
