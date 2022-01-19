#include <iostream>

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

  /**
   * @brief that function advance one depending of the bearing of the robot
   * 
   */
  void Robot::advance() {
    switch (bearing_) {
      case NORTH:
        ++position_.second;
        break;
      case EAST:
        ++position_.first;
        break;
      case WEST:
        --position_.first;
        break;
      case SOUTH:
        --position_.second;
        break;
      default:
        std::cerr << "ERROR: That error you shouldn't see that error" << std::endl;
        exit(EXIT_SUCCESS);
    }
  }

  void Robot::execute_sequence(const std::string& kPhraseIntroduced) {
    for (char counter : kPhraseIntroduced) {
      switch (counter) {
      case 'L':
        turn_left();
        break;
      case 'R':
        turn_right();
        break;
      case 'A':
        advance();
        break;
      default:
        std::cerr << "ERROR: That error you shouldn't see that error" << std::endl;
        break;
      }
    }
  }
}  // namespace robot_simulator
