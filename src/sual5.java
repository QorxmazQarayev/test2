import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sual5 {
    public static void main(String[] args) {
        List<String> element=new ArrayList<>();
        element.add("insafli");
        element.add("kesler");
        element.add("necede");
        element.add("azdir");
        List<String>soz=element.stream().filter(cumle->cumle.length()>5).collect(Collectors.toList());
        System.out.println(soz);

    }
}
