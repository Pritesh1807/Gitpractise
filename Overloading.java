class Overloading{
static int add(int a,int b){
	return a+b;
}
static int add (int a, int b, int c){
	return a+b+c;
}

public static void main(String[]args){
	Overloading obj =new Overloading();
	System.out.println(obj.add(5,10,15));
	System.out.println(obj.add(5,10));
}
}