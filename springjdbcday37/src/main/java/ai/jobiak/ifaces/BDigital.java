package ai.jobiak.ifaces;

public class BDigital {

	Printable printable;
	PackingIface packing;
	public BDigital() {
		
		// TODO Auto-generated constructor stub
	}
	public Printable getPrintable() {
		return printable;
	}
	public void setPrintable(Printable printable) {
		this.printable = printable;
	}
	public PackingIface getPacking() {
		return packing;
	}
	public void setPacking(PackingIface packing) {
		this.packing = packing;
	}
	public void doPublishing() {
		// TODO Auto-generated method stub
		
	}
	public void publish() {
		// TODO Auto-generated method stub
		printable.print();
		packing.doPacking();
		
	}
	public void doInit()
	{
		System.out.println("from init().....");
	}
	
	public void doDestroy()
	{
		System.out.println("from Destroy().....");
	}
	
	
	
	
}
