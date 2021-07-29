import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menuSelection = 1;
		
		while (menuSelection != 4) {
			System.out.println("1. Meters to Decameters\n 2. Meters to Kilometers\n 3.Millimeters to Centimeters\n 4.Quit");
			menuSelection = sc.nextInt();
			switch (menuSelection) {
			case 1: menuSelection = sc.nextInt();
					menuSelection = menuSelection*10;
					System.out.println(menuSelection);
					break;
					
			case 2: menuSelection = sc.nextInt();
					menuSelection = menuSelection*1000;
					System.out.println(menuSelection);
					break;
					
			case 3: menuSelection = sc.nextInt();
					menuSelection = menuSelection*10;
					System.out.println(menuSelection);
					break;
			}
		}
	}

}
