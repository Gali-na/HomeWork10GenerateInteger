import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str= "aAHsrfhsrh";
      char[] chars= str.toCharArray();
      IntStream.range(0, chars.length)
               .map(i -> (int)chars[i])
               .forEach(System.out::println);
    }
}
