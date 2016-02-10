import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {
  public static void main(String[] args) {}

  public static String numbersToWords(Integer number) {
    String stringNumber = number.toString();
    String[] stringNumberArray = stringNumber.split("");


    HashMap<String, String> onesAndTeens = new HashMap<String, String>();
    // HashMap<String> tens = new HashMap<String>();
    // HashMap<String> hundreds = new HashMap<String>();
    String[] onesAndTeensWords = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    // String[] tensWords = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    // findHundredsWords.put(0, "");
    for(Integer i = 1; i <= 19; i++) {
      onesAndTeens.put(i.toString(), onesAndTeensWords[i-1]);
    }
    // for(Integer i = 2; i <= 9; i++) {
    //   findTensWords.put(i, tensWords[i-2]);
    // }
    // for(Integer i = 1; i <= 9; i++) {
    //   findHundredsWords.put(i, (smallNumberWords[i-1] + " hundred"));
    // } //END HASHMAP SETUP

    Integer indexOfWord = stringNumberArray.length - 1;
    String hashKey = stringNumberArray[indexOfWord];
    String word = onesAndTeens.get(hashKey);

    return word;
  }

}
