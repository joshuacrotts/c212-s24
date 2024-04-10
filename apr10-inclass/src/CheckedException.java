import java.io.*;
import java.util.*;

class CheckedException {

  /*
  Checked exceptions are enforced at compile-time. You cannot
  omit a try/catch or throws.

  Almost all uses of checked exceptions are I/O bound.
   */

  static int readNums(String f) {
    // Reads in the integers from a file and returns the max.
    // If a non-integer is read, we throw an IllegalValueException (a custom exception!).
    // If no elements are read, we throw a NoSuchElementException.
    // Both of those, however, are UNCHECKED!
    // Let's see where we need a checked exception.
    // ==============
    // FileInputStream is SLOW because it reads raw bytes and
    // is non-buffered. It's also not very convenient.
    // BufferedReader is faster because it uses buffering and doesn't
    // make as many system calls. BUT it's really only used to read
    // lines of text.
    // Scanner is the most flexible in terms of parsing.
    int max = Integer.MIN_VALUE;
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
      String line = null;
      boolean foundSomething = false;
      while ((line = br.readLine()) != null) {
        // If we fail to cast it to a number, then we throw an IllegalValueException.
        try {
         int v = Integer.parseInt(line);
           max = Math.max(v, max);
        } catch (NumberFormatException ex) {
          throw new IllegalValueException("readNums: read a non-number");
        }
      }
      if (!foundSomething) {
        throw new NoSuchElementException("readNums: no values read");
      } else {
        return max;
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // Example: read a file containing numbers and sum them all.
  static int sumNums(String f) {
    try {
      Scanner sc = new Scanner(new File(f));
      int sum = 0;
      while (sc.hasNext()) {
        sum += Integer.parseInt(sc.next());
      }
      sc.close();
      return sum;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  static List<String> reverseLines(String f) {
    try (Scanner file = new Scanner(new File(f))) {
      List<String> lines = new ArrayList<>();
      while (file.hasNext()) {
        String s = file.next();
        String res = new StringBuilder(s).reverse().toString();
        lines.add(res);
      }
      file.close();
      return lines;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  // Example: read a file of integers and output the largest.
  static int largestInt(String f) {
    try (BufferedReader br = new BufferedReader(new FileReader(f))){
      String line = null;
      int max = Integer.MIN_VALUE;
      while ((line = br.readLine()) != null) {
        int n = Integer.parseInt(line);
        if (n >= max) {
          max = n;
        }
      }
      return max;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // Example: read a file of integers. WRITE to a file the odd numbers.
  static void writeOddFiles(String f) {
    List<Integer> nums = new ArrayList<>();
    try (Scanner sc = new Scanner(new File(f))) {
      while (sc.hasNextInt()) {
        nums.add(sc.nextInt());
      }
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }

    try (PrintWriter pw = new PrintWriter(new FileWriter("odds.txt"))) {
      for (int n : nums) {
        if (n % 2 != 0) {
          pw.println(n);
        }
      }
      pw.println("this is a string");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // read a file of strings. Count how many of each (alphabetic) character there
  // are, and output an alphabetized ordering to a file. If we encounter
  // a non-alphabetic character, throw an IAE.
  static void countLetters(String f) {
    // Hint hint for the homework!
    String outFile = f.substring(0, f.indexOf(".")) + ".out";

    // Yes, you can instantiate multiple AutoClosable objects in a try-with-resources block!
    try (BufferedReader br = new BufferedReader(new FileReader(f));
         PrintWriter pw = new PrintWriter(new FileWriter(outFile))) {
      Map<Character, Integer> M = new TreeMap<>();
      // First, populate the map with the initial letters.
      for (int i = 0; i < 26; i++) {
        M.put(Character.valueOf((char) (i + 'A')), 0);
      }

      // Now read in the lines.
      String line = null;
      while ((line = br.readLine()) != null) {
        // We love streams :-)
        line.chars()
            .map(c -> Character.toUpperCase(c))
            .filter(c -> Character.isAlphabetic(c))
            .forEach(c -> M.put((char)c, M.get((char)c)+1));
      }

      // Now output it.
      for (char k : M.keySet()) {
        pw.printf("%s:%d\n", k, M.get(k));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // Below is an example of using the raw FileInputStream class to read
  // data from a file. Remember that this reads raw BYTES! We have to convert
  // them from bytes to digits, and since it uses system calls, it is SLOW!
  // Do NOT do this with "real code!"
  static int fileReader() {
    try (FileInputStream fr = new FileInputStream("random_integers.txt")) {
      int max = Integer.MIN_VALUE;
      int currNo = 0;
      while (true) {
        int d = -1;
        d = fr.read();
        if (d == -1) { break; }
        else if (d == 10) {
          if (max < currNo) {
            max = currNo;
          }
          currNo = 0;
        } else {
          currNo = 10 * currNo + (d - '0');
        }
      }
      return max;
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

  public static void main(String[] args) {
    countLetters("lines.txt");
  }
}
