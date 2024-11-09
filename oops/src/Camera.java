
public class Camera {
	String Cameras,picles,perpouse;
	public Camera(String Cameras, String picles, String perpouse) {
		super();
		this.Cameras = Cameras;
		this.picles = picles;
		this.perpouse = perpouse;
	}
	public void displayCamera() {
		System.out.println("NO OF Cameras: "+Cameras);
		System.out.println("pixcels: "+picles);
		System.out.println(" perpouse: "+perpouse);
	}
	

}
