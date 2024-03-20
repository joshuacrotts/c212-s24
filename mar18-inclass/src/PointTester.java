import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class PointTester {

  @Test
  void testPoint() {
    Set<Point> sop = new HashSet<>();
    sop.add(new Point(3, 4));
    sop.add(new Point(3, 4));
    System.out.println(sop.size());
  }
}
