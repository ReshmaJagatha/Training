package Day1;

public class Ternary {
public static void main(String[] args) {
	
	int a=300;
	int b=500;
	int res=a<b? a:b;
	System.out.println(res);//a
	int res1=a>b? a:b;
	System.out.println(res1);//b
	int age=18;
	String s=age>16?"eligible":"not eligible";
	System.out.println(s);// eligible
	char c='A';
	String t=c>56 ? "pass":"failure";
	System.out.println(t);//failure
	
}
}
