import java.util.Random;

public class Phone {

    public Phone() {
        this.brand = randomBrand();
        this.price = randomPrice();
        this.ram = randomRam();
    }

    private brand randomBrand(){
        return brand.values()[(new Random().nextInt(brand.values().length))];
    }



    private double randomPrice(){
        double price = new Random().nextInt(5, 20) * 1000;
        return price;
    }

    private int randomRam(){
        int ram = 2;
        for(int i = new Random().nextInt(2, 6); i > 0; i--){
            ram *= 2;
        }
        return ram;
    }

    enum brand
    {
        Lenuvo,
        Asos,
        MacNote,
        Eser,
        Xamiou
    }

    public Phone.brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    brand brand;

    double price;

    int ram;

    public void print(){
        System.out.println("Brand - " + this.brand + "\nPrice - " + this.price + "\nRAM - " + this.ram);
    }

    public static  Phone[] phoneSort(Phone[] phones, int low, int high) {

        if (phones.length == 0 || low >= high) return phones;

        Phone border = phones[(high + low) / 2];

        int i = low, j = high;
        while (i <= j) {
            while (phones[i].price < border.price) i++;
            while (phones[j].price > border.price) j--;
            if (i <= j) {
                Phone swap = phones[i];
                phones[i] = phones[j];
                phones[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) phoneSort(phones, low, j);
        if (high > i) phoneSort(phones, i, high);

        return phones;
    }
}
