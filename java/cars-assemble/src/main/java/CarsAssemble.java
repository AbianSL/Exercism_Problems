public class CarsAssemble {

    public double productionRatePerHour(int speed) {
      int total = speed * 221;
      if (speed == 10) {
        return total * 0.77;
      } else if (speed == 9) {
        return total * 0.80;
      } else if (speed < 9 && speed > 4) {
        return total * 0.90;
      }
      return total;
    }

    public int workingItemsPerMinute(int speed) {
      return (int)productionRatePerHour(speed) / 60;
    }
}
