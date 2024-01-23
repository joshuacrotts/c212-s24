class FirstHalf {

  /**
   * Computes the first half of a string.
   *
   * @param s - input string, assumed to be of even length.
   * @return first half of s, or empty if the string is empty.
   */
  static String firstHalf(String s) {
    return s.substring(0, s.length() / 2);
  }
}
