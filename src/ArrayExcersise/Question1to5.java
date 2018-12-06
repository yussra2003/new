/********************************************************************
 * Programmer:	Yussra Abdo M.
 * Class:  CS20S
 *
 * Assignment: Array Exercise 1 question 1 to 5
 *
 * Description: 1- this program should prompt the user to enter 5 numbers and 
 *                 then print those 5 numbers to the output in order as entered 
 *                 and reverse order
 *              2- Continuing from question 1 the program should also ask you
 *                  to enter the number of numbers you want to enter.
 *              3- in addition to question 1 and 2 the program should prompt
 *                  the user to choose a number to be entered then print that 
 *                  number to the output. this should work until -1 
 *                  is entered
 *              4- in addition to question 1,2,and 3 this program should allow
 *                  the user to change individual parts of the list
 *              5- lastly in addition to all of the above questions the program 
 *                  should single out the smallest and largest number from the 
 *                  list after a change has been made
 * 
 * Input: Numbers should be entered from the keyboard buffer.
 * 
 * Output: the list of numbers the user entered in reverse, print the number you 
 *          specifically chose, and should print the largest and smallest 
 *          number form the list.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class Question1to5 {  // begin class
    
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
        
        int actualLength = 0;       // actual length of array
        int[] list = new int[100];
        int reverse = 0;
        int index = 0;
        int newNumber = 0;
        int len = 0;
        int smallNumber = 0;
        int bigNumber = 0;
    // ***** create objects *******
    
        //ConsoleReader console = new ConsoleReader(System.in);
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
        // todo: add a try catch to the creation of the buffered reader
       // BufferedReader fin = new BufferedReader(new FileReader("arrayData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    
    // ********** Print output Banner **********

        printBanner();      // call printBanner method
        fileBanner(fout);       // call fileBanner method
        bannerForWindow = windowBanner();
	    	
    // ************************ get input **********************
//        
          actualLength = Integer.parseInt(JOptionPane.showInputDialog("enter the amount of numbers you want"));
          loadList(list, actualLength);
          
   
    // ************************ processing ***************************
       
    
    
    // ************************ print output ****************************
     
            System.out.println("Original: ");
            printList(actualLength, list);
            System.out.println("    ");
          
            System.out.println("Reverse: ");
            printReverse(actualLength, list);
            System.out.println("   ");
            
            System.out.println("Number chosen: ");
            printIndex(list,index);
            System.out.println("   ");
            
            System.out.println("Modifide list: ");
            changeIndex(list,newNumber);
            printList(actualLength, list);
            System.out.println("   ");
            
            System.out.println("Smallest Number: ");
            smallNumber  = smallestNumber(actualLength, list);
            System.out.println(list[smallNumber]);
         
            System.out.println("Biggest Number: ");
            bigNumber  = biggestNumber(actualLength, list);
            System.out.println(list[bigNumber]);
            
    // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.println("end of proecessing");
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
    
//****************** static methods ***************
     /***********************************************************
    *   Purpose:    prints the amount of numbers you chose
    *   Interface:  int len ----> the number entered by the user
    *               int [] list ----> pointer to base address of array
    * **************************************************************/
   public static void loadList(int [] list, int len){
    
       for(int i = 0; i < len; i++){
           list[i] = Integer.parseInt(JOptionPane.showInputDialog("Now enter the numbers you want seperatly"));
       }//end for int i = 0;
     
   }// end loadlist
    
    
    /***********************************************************
    *   Purpose: print array in numbers
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    length of numbers
    * **************************************************************/
    public static int printList(int len, int[] list){
        for(int i = 0; i < len; i++)
            System.out.print(list[i]);
        return len;
    } // end printList
    
     /***********************************************************
    *   Purpose: load an array of integers
    *   Interface:  String Delim ----> the delimeter characters
    *               int [] list ----> pointer to base address of array
    *   Returns:   no len
    * **************************************************************/
   public static int loadList(int [] list, String delim){
       int len = 0;
       String strin = "";
       
       strin = JOptionPane.showInputDialog("Enter 5 numbers");
       
       String[] tokens = strin.split(delim);
       
       len = tokens.length;         //get number of values to be added to array
       
       for(int i = 0; i < len; i++){
           list[i] = Integer.parseInt(tokens[i]);
       }//end for int i = 0;
       return len;
   }// end loadlist
   
    /***********************************************************
    *   Purpose: to reverse the order of the list
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:  return len
    /**************************************************************/
    public static int printReverse(int len, int[] list){
        for(int i = len -1; 0 <= i; i--){
            System.out.print(list[i]);
            
        }
        return len;
    } // end print reverse
    
    /***********************************************************
    *   Purpose: Print the number the user choose
    *   Interface:  int actualLength --> len: actual length of list
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    /**************************************************************/
    public static int printIndex(int[] list, int index){
        
            int i = index; 
            
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter the position of the number you would like to know."));
       
            while (index != -1){
                
            System.out.print(list[index]);
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter another number you want to know from the list; enter -1 to quit"));
            
                
            }//end while index != -1  
            return index;
            
    } // end print index
    
    /***********************************************************
    *   Purpose: to change a specific number on the list
    *   Interface:  int newNumber --> The new Number to be printed to the list
    *               list[] --> pointer to base address of array
    *   Returns:    no return
    /**************************************************************/
    public static void changeIndex(int[] list, int newNumber){
        
           // int i = index; 
            int index = 0;
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter the position of the number you want to change."));
       
            while(index != -1){
                
                 newNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the new number"));
                 list[index] = newNumber;
                 
                 
                 index = Integer.parseInt(JOptionPane.showInputDialog("Do you want to change a new number? Enter the position if so; enter -1 to quit"));
                  
            }//end index != -1
             
    } // end print index
        
         /***********************************************************
    *   Purpose: Print the smallest number
    *   Interface:  int Len --> len: length of list
    *               list[] --> pointer to base address of array
    *   Returns:    minimum index
    /**************************************************************/
  public static int smallestNumber(int len, int[] list){
        int minimumValue = list[0];
        int minimumIndex = 0;
        
        for(int i = 0; i < len; i++){
            if(list[i] < list[minimumIndex]){
                minimumValue = list[i];
                minimumIndex = i;
            } // end if list[i] < min value
        
        } // end for int i = 0
        
        return minimumIndex;
    } // end findMinimumValue
  
    /***********************************************************
    *   Purpose: Print the smallest number
    *   Interface:  int Len --> len: length of list
    *               list[] --> pointer to base address of array
    *   Returns:    minimum index
    /**************************************************************/
  public static int biggestNumber(int len, int[] list){
        int maximumValue = list[0];
        int maximumIndex = 0;
        
        for(int i = 0; i < len; i++){
            if(list[i] > list[maximumIndex]){
                maximumValue = list[i];
               maximumIndex = i;
            } // end if list[i] < min value
        
        } // end for int i = 0
        
        return maximumIndex;
    } // end findMinimumValue
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
    	bannerOut += "Name: yussra Abdo\n";
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
    	System.out.println("Name: yussra Abdo");
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
    	fout.println("Name:	Yussra Abdo");
    	fout.println("Class:		CS20S");
    	fout.println("Assignment:	Ax Qy");
    	fout.println("*******************************************");       
    } // end bannerOut

}  // end class
