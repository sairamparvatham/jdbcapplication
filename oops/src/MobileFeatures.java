
public class MobileFeatures {
	String Name;
	String model_no;
	int height;
	int width;
	int wheight;
	int noOfCameras ;
	Ram ramfeatures;
	Rom romfeatures;
	Processors processor_types;
	Display displayfeatures;
	Camera[] Camerafeatures;
	Speakers Speakersfeatures;
	Os Osfeatures;
	Battrey batteryfeatures;
	
	public MobileFeatures(String name, String model_no, int height, int width, int wheight, int noOfCameras,
			Ram ramfeatures, Rom romfeatures, Processors processor_types, Display displayfeatures,
			Speakers speakersfeatures, Os osfeatures, Battrey batteryfeatures,Camera[] Camerafeatures) {
		super();
		this.Name = name;
		this.model_no = model_no;
		this.height = height;
		this.width = width;
		this.wheight = wheight;
		this.noOfCameras = noOfCameras;
		this.ramfeatures = ramfeatures;
		this.romfeatures = romfeatures;
		this.processor_types = processor_types;
		this.displayfeatures = displayfeatures;
		Speakersfeatures = speakersfeatures;
		Osfeatures = osfeatures;
		this.batteryfeatures = batteryfeatures;
		this.Camerafeatures=Camerafeatures;
	}

	public void displayof() {
		System.out.println("mobile name: "+Name);
		System.out.println("model: "+model_no);
		System.out.println("height: "+height);
		System.out.println("width: "+width);
		System.out.println("No Of Cameras: "+noOfCameras);
		System.out.println("wheight: "+wheight);
		ramfeatures.displayram();
		romfeatures.displayrom();
		processor_types.displayprocesors();
//		Camerafeatures.displayCamera();
		Speakersfeatures.displayspeakers();
		Osfeatures.displayOsfeatures();
		displayfeatures.displayingdisplay();
		batteryfeatures.displayBattrey();
	}
}
