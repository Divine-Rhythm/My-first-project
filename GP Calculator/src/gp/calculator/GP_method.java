
package gp.calculator;
import java.util.Scanner;


public class GP_method {
   
       int Gbycredit1 = 0;
       int newcu = 0;
       double GPA = 0.00;
       double nGPA;
       double CGans1;
       double CGans2;
       double CGans3;
       double CGPA;
       double nCGPA;
    
    public String gpa() {
        
        Scanner offer = new Scanner(System.in);
                   int nos = offer.nextInt(); 
        System.out.println("Please input the subjects, grades and credit unit in this order"
                          + " Mathematics,A,3");
           
      Scanner sc = new Scanner(System.in);      
          
    //System.out.println("Part one");
        
         for(int count = 0;count<nos;count++){
             String suboff = sc.nextLine();
            String gpinfo[] = suboff.split(",");
            String subjects = (gpinfo[0]);
            char grade = gpinfo[1].charAt(0);
            int creditUnit = Integer.parseInt(gpinfo[2]);
        //   int[] Gbycredit1 = new int[nos];
           
             int gradeval = 0;
             int Gbycredit = 0;
            
             
             if(grade== 'a' || grade == 'A'){
                 gradeval = 5;
                 
                 Gbycredit = gradeval * creditUnit;
                 
                }else if(grade=='b' || grade == 'B'){
                     gradeval = 4;
                    
                     Gbycredit = gradeval * creditUnit;
                 
                }else if(grade=='c' || grade == 'C'){
                    gradeval = 3;
                    Gbycredit = gradeval * creditUnit;
                 
                }else if(grade=='d' || grade == 'D'){
                    gradeval = 2;
                    Gbycredit = gradeval * creditUnit;
                 
                }else if(grade=='e' || grade == 'E'){
                    gradeval = 1;
                    Gbycredit = gradeval * creditUnit;
                 
                }else{
                    System.out.println("I don't have that grade in my storage"
                    + " i only have A,B,C,D,E");
                    }
           newcu += creditUnit;
           Gbycredit1 += Gbycredit;
          // Gbycredit1[count] = Gbycredit;
          
         }
         GPA = Gbycredit1/newcu;
         nGPA = Math.ceil(GPA * 100) / 100;
        if(GPA >= 4.50 && GPA <= 5.00){
               System.out.println("Congratulations!!!\n"
            + " You're on your way to making First Class.\nKEEP IT UP!");
        }else if(GPA >= 3.50 && GPA <= 4.49){
                System.out.println("Good Job!\n"
            + " You're on your way to making Second Class Upper.\nYou're doing well.");
        }else if(GPA >= 2.40 && GPA <= 3.49){
                System.out.println("Well Done\n"
            + "You're on your way to making Second Class Lower.\nI'm sure you can do better.");
        }else if(GPA >= 1.50 && GPA <= 2.39){
                System.out.println("You're on your way to making Third Class.\n"
                        + "You really need to sit up. ");
        }else if(GPA >= 1.00 && GPA <= 1.49){
                System.out.println("Hmmm,you're on your way to making what we call "
                        + " 'Pass Degree'\n which is commonly called 'Let My People GO'\n"
                        + "You better go and think about your life.");
        }else{
        
                System.out.println("Congratulations!!!\n"
                       + "You've proved to your parents"
                        + " they should have never sent you to school");
        
        }
         
           
   
                   
                   
                 
       
  return "Your GPA is "+nGPA;
    }
  public String CGPA () {
  
      System.out.println("Okay please input your GPA"
                            + " for first semester below");
                    Scanner CGans = new Scanner(System.in);
                     CGans1 = CGans.nextDouble();
                    System.out.println("Okay please input your GPA"
                            + " for Second semester below");
                     CGans2 = CGans.nextDouble();
                    CGans3 = CGans1 + CGans2;
                    CGPA = CGans3 / 2;
                    nCGPA = Math.ceil(CGPA * 100) / 100;
                    
            if(CGPA >= 4.50 && CGPA <= 5.00){
               System.out.println("Congratulations!!!\n"
            + " You're on your way to making First Class.\nKEEP IT UP!");
        }else if(CGPA >= 3.50 && CGPA <= 4.49){
                System.out.println("Good Job!\n"
            + "You're on your way to making Second Class Upper."
            + "\nYou're doing well.");
        }else if(CGPA >= 2.40 && CGPA <= 3.49){
                System.out.println("Well Done\n"
            + "You're on your way to making Second Class Lower.\nI'm sure you can do better.");
        }else if(CGPA >= 1.50 && CGPA <= 2.39){
                System.out.println("You're on your way to making Third Class.\n"
                        + "You really need to sit up. ");
        }else if(CGPA >= 1.00 && CGPA <= 1.49){
                System.out.println("Hmmm,you're on your way to making what we call "
                        + " 'Pass Degree'\n which is commonly called 'Let My People GO'\n"
                        + "You better go and think about your life.");
        }else{
        
                System.out.println("Congratulations!!!\n"
                       + "You've proved to your parents"
                        + " they should have never sent you to school");
        
        }
  
  return "Your CGPA is "+nCGPA;
  }
    
}