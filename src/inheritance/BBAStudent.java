package inheritance;
public class BBAStudent extends Student{
  public double getCGPA(){
    return 4.0;
  }
  public void party(){
    System.out.println("party");
  }
//-----------------------for my
  public String getparty(){
    return "party";
  }
  public String toString(){
    return getName()+" "+getCGPA()+getparty();
  }
}