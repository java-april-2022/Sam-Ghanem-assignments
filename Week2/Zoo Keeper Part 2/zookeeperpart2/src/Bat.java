
public class Bat extends Mammal{
	
	public Bat(String nameinput) {
		super(nameinput);
		this.Energy = 300;
	}
	public Bat() {
		super();
	}
	public void fly() {
		System.out.println("The bat is flying");
		Energy -= 50;
	}
	public void eatHumans() {
		System.out.println("The bat is eating a homie runnnnnnnnn");
		Energy += 25;
	}
	public void attackTown() {
		System.out.println("Nooooo my house. You damn bat");
		Energy -= 100;
	}
	

}
