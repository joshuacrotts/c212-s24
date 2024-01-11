import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OctagonAreaTest {

  @Test
  void octagonArea() {
    double DELTA = 0.01;
    assertAll(
      () -> assertEquals(0, OctagonArea.octagonArea(0), DELTA),
      () -> assertEquals(4.83, OctagonArea.octagonArea(1), DELTA),
      () -> assertEquals(19.31, OctagonArea.octagonArea(2), DELTA),
      () -> assertEquals(236.59, OctagonArea.octagonArea(7), DELTA));
  }
}