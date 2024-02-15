import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueExamples {

  /**
   * Returns a priority queue of strings where the strings are alphabetized.
   * This is the default ordering of items inserted in a PQ.
   * @param args - variable number of strings.
   * @return priority queue.
   */
  static PriorityQueue<String> alphabetizedPq(String... args) {
    PriorityQueue<String> pq = new PriorityQueue<>();
    for (String s : args) {
      pq.add(s);
    }
    return pq;
  }

  /**
   * Returns a priority queue whose priority is based off of the following
   * criteria:
   * - If a name is "Joshua", it should have the highest priority.
   * - If a name is "Jack", it should have the lowest priority.
   * - Anything else should use the standard string order.
   * @param names
   * @return
   */
  static PriorityQueue<String> namesPq(String... names) {
    Comparator<String> cmp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
        if (o1.equals("Joshua") || o2.equals("Jack")) {
          return -1;
        } else if (o2.equals("Joshua") || o1.equals("Jack")) {
          return 1;
        } else {
          return o1.compareTo(o2);
        }
    }};

    PriorityQueue<String> pq = new PriorityQueue<>(cmp);
    for (String s : names) {
      pq.add(s);
    }
    return pq;
  }

  public static void main(String[] args) {
    PriorityQueue<String> pq1 = alphabetizedPq("Joel", "Albert", "Charles", "Dylan", "Walter", "Alex");
    while (!pq1.isEmpty()) {
      System.out.println(pq1.poll());
    }
    System.out.println("------");
    PriorityQueue<String> pq2 = namesPq("Joel", "Albert", "Joshua", "Charles", "Dylan", "Walter", "Jack", "Alex");
    while (!pq2.isEmpty()) {
      // Joshua
      // Albert
      // Alex
      // ...
      // Jack
      System.out.println(pq2.poll());
    }
  }
}
