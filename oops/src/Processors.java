
public class Processors {
	String name,model,accessspeed;
	int cores;
	public Processors(String name, String model, String accessspeed, int cores) {
		super();
		this.name = name;
		this.model = model;
		this.accessspeed = accessspeed;
		this.cores = cores;
	}
	public void displayprocesors() {
		System.out.println("Processor Name: "+name);
		System.out.println("Processor model: "+model);
		System.out.println("Processor access speed: "+accessspeed);
		System.out.println("Processor no of cores: "+name);

	}
}
