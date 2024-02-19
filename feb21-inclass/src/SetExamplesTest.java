import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SetExamplesTest {


  @Test
  void testRemoveDuplicates() {
    assertEquals(List.of(),
                 SetExamples.removeDuplicates(List.of()));
    assertEquals(List.of(),
                 SetExamples.removeDuplicates(List.of()));
    assertEquals(List.of(),
                 SetExamples.removeDuplicates(List.of()));
  }

  @Test
  void testCommonValues() {
    assertEquals(List.of(),
                 SetExamples.commonValues(
                        new LinkedList<>(List.of()),
                        new LinkedList<>(List.of())));
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
    assertArrayEquals(new int[]{},
                      SetExamples.findDupMissing(new int[]{}));
    assertArrayEquals(new int[]{},
                      SetExamples.findDupMissing(new int[]{}));
    assertArrayEquals(new int[]{},
                      SetExamples.findDupMissing(new int[]{}));
  }
}