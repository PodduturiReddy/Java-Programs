import java.util.Scanner;
public class Prime
{
  public static void main(String[] ar)
  {
    
	Scanner p=new Scanner(System.in);
	System.out.println("Enter any Number to Check Whether it is prime or not");
	int a=p.nextInt();
	
	
	int b=a/2;
	int count=0;

	for(int i=2;i<=b;i++)
	 {
	   if(a%i==0)
	    {
	        count++;
	   	break;
	     }
		
	 }
  	
        if(count==0)
	 {
		System.out.println(a+"is a prime number");
	 }

        else
	 {
		System.out.println(a+"is not a prime number");
	 }
    }
}
	  