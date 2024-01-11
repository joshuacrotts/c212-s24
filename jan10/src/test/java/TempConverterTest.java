import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

  @Test
  void f2c() {
    assertAll(
      () -> assertEquals(0, TempConverter.f2c(32)),
      () -> assertEquals(100, TempConverter.f2c(212)));
  }
}