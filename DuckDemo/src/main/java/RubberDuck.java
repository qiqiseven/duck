public class RubberDuck extends Duck{
	public RubberDuck() { 
		QuackBehavior = new Squeak(); 
		FlyBehavior = new FlyNoWay(); 
	}	
	
	@Override 
	public void swim() { 
		System.out.println("RubberDuck会游泳。"); 
	} 

	@Override 
	public void display() { 
		System.out.println("RubberDuck是这样的。"); 
	} 	

}
