#if !defined(ROBOT_SIMULATOR_H)
#define ROBOT_SIMULATOR_H

#include <iostream>

namespace robot_simulator {
  enum Bearing {
    NORTH,
    SOUTH,
    WEST,
    EAST
  };

  class Robot { 
   public:
    Robot () : position_{0, 0}, bearing_{NORTH} {}
    Robot (const std::pair<int, int>& kPosition, const Bearing kBearing) : position_{kPosition},  bearing_{kBearing} {} 
    std::pair<int, int> get_position() const { return position_; }
    Bearing get_bearing() const { return bearing_; }
    void turn_right();
    void turn_left();
    void advance();
    void execute_sequence(const std::string& kPhraseIntroduced);
   private:
    std::pair<int, int> position_;
    Bearing bearing_;
  };
}  // namespace robot_simulator

#endif // ROBOT_SIMULATOR_H