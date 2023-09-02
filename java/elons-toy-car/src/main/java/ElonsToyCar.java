public class ElonsToyCar {
    public static ElonsToyCar buy() {
      return new ElonsToyCar();
    }

    public String distanceDisplay() {
      return "Driven " + distance + " meters"; 
    }

    public String batteryDisplay() {
      return "Battery at " + battery + "%";
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }

    private int distance = 0;
    private int battery = 100;
}
