public class StringSplit{
  
public static void main(String args[]){  

String s1="welcome to split world";
System.out.println("\n");  
System.out.println("returning words:");  

for(String w:s1.split("\\s",0)){  
System.out.println(w);  
}  

System.out.println("\n"); 
System.out.println("returning words:");  


for(String w:s1.split("\\s",1)){  
System.out.println(w);  
}  

System.out.println("\n");
System.out.println("returning words:");  


for(String w:s1.split("\\s",2)){  
System.out.println(w);  
}  
  
}}