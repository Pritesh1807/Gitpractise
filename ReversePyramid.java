public class ReversePyramid{
public static void main(String[]args){
int a=10;
for(int i=1;i<=10;i++){
for(int j=a;j>=i;j--){
System.out.print("*");
}
System.out.println();
}
}
}