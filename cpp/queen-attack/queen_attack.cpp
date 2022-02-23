#include <cmath>

#include "queen_attack.h"

namespace queen_attack {
  /**
   * @brief that function calculate if the black piece are in the line of white piece
   * 
   * @return true queen attack the black piece
   * @return false queen don´t attack the black piece
   */
  bool chess_board::can_attack() const {
    int distance_first_coordinate {std::abs(white_piece_.second_coordinate() - Black_piece_.second_coordinate())};
    int distance_second_coordinate {std::abs(white_piece_.first_coordinate() - Black_piece_.first_coordinate())};
    return ((distance_first_coordinate == distance_second_coordinate) || (distance_first_coordinate == 0) || (distance_second_coordinate == 0)) ?  1 : 0;  
  }

  /**
   * @brief is the operator to transfor the class to string
   * 
   * @return std::string is the string created
   */
  chess_board::operator std::string() const {
    std::string output_of_string;
    for (int i{0}; i < 8; ++i) {
      for (int j{0}; j < 8; ++j) {
        if (white_piece_.first_coordinate() == i && white_piece_.second_coordinate() == j) {
          output_of_string += "W";
        } else if (Black_piece_.first_coordinate() == i && Black_piece_.second_coordinate() == j) {
          output_of_string += "B";
        } else {
          output_of_string += "_";
        } 
        if (j != 7) {
          output_of_string += " ";  /// that put a space
        } else {
          output_of_string += "\n"; /// that is for know if it is a blank line 
        }
      }
    }
    return output_of_string;
  }

  /**
   * @brief Construct a new chess board::chess board object is the constructor of the chess_board
   * 
   * @param kWhitePiece is the white position piece
   * @param kBlackPiece is the black position piece
   */
  chess_board::chess_board(const std::pair<int,int>& kWhitePiece, const std::pair<int,int>& kBlackPiece) : white_piece_{(unsigned int)kWhitePiece.first, (unsigned int)kWhitePiece.second}, Black_piece_{(unsigned int)kBlackPiece.first, (unsigned int)kBlackPiece.second} {
    if (white_piece_ == Black_piece_) {
      throw std::domain_error("All positions must be different on the board");
    }
  } 

  /**
   * @brief overload the operator '=='
   * 
   * @param kWhitePiece is the white position to know if it is the sames
   * @param kBlackPiece is the black position to know if it is the same
   * @return true both position are equal
   * @return false ehite and black pieces are in different position
   */
  bool operator==(const Piece& kWhitePiece, const Piece& kBlackPiece) {
    return (kWhitePiece.first_coordinate() == kBlackPiece.first_coordinate()) && (kWhitePiece.second_coordinate() == kBlackPiece.second_coordinate()) ? 1 : 0;
  }
}  // namespace queen_attack
