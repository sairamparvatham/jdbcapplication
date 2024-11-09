
public class Speakers {
	String feature,name,soundCapasity,no_of_speakers;

	public Speakers(String feature, String name, String soundCapasity, String no_of_speakers) {
		super();
		this.feature = feature;
		this.name = name;
		this.soundCapasity = soundCapasity;
		this.no_of_speakers = no_of_speakers;
	}
	public void displayspeakers() {
		System.out.println("No of speakers : "+no_of_speakers);
		System.out.println("speakers aceptable features: "+feature);
		System.out.println("speakers name: "+name);
		System.out.println("speakers sound Capasity: "+soundCapasity);
		
		
	}

}
