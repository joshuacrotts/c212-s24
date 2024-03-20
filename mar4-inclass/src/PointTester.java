import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTester {

  @Test
  void testAverageDistance() {
    List<Point> lop = List.of(
            new Point(4, 0), new Point(0, 4),
            new Point(-4, 0), new Point(0, -4),
            new Point(2, 2), new Point(-2, 2),
            new Point(-2, -2), new Point(2, -2));
    assertAll(
      () -> assertEquals(OptionalDouble.of(3.414213562373095), Point.averageDistance(lop)),
      () -> assertEquals(OptionalDouble.empty(), Point.averageDistance(List.of())));
  }
}
