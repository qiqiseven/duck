public class RubberDuck extends Duck{
	public RubberDuck() { 
		QuackBehavior = new Squeak(); 
		FlyBehavior = new FlyNoWay(); 
	}	
	
	@Override 
	public void swim() { 
		System.out.println("RubberDuck����Ӿ��"); 
	} 

	@Override 
	public void display() { 
		System.out.println("RubberDuck�������ġ�"); 
	} 	

}
