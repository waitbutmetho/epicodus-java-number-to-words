import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_returnsAWordForANumber_String() {
    String word = "nine";
    assertEquals(word, NumbersToWords.numbersToWords(9));
  }
}
