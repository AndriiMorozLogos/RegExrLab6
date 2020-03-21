package ua.lviv.iot.regular.expressions;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCodesRegularExpressions {

  public static void findZipCodesByPatterns(String textToCheck) {

    List<String> stringList = new LinkedList<>();
    String patternString = "\\b790+\\d{2}\\b";
    Pattern pattern = Pattern.compile(patternString);
    Matcher matcher = pattern.matcher(textToCheck);
    while (matcher.find()) {
      stringList.add(matcher.group());
    }
    System.out.println(stringList);
  }


}
