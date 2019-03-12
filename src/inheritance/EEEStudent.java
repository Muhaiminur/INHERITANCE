package inheritance;
public class EEEStudent extends Student{
  public double getCGPA(){
    return 3.0;
  }  
  public void study(){
    System.out.println("study");
  }
  //-----------------------for my
  public String getstudy(){
    return "study";
  }
  public String toString(){
    return getName()+" "+getCGPA()+getstudy();
  }
}