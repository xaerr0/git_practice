class Main {
  public static void main(String[] args) {

    // please demonstrate converting an int to a double below - example - why don't
    // we need to cast the int to a double?

    // ANSWER: Because int fits into a double.

    int i = 87;

    double s = i;

    System.out.println("double value " + i);

    // please demonstrate casting a double to an int below

    double dVal = 1.34;
    int iVal = (int) dVal;
    System.out.println(iVal);

    // please demonstrate casting a double to a float below

    float fVal = (float) dVal;
    System.out.println(fVal);

    // please demonstrate casting a double with decimal values to an short

    short sVal = (short) dVal;

    // now print out the short value - what happened to the decimals?
    System.out.println(sVal);

    // ANSWER: They were removed because shot values don't have decimals.

  }
}