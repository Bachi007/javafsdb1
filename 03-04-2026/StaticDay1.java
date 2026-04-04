class StaticDay1{
 	static int num1=5;
	static int num2=7;
	public static void main(String args[])
	{	InstanceDay1 d1=new InstanceDay1();
		d1.display();
		System.out.println(num1+num2);
	}
	public void display(){
		System.out.println(num1+num2);
	}

}