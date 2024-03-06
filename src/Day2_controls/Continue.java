package Day2_controls;

public class Continue {
public static void main(String[] args) {
	for(int i=2;i<=36;i++) {
		if(i==10 || i==26 ||i==35)
		{
			continue;
		}
		System.out.println(i);
	}
}
}
