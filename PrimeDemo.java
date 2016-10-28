import java.util.Scanner;
public class PrimeDemo
{
  public static void main(String[] ar)
  {
    
	Scanner p=new Scanner(System.in);
	System.out.println("Enter a Number to Print prime numbers");
	int a=p.nextInt();
	
	
	//int b=a/2;
	int count=0;
	
	for(int i=2;i<=a;i++){

	for(int j=2;j<=i;j++)
	 {
	   if(i%j==0)
	    {
	        count=count++;
	   	break;
	     }
		 if(count==0)
	 	{
		System.out.println(i);
		break;
	 	}
	 }
  	
       

        }
    }
}
	  