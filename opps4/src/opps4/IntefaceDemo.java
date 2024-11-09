package opps4;

public class IntefaceDemo {
	public static void main(String[] args) {
		EpsonPrinter ep= new EpsonPrinter();
		ep.printJob();
		ep.Scan();
		ep.tShirtPrintJob();
		ep.coffeCupPrintJob();

		Canonprinter cp=new Canonprinter();
		cp.printJob();
		cp.Scan();
		cp.tShirtPrintJob();
		cp.coffeCupPrintJob();
		HpPrinter hp= new HpPrinter();
		hp.printJob();
		hp.Scan();
		hp.tShirtPrintJob();
		hp.coffeCupPrintJob();
		Printer p = new Canonprinter();
		p.Scan();
		p.printJob();
		p.tShirtPrintJob();
		p.coffeCupPrintJob();
		Printer.threeDPrintingJob();
		
	}

}
