public class RedheadDuck extends Duck{
	public RedheadDuck() { 
		QuackBehavior = new MuteQuack(); 
		FlyBehavior = new FlyWithRocket(); 
	}	 
	
	@Override 
	public void swim() { 
		System.out.println("RedheadDuck会游泳。"); 
	} 

	@Override 
	public void display() { 
		System.out.println("RedheadDuck是这样的。"); 
	} 	

}
