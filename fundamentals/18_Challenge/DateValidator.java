import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DateValidator{
    public static boolean isValid(String input){

       boolean a = false;

     try{
       
       
       String regex = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
       //Creating a pattern object
       Pattern pattern = Pattern.compile(regex);
       //Matching the compiled pattern in the String
       Matcher matcher = pattern.matcher(input);
       a = matcher.matches();

     }catch (Exception e){
       a = false;
     } 
      return a;
      
      

     


   }


}