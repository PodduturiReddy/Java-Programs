import java.util.Scanner;

public class Anagram{

public static void main(String[] ar){

Scanner s=new Scanner(System.in);

System.out.println("Enter any String");
String a=s.nextLine();
System.out.println("Enter any String");
String b=s.nextLine();
int count=0;


if(a.length()==b.length()){

System.out.println("Lengths of strings are equal");

for(int i=0;i<a.length();i++){

for(int j=0;j<b.length();j++){


if(a.charAt(i)==b.charAt(j)){


}
}

count++;
}
}
else{
System.out.println(" Stringths length is not same Try again Later");
System.exit(0);
}



if(count ==a.length()){

System.out.println(a+" and "+b+" are anagrams");

}
else
{
System.out.println(a+" and"+b+" are not anagrams");
}
}
}





