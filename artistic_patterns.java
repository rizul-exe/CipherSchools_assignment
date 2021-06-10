package assignment1;
public class artistic_patterns 
{
	static void horz_lines(int size) 
	{
		System.out.print("+");
		for(int i = 0;i<(size)*2;i++) 
		{
			System.out.print("-");
		}
		System.out.println("+");
	}
	static void mid_line(int size) 
	{
		System.out.print("|");
		System.out.print("<");
		if(size%2==0) 
		{
			for(int i = 0;i<(2*size - 2);i++) 
			{
				System.out.print("-");
			}
		}
			else {
				for(int i = 0;i<(2*size - 2);i++)
				System.out.print("=");
			}
			
		System.out.print(">");
		System.out.println("|");
	}
	static void upper_half(int size) 
	{
		for(int row=0;row<size-1;row++) 
		{
			System.out.print("|");
			for(int i=0;i<size-row-1;i++) 
			{
				System.out.print(" ");
			}
			System.out.print("/");
			for(int i=0;i<(2*row);i++)
			{
				if(row%2!=0)
					System.out.print("-");
					else 
						System.out.print("=");
			}
			System.out.print("\\");
			for(int i=0;i<size-row-1;i++) 
			{
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
		
	}
	static void lower_half(int size) 
	{
		 for(int row=size-2; row>=0; row--) 
		 {
	            System.out.print("|");
	            for(int i=0; i<size-row-1;i++) 
	            {
	                System.out.print(" ");
	            }
	            System.out.print("\\");

	            for(int i=0; i<2*row;i++) 
	            {
	                if(row%2==0)
	                    System.out.print("=");
	                else
	                    System.out.print("-");
	            }

	            System.out.print("/");

	            for(int i=0; i<size-row-1;i++) 
	            {
	                System.out.print(" ");
	            }
	            System.out.println("|");
	            }
	}
	
	static void pattern(int size) 
	{
		horz_lines(size);
	    upper_half(size);
		mid_line(size);
		lower_half(size);
		horz_lines(size);
	}
	public static void main(String[] args) 
	{
		
	
		pattern(1);

	}

}
