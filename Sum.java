import java.util.Scanner;

public class Sum{

public static void main(String[] ar){

Scanner s=new Scanner(System.in);

System.out.println("Enter Any Number");
int a=s.nextInt();

int b=a;
int i=0,sum=0,c;

while(a>0)
{
c=a%10;
sum=sum+c;
a=a/10;
}
System.out.println("Sum of Digits of"+b+"is"+sum);
}
}


 