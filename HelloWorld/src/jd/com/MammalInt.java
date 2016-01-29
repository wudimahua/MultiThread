package jd.com;

public class MammalInt implements Animal {
	public void eat() {
		System.out.println("Mammal eat");
	}
	
	public void travel() {
		System.out.println("Mammal travel");
	}
	
	public int noOfLegs() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt mammalInt = new MammalInt();
		mammalInt.eat();
		mammalInt.travel();
	}

}
