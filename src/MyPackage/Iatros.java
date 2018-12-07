/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

public class Iatros {
	// Dhlwsh metavlhtwn ths klashs Iatros
	private String fname;
	private String lname;
	private int AM;
	
	// O constructor ths klashs Iatros
	public Iatros() {
		this.fname = null;
		this.lname = null;
		this.AM = 0;
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

	public int getAM() {
		return AM;
	}

	public int setAM(int am) {
		return AM = am;
	}
	
	// H methodos print emtypwnei tis metavlites tis klasis
	public void print() {
		System.out.println("ONOMA IATROU: " + this.getFname());
		System.out.println("EPWNYMO IATROU: " + this.getLname());
		System.out.println("AM IATROU: " + this.getAM());
	}
	
}	