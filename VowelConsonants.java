public class VowelConsonants{
public static void main(String[]args){
int vowels=0; 
int consonants=0;
String str="good morning everyone, how are you all?";
	for(int i=0;i<str.length();i++)
	{
		if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			vowels++;
		}
		else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
		{
			consonants++;
		}
	}
System.out.println(vowels);
System.out.println(consonants);
}
}