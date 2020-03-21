package ua.lviv.iot;

import org.junit.Test;
import ua.lviv.iot.regular.expressions.ZipCodesRegularExpressions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FindZipCodesTest {

  @Test
  public void findZipCodesTest() {

    String text = "This text contains zip codes: 79046 79012, 70723 79345 790908 879024";
    InputStream in = new ByteArrayInputStream(text.getBytes());
    System.setIn(in);

    Scanner scanner = new Scanner(System.in);
    String myText = scanner.nextLine();
    System.out.println(myText);
    ZipCodesRegularExpressions.findZipCodesByPatterns(myText);
  }
}
