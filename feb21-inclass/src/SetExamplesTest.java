import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SetExamplesTest {


  @Test
  void testRemoveDuplicates() {
    assertEquals(List.of(1, 2, 4, 3, 5),
                 SetExamples.removeDuplicates(List.of(1, 2, 2, 4, 3, 4, 4, 4, 5, 4, 5)));
    assertEquals(List.of(),
                 SetExamples.removeDuplicates(List.of()));
    assertEquals(List.of(10, 9, 8, 7, 6, 5, 0, 1, 2, 3, 4),
                 SetExamples.removeDuplicates(List.of(10, 9, 8, 7, 6, 5, 0, 1, 2, 3, 4)));
  }

  @Test
  void testCommonValues() {
    assertEquals(List.of(1, 2),
                 SetExamples.commonValues(
                        new LinkedList<>(List.of(3, 1, 4, 1, 5, 2)),
                        new LinkedList<>(List.of(2, 7, 1, 8, 2, 8))));
    assertEquals(List.of(),
                 SetExamples.commonValues(
                        new LinkedList<>(List.of()),
                        new LinkedList<>(List.of())));
    assertEquals(List.of(),
                 SetExamples.commonValues(
                        new LinkedList<>(List.of()),
                        new LinkedList<>(List.of())));
  }

  @Test
  void testFindMissingDup() {
    assertArrayEquals(new int[]{3, 2},
                      SetExamples.findDupMissing(new int[]{4, 2, 2, 1}));
    assertArrayEquals(new int[]{5, 8},
                      SetExamples.findDupMissing(new int[]{6, 10, 8, 7, 3, 2, 4, 1, 9, 8}));
//    assertArrayEquals(new int[]{},
//                      SetExamples.findDupMissing(new int[]{}));
  }
}