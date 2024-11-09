package opps4;

public class EpsonPrinter implements Printer {

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("print job using Epsonprinter");
	}
	@Override
	public void tShirtPrintJob() {
		System.out.println("T-Shirt printing job override");
	}

	@Override
	public void Scan() {
		// TODO Auto-generated method stub
		System.out.println("scaning using Epsonprinter");
	}

}
