import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sual2 {
    public static void main(String[] args) {
        //int  listdəki elementləri tək və cüt olaraq qruplaşdır
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);
        List<Integer>list1=list.stream().filter(element->element%2==1).collect(Collectors.toList());
        System.out.println(list1);
        List<Integer>list2=list.stream().filter(element->element%2==0).collect(Collectors.toList());
        System.out.println(list2);
    }}