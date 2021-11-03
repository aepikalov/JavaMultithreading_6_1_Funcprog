import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "an Aboriginal dictionary generator in a functional style";
        //Программа написана в функциональном стиле.
        //На это указывает использование реализации функционального интерфейса Function
        // и монады в виде Stream API.
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" ")).sorted().distinct().toList();
        function.apply(text).forEach(System.out::println);
    }
}
