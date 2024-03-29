#if !defined(QUEEN_ATTACK_H)
#define QUEEN_ATTACK_H

#include <iostream>

namespace queen_attack {
  class Piece {
   public:
    Piece(const unsigned int kFirstCoordinate, const unsigned int kSecondCoordinate) : first_coordinate_{kFirstCoordinate}, second_coordinate_{kSecondCoordinate} {}  /// constructor with argument
    int first_coordinate() const { return first_coordinate_; }    /// getter
    int second_coordinate() const { return second_coordinate_; }  /// getter
   private:
    unsigned int first_coordinate_;
    unsigned int second_coordinate_;
  };

  bool operator==(const Piece& kWhitePiece, const Piece& kBlackPiece);

  class chess_board {
   public:
    chess_board() : white_piece_{0,3}, Black_piece_{7,3} {};  /// constructor without argument
    chess_board(const std::pair<int,int>& kWhitePiece, const std::pair<int,int>& kBlackPiece);  /// constructor with argument
    std::pair<int,int> white() const { return std::make_pair(white_piece_.first_coordinate(), white_piece_.second_coordinate()); }  /// getter
    std::pair<int,int> black() const { return std::make_pair(Black_piece_.first_coordinate(), Black_piece_.second_coordinate()); }  /// getter
    bool can_attack() const;
    operator std::string() const;
   private:
    Piece white_piece_;
    Piece Black_piece_;
  };
}  // namespace queen_attack

#endif // QUEEN_ATTACK_H