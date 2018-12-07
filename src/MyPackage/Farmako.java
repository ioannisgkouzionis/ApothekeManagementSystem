/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

public class Farmako {
	// Dilwsi metavlitwn tis klasis Farmako
	private int code;
	private String name;
	private float price;
	
	// O constructor ths klashs Farmako
	public Farmako() {
		this.code = 0;
		this.name = null;
		this.price = 0;
	}

	// Set kai Get methodoi gia ka8emia apo tis metavlites ths klashs
	public int getCode() {
		return code;
	}

	public int setCode(int code) {
		return this.code = code;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	// H methodos print emtypwnei tis metavlites tis klasis
	public void print() {
		System.out.println("KWDIKOS FARMAKOU: " + this.getCode());
		System.out.println("ONOMA FARMAKOU: " + this.getName());
		System.out.println("TIMH FARMAKOU: " + this.getPrice());
	}
	
}
