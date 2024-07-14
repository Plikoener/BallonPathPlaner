public class AzimuthCalculator {
    
    public static double calculateAzimuth(double lat1, double lon1, double lat2, double lon2) {
        double lonDiff = Math.toRadians(lon2 - lon1);
        
        double y = Math.sin(lonDiff) * Math.cos(Math.toRadians(lat2));
        double x = Math.cos(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) - 
                   Math.sin(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(lonDiff);
        
        double azimuth = Math.toDegrees(Math.atan2(y, x));
        
        return (azimuth + 360) % 360; // Convert negative azimuth to positive value
    }

    public static void main(String[] args) {
        double lat1 = 52.5200; // Latitude of the first point
        double lon1 = 13.4050; // Longitude of the first point
        double lat2 = 51.5074; // Latitude of the second point
        double lon2 = 0.1278; // Longitude of the second point

        double azimuth = calculateAzimuth(lat1, lon1, lat2, lon2);
        System.out.println("The azimuth between the two points is: " + azimuth + " degrees");
    }
}
