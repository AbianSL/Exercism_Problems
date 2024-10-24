public class ElonsToyCar {
    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return "Driven " + distance + " meters"; 
    }

    public String batteryDisplay() {
      if (battery <= 0) {
        return "Battery empty";
      }
      return "Battery at " + battery + "%";
    }

    public void drive() {
      if (battery <= 0) {
        return;
      }
      distance += 20;
      battery -= 1;
    }

    private int distance = 0;
    private int battery = 100;
}
