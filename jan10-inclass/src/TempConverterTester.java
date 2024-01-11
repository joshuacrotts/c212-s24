import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTester {



  @org.junit.jupiter.api.Test
  void fahrenheitToCelsius() {
    double DELTA = 0.01;

    assertAll(
      () -> assertEquals(0, TempConverter.fahrenheitToCelsius(32), DELTA),
      () -> assertEquals(-40, TempConverter.fahrenheitToCelsius(-40), DELTA),
      () -> assertEquals(100, TempConverter.fahrenheitToCelsius(212), DELTA),
      // | -17.778 - -17.777777778 | < 0.000000000001
      () -> assertEquals(-17.778, TempConverter.fahrenheitToCelsius(0), DELTA));
  }
}