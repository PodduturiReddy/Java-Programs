import java.util.Scanner;
public class Pallindrome{

public static void main(String[] ar){

Scanner s=new Scanner(System.in);
System.out.println("Enter a Number");
int a=s.nextInt();
 int b=a;
int i,c,sum=0;

/*while(a>0)                 
{                              
c=a%10;                           
sum=(sum*10)+c;                   
a=a/10;                         
}*/
  for(i=a;i>0;i=i/10)
  {
	c=i%10;
	sum=(sum*10)+c;
   }
if(b==sum)
{
System.out.println(b+"is a Pallindrome Number");
}
else
{
System.out.println(b+"is nota Pallindrome Number");
}
}
}































   