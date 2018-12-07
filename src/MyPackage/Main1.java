/* First Name: Ioannis
 * Last Name: Gkouzionis
 * Arithmos Mitrwou: 2012030003
 */
package MyPackage;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		/* create a StandardInputRead object*/
		StandardInputRead sir = new StandardInputRead();
		
		int choise = 1;
		// Eisagwgh twn stoixeiwn tou farmakeiou
		System.out.println();
		String fnm = sir.readString("DWSTE TO ONOMA TOU IDIOKTITI TOU FARMAKEIOU: ");
		String lnm = sir.readString("DWSTE TO EPWNYMO TOU IDIOKTITI TOU FARMAKEIOU: ");
		String adr = sir.readString("DWSTE THN DIEYTHINSH TOU FAMRAKEIOU: ");
		String tel = sir.readString("DWSTE TO THLEFWNO TOU FARMAKEIOU: ");
		System.out.println();
		Farmakeio farmacy = new Farmakeio(fnm, lnm, adr, tel);
		
		while(choise != 17) {
			//EKTYPWSH TOY MENOY EPILOGWN TOY XRHSTH.
			System.out.println("1.EISAGWGH FARMAKOY");
			System.out.println("2.EISAGWGH GIATROY");
			System.out.println("3.EISAGWGH ASTHENH");
			System.out.println("4.EISAGWGH SYNTAGHS");
			System.out.println("5.DIAGRAFH FARMAKOY");
			System.out.println("6.DIAGRAFH GIATROY");
			System.out.println("7.DIAGRAFH ASTHENH");
			System.out.println("8.DIAGRAFH SYNTAGHS");
			System.out.println("9.ANAZHTHSH SYNTAGHS VASEI TOU EPWNYMOU TOU GIATROU POU THN EGRAPSE");
			System.out.println("10.ANAZHTHSH SYNTAGHS VASEI TOU AMKA TOU ASTHENOUS GIA TON OPOIO PROORIZOTAI");
			System.out.println("11.ANAZHTHSH SYNTAGHS VASEI TOU XRONIKOU EUROUS KATA TO OPOIO GRAFTHKE");
			System.out.println("12.EMFANISH STOIXEIWN KATHE FARMAKOY");
			System.out.println("13.EMFANISH STOIXEIWN KATHE GIATROY");
			System.out.println("14.EMFANISH STOIXEIWN KATHE ASTHENH");
			System.out.println("15.EMFANISH STOIXEIWN KATHE SYNTAGHS");
			System.out.println("16.EMFANISH STOIXEIWN FARMAKEIOU");
			System.out.println("17.EXODOS");
			
			System.out.println();
			choise = sir.readPositiveInt("DWSTE TON ARITHMO POU ANTISTOIXEI STHN LEITOURGIA POU EPITHIMEITAI: ");
			
			while(choise > 17 || choise < 1)
			{
				choise = sir.readPositiveInt("DWSTE TON ARITHMO POU ANTISTOIXEI STHN LEITOURGIA POU EPITHIMEITAI: ");
				System.out.println();
			}
			
			// Eisagwgi farmakou
			if(choise == 1)
			{
				farmacy.eisagwgiFarmakou();
			}
			
			// Eisagwgi giatrou
			else if(choise == 2)
			{
				farmacy.eisagwgiGiatrou();
			}
			
			// Eisagwgi astheni
			else if(choise == 3)
			{
				farmacy.eisagwgiAstheni();
			}
			
			// Eisagwgi syntagis
			else if(choise == 4)
			{
				farmacy.eisagwgiSintagis();
			}
			
			// Diagrafi farmakou
			else if(choise == 5)
			{
				farmacy.diagrafiFarmakou();
			}
			
			// DIAGRAFH GIATROY
			else if(choise == 6)
			{
				farmacy.diagrafiGiatrou();
			}
			
			// DIAGRAFH ASTHENH
			else if(choise == 7)
			{
				farmacy.diagrafiAstheni();
			}
			
			// DIAGRAFH SYNTAGHS
			else if(choise == 8)
			{
				farmacy.diagrafiSintagis();
			}
			
			// ANAZHTHSH SYNTAGHS VASEI TOU EPWNYMOU TOU GIATROU POU THN EGRAPSE
			else if(choise == 9)
			{
				farmacy.anazitisiSintagisVaseiGiatrou();
			}
			
			// ANAZHTHSH SYNTAGHS VASEI TOU AMKA TOU ASTHENOUS GIA TON OPOIO PROORIZONTAI
			else if(choise == 10)
			{
				farmacy.anazitisiSintagisVaseiAstheni();
			}
			
			//ANAZHTHSH SYNTAGHS VASEI TOU XRONIKOU EUROUS KATA TO OPOIO GRAFTHKAN
			else if(choise == 11)
			{
				farmacy.anazitisiSintagisVaseiHmerominias();
			}
			
			// Ektypwsi stoixeiwn ka8e farmakou
			else if(choise == 12)
			{
				farmacy.ektypwsiFarmakou();
			}
			
			// Ektypwsi stoixeiwn ka8e giatrou
			else if(choise == 13)
			{
				farmacy.ektypwsiGiatrou();
			}
			
			// Ektypwsi stoixeiwn ka8e astheni
			else if(choise == 14)
			{
				farmacy.ektypwsiAstheni();
			}
			
			// Ektypwsi stoixeiwn ka8e syntagis
			else if(choise == 15)
			{
				farmacy.ektypwsiSintagis();
			}
			
			else if(choise == 16)
			{
				farmacy.print();
			}
			
			// Eksodos apo to programma
			else
			{
				break;
			}
					
		}
	}	
}
