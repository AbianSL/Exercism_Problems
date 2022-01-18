#include "robot_simulator.h"

namespace robot_simulator {
  /**
   * @brief that funciton turn to the right
   * 
   */
  void Robot::turn_right() {
    switch (bearing_) {
      case NORTH:
        bearing_ = EAST;
        break;
      case SOUTH:
        bearing_ = WEST;
        break;
      case WEST:
        bearing_ = NORTH;
        break;
      case EAST:
        bearing_ = SOUTH;
        break;
    }
  }

  /**
   * @brief that member function turn to the left
   * 
   */
  void Robot::turn_left() {
    switch (bearing_) {
      case NORTH:
        bearing_ = WEST;
        break;
      case SOUTH:
        bearing_ = EAST;
        break;
      case WEST:
        bearing_ = SOUTH;
        break;
      case EAST:
        bearing_ = NORTH;
        break;
    }
  }

}  // namespace robot_simulator
