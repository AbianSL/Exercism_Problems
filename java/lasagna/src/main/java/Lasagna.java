public class Lasagna {
  public static int LasagnaTime = 40; 

  // TODO: define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven() {
    return LasagnaTime;
  }
    
  // TODO: define the 'remainingMinutesInOven()' method
  public int remainingMinutesInOven(int remaining_) {
    return LasagnaTime - remaining_;
  }

  // TODO: define the 'preparationTimeInMinutes()' method
  public int preparationTimeInMinutes(int layers) {
    return layers * 2;
  }

  // TODO: define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int layers_added, int time_in_oven) {
    return 2 * layers_added + time_in_oven;
  }
}
