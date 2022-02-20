#if !defined(QUEEN_ATTACK_H)
#define QUEEN_ATTACK_H

#include <tuple>

namespace queen_attack {
  class Piece {
   public:
    Piece(const unsigned int kFirstCoordinate, const unsigned int kSecondCoordinate) : first_coordinate_{kFirstCoordinate}, second_coordinate_{kSecondCoordinate} {}
    int first_coordinate() const { return first_coordinate_; }
    int second_coordinate() const { return second_coordinate_; }
   private:
    unsigned int first_coordinate_;
    unsigned int second_coordinate_;
  };

  bool operator==(const Piece& kWhitePiece, const Piece& kBlackPiece);

  class chess_board {
   public:
    chess_board() : white_piece_{0,3}, Black_piece_{7,3} {};
    chess_board(const std::pair<int,int>& kWhitePiece, const std::pair<int,int>& kBlackPiece);
    std::pair<int,int> white() const { return std::make_pair(white_piece_.first_coordinate(), white_piece_.second_coordinate()); }
    std::pair<int,int> black() const { return std::make_pair(Black_piece_.first_coordinate(), Black_piece_.second_coordinate()); }
   private:
    Piece white_piece_;
    Piece Black_piece_;
  };
}  // namespace queen_attack

#endif // QUEEN_ATTACK_H