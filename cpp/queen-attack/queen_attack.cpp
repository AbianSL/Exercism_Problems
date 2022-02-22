#include "queen_attack.h"

#include <iostream>

namespace queen_attack {
  chess_board::chess_board(const std::pair<int,int>& kWhitePiece, const std::pair<int,int>& kBlackPiece) : white_piece_{(unsigned int)kWhitePiece.first, (unsigned int)kWhitePiece.second}, Black_piece_{(unsigned int)kBlackPiece.first, (unsigned int)kBlackPiece.second} {
    if (white_piece_ == Black_piece_) {
      throw std::domain_error("All positions must be different on the board");
    }
  } 

  bool operator==(const Piece& kWhitePiece, const Piece& kBlackPiece) {
    return (kWhitePiece.first_coordinate() == kBlackPiece.first_coordinate()) && (kWhitePiece.second_coordinate() == kBlackPiece.second_coordinate()) ? 1 : 0;
  }
}  // namespace queen_attack
