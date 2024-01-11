class TempConverter {

  /**
   * Converts a temperature in degrees Fahrenheit to degrees Celsius.
   * @param f - given temperature in degrees Fahrenheit.
   * @return temperature in degrees Celsius.
   */
  static double fahrenheitToCelsius(double f) {
    return (f - 32) * (5.0 / 9.0);
  }
}
