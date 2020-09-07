package no.hvl.dat100;

public class nfakultet {

	public static void main(String[] args) {

		for (int g = 0; g < 1; g++) {
			int n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Skriv inn heltall: "));
			long k = n;

			if (n <= 0) {
				javax.swing.JOptionPane.showMessageDialog(null, "Venligst skriv inn tall fra 1 og opp.");
				g--;
			} else {

				for (int i = (n - 1); i > 1; i--) {
					k = k * i;
				}

				javax.swing.JOptionPane.showMessageDialog(null, "Fakultet av " + n + " er " + k);

			}
		}
	}
}
