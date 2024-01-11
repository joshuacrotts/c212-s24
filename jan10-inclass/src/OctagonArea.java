class OctagonArea {

  /**
   * Computes the area of an octagon, given the side length.
   * @param s - the side length.
   * @return inner area of the octagon.
   */
  static double octagonArea(double s) {
    return 2 * (1 + Math.sqrt(2)) * Math.pow(s, 2);
  }
}
