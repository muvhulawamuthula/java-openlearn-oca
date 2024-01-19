public class AgeCalculator{
    public static double calculate(String input){
    String[] year = input.split("/");
    double age = 2024 - Integer.parseInt(year[2]);
    return age; 
    

  }
   

}