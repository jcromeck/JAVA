import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("antonio", "bruno", "CARLOS", "Dionisio");
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList()); //Para padronizar todos como maiuscula
        System.out.println(collect);
    }
}