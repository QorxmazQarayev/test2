import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Strinq listdəki strinqləri uzunluğuna görə sıralayın
public class Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("pis");
        list.add("bulud");
        list.add("yagis");
        list.add("axi");
        list.add("guldesde");
        list.add("qaranqus");
        list.add("sey");
        list.add(" sadece bos");
        List<String>element=list.stream().sorted((element1,element2)
         ->Integer.compare(element1.length(),element2.length())).collect(Collectors.toList());
        System.out.println(element);


    }
}
