public class Challenge1Main{
    public static void main(String[] args){
    String name = Prompter.prompt("What is your name");
    String surname = Prompter.prompt("What is your surname");
    String dob = Prompter.prompt("what is your date of birth? DD/MM/YYYY:");
    String distance = Prompter.prompt("how far is your favourite store from home");
    boolean dateValid = DateValidator.isValid(dob);
    boolean distanceIsNumeric = NumberValidator.isValid(distance);
    
    int age = 0;
      if(dateValid){
          age = (int)AgeCalculator.calculate(dob);
      //System.out.println("You are "+age+ " milliseconds old");  
      }else{
        System.out.println("Date is not valid exiting");
      }
    

    
    if(distanceIsNumeric){
          double miles = MilesCalculator.calculate(distance);
          double metres = MetresCalculator.calculate(distance);
          Printer.print(name,surname,age,miles,metres);
    }else{
       System.out.println("Distance is not valid exiting");

    }



   }



}