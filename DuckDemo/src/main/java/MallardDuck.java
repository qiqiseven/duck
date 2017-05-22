public class MallardDuck extends Duck {
	public MallardDuck() { 
		QuackBehavior = new Quack(); 
		FlyBehavior = new FlyWithWings(); 
	}
	
	@Override 
	public void swim() { 
		System.out.println("MallardDuck����Ӿ��"); 
	} 

	@Override 
	public void display() { 
		System.out.println("MallardDuck�������ġ�"); 
	}
	
}
