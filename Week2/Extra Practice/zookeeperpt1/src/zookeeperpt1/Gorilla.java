package zookeeperpt1;

public class Gorilla extends Mammal {
	public Gorilla(String nameinput) {
		super(nameinput);
	}
	
	public Gorilla() {
		super();
	}
	
	public void  throwSomething() {
		System.out.println("The Gorilla has thrown something and it looks like poop!!!");
		displayEnergy -= 5;
		
	}
	
	public void eatBannans() {
		System.out.println("Champin a bannan down for energy ");
		displayEnergy += 10;
	}
	
	public void climb() {
		System.out.println("Climbing to a high place. I have the high ground!!!!!");
		displayEnergy -= 10;
	}
	

}
