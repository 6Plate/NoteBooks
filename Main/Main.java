package Main;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import NoteBook.NB;

public class Main{
    public static void main(String [] args){
    
    Set<NB> laptops = new HashSet<>();
    NB laptop1 = new NB(16, 512, "Windows", "черный");
    NB laptop2 = new NB(32, 1000, "Mac", "серый" );
    NB laptop3 = new NB(8, 512, "Windows", "красный" );
    NB laptop4 = new NB(32, 2000, "Mac", "серый" );
    NB laptop5 = new NB(8, 256, "Windows", "черный" );
     laptops.add(laptop1);
     laptops.add(laptop2);
     laptops.add(laptop3);
     laptops.add(laptop4);
     laptops.add(laptop5);
    
    Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "оперативная память");
        criteria.put(2, "жесткий диск");
        criteria.put(3, "операционная система");
        criteria.put(4, "цвет");

        Map<String, Integer> filterParams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println("Введите минимальное значение для " + entry.getValue() + ":");
            int value = scanner.nextInt();
            filterParams.put(entry.getValue(), value);
        }

        Set<NB> filteredLaptops = new HashSet<>();
        for (NB laptop : laptops) {
            if (laptop.getRam() >= filterParams.get("опертаивная память") &&
                    laptop.getHD() >= filterParams.get("жесткий диск") &&
                    laptop.getOS().equals(filterParams.get("операционная система")) &&
                    laptop.getColor().equals(filterParams.get("цвет"))) {
                filteredLaptops.add(laptop);
            }
        }
        
        System.out.println("\nFiltered Laptops:");
        for (NB laptop : filteredLaptops) {
            System.out.println(laptop);
        }

}
}
    