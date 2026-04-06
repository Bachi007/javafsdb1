class ElseIfDay3{
 	
	public static void main(String args[])
	{	
		
	int percent=85;
	String grade="";
		if(percent>=90 && percent<=100)
			{
			grade="A grade";
			}
		else if(percent>=80 && percent<90)
			{
			grade="B grade";
			}
		else if(percent>=70 && percent<80)
			{
			grade="C grade";
			}
		else if(percent>=60 && percent<70)
			{
			grade="D grade";
			}
		else if(percent>=50 && percent<60)
			{
			grade="E grade";
			}
		else{
			grade="Fail";
			}

		System.out.println(percent+" is "+grade);
	}

	
}