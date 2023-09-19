import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sual3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("sertsozlu");
        list.add("Inanan");
        list.add("QiriciTeyyare");
        list.add("qiyiqgozlu");
        List<String>ad=list.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
        System.out.println(ad);
    }
}
