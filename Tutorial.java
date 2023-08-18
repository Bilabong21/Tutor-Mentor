import java.util.Scanner;
import java.util.DecimalFormat;

public class Tutorial{

 public static void main(String[] args){

  Scanner Kb= new Scanner(System.in);
  Format Formatter = new Format(System.in);

  int iProgm,iComMath,iComFund, iNoSession;

  System.out.println("Enter the first number");
  iProgm = Kb.nextInt();
 
 System.out.println("Enter the PPB mark");
  iComMath = Kb.nextInt();

 System.out.println("Enter the math");
  iComFund = Kb.nextInt();

   System.out.println("Enter the Computer fundermental");
  iNoSession= Kb.nextInt();

 boolean value =validate( iProgm, iComMath,iComFund)


    double Price =calculateResult(iNoSession);
      displayResult(value,price);
 }
public static boolean  validate(int a, int b, int c)
{
    boolean ans=false;

    if(a<60){

      return true;  
    } 
    else if(b<60||c<50) 
    {
    return false;    

    }    
else {

    System.out.println("you qualify ");
}
    return ans;
}
 
public static double calculateResult(int noSession)
{
    if(noSession>=2 && noSession<=8)
    {
        double totalPrice = noSession*350,50;

    }
    else 
    {
    System.out.println("invalid number of session  nummber of session range from (2-8)");    

    }
    return totalPrice;

}
 
 
public static void displayResult(boolean vul,double PR )
{
	 DecimalFormat format = new DecimalFormat("###.00");  
    System.out.println(vul);
    System.out.println("\n The fee is : "+PR);



}
 
 
}
 
 
}