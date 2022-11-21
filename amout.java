class amount{
public static void main(String args[])
	{
		int prize=25000;
		float dis=0f;
		float finalprize=0f;
			if(prize<=5000 && prize >=3000)
			{
				dis=prize*0.02f;
				finalprize=prize-dis;
				System.out.println("your prize is "+finalprize);
				System.out.println("your gift is coocker");
			}
			else if(prize<=8000 && prize >=5001)
			{
				dis=prize*0.05f;
				finalprize=prize-dis;
				System.out.println("your prize is "+finalprize);   
				System.out.println("your gift is stove");
			}
			else if(prize<=12000 && prize >=8001)
			{
				dis=prize*0.10f;
				finalprize=prize-dis;
				System.out.println("your prize is "+finalprize);
				System.out.println("your gift is iron box");
			}
			else if(prize<=15000 && prize >=12001)
			{
				dis=prize*0.12f;
				finalprize=prize-dis;
				System.out.println("your prize is "+finalprize);
				System.out.println("your gift is watch");
			} 
				else if(prize >=15001)
			{
				dis=prize*0.15f;
				finalprize=prize-dis;
				System.out.println("your prize is "+finalprize);
				System.out.println("your gift is mobile");
			}
	}
}