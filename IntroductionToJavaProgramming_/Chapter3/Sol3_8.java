public
class Sol3_8 { public static void main(String [] args){
Scanner scan=new Scanner(System.in);
  System.out.println("Please enter three number");
  int a=scan.nextInt();
  int b=scan.nextInt();
  int c=scan.nextInt();
]
		int temp;
		if (b < a || c < a)
		{
			if (b < a)
			{
				temp = a;
				a = b;
				b = temp; 
			}
			if (c < a)
			{
				temp = a;
				a = c;
				c = temp;
			}
		}
		if (c < b)
		{
			temp = b;
			b = c;
			c = temp;
		}

		System.out.println(a + " " + b + " " + c);
	}
}
  
  
 
