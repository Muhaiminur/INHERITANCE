package inheritance;
public class BU{
  public static void main(String [] args){
    BBAStudent bba = new BBAStudent();
    bba.setName("BBA Student");
    System.out.println(bba.getName());//BBA Student
    System.out.println(bba.getCGPA());//4.0
    bba.party();//party
    EEEStudent eee = new EEEStudent();
    eee.setName("EEE Student");
    System.out.println(eee.getName());//EEE Student
    System.out.println(eee.getCGPA());//3.0
    eee.study();//study
    CSEStudent cse = new CSEStudent();
    cse.setName("CSE Student");
    System.out.println(cse.getName());//CSE Student
    System.out.println(cse.getCGPA());//2.0
    cse.cry();//cry
  }
}