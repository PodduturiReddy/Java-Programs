import java.util.Scanner;
public class StrPallindrome{

public static void main(String[] ar){

Scanner s=new Scanner(System.in);

System.out.println("Enter one String");
String p=s.next();
System.out.println("Given String Is:"+p);


String r="";


for(int i=p.length()-1;i>=0;i--){


r +=p.charAt(i);
}

System.out.println("Reverse Of Given String Is:"+r);

if(p.equals(r))
{
System.out.println("Given String Is Pallindrome");
}
else{
System.out.println("Given String Is not Pallindrome");
}
}
}