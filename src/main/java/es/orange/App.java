package es.orange;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int add(String nums) {
		String[] numsarr = nums.split(",");
		int suma = 0;

		for (String unNum : numsarr) {
				
			if (!unNum.trim().equals("") &&  Integer.parseInt(unNum.trim()) <= 1000) {
				suma += Integer.parseInt(unNum.trim());
			}
		}

		return suma;
	}

}
