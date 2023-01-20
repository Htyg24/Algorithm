import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        long t = System.nanoTime();

        int count = 1000000;

        Phone[] phones = new Phone[count];

        for(int i = 0; i < phones.length; i++){
            phones[i] = new Phone();
        }

        Arrays.sort(phones, Comparator.comparing(Phone::getBrand));
        Arrays.sort(phones, Comparator.comparing(Phone::getRam));
        Arrays.sort(phones, Comparator.comparing(Phone::getPrice));

//        phones = Phone.phoneSort(phones, 0, phones.length - 1);


        for (int i = 0; i < phones.length; i++)
            phones[i].print();

        System.out.println("Spend time: "+ (System.nanoTime() - t)/1_000_000.0);
    }




}