import java.util.Scanner;

public class Fibo{

public static void main(String[] ar){


Scanner s=new Scanner(System.in);

System.out.println("Enter a number");
int a=s.nextInt();

int b=0,c=1,d;

System.out.println("Numbers In Fibonaci Series are");
System.out.println(b);
System.out.println(c);

for(int i=1;i<a;i++){

d=b+c;
System.out.println(d);
b=c;
c=d; 
}
}
}