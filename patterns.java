package assignment1;
class star_patt
{
	public void stars() {
	int n = 4;
	int i = 1;
	int j = 1;
	System.out.println();
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=i;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		for(i=2;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println();
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" "); 
			}
			for (j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

class num_patt
{
	public void numbers() {
	int n = 5;	
	int i = 1;
	int j = 1;
	System.out.println();
	System.out.println();
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(" " + j);
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	int k = 1;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(k++ + " ");
		}
		System.out.println();
	}
	}
}

public class patterns 
{
	public static void main(String[] args) 
	{
		star_patt s1 = new star_patt();
        s1.stars();
        num_patt s2 = new num_patt();
        s2.numbers();
	}

}
