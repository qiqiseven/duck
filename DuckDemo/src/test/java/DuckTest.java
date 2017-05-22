
import org.junit.Test;


public class DuckTest {

	@Test
	public void MallardDuck() { 
		Duck MallardDuck = new MallardDuck(); 
		System.out.println("MallardDuck:");
		MallardDuck.swim(); 
		MallardDuck.display(); 
		MallardDuck.performQuack(); 
		MallardDuck.performFly();	 
	} 

	@Test
	public void RedheadDuck() { 
		Duck RedheadDuck = new RedheadDuck(); 
		System.out.println("RedheadDuck:");
		RedheadDuck.swim(); 
		RedheadDuck.display(); 
		RedheadDuck.performQuack(); 
		RedheadDuck.performFly();	 
	} 
	
	@Test
	public void RubberDuck() { 
		Duck RubberDuck = new RubberDuck(); 
		System.out.println("RubberDuck:");
		RubberDuck.swim(); 
		RubberDuck.display(); 
		RubberDuck.performQuack(); 
		RubberDuck.performFly();	 
	} 

}
