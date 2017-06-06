/**
 * @see PackageLevelAnnotations
 */
package com.checkstyle;


/**
 * My <b>class</b>.
 * @see SampleApp
 */
public class SampleApp {
  /**
   * @param a
   *          This is the first paramter to sumOfNum method
   * @param b
   *          This is the second parameter to sumOfNum method
   * @return int This returns sum of numA and numB.
   */
  public final int sumOfNum(final int a, final int b) {
    int sum = a + b;
    String ant = null
    return sum;
  }

  /**
   * @param a
   *          This is the first paramter to divOfNum method
   * @param b
   *          This is the second parameter to sumOfNum method
   * @return int This returns sum of numA and numB.
   */
  public final int divOfNum(final int a, final int b) {
    int div = 0;
    try {
      div = a / b;
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
    return div;
  }

}
