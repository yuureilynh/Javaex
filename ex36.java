import java.util.Scanner;

public class ex36 {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
	        System.out.print("nhap vi do cua toa do 1: ");
	        double lat1 = input.nextDouble();
	        System.out.print("nhap kinh do cua toa do 1: ");
	        double lon1 = input.nextDouble();
	        System.out.print("nhap vi do cua toa do 2: ");
	        double lat2 = input.nextDouble();
	        System.out.print("nhap kinh do cua toa do 2: ");
	        double lon2 = input.nextDouble();

	        System.out.print("khoang cach giua 2 diem la: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");

	}
	// Points will be converted to radians before calculation
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
	}

}
