class PointDistance {

  /**
   * Computes the distance between two points.
   * @param px x coordinate of first pt.
   * @param py y coordinate of first pt.
   * @param qx x coordinate of second pt.
   * @param qy y coordinate of second pt.
   * @return distance.
   */
  static double ptDistance(double px, double py, double qx, double qy) {
    return Math.sqrt(Math.pow(qy - py, 2) + Math.pow(qx - px, 2));
  }
}
