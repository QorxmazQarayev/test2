import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sual4 {
    public static void main(String[] args) {
       int[]arr={4,2,5,9};
       int sum= Arrays.stream(arr).map(element->element*element*element).sum();
        System.out.println(sum);

    }}

