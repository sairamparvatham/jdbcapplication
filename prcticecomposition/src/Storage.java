
public class Storage {
	String ram;
	String rom;
	public Storage(String ram, String rom) {
		super();
		this.ram = ram;
		this.rom = rom;
	}
	public void display() {
		
		System.out.println("Ram: "+ram);
		System.out.println("rom"+rom);
	}
}
