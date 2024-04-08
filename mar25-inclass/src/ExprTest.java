import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExprTest {

  // (+ (+ 5 10) (+ 0 27))

  @Test
  void testExpr() {

    IExpr e1 = new Add(new Add(new Lit(5), new Lit(10)),
                       new Add(new Lit(0), new Lit(27)));

    IExpr e2 = new Mul(new Lit(6), new Lit(7));

    IExpr e3 = new Add(new Lit(10),
                       new Mul(new Add(new Lit(2), new Lit(6)),
                               new Lit(9)));

    assertAll(
      () -> assertEquals(42, new Lit(42).eval()),
      () -> assertEquals(0, new Lit(0).eval()),
      () -> assertEquals(42, e1.eval()),
      () -> assertEquals(42, e2.eval()));
  }

}