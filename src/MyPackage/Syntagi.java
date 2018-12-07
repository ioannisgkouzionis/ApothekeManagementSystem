/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

// Eisagw thn vivliothikh Date, wste na mporesw na dhlwsw thn imeromhnia ws typo Date
import java.util.Date;

public class Syntagi {
	// Dhlwsh metavlhtwn ths klashs Syntagh
	private String doctorLName;
	private int patient_AMKA;
	private Iatros giatros;
	private Asthenis as8enis;
	private Date date;
	private int totMed; // Metavlhth gia ton synoliko arithmo twn farmakwn pou thelei o xrhsths na exei h syntagh
	private Farmako[] farmako; // Pinakas gia ta farmaka apo ta opoia tha apoteleitai h syntagh
	private int[] quantity = new int[100]; // Metavliti gia tin posotita tou kathe farmakou
	
	// O prwtos constructor ths klashs Syntagi, o opoios perelamvanei orismata
	public Syntagi(Iatros iatros, Asthenis asthenis, Date dt, int tmp2) {
		giatros = iatros;
		as8enis = asthenis;
		date = dt;
		totMed = tmp2;
	}
	
	// O deuteros constructor ths klashs Syntagi, o opoios den exei orismata
	public Syntagi() {
		this.doctorLName = null;
		this.patient_AMKA = 0;
		for (int i = 0; i < 100; i++)
		{
			this.farmako[i] = null;
			this.quantity[i] = 0;
		}
	}
	
	// Methodos gia thn dhmiourgia pinaka farmakwn
	public void dimiourgiaPinakaFarmakwn()
	{
		farmako = new Farmako[6];
	}
	
	// Methodos gia na gemisw ton pinaka twn farmakwn
	public void gemismaPinakaFarmakwn(int num, Farmako medi, int posotita)
	{
		farmako[num] = medi;
		quantity[num] = posotita; 
	}
	
	// Methodos gia na pairnw to AMKA tou asthenous
	public int getPatientAmka()
	{
		return as8enis.getAMKA();
	}
	
	// Methodos gia na pairnw to epwnymo tou iatrou
	public String getDoctorLname()
	{
		return giatros.getLname();
	}

	// Set kai Get methodoi gia ka8emia apo tis metavlites ths klashs

	public String getDoctorLName() {
		return doctorLName;
	}

	public void setDoctorLName(String doctorLName) {
		this.doctorLName = doctorLName;
	}

	public int getPatient_AMKA() {
		return patient_AMKA;
	}

	public void setPatient_AMKA(int patient_AMKA) {
		this.patient_AMKA = patient_AMKA;
	}
	
	public Iatros getGiatros() {
		return giatros;
	}

	public void setGiatros(Iatros giatros) {
		this.giatros = giatros;
	}

	public Asthenis getAs8enis() {
		return as8enis;
	}

	public void setAs8enis(Asthenis as8enis) {
		this.as8enis = as8enis;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotMed() {
		return totMed;
	}

	public void setTotMed(int totMed) {
		this.totMed = totMed;
	}

	public Farmako[] getFarmako() {
		return farmako;
	}

	public void setFarmako(Farmako[] farmako) {
		this.farmako = farmako;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	// H methodos print emtypwnei tis metavlites tis klasis
	public void print() {
		System.out.println();
		System.out.println("DOCTOR'S INFORMATION: ");
		giatros.print();
		System.out.println();
		System.out.println("PATIENT'S INFORMATION: ");
		as8enis.print();
		System.out.println();
		System.out.println("DATE IS: " + date);
		System.out.println();
		for (int i = 0; i < totMed; i++)
		{
			System.out.println("INFORMATION FOR MEDICINE No." + (i+1));
			farmako[i].print();
			System.out.println("POSOTHTA FARMAKOU: " + quantity[i]);
			System.out.println();
		}
	}
}
