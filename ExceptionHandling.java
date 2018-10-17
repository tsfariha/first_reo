
import java.io.IOException;
 class ExceptionHandling
 {
  public static void main(String args[])throws FarihaException
  {
    try{
    try{
       customException();
     }catch(Exception e)
     {
      
     }
     finally{
        System.out.println("this is finally final");
     }
    

     throw new IOException("device2 Error");
    }catch(IOException f){
       System.out.println(f);
     }
    
  }
 static void customException() throws FarihaException
  {
      throw new FarihaException("ohh faiha");
  }
 
 

} 
 class FarihaException extends Exception
  {
    FarihaException(String a)
   {
    super(a);
   }
  }

