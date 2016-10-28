import java.util.Scanner;

public class Splitting{

public static void main(String[] ar){

Scanner s= new Scanner(System.in);
System.out.println("Enter any String");

String ip=s.nextLine();

String[] r=ip.split("\\s");

/*for(String n:r){

System.out.println(n);

}
*/

for(int i=1;i<r.length;i=i+2){

System.out.println(r[i]);

}


}
}