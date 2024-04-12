
package gp.calculator;

import java.util.Scanner;
public class GPCalculator {

    public static void main(String[] args) {
       
     System.out.println("Good Day Student"
             + "\nWhat operation would you like to perform");
     System.out.println("A.Your grade for a subject");
     System.out.println("B.Calculate your GPA");
     System.out.println("C.Calculate your CGPA");
     Scanner operation = new Scanner(System.in);
     char opchoice = operation.next().charAt(0);
        switch (opchoice) {
            case 'a':
            case 'A':
                  System.out.println("Please supply the subject and score"
        + " you'd like me to grade for you in this order:\nMathematics,67");
                Scanner choice = new Scanner(System.in);
                String subscor = choice.nextLine();
                String []gradeans = subscor.split(",");
                String subject = (gradeans[0]);
                int score = Integer.parseInt(gradeans[1]);
                
               if(score >= 70 && score <= 100){
                   System.out.println("You got an A in "+subject+".\nCongratulations! You did excelently well");
               }else if(score>=60 && score<=69){
                   System.out.println("You got a B in "+subject+".\nCongrats! You did well!");
               }else if(score>=50 && score<=59){
                   System.out.println("You got a C in "+subject+".\nYou tried! But you can do better");
               }else if(score>=45 && score<=49){
                   System.out.println("You got a D in "+subject+".\nStudy hard, you can do it,better luck next time!");
               }else if(score>=40 && score<=44){
                   System.out.println("you got an E in "+subject+".\nSorry to say but you did poorly put in more effort");
               }else if(score>=0 && score<=39){
                   System.out.println("You failed! you got an F in "+subject+".\nYou've failed this course; read harder!");
               }else{
                   System.out.println("I don't think there is a grade for that score!");
               }
                
                break;
            case 'b':
            case 'B':
                System.out.println("To calculate your GPA, i'll need"
                +"\nA list of all the subjects you offer"
                +"\nWith the Grade of each subject"
                +"\nAnd finally the credit unit or credit load of each subject."
                +"\nDo you have all the required information needed to know your GPA:"
                + "Answer 'yes' or 'no'");
                Scanner opans = new Scanner(System.in);
                String ansInfo = opans.nextLine();
               if("yes".equalsIgnoreCase(ansInfo)){
                   
                   System.out.println("How many subjects do you offer?");
             
                   GP_method gpmethod = new GP_method();
             
                  System.out.println(gpmethod.gpa());
             
               }else if("no".equalsIgnoreCase(ansInfo)){
                   System.out.println("I suggest you go and get it");
               }
                
                break;
            case 'c':
            case 'C':
                System.out.println("To calculate your CGPA i'll need "
                        + "the GPA of your first semester and second "
                        + "semester.\nDo you have them? Answer 'yes' or 'no'");
                Scanner Cans = new Scanner(System.in);
                String Cans1 = Cans.nextLine();
                if("yes".equalsIgnoreCase(Cans1)){
                    GP_method gpmethod = new GP_method();
                    System.out.println(gpmethod.CGPA());
                    System.out.println();
                }else if("no".equalsIgnoreCase(Cans1)){
                
                }else{}
                break;
            default:
                System.out.println("It seems you've typed the wrong character");
                break;
        }
    }

    
    
}
