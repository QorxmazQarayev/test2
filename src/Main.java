      import java.time.LocalDate;
      import java.util.ArrayList;
      import java.util.Comparator;
      import java.util.List;
      import java.util.Optional;
      import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Sual1:Qiymeti 100-den cox olan ve "Book" kateqoriyasina aid mehsullarin(products) siyahisini getirin.
        List<Product>mehsul=new ArrayList<>();
        mehsul.add(new Product(12,"etir","qoxu",112));
        mehsul.add(new Product(14,"qaysi","Book",1000));
        List<Product>satis=mehsul.stream().filter(product -> product.getPrice()>100 && product.getCategory().equals("Book")).collect(Collectors.toList());
        System.out.println(satis);

       //Sual2:"Toys"kateqoriyasina uygun mehsullara 10% endirim tetbiq edin.
        List<Product>mehsul1=new ArrayList<>();
        mehsul1.add(new Product(13,"ad","Toys",2.5));
        mehsul1.add(new Product(18,"sirine","esebi",2.9));
        List<Double>qida=mehsul1.stream().filter(product->product.getCategory().equals("Toys")).map(product -> product.getPrice()*0.9).collect(Collectors.toList());
        System.out.println(qida);

     //Sual3:"Book" kateqoriyasindaki en ucuz mehsullari elde edin
        List<Product>qebul=new ArrayList<>();
        qebul.add(new Product(6,"kitab","Book",4.8));
        qebul.add(new Product(2,"kelime","yagli",3.5));
        List<Double>alis=qebul.stream().filter(product->product.getCategory().equals("Book")).map(product->product.getPrice()).collect(Collectors.toList());
        System.out.println(alis);

        //Sual4: Order-lerin tarixlerine gore artan sira ile siralayin
       List<Order>tarix=new ArrayList<>();
       tarix.add(new Order(12,"sakalatka",2021  ));
       tarix.add(new Order(14,"pamuklu",2023));
       List<Order>orders=tarix.stream().sorted(Comparator.comparing(Order::getOrderDate)).collect(Collectors.toList());
       System.out.println(orders);

        //Sual5:Butun musterilerin(Customer) adini boyuk heriflere cevirin
        List<Customer>herf=new ArrayList<>();
        herf.add(new Customer(20,"Customer",20));
        List<String> herf1=herf.stream().map(cust->cust.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(herf1);

        //Sual6:Butun mehsullarin(Product) orta qiymetini tapin(avarage)
       List<Product>sual=new ArrayList<>();
        double result6=sual.stream().mapToDouble(Product::getPrice).average().orElse(0);
       System.out.println(sual);


        //Sual7:"Complated" statuslu sifarislerin sayini tapin
        List<Order>status=new ArrayList<>();
        status.add(new Order(1,"complated",LocalDate.of(2023,12,11)));
        Long result=status.stream().filter(ord->ord.getStatus().equals("Completed")).count();

      /*  //Sual8:max price-li productu tapin
        Optional<Product> list2=list.stream().max(Comparator.comparing(Product::getPrice));
        System.out.println(list2);*/




    }
}