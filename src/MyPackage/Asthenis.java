/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

public class Asthenis {
	// Dhlwsh metavlhtwn ths klashs Asthenhs
	private String fname;
	private String lname;
	private int AMKA;
	
	// O constructor ths klashs Asthenis
	public Asthenis() {
		this.fname = null;
		this.lname = null;
		this.AMKA = 0;
	}

	// Set kai Get methodoi gia ka8emia apo tis metavlites ths klashs
	public String getFname() {
		return fname;
	}

	public String setFname(String fname) {
		return this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public String setLname(String lname) {
		return this.lname = lname;
	}

	public int getAMKA() {
		return AMKA;
	}

	public int setAMKA(int amka) {
		return AMKA = amka;
	}
	
	// H methodos print emtypwnei tis metavlites tis klasis
	public void print() {
		System.out.println("ONOMA ASTHENH: " + this.getFname());
		System.out.println("EPWNYMO ASTHENH: " + this.getLname());
		System.out.println("AMKA ASTHENH: " + this.getAMKA());
	}
	
}
