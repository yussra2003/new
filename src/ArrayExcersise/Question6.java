/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: array example using static method
 *
 * Description: an intro example to show how to perform some basic
 *              array operations using static methods where possible
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class Question6 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerForWindow;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
        int array;
        int actualLength = 0;       // actual length of array
        int[] list = new int[100];
        int len = 0;
        
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
        // todo: add a try catch to the creation of the buffered reader
        //BufferedReader fin = new BufferedReader(new FileReader("arrayData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        printBanner();      // call printBanner method
        fileBanner(fout);       // call fileBanner method
        bannerForWindow = windowBanner();
	    	
    // ************************ get input **********************

        //actualLength = loadList(list, delim);
       // actualLength = loadList(list, fin);

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
        System.out.println("Fibonacci Sequence");
        fibonacciSquenceList(actualLength);
        System.out.println("");
        
        
        System.out.println("Fibonacci Sequence Fist 5 numbers: ");
     
        
    
    // ******** closing message *********
        
        System.out.println("\nend of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************
  
 /***********************************************************
    *   Purpose: print the first fibonacci sequence numbers
    *   Interface:  
    *   Returns:    no return
    * **************************************************************/
    public static void fibonacciSquenceList(int len){
        
       int n1 = 0, n2 =1, n3, i, count = 20;
       System.out.print(n1+ " " + n2);
       
       for (i = 2; i < count; ++i){
           
           n3 = n1 + n2;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
       }//end for i = 2
        
    } // end fibonacciSquenceList
    
   
 /***********************************************************
    *   Purpose: Create a banner string that can be used to 
    *           print the banner to a message dialog or the console
    *           window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		your name here\n";
    	bannerOut += "Class:		CS20S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(){
    	System.out.println("*******************************************");
    	System.out.println("Name:		sveinson");
    	System.out.println("Class:		CS20S");
    	System.out.println("Assignment:	Ax Qy");
    	System.out.println("*******************************************");        
    } // end print banner
    
 
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout){
     	fout.println("*******************************************");
    	fout.println("Name:		sveinson");
    	fout.println("Class:		CS20S");
    	fout.println("Assignment:	Ax Qy");
    	fout.println("*******************************************");       
    } // end bannerOut

}  // end class
