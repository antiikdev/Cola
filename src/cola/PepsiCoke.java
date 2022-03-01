/**
 * Budget allocation for Pepsi and Coke
 * for the following 100 days 
 */
package cola;

/**
 * Java implementation of cola budget day allocation
 * @author antiik.dev
 * @version 25 Feb 2022
 */
public class PepsiCoke {
	
	
	/**
	 * Allocated budget of cola drings for x days
	 * @param days of budget
	 */
	public static void budgetCola(int days) {
		// count all the cola drinks for statistical purposes
		int PepsiCoke = 0, Coke = 0, Pepsi = 0;
		
		for (int i = 1; i <= days; i++) {
			// if multiplier of 3 and 5: print PepsiCoke
			if ( i % 3 == 0 && i % 5 == 0) {
				System.out.println("PepsiCoke ");
				PepsiCoke++;
				continue;
			}
			// if multiplier of 5: print Coke
			if ( i % 5 == 0 ) {
				System.out.println("Coke ");
				Coke++;
				continue;
			}
			// if multiplier of 3: print Pepsi
			if ( i % 3 == 0 ) {
				System.out.println("Pepsi ");
				Pepsi++;
				continue;
			}
			// print numbers 1-100 if no cola drinks
			else System.out.println(i + " ");
		}
		// print all the colas
		System.out.println();
		System.out.println("How many drinks were served:");
		System.out.println(Pepsi + " Pepsis, " + Coke + " Cokes, and " +
					PepsiCoke + " PepsiCokes");
	}
	

	/**
	 * Main for testing
	 * @param args not in use
	 */
	public static void main(String[] args) {
		System.out.println("Let's get some Pepsi and Coke for the team!");
		// amount of days
		int days = 100;
		// function for cola budget allocation
		budgetCola(days);
		System.out.println("A beer version for everyday "
				+ "coming soon - stay tuned!");
	}

}
