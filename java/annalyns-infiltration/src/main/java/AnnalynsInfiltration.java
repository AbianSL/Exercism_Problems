class AnnalynsInfiltration {
  public static boolean canFastAttack(boolean knightIsAwake) {
    if (knightIsAwake = true) {
      return false;
    } else {
      return true;
    }
  }

  public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    if (prisonerIsAwake == true || knightIsAwake == true || archerIsAwake == true ) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
  }
  
  public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
  }
}
