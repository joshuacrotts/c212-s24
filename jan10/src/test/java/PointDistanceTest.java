import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointDistanceTest {

  private static final double DELTA = 0.01;

  @Test
  void ptDistance() {
    assertAll(
            () -> assertEquals(0, PointDistance.ptDistance(0, 0, 0, 0), DELTA),
            () -> assertEquals(6.40, PointDistance.ptDistance(0, 0, 4, 5), DELTA),
            () -> assertEquals(7.07, PointDistance.ptDistance(10, 7, 5, 2), DELTA),
            () -> assertEquals(5, PointDistance.ptDistance(2, 5, 2, 10), DELTA));
  }
}