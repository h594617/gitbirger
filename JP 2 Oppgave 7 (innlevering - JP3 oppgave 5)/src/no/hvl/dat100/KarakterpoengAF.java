package no.hvl.dat100;

public class KarakterpoengAF {

	public static void main(String[] args) {

		
		char karakter = '#';

		for (int i = 1; i <= 10; ++i) {
			int poeng = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Antall poeng: "));
			
				
			if ((poeng <= 39) && (poeng >= 0)) {
				karakter = 'F';
			}

			else if ((poeng >= 40) && (poeng <= 49)) {
				karakter = 'E';
			}

			else if ((poeng >= 50) && (poeng <= 59)) {
				karakter = 'D';
			}

			else if ((poeng >= 60) && (poeng <= 79)) {
				karakter = 'C';
			}

			else if ((poeng >= 80) && (poeng <= 89)) {
				karakter = 'B';
			}

			else if ((poeng >= 90) && (poeng <= 100)) {
				karakter = 'A';
			}
			
			if ((poeng < 0) || (poeng >100)) {
				javax.swing.JOptionPane.showMessageDialog(null, "Skriv inn poengsum mellom 0 og 100");
				--i;
			}
			
			else javax.swing.JOptionPane.showMessageDialog(null, "Med poengsum " + poeng + " får du karakteren: " + karakter);
			
			}
		}
		

	}
