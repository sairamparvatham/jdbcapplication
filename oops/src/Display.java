
public class Display {
	String type,size,picels;

	public Display(String type, String size, String picels) {
		super();
		this.type = type;
		this.size = size;
		this.picels = picels;
	}
	public void displayingdisplay() {
		System.out.println("Display type"+type);
		System.out.println("Display size"+size);
		System.out.println("Display picels"+picels);
	}
}
