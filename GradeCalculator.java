/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNEducationProject;

/**
 *
 * @author marky
 */
public class GradeCalculator {
    
    public static int gradeScore;
    private String grade;
    private String message;
    
    public GradeCalculator(){
        grade="A";
        message="Test";
    }
    public void calculate(){
     if(gradeScore<=4){
         grade="F";
         message="Good Try!";
     }
     else if(gradeScore==5){
         grade="D";
         message="Good Try!";
     }
     else if(gradeScore==6){
         grade="D+";
         message="Good Try!";
     }
     else if(gradeScore==7){
         grade="C";
         message="Congratulations!";
     }
     else if(gradeScore==8){
         grade="C+";
         message="Congratulations!";
     }
     else if(gradeScore==9){
         grade="B";
         message="Congratulations!";
     }
     else if(gradeScore==10){
         grade="B+";
         message="Congratulations!";
     }
     else if(gradeScore==11){
         grade="A";
         message="Congratulations!";
     }
     else{
         grade="A+";
         message="Congratulations!";
     }
    
  }
     public int getGradeScore(){
        return this.gradeScore;
     }
     public String getGrade(){
        return this.grade;
    }public String getMessage(){
        return this.message;
    }
    
}