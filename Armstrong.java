import java.util.Scanner;

public class Armstrong{

public static void main(String[] ar){

Scanner s = new Scanner(System.in);

System.out.println("Enter a Number");
int a=s.nextInt();
int b=a;
int sum=0;
int c;

while(a>0){

c=a%10;
sum=(c*c*c)+sum;
a=a/10;
}

if(b==sum){

System.out.println(b+"is An Armstrong Number");
}
else{

System.out.println(b+"is not An Armstrong Number");
}
}
}