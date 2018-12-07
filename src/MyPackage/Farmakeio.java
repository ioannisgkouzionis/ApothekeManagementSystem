/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

import java.util.Random; // Eisagwgh ths vivliothikhs Random gia na dinei to systhma automata AM gia ton iatro, AMKA gia ton asthenh kai kwdiko gia to farmako
import java.util.Date;

public class Farmakeio {
	// Dhlwsh metavlhtwn ths klashs Farmakeio
	private String fname;
	private String lname;
	private String address;
	private String telephone;
	
	private int i = 0, tmp_1 = 0, tmp_2 = 0, tmp_3 = 0, a = 0, h = 0; // Dilwseis metavlitwn-metritwn
	
	// O constructor ths klashs Farmakeio
	public Farmakeio (String fn, String ln, String ad, String tl) {
	      fname = fn;
	      lname = ln;
	      address = ad;
	      telephone = tl;
	}
	
	// Set kai Get methodoi gia ka8emia apo tis metavlites ths klashs
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	// H methodos print emtypwnei tis metavlites tis klasis farmakeio
	public void print() {
		System.out.println("ONOMA IDIOKTITH: " + fname);
		System.out.println("EPWNYMO IDIOKTITH: " + lname);
		System.out.println("DIEUTHINSH FARMAKEIOU: " + address);
		System.out.println("THLEFWNO FARMAKEIOU: " + telephone);
		System.out.println();
	}
	
	// Ektelesi kiriws programmatos
	
	//Create a StandardInputRead object. Gia na diavazei apo to plhktrologio
	StandardInputRead sir = new StandardInputRead();
	
	// Gia ta farmaka
	Farmako[] medicine = new Farmako[100]; // Dhmiourgia pinaka farmakwn pou dexetai mexri 100 farmaka
	int numOfMedicine = 0; // O arithmos twn farmakwn pou exoun eisaxthei sto farmakeio
	
	// Gia tous giatrous
	Iatros[] doctor = new Iatros[100]; // Dhmiourgia pinaka iatrwn pou dexetai mexri 100 iatrous
	int numOfDoctors = 0; // O arithmos twn iatrwn pou exoun eisaxthei sto farmakeio
	
	// Gia tous astheneis
	Asthenis[] patient = new Asthenis[100]; // Dhmiourgia pinaka asthenwn pou dexetai mexri 100 astheneis
	int numOfPatient = 0; // O arithmos twn asthenwn pou exoun eisaxthei sto farmakeio
	
	// Gia tis syntages
	Syntagi[] prescription = new Syntagi[1000]; // Dhmiourgia pinaka syntagwn pou dexetai mexri 1000 syntages
	int numOfPrescription = 0; // O arithmos twn syntagwn pou exoun eisaxthei sto farmakeio
	
	// H RANDOM PARAGEI PSEYDOTYXAIOYS ARITHMOYS KAI TH XRHSIMOPOIOYMAI GIA NA DWSOYME KWDIKOYS
	Random rnd = new Random();
	
	// Methodos gia thn eisagwgh farmakou
	public void eisagwgiFarmakou() {
		// Elegxw o arithmos twn farmakwn na mhn ypervei ton megisto dynato
		if(numOfMedicine < 100)
		{
			System.out.println();	
			medicine[numOfMedicine] = new Farmako();	
			medicine[numOfMedicine].setCode(rnd.nextInt(1000000)); // To sistima dinei automata ton kwdiko tou farmakou
			medicine[numOfMedicine].setName(sir.readString("DWSTE TO ONOMA TOU FARMAKOU: ")); // Zitaw apo ton xristi na mou dwsei to onoma tou farmakou
			medicine[numOfMedicine].setPrice(sir.readPositiveFloat("DWSTE THN TIMH TOU FARMAKOU: ")); // Pairnw apo ton xristi tin timi tou farmakou
			System.out.println();
			// Elegxos monadikotitas tou kwdikou tou farmakou
			h = rnd.nextInt(1000000);
			for(int i = 0; i < numOfMedicine; i++)
			{
				if(medicine[i].getCode() == h)
				{
					System.out.println();
					System.out.println("O KWDIKOS AUTOS YPARXEI HDH!");
					h = rnd.nextInt(10);
					System.out.println();
				}
			}
			numOfMedicine++;
		}
		// An xeperastei o megistos arithmos farmakwn
		else
		{
			System.out.println("DEN MPOREITE NA EISAGETE ALLA FARMAKA!");
			System.out.println("EXEI SYMPLHRWTHEI O PROVLEPOMENOS ARITHMOS!");
		}
	}
	
	// Methodos gia thn eisagwgh iatrou
	public void eisagwgiGiatrou() {
		// Elegxw o arithmos twn iatrwn na mhn ypervei ton megisto dynato
		if(numOfDoctors < 100)
		{
			System.out.println();
			doctor[numOfDoctors] = new Iatros();
			doctor[numOfDoctors].setFname(sir.readString("DWSTE TO ONOMA TOU GIATROU: ")); // Pairnei apo ton xristi to onoma tou giatrou
			doctor[numOfDoctors].setLname(sir.readString("DWSTE TO EPWNYMO TOU GIATROU: ")); // Pairnei apo ton xristi to epitheto tou giatrou
			doctor[numOfDoctors].setAM(rnd.nextInt(1000000)); // To sistima dinei automata ton am tou giatrou
			System.out.println();
			
			// Elegxos monadikotitas tou am tou giatrou
			h = rnd.nextInt(1000000);
			for(int i = 0; i < numOfDoctors; i++)
			{
				if(doctor[i].getAM() == h)
				{
					System.out.println();
					System.out.println("O KWDIKOS AUTOS YPARXEI HDH!");
					h = rnd.nextInt(1000000);
					System.out.println();
				}
			}
			numOfDoctors++;
		}
		else
		{
			System.out.println("DEN MPOREITE NA EISAGETE ALLOUS GIATROUS!");
			System.out.println("EXEI SYMPLHRWTHEI O PROVLEPOMENOS ARITHMOS!");
		}
	}
	
	// Methodos gia thn eisagwgh asthenh
	public void eisagwgiAstheni() {
		// Elegxw o arithmos twn asthenwn na mhn ypervei ton megisto dynato
		if(numOfPatient < 100)
		{
			System.out.println();
			patient[numOfPatient] = new Asthenis();
			patient[numOfPatient].setFname(sir.readString("DWSTE TO ONOMA TOU ASTHENH: ")); // Pairnei to onoma tou asthenh apo ton xrhsth
			patient[numOfPatient].setLname(sir.readString("DWSTE TO EPWNYMO TOU ASTHENH: ")); // Pairnei to epitheto tou asthenh apo ton xrhsth
			patient[numOfPatient].setAMKA(rnd.nextInt(1000000)); // To sistima dinei automata ton amka tou asthenous
			System.out.println();
			
			//Elegxos monadikotitas tou amka tou astheni
			h = rnd.nextInt(1000000);
			for(int i = 0; i < numOfPatient; i++)
			{
				if(patient[i].getAMKA() == h)
				{
					System.out.println();
					System.out.println("O KWDIKOS AUTOS YPARXEI HDH!");
					h = rnd.nextInt(1000000);
					System.out.println();
				}
			}
			numOfPatient++;
		}
		else
		{
			System.out.println("DEN MPOREITE NA EISAGETE ALLOUS ASTHENEIS!");
			System.out.println("EXEI SYMPLHRWTHEI O PROVLEPOMENOS ARITHMOS!");
		}
	}
	
	// Methodos gia thn eisagwgh syntaghs
	public void eisagwgiSintagis() {
		//Elegw ean mporei na eisaxthei suntagi
		if(numOfMedicine != 0 && numOfDoctors != 0 && numOfPatient != 0 && numOfPrescription < 1000) 
		{
			tmp_1 = numOfPrescription + 1;
			// Emfanizw to synolo twn giatrwn pou yparxoun sto farmakeio
			for(i = 0; i < numOfDoctors; i++)
			{
				System.out.println();
				System.out.println(i + ".  STOIXEIA IATROU: ");
	    	  	doctor[i].print();
	    	  	System.out.println();
			}
			// O xristis epilegei ton ari8mo pou antistoixei ston giatro pou egrapse thn syntagh
			tmp_1 = sir.readPositiveInt("EPILEKSTE TON GIATRO POU EGGRAPSE THN SYNTAGH: "); 
			// Elegxw an o yparxei o giatros pou edwse o xristis
			while(tmp_1 < 0 || tmp_1 > numOfDoctors - 1)
	  	    {
				tmp_1 = sir.readPositiveInt("DEN YPARXEI GIATROS ME TO NOUMERO POU PLIKTROLOGISATE! PARAKALW KSANADWSTE ARITHMO: ");
				System.out.println();
	  	    }
			
			i = numOfPrescription + 1;
			// Emfanizw to synolo twn asthenwn pou yparxoun sto farmakeio
			for(i = 0; i < numOfPatient; i++)
		    {
				System.out.println();
				System.out.println(i + ".  STOIXEIA ASTHENOUS: ");
	            patient[i].print();
	            System.out.println();
		    }
			// O xristis epilegei ton ari8mo pou antistoixei ston as8enh gia ton opoio proorizetai i syntagh
			i = sir.readPositiveInt("EPILEKSTE TON ASTHENH GIA TON OPOIO PROORIZETAI H SYNTAGH: "); 
			// Elegxw an o yparxei o as8enhs pou edwse o xristis
			while(i  < 0 || i > numOfPatient - 1)
	  	    {
				i = sir.readPositiveInt("DEN YPARXEI ASTHENHS ME TO NOUMERO POU PLIKTROLOGISATE! PARAKALW KSANADWSTE ARITHMO: ");
				System.out.println();
	  	    }
			
			// O xristis eisagei tn synoliko ar8mo farmakwn pou 8a exei h syntagh
			System.out.println();
			tmp_2= sir.readPositiveInt("EISAGETAI TON ARITHMO TWN FARMAKWN POU EPITHUMEITAI NA EXEI H SYNTAGH(1-6): ");
			// Elegxw an o ari8mos twn farmakwn pou edwse o xristis einai egkyros
			while(tmp_2 < 0 || tmp_2 > 6)
	  	    {
				tmp_2 = sir.readPositiveInt("PARAKALW KSANAEISAGETAI SYNOLIKO ARITHMO FARMAKWN(1-6): ");
				System.out.println();
	  	    }
			// Apo8ikeuw tis times ston constructor Syntagi
			prescription[numOfPrescription] = new Syntagi(doctor[tmp_1], patient[i], sir.readDate("\nEISAGETAI THN HMEROMHNIA EGGRAFHS THS SYNTAGHS: "), tmp_2);
			
			prescription[numOfPrescription].dimiourgiaPinakaFarmakwn(); // Kalw tin methodo auti gia na dimiourgisw ton pinaka me ton arithmo twn farmakwn pou mou edwse o xrhsths
			
			// Emfanizw to synolo twn farmakwn
			for(i = 0; i < numOfMedicine; i++)
			{
				System.out.println();
				System.out.println(i + ".  STOIXEIA FARMAKOU: ");
				medicine[i].print();
			}
			
			for(i = 0; i < tmp_2; i++)
  	     	{
				a = i + 1; 
				// An h syntagh apoteleitai apo perissotera tou enos farmaka tote...
				if(tmp_2 != 1)
  	    	 	{
					System.out.println();
					tmp_1 = sir.readPositiveInt("ARITHMOS " + a + "ou FARMAKOU: ");
					tmp_3 = sir.readPositiveInt("POSOTHTA " + a + "ou FARMAKOU: ");
  	    	    	System.out.println();
  	    	 	}
				// An h syntagh apoteleitai apo ena farmako tote...
				else
  	    	 	{
					System.out.println();
					tmp_1 = sir.readPositiveInt("ARITHMOS FARMAKOU: ");
					tmp_3 = sir.readPositiveInt("POSOTHTA FARMAKOU: ");
  	    		 	System.out.println();
  	    	 	}
  	    	 	// Elegxw an o ari8mos pou edwse o xristis einai egkyros
				while(tmp_1 < 0 || tmp_1 > numOfMedicine - 1)
  	    	 	{
  	    	 		tmp_1 = sir.readPositiveInt("EISAGATAI LATHOS DEDOMENA!DWSTE KSANA TIMH: ");
  	    		 	System.out.println();
  	    	 	}
  	    	 	
				prescription[numOfPrescription].gemismaPinakaFarmakwn(i, medicine[tmp_1], tmp_3); // Kalw tin methodo auti gia na gemisw ton pinaka twn farmakwn pou dimiourgisa proigoumenws
  	     	}
			numOfPrescription++;
		}
		// Elegxw pote den mporei na eisaxthei syntagh
		else
		{
			// An oi syntages pou exoun eisaxthei xeperasan to epitrepto orio
			if(numOfPrescription >= 1000)
  		  	{
  				System.out.print("DEN MPOREITAI NA EISAGETAI ALLES SYNTAGES!EXEI KALIFTHEI O MEGISTOS ARITHMOS TOUS");
  				System.out.println();
  		  	}
			// An den yparxoun iatroi, astheneis kai farmaka sto farmakeio
			else if(numOfDoctors == 0 && numOfPatient == 0 && numOfMedicine == 0)
  		  	{
  				System.out.print("DEN YPARXOUN DIATHESIMOI GIATROI, ASTHENEIS KAI FARMAKA WSTE NA OLOKLIRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI GIATROUS, ASTHENEIS KAI FARMAKA!");
  				System.out.println();
  		  	}
			// An den yparxoun iatroi kai astheneis
			else if(numOfDoctors == 0 && numOfPatient == 0)
  	      	{
				System.out.print("DEN YPARXOUN DIATHESIMOI GIATROI KAI ASTHENEIS GIA NA OLOKLHRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI GIATROUS KAI ASTHENEIS!");
  	    	  	System.out.println();
  	      	}
			// An den yparxoun iatroi kai farmaka
			else if(numOfDoctors == 0 && numOfMedicine == 0)
  	      	{
				System.out.print("DEN YPARXOUN DIATHESIMOI GIATROI KAI FARMAKA GIA NA OLOKLHRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI GIATROUS KAI FARMAKA!");
  	    	  	System.out.println();
  	      	}
			// An den yparxoun astheneis kai farmaka
			else if(numOfPatient == 0 && numOfMedicine == 0)
  	     	{
				System.out.print("DEN YPARXOUN DIATHESIMOI ASTHENEIS KAI FARMAKA GIA NA OLOKLHRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI ASTHENEIS KAI FARMAKA!");
  	    	  	System.out.println();
  	      	}
			// An den yparxoun iatroi
			else if (numOfDoctors == 0)
  		  	{
  				System.out.print("DEN YPARXOUN DIATHESIMOI GIATROI GIA NA OLOKLHRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI GIATROUS!");
  				System.out.println();
  		  	}
  		  	// An den yparxoun astheneis
			else
  		  	{
  				System.out.print("DEN YPARXOUN DIATHESIMOI ASTHENEIS GIA NA OLOKLHRWTHEI H EISAGWGH SYNTAGHS!PARAKALW EISAGETAI ASTHENEIS!");
  				System.out.println();
  		  	}
		}
	}
	
	// Methodos gia thn diagrafh farmakou
	public void diagrafiFarmakou() {
		// Elegxw an yparxoun farmaka sto farmakeio
		if(numOfMedicine != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA FARMAKWN");
			// Emfanizw ola ta famraka tou farmakeiou
			for(int j = 0; j < numOfMedicine; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA FARMAKOU: ");
				System.out.println();
	    	  	medicine[j].print();
			}
			System.out.println();
			tmp_1 = sir.readPositiveInt("DWSTE TON ARITHMO TOU FARMAKOU POU THELETAI NA DIAGRAFEI: ");
			System.out.println();
			// Elegxos egkyrotitas tou ari8mou pou edwse o xristis
			while(tmp_1 < 0 || tmp_1 > numOfMedicine)
			{
				tmp_1 = sir.readPositiveInt("KSANAEISAGETAI ARITHMO FARMAKOU: ");
			}
			// Metakinw ta epomena farmaka mia 8esi pio aristera
			for(int k = tmp_1; k < numOfMedicine - 1; k++)
			{
				medicine[k] = medicine[k+1]; // Metakinw to farmako sti 8esi k+1 pio aristera
			}
			numOfMedicine--; // Meiwse ton ari8mo twn farmakwn
		}
		else
		{
			System.out.print("\nDEN YPARXOUN DIATHESIMA FARMAKA PROS DIAGRAFH!\n");
			System.out.println();
		}
	}
	
	// Methodos gia thn diagrfh iatrou
	public void diagrafiGiatrou() {
		// Elegxw an yparxoun iatroi sto farmakeio
		if(numOfDoctors != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA IATRWN");
			// Emfanizw olous tous giatrous
			for(int j = 0; j < numOfDoctors; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA IATROU: ");
				System.out.println();
	    	  	doctor[j].print();
			}
			System.out.println();
			tmp_1 = sir.readPositiveInt("DWSTE TON ARITHMO TOU IATROU POU THELETAI NA DIAGRAFEI: ");
			System.out.println();
			// Elegxos egkyrotitas tou ari8mou pou edwse o xristis
			while(tmp_1 < 0 || tmp_1 > numOfDoctors)
			{
				tmp_1 = sir.readPositiveInt("KSANAEISAGETAI ARITHMO IATROU: ");
			}
			// Metakinw tous epomenous giatrous mia 8esi pio aristera
			for(int k = tmp_1; k < numOfDoctors - 1; k++)
			{
				doctor[k] = doctor[k+1]; // Metakinw ton giatro sti 8esi k+1 pio aristera
			}
			numOfDoctors--; // Meiwse ton ari8mo twn giatrwn
		}
		else
		{
			System.out.print("\nDEN YPARXOUN DIATHESIMOI GIATROI PROS DIAGRAFH!\n");
			System.out.println();
		}
	}
	
	// Methodos gia thn diagrafh asthenh
	public void diagrafiAstheni() {
		if(numOfPatient != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA ASTHENWN");
			// Emfanizw olous tous astheneis
			for(int j = 0; j < numOfPatient; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA ASTHENOUS: ");
				System.out.println();
	    	  	patient[j].print();
			}
			System.out.println();
			tmp_1 = sir.readPositiveInt("DWSTE TON ARITHMO TOU ASTHENH POU THELETAI NA DIAGRAFEI: ");
			System.out.println();
			// Elegxos egkyrotitas tou ari8mou pou edwse o xristis
			while(tmp_1 < 0 || tmp_1 > numOfPatient)
			{
				tmp_1 = sir.readPositiveInt("KSANAEISAGETAI ARITHMO ASTHENOUS: ");
			}
			// Metakinw tous epomenous astheneis mia 8esi pio aristera
			for(int k = tmp_1; k < numOfPatient - 1; k++)
			{
				patient[k] = patient[k+1]; // Metakinw ton astheni sti 8esi k+1 pio aristera
			}
			numOfPatient--; // Meiwse ton ari8mo twn asthenwn
		}
		else
		{
			System.out.print("\nDEN YPARXOUN DIATHESIMOI ASTHENEIS PROS DIAGRAFH!\n");
			System.out.println();
		}
	}
	
	// Methodos gia thn diagrafh syntaghs
	public void diagrafiSintagis() {
		// Elegxw an yparxoun syntages
		if(numOfPrescription != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA SYNTAGWN");
			// Emfanizw oles tis syntages 
			for(int j = 0; j < numOfPrescription; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA SYNTAGHS: ");
				System.out.println();
	    	  	prescription[j].print();
			}
			System.out.println();
			tmp_1 = sir.readPositiveInt("DWSTE TON ARITHMO THS SYNTAGHS POU THELETAI NA DIAGRAFEI: ");
			System.out.println();
			// Elegxos egkyrotitas tou ari8mou pou edwse o xristis
			while(tmp_1 < 0 || tmp_1 > numOfPrescription)
			{
				tmp_1 = sir.readPositiveInt("KSANAEISAGETAI ARITHMO SYNTAGHS: ");
			}
			// Metakinw tis epomenes syntages mia 8esi pio aristera
			for(int k = tmp_1; k < numOfPrescription - 1; k++)
			{
				prescription[k] = prescription[k+1]; // Metakinw thn syntagh sti 8esi k+1 pio aristera
			}
			numOfPrescription--; // Meiwse ton ari8mo twn syntagwn
		}
		else
		{
			System.out.print("\nDEN YPARXOUN DIATHESIMES SYNTAGES PROS DIAGRAFH!\n");
			System.out.println();
		}
	}
	
	// Methodos gia thn anazhthsh syntaghs vasei tou epwnymou tou iatrou pou thn egrapse
	public void anazitisiSintagisVaseiGiatrou() {
		String doctorName = null;
		tmp_2 = 0;
		if(numOfPrescription != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA SYNTAGWN");
			// Emfanizw oles tis syntages
			for(int j = 0; j < numOfPrescription; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA SYNTAGHS: ");
	    	  	prescription[j].print();
			}
			doctorName = sir.readString("DWSTE TO EPWNYMO TOU GIATROU: "); // Zitaw apo ton xrhsth na mou dwsei to onoma tou giatrou pou exei grapsei thn sintagh pou epithumei
			for(int i = 0; i < numOfPrescription; i++)
			{
				if(doctorName.equals(prescription[i].getDoctorLname())) // An vre8ei kapoia antistoixeia emfanizw thn syntagh pou exei grapsei o giatros
				{
					System.out.println();
					System.out.println("VRETHIKE SYNTAGH!");
					// Emfanizw thn/tis sintagh/sintages pou exoun graftei apo ton sygkekrimeno giatro
					prescription[i].print();
					System.out.println();
					tmp_2++;
				}
			}
			if(tmp_2 == 0)
			{
				System.out.println();
				System.out.println("DEN YPARXEI SYNTAGH POU NA PERILAMVANEI TON IATRO ME EPWNYMO: " + doctorName);
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMES SYNTAGES!");
			System.out.println();
		}
	}
	
	// Methodos gia thn anazhthsh syntaghs vasei tou AMKA tou asthenous gia ton opoio proorizetai
	public void anazitisiSintagisVaseiAstheni() {
		int amkaCode = 0;
		tmp_2 = 0;
		if(numOfPrescription != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA SYNTAGWN");
			// Emfanizw oles tis syntages
			for(int j = 0; j < numOfPrescription; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA SYNTAGHS: ");
	    	  	prescription[j].print();
			}
			amkaCode = sir.readPositiveInt("EISAGETAI TO AMKA TOU ASTHENH: "); // Zitaw apo ton xrhsth na mou dwsei ton amka tou asthenh pou thelei
			for(i = 0; i < numOfPrescription; i++)
			{
					if(amkaCode == prescription[i].getPatientAmka()) // An vre8ei kapoia antistoixeia emfanizw thn syntagh pou proorizetai gia ton sygkekrimeno asthenh
					{
						System.out.println();
						System.out.println("VRETHIKE SYNTAGH!");
						prescription[i].print(); // Emfanizw thn/tis sintagh/sintages oi opoies proorizontai gia ton sigkekrimeno asthenh
						System.out.println();
						tmp_2++;
					}
			}
			if(tmp_2 == 0)
			{
				System.out.println();
				System.out.println("DEN YPARXEI SYNTAGH POU NA PERILAMVANEI TON ASTHENH ME AMKA: " + amkaCode);
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMES SYNTAGES!");
			System.out.println();
		}
	}

	// Methodos gia thn anazhthsh syntaghs vasei tou xronikou eurous kata to opoio grafthke
	public void anazitisiSintagisVaseiHmerominias() {
		Date firstDt = null, lastDt = null;
		tmp_2 = 0;
		if(numOfPrescription != 0)
		{
			System.out.println();
			System.out.println("   STOIXEIA SYNTAGWN");
			// Emfanizw oles tis syntages
			for(int j = 0; j < numOfPrescription; j++)
			{
				System.out.print("\n " + j + ".  STOIXEIA SYNTAGHS: ");
				prescription[j].print();
			}
			System.out.println();
			// Zitaw apo ton xrhsth to xroniko euros kata to opoio exei graftei sintagh
			firstDt = sir.readDate("DWSTE ARXIKH HMEROMHNIA: ");
			lastDt = sir.readDate("DWSTE TELIKH HMEROMHNIA: ");
			System.out.println();
			for(i = 0; i < numOfPrescription; i++)
			{
				// An h hmeromhnia eggrafhs ths syntaghs einai anamesa sta xronika oria pou exei dwsei o xrhsths ektypwnetai
				if(firstDt.before(prescription[i].getDate()) && (lastDt.after(prescription[i].getDate()))) 
				{
					System.out.println();
					System.out.println("VRETHIKE SYNTAGH!");
					prescription[i].print();
					System.out.println();
					tmp_2++;
				}
			}
			if(tmp_2 == 0)
			{
				System.out.println();
				System.out.println("DEN YPARXEI SYNTAGH METAKSY:" + firstDt + " KAI: " + lastDt);
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMES SYNTAGES!");
			System.out.println();
		}
	}
	
	// Methodos gia thn ektypwsh twn farmakwn pou exei to farmakeio
	public void ektypwsiFarmakou() {
		// Elegxw an yparxoun farmaka
		if(numOfMedicine != 0)
		{
			for(int i = 0; i < numOfMedicine; i++)
			{
				System.out.println();
				System.out.println("INFO FOR MEDICINE No." + (i+1) + ":");
				medicine[i].print();
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMA FARMAKA PROS EMFANISH!");
			System.out.println();
		}
	}
	
	// Methodos gia thn ektypwsh twn iatrwn pou exei to farmakeio
	public void ektypwsiGiatrou() {
		// Elegxw an yparxoun iatroi
		if(numOfDoctors != 0)
		{
			for(int i = 0; i < numOfDoctors; i++)
			{
				System.out.println();
				System.out.println("INFO FOR DOCTOR No." + (i+1) + ":");
				doctor[i].print();
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMOI GIATROI PROS EMFANISH!");
			System.out.println();
		}
	}
	
	// Methodos gia thn ektypwsh twn asthenwn pou exei to farmakeio
	public void ektypwsiAstheni() {
		// Elegxw an yparxoun astheneis
		if(numOfPatient != 0)
		{
			for(int i = 0; i < numOfPatient; i++)
			{
				System.out.println();
				System.out.println("INFO FOR PATIENT No." + (i+1) + ":");
				patient[i].print();
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMOI ASTHENEIS PROS EMFANISH!");
			System.out.println();
		}
	}
	
	// Methodos gia thn ektypwsh twn syntagwn pou exei to farmakeio
	public void ektypwsiSintagis() {
		// Elegxw an yparxoun syntages
		if(numOfPrescription != 0)
		{
			for(int i = 0; i < numOfPrescription; i++)
			{
				System.out.println();
				System.out.println("INFO FOR PRESCRIPTION No." + (i+1) + ":");
				prescription[i].print();
				System.out.println();
			}
		}
		else
		{
			System.out.println();
			System.out.println("DEN YPARXOUN DIATHESIMES SYNTAGES PROS EMFANISH!");
			System.out.println();
		}
	}

}
