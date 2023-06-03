package homework;

public class Dude {
	public String name;
	public int hp;
	public int mp=0;
	
	
	public void sayName() {
		System.out.println(name);
		}
	public void punchFacr(Dude target) {
		target.hp -=10;
	}
}
