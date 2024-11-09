
public class MobileFeaturesTest {
	public static void main(String[] args) {
		Rom rom=new Rom ("16 Gb");
		Ram ram=new Ram("512gb");
		Speakers s=new Speakers("Supports Dollby atoms","Soney speakar","50hz","2 speakers");
		Display d=new Display("amo led","6 intch","1024*4000 pix");
		Os o=new Os("andriod","13.00v");
		Battrey b=new Battrey("lythium-ion","5000mah","10hours","30 min");
		Processors p=new Processors("snap dragon","4563.por","2mhz",8);
		Camera c=new Camera("primary","108mp","clarity pictures");
		Camera c1=new Camera("secondary","2mp","potrate");
		Camera c2=new Camera("ternery","5mp","wide angle");
		Camera[] dummy= {c,c1,c2};
		MobileFeatures feature=new MobileFeatures("mi","12pro",7,6,500,4,ram,rom,p,d,s,o,b,dummy);
		feature.displayof();
		rom.displayrom();
		ram.displayram();
		s.displayspeakers();
		b.displayBattrey();
		d.displayingdisplay();
		o.displayOsfeatures();
		b.displayBattrey();
		for( Camera st: dummy) {
			st.displayCamera();
			System.out.println("---------------------------");
		}
	}

}
