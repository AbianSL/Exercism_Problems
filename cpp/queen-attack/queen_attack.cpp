#include "queen_attack.h"

namespace queen_attack {

  chess_board::operator std::string() {
    
  }

  /**
   * @brief is the function to create the graphic board
   * 
   * @return std::string is the string of the board
   */
  std::string chess_board::ConstructorOfBoard() const{
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
          output_of_string += " ";
        } else {
          output_of_string += "\n";
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
