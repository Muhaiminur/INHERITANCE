package inheritance;
public class BUmy{
  public static void main(String [] args){
    BBAStudent bba = new BBAStudent();
    bba.setName("BBA Student");
    System.out.println(bba);//BBA Student 4.0party
    EEEStudent eee = new EEEStudent();
    eee.setName("EEE Student");
    System.out.println(eee);//EEE Student 3.0study
    CSEStudent cse = new CSEStudent();
    cse.setName("CSE Student");
    System.out.println(cse);//inheritance.CSEStudent@68837a77
  }
}