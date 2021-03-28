//Clock Hands
//579
import java.util.Scanner;

public class p579 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String time;
		int hourHand = 0, mintHand = 0, totalMinutes;
		final double hourHandDegPerMin = 0.5, mintHandDegPerMin = 6.0;
		double hourHandAngle, mintHandAngle, diffAngle = 0;
		
		time = kb.next();
		hourHand = Integer.valueOf(time.substring(0, time.indexOf(":")));
		mintHand = Integer.valueOf(time.substring(time.indexOf(":") + 1));
		
		while(hourHand != 0 || mintHand != 0) {
			totalMinutes = hourHand * 60 + mintHand;
			hourHandAngle = hourHandDegPerMin * totalMinutes;
			mintHandAngle = mintHandDegPerMin * mintHand;
			diffAngle = Math.abs(hourHandAngle - mintHandAngle);
			while(diffAngle > 180)
				diffAngle = 360 - diffAngle;
			System.out.println(String.format("%.3f", diffAngle));
			time = kb.next();
			hourHand = Integer.valueOf(time.substring(0, time.indexOf(":")));
			mintHand = Integer.valueOf(time.substring(time.indexOf(":") + 1));
		}
	}
}