public class NumberValidator{
    public static boolean isValid(String input){
     if (input == null) {
        return false;
     }
      boolean a = false;
     try{
         double d = Double.parseDouble(input);
       a = true;

     }catch(Exception e){
         a = false;
     }
     return a;
   }
}







