package lesson3.labs.prob3;

public class Admin {
	public static double computeTotalRent(Properties[] properties) {
		double totalRent = 0;
		for (Properties prop : properties) {
			totalRent += prop.computeRent();

		}
		return totalRent;
	}
/*
	public static double computeTotalRent_withoutPolymorphism(Object[] properties) {
		double totalRent = 0;
		for (Object o : properties) {
			if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condo) {
				Condo h = (Condo) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}
		}
		return totalRent;
	}*/
}
