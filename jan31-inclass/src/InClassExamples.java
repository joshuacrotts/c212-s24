class InClassExamples {

  /**
   * Finds the last index of a digit in a string.
   * @param s - input string.
   * @return index of last digit or -1 otherwise.
   */
  static int lastDigitLocation(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
      // If the current character is a digit, return that index.
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        return i;
      }
    }
    return -1;
  }


  /**
   * Returns the number of "chicken" substrings in a string.
   * Substrings that occur after removing one are also valid.
   * @param s - input string.
   * @return the number of "chicken" substrings.
   */
  static int chickenCounter(String s) {
    // s.contains("chicken") is the same as s.indexOf("chicken") == -1
    if (!s.contains("chicken")) {
      return 0;
    } else {
      // XchickenY
      int loc = s.indexOf("chicken");
      String beforeChicken = s.substring(0, loc);
      String afterChicken = s.substring(loc + 7);
      // X+Y
      return 1 + chickenCounter(beforeChicken+afterChicken);
    }
  }

  static int chickenCounterTR(String s) {
    return chickenCounterTRHelper(s, 0);
  }

  private static int chickenCounterTRHelper(String s, int acc) {
    if (!s.contains("chicken")) {
      return acc;
    } else {
      int loc = s.indexOf("chicken");
      String beforeChicken = s.substring(0, loc);
      String afterChicken = s.substring(loc + 7);
      return chickenCounterTRHelper(beforeChicken + afterChicken, acc + 1);
    }
  }

  static int chickenCounterLoop(String s) {
    int acc = 0;
    while (!(!s.contains("chicken"))) {
      acc++;
      int loc = s.indexOf("chicken");
      String beforeChicken = s.substring(0, loc);
      String afterChicken = s.substring(loc + 7);
      s = beforeChicken + afterChicken;
    }
    return acc;
  }
}
