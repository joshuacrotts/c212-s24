class EndsLy {

  /**
   * Returns whether a string ends with ly.
   * @param str input string.
   * @return true if ends with ly, false otherwise (or if the
   *         string contains less than 2 characters).
   */
  static boolean endsLy(String str) {
    if (str.length() < 2) {
      return false;
    } else {
      return str.substring(str.length() - 2).equals("ly");
    }
  }
}
