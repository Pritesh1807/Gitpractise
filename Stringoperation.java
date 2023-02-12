public class Stringoperation{
public  static void main (String[]args){
String s= " Pritesh ";
String s1= " Pritesh is a student of ECE ";
int a=10;
String a1=String.valueOf(a);     //The String class valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into String.
System.out.println(a1+a);

StringBuffer sb=new StringBuffer("Hello");
//sb.insert(1,3,"python");
//System.out.println(sb);
sb.append("Java");
System.out.println(sb);

StringBuffer p= new StringBuffer("This is a javatpoint");
System.out.println(p.reverse());

System.out.println(s1.replace("Pritesh","Mayank"));
System.out.println(s.toUpperCase());
System.out.println(s.charAt(0));  // charAt() method returns a character at specified index.
System.out.println(s.trim());  // class trim() method eliminates white spaces before and after the String.
System.out.println(s.startsWith("Pr"));
System.out.println(s.length());

}
}