import java.util.Random;

public class Main {

	private long boys = 0;
	private long girls = 0;

	private final int BOY = 0;
	private final int GIRL = 1;

	private int families = 100000000;

	public static void main(String[] args) {
		new Main();
	}

	/*
	 * For every family, start making babies.
	 */
	public Main() {
		for (int i = 0; i < families; i++) {
			makeBabies();
		}
		print();

	}

	/** 
	 * A family's session of baby-making. Only stops after conceiving a boy.
	 **/
	private void makeBabies() {
		Random rnd = new Random();
		int sex = rnd.nextInt(2);

		if (sex == GIRL) {
			girls++;
			makeBabies();
		} else {
			boys++;
		}
	}

	/**
	 * Print out the amount of girls and boys.
	 */
	private void print() {
		System.out.println("Girls: " + girls);
		System.out.println("Boys: " + boys);
	}

}
