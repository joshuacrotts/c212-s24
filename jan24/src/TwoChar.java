class TwoChar {


  /**
   * Returns the two characters following the given index in the string,
   * or the first two chars if index is out of bounds.
   * @param str - input string.
   * @param index - index value.
   * @return new string.
   */
  static String twoChar(String str, int index) {
    if (index < 0 || index + 2 > str.length()) {
      return str;
    } else {
      return str.substring(index, index + 2);
    }
  }
}
