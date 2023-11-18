import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import HW6.NB;

public class Shop {
    private List<NB> laptop;
    

    public Shop() {
    laptop = new ArrayList<>();
}

    public void addNB( NB nb){
    if (!laptop.contains(nb)){
        laptop.add(nb);
    }
    }


public void MenuFilter (){
    Map<Integer, String> filter = new HashMap<>();
    filter.put(1, "Color");
    filter.put(2, "Hd");
    filter.put(3, "Оs");
    filter.put(4, "озy");
    System.out.println(filter);
    System.out.println("Введите номер желаемого критерия:");
    Scanner sc = new Scanner(System.in);
    int choosed = sc.nextInt();
    System.out.println(Filter(choosed));

}

public List<NB> Filter(int choose){
switch (choose) {
    case choose == 1:
        System.out.println("Выберите цвет: ");
        String colchose = sc.nextLine();
        List <NB> colored = new ArrayList<>();
        for (NB nb: noteBook.isEmpty()){
           if (nb.getColor().equals(colchose)){
            colored.add(nb);
            System.out.println("Вот все варианты:");
        }
        return colored.toString();
    }
    case choose == 2:
    System.out.println("Выберите объем жесткого диска: ");
    int choosehd = sc.nextInt();
    List <NB> hd = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
           if (nb.getHD() == choosehd){
            hd.add(nb);
            System.out.println("Вот все варианты:");
         }
         return hd.toString();
    }   
    case choose == 3:
    System.out.println("Выберите операционную систему: ");
    String chooseos = sc.nextLine();
    List <NB> os = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
        if (nb.getOS().equals(chooseosos)){
            os.add(nb);
            System.out.println("Вот все варианты:");
            System.out.println(os);
    }
    return os.toString();
}
    case choose == 4:
    System.out.println("Выберите объем озу: ");
    int chooseram = sc.nextInt();
    List <NB> ram = new ArrayList<>();
    for (NB nb: noteBook.isEmpty()){
        if (nb.getRam() == chooseram){
            ram.add(nb);
            System.out.println("Вот все варианты:");
            System.out.println(ram);
        }
        return ram.toString();
    }
}
}
}
