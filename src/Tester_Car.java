/**
 * 
 */

/**
 * @author Rishab Dussoye
 *
 */
import java.util.*;
public class Tester_Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myKey = new Scanner(System.in);
		
		System.out.print("This is my previous Car Fucking Bitch:\n");
		Car myCar = new Car();
		
		System.out.print("Input Chasis No: ");
		int x = myKey.nextInt();
		
		System.out.print("Input Brand: ");
		String y = myKey.next();
		
		System.out.print("Input Make: ");
		String z = myKey.next();
		myCar.chasisNo = x;
		myCar.brand = y;
		myCar.make = z;
		
		myCar.carDetails();
		
		
		System.out.print("\nThis is my present Car Fucking Bitch:\n");
		Car presentCar = new Car();
		
		
		presentCar.chasisNo = 1502456;
		presentCar.brand = "Agera RS";
		presentCar.make = "Koenigsegg";
		
		presentCar.presentCar();

	}
}
