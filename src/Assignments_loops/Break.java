package Assignments_loops;

public class Break {

	public static void main(String[] args)
	{
	//Break statement using for loop
		//2<=50
	/* for(int i=2;i<=50;i++)
	{
		//25==25
		if(i==25)
		{
			break;
		}
		
		System.out.println(i+" ");//2 to 24
	} */
	
	//Break statement using while loop
	/* int i=2;
	while(i<=35)
	{
		if(i>20)
		{
			break;
		}
		System.out.print(i+" ");
		i++;
	} */
		
	//Break statement using do-while loop	

	/*	int i=1;
		do
		{
			//71==71
			if(i==72)
			{
				break;
				
			}
			System.out.print(i+" ,");
			i++;
			
		}
		while(i<78); //1<78 */
		
		
		//Continue statement using for loop
	/*	for(int i=1;i<=30;i++)
		{
			//26==26,24==24,28==28
			if(i==26 || i==24 ||i==28)
			{
				continue;
			}
			
			System.out.println(i+", ");
		} */
		
		//Continue statement using while loop
		
	/*	int i=1;
		while(i<20)
		{
			if(i==10)
			{
				continue;
			}
			System.out.println(i);
			i++;
			
			
		} */
		
	//do-while using continue loop
		
		int i=1;
		do 
		{
		 if(i==20)
		 {
			 continue;
		 }
		 System.out.println(i);
			i++;
		}
		while(i<25);
		
		
		
	}

}
