class SwitchDay3{
 	
	public static void main(String args[])
	{	
		int day=10;	
		System.out.println(switch(day){		
		case 0,4-> "Weekend";
		case 1,2,3->"Weekdays";
		default->"Invalid day";
		});

	}

	
}