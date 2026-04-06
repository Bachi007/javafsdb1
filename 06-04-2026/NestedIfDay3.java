class NestedIfDay3{
 	
	public static void main(String args[])
	{	
		int a=5;
		int b=7;
		int c=12;
		//a>b -> a>c -> a is biggest || c is biggest
		//a<b -> b>c ->b is biggest || c is biggest

		if(a>b){
			if(a>c)
			{
			System.out.println(a+" is big");
			}
			else{
			System.out.println(c+" is big");
			}
		} 
		else{
			if(b>c)
			{
			System.out.println(b+" is big");
			}
			else{
			System.out.println(c+" is big");
			
			}
		}
			

	}
	
}