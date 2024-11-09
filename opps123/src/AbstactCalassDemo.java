
interface Vechile {
	void Wheels();

	void start();

	void move();

	void stop();

}

abstract class Myvachile implements Vechile {
	public void start() {
		System.out.println("start...");
	}

	public void move() {
		System.out.println("move...");
	}

	public void stop() {
		System.out.println("stop...");
	}

	public abstract void Wheels();
}

class bike extends Myvachile {

	@Override
	public void Wheels() {
		System.out.println("2");
		// TODO Auto-generated method stub

	}
}
class Car extends Myvachile {

	@Override
	public void Wheels() {
		System.out.println("4....");
		// TODO Auto-generated method stub
	}

}
public class AbstactCalassDemo {
	public static void main(String[] args) {
		bike b = new bike();
		b.stop();
		b.start();
		b.move();
		b.Wheels();
		Car c = new Car();
		c.stop();

	}
}
