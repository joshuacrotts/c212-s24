import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Point {

  private final int X;
  private final int Y;

  public Point(int x, int y) {
    this.X = x;
    this.Y = y;
  }

  public double distance() {
    return this.distance(new Point(0, 0));
  }

  /**
   * Determines the Euclidean distance between two points.
   * @param p the other point.
   * @return the distance between this point and p.
   */
  public double distance(Point p) {
    int dx = this.X - p.X;
    int dy = this.Y - p.Y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public static OptionalDouble averageDistance(List<Point> lop) {
    return lop.stream()
              .map(p -> p.distance())
              .mapToDouble(d -> d)
              .average();
  }
}
