import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class CollectionsApi {

  public static void main(String[] args) {
    Set<String> s1 = new LinkedHashSet<>();
    Set<String> s2 = new TreeSet<>();
    s1.add("Hello");
    s1.add("Hi");
    s1.add("Hey");
    s1.add("Yo");
    s1.add("Computers");

    for (String s : s1) {
      System.out.println(s);
    }

    s2.add("Hello");
    s2.add("Hi");
    s2.add("Hey");
    s2.add("Yo");
    s2.add("Computers");

    for (String s : s2) {
      // Computers Hello Hey Hi Yo
      System.out.println(s);
    }
  }
}
