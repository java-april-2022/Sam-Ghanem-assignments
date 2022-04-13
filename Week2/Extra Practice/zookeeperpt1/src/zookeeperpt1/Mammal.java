package zookeeperpt1;

public class Mammal {
	public int displayEnergy;
	public  String name;
	
	
	
public Mammal() {
		super();
	}

//	constructor 
	public Mammal(String nameinput) {
		this.name = nameinput;
		this.displayEnergy = 100;
		}
	
	public void getEnergylvl() {
		String dkSmash = String.format("%s level of energy of %s \n", this.displayEnergy , this.name );
		System.out.println(dkSmash);
	}

}
