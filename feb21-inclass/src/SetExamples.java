import java.util.*;

class SetExamples {

  /**
   * Returns a list of non-duplicate elements from the given
   * list. The order must be maintained.
   * @param ls - list of integers.
   * @return list with no duplicates.
   */
  static List<Integer> removeDuplicates(List<Integer> ls) {
    Set<Integer> S = new LinkedHashSet<>();
    for (int x : ls) { S.add(x); }

    List<Integer> newLs = new ArrayList<>();
    for (int x : S) { newLs.add(x); }
    return newLs;
  }

  /**
   * Given two lists of integers, returns a new list of non-duplicate
   * but naturally-ordered values such that every value in the returned
   * list is in both ls1 and ls2.
   * @param ls1 - first list of integers.
   * @param ls2 - second list of integers.
   * @return new list of naturally-ordered, non-duplicate integers.
   */
  static List<Integer> commonValues(LinkedList<Integer> ls1,
                                    LinkedList<Integer> ls2) {

    Set<Integer> S = new TreeSet<>();
    for (int x : ls1) {
      if (ls2.contains(x)) {
        S.add(x);
      }
    }

    List<Integer> ls = new ArrayList<>();
    ls.addAll(S);
    return ls;
  }

  /**
   * Given an array of integers of values between 1 and n inclusive,
   * one is missing and one is duplicate. Returns an array of these
   * two values.
   * @param A - array of integers from 1 to n with the above criteria.
   * @return A[0] is the missing number, A[1] is the duplicate value.
   */
  static int[] findDupMissing(int[] A) {
    int[] res = new int[2];
    Map<Integer, Integer> M = new TreeMap<>();
    for (int x : A) {
      if (!M.containsKey(x)) {
        M.put(x, 1);
      } else {
        M.put(x, M.get(x) + 1);
      }
    }

    // Find the duplicate number.
    for (int k : M.keySet()) {
      if (M.get(k) == 2) {
        res[1] = k;
        break;
      }
    }

    // Find the missing number.
    int prev = 0;
    for (int k : M.keySet()) {
      if (prev + 1 != k) {
        res[0] = prev + 1;
        break;
      } else {
        prev = k;
      }
    }

    return res;
  }
}
