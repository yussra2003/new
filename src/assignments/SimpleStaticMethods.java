/********************************************************************
 * Programmer:	Yussra Abdo M.
 * Class:  CS20S
 *
 * Assignment: static methods 1

 * Description: this program should take 2 integer numbers and 2 floating point 
 *              numbers and add, subtract, multiply, and divide them together.
 *              it should also print the output banner to the output and file window.
 *
 * Input: 2 integer number and 2 floating point numbers from the keyboard buffer
 *
 * Output: it should add, subtract, multiply and divide, the numbers entered
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class SimpleStaticMethods {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerForWindow= " ";			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
        int operand1 = 0;
        int operand2 = 0;
        
        double floatOp1 = 0;
        double floatOp2 = 0;
        
        int sumInteger = 0;
        double sumDouble = 0;
    	
        int differenceInteger = 0;
        double differenceDouble = 0;
    	
        int productInteger = 0;
        double productDouble = 0;
    	
        int quotientInteger = 0;
        double quotientDouble = 0;
    	
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

    	prompt = "Enter a number \n\n";
        
    	
    	//strin = JOptionPane.showInputDialog(bannerForWindow + prompt);
        
        operand1 = getInteger(bannerForWindow, prompt);
        operand2 = getInteger(bannerForWindow, prompt);
        
        floatOp1 = getDouble(bannerForWindow, prompt);
        floatOp2 = getDouble(bannerForWindow, prompt);
        
    // ************************ processing ***************************
    
        sumInteger = add(operand1, operand2);   //adds 2 integer numbers
        sumDouble = add(floatOp1, floatOp2);    //adds 2 floating point numbers
        
        differenceInteger = subtract(operand1, operand2); //subtracts 2 integer numbers
        differenceDouble = subtract(floatOp1, floatOp2);  //subtracts the difference of 2 floating point numbers
        
        productInteger = multiply(operand1, operand2); //multiplies 2 integer numbers
        productDouble = multiply(floatOp1, floatOp2);  //multiplies  2 floating point numbers
        
        quotientInteger = divide(operand1, operand2); //divides 2 integer numbers
        quotientDouble = divide(floatOp1, floatOp2);  //divides 2 floating point numbers
        
    // ************************ print output ****************************

        System.out.println(operand1 + " + " + operand2 + " = " + sumInteger);
        System.out.println(floatOp1 + " + " + floatOp2 + " = " + sumDouble);
        
        strout = operand1 + " + " + operand2 + " = " + sumInteger + "\n";
        strout += floatOp1 + " + " + floatOp2 + " = " + sumDouble + "\n";
        
        System.out.println(operand1 + " - " + operand2 + " = " + differenceInteger);
        System.out.println(floatOp1 + " - " + floatOp2 + " = " + differenceDouble);
        
        strout += operand1 + " - " + operand2 + " = " + differenceInteger + "\n";
        strout += floatOp1 + " - " + floatOp2 + " = " + differenceDouble + "\n";
        
        System.out.println(operand1 + " * " + operand2 + " = " + productInteger);
        System.out.println(floatOp1 + " * " + floatOp2 + " = " + productDouble);
        
        strout += operand1 + " * " + operand2 + " = " + productInteger + "\n";
        strout += floatOp1 + " * " + floatOp2 + " = " + productDouble + "\n";
        
        System.out.println(operand1 + " / " + operand2 + " = " + quotientInteger);
        System.out.println(floatOp1 + " / " + floatOp2 + " = " + quotientDouble);
        
        strout += operand1 + " / " + operand2 + " = " + quotientInteger + "\n";
        strout += floatOp1 + " / " + floatOp2 + " = " + quotientDouble + "\n";
        
        
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
       *  Purpose: add 2 integer values passed through the arg area param interface
       * Interface: operand1 ---> op1 first integer operand
       *            operand2 ---> op2 second integer operand
       * Returns:  sum of op1 + op2: int
       * ******************************************************/
        public static int add(int op1, int op2){
            int sum = 0;
            
            sum = op1 + op2;
            
            return sum;
        }//end add
        
        /********************************************************
       *  Purpose: add 2 floating points  values passed 
       *            through the arg area param interface
       * Interface: operand1 ---> op1 first double operand
       *            operand2 ---> op2 second double operand
       * Returns:  sum of op1 + op2: double
       * ******************************************************/
        public static double add(double op1, double op2){
            double sum = 0;
            
            sum = op1 + op2;
            
            return sum;
        }//end add
        
    /********************************************************
       *  Purpose: subtract 2 integer values passed through the arg area param interface
       * Interface: operand1 ---> op1 first integer operand
       *            operand2 ---> op2 second integer operand
       * Returns:  sum of op1 - op2: int
       * ******************************************************/
        public static int subtract(int op1, int op2){
            int difference = 0;
            
            difference = op1 - op2;
            
            return difference;
        }//end difference
        
        /********************************************************
       *  Purpose: subtract 2 floating point values passed through the arg area param interface
       * Interface: operand1 ---> op1 first double operand
       *            operand2 ---> op2 second double operand
       * Returns:  sum of op1 - op2: double
       * ******************************************************/
        public static double subtract(double op1, double op2){
            double difference = 0;
            
            difference = op1 - op2;
            
            return difference;
        }//end difference
        
        /********************************************************
       *  Purpose: multiply 2 integer values passed through the arg area param interface
       * Interface: operand1 ---> op1 first integer operand
       *            operand2 ---> op2 second integer operand
       * Returns:  product of op1 * op2: int
       * ******************************************************/
        public static int multiply(int op1, int op2){
            int product = 0;
            
            product = op1 * op2;
            
            return product;
        }//end product
        
        /********************************************************
       *  Purpose: multiply 2 floating points values passed through the arg area param interface
       * Interface: operand1 ---> op1 first double operand
       *            operand2 ---> op2 second double operand
       * Returns:  product of op1 * op2: double
       * ******************************************************/
        public static double multiply(double op1, double op2){
            double product = 0;
            
            product = op1 * op2;
            
            return product;
        }//end product
        
        /********************************************************
       *  Purpose: divide 2 integer values passed through the arg area param interface
       * Interface: operand1 ---> op1 first integer operand
       *            operand2 ---> op2 second integer operand
       * Returns:  product of op1 / op2: int
       * ******************************************************/
        public static int divide(int op1, int op2){
            int quotient = 0;
            
            quotient = op1 / op2;
            
            return quotient;
        }//end quotient
        
        /********************************************************
       *  Purpose: divide 2 floating point values passed through the arg area param interface
       * Interface: operand1 ---> op1 first double operand
       *            operand2 ---> op2 second double operand
       * Returns:  product of op1 / op2: double
       * ******************************************************/
        public static double divide(double op1, double op2){
            double quotient = 0;
            
            quotient = op1 / op2;
            
            return quotient;
        }//end quotient
        
        
       
        /********************************************************
       *  Purpose: get an double  from the keyboard buffer
       * Interface: bannerForWindow ---> ban output banner
       *            prompt ---> prmt input prompt
       * Returns: an double value
       * ******************************************************/
    
        public static double getDouble(String ban, String prmt){
            double n = 0;
            
            n = Double.parseDouble(JOptionPane.showInputDialog(ban + prmt));
            
            return n;
            
        } //end get double
        
       /********************************************************
       *  Purpose: get an integer from the keyboard buffer
       * Interface: bannerForWindow ---> ban output banner
       *            prompt ---> prmt input prompt
       * Returns: an integer value
       * ******************************************************/
    
        public static int getInteger(String ban, String prmt){
            int n = 0;
            
            n = Integer.parseInt(JOptionPane.showInputDialog(ban + prmt));
            
            return n;
            
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
            bannerOut += "Name:	 Yussra Abdo\n";
            bannerOut += "Class: CS20S\n";
            bannerOut += "Assignment:	static methods\n";
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
            System.out.println("Assignment: static methods");
            System.out.println("*******************************************");
        }//end print banner
        
        
        /********************************************************
       *  Purpose: print banner to the output file
       * Interface: print writer fout
       * Returns: no returns
       * ******************************************************/
        public static void fileBanner(PrintWriter fout){
           fout.println("*******************************************");
           fout.println("Name:	Yussra");
           fout.println("Class:	CS20S");
           fout.println("Assignment: static methods");
           fout.println("*******************************************"); 
        }//end bannerOut
        
    
}  // end class
