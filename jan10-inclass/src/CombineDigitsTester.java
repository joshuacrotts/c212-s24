import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombineDigitsTester {

  @Test
  void combineDigits() {
    assertAll(
      () -> assertEquals(34, CombineDigits.combineDigits(3, 4)),
      () -> assertEquals(7, CombineDigits.combineDigits(0, 7)),
      () -> assertEquals(79, CombineDigits.combineDigits(7, 9)));
  }
}