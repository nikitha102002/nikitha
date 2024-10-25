class Height{
	public static void main(String[] args)
	{
		double nikkiHeight=5.4;
		double darshanHeight=6.9;
		double kavanaHeight=5.3;
		double shivaliHeight=5.5;
		double poojithaHeight=5.6;
		double manojHeight=6.10;
		double bhanuHeight=5.7;
		double pruthviHeight=6.11;
		double kavyaHeight=5.0;
		double bhavyaHeight=4.9;
		
		double[] heights={nikkiHeight,darshanHeight,kavanaHeight,shivaliHeight,poojithaHeight,manojHeight,
		bhanuHeight,pruthviHeight,kavyaHeight,bhavyaHeight};
		
		for(int height=0; height<10; height++)
		{
			double ref=heights[height];
			if(ref>5.9)
			System.out.println("Height greater than 5.9:"+ref);
		}
		for(int height=0; height<10; height++)
		{
			double ref=heights[height];
			if(ref<5.3)
			System.out.println("Height less than 5.3:"+ref);
		}
	}
}