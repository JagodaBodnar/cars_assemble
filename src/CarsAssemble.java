public class CarsAssemble {

    private static final int CARS_PRODUCED_PER_HOUR = 221;
    private static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args) {
        double productionPerHour = CarsAssemble.productionRatePerHour(6);
        int carsProducedPerHour = CarsAssemble.workingItemsPerMinute(6);
        System.out.printf("Production rate per hour: %.2f %nNumber of working items produced per minute: %d ", productionPerHour, carsProducedPerHour);
    }

    private static double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return speed * CARS_PRODUCED_PER_HOUR;
        } else if (speed > 4 && speed <= 8) {
            return speed * CARS_PRODUCED_PER_HOUR * 0.9;
        } else if (speed == 9) {
            return speed * CARS_PRODUCED_PER_HOUR * 0.8;
        } else {
            return speed * CARS_PRODUCED_PER_HOUR * 0.77;
        }
    }

    private static int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }
}
