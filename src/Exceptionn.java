
class Exceptionn extends Throwable 
{ 
    public Exceptionn(String s) 
    { 
        // Call constructor of parent Exception 
     System.out.println(s);
    } 
 
  
// A Class that uses above MyException 
 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new Exceptionn("GeeksGeeks"); 
        } 
        catch (Exceptionn ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            ex.printStackTrace();
        } 
    } 
}