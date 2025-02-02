import org.checkerframework.checker.dividebyzero.qual.*;

// A simple test case for your divide-by-zero checker.
// The file contains "// ::" comments to indicate expected
// errors and warnings.
//
// Passing this test does not guarantee a perfect grade on this assignment,
// but it is an important start. You should always write your own test cases,
// in addition to using those provided to you.
class ExtraTests {

  public static void fine() {
    int one = 1;
    int two = 2;
    int neg = -1;
    int zero = 0;
    int w = neg + zero;
    int x = one + zero;
    int y = zero + one;
    int z = two + zero;
  }

  public static void bad() {
    int two = 2;
    int neg = -1;
    int zero = 0;
    // :: error: divide.by.zero
    int x = two / zero;
    // :: error: divide.by.zero
    int y = neg / zero;
    // :: error: divide.by.zero
    int z = zero / zero;
  }

}
