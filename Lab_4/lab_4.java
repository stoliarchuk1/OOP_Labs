
import java.util.Arrays;

public class lab_4 {
    public static void main(String[] args){
        //залишок від ділення номера залікової книжки учня на 17
        int C11;
        C11 = 1124 % 11;
        System.out.println("C17 = " + C11 );
        cars car1 = new cars("BMV", 11000, 4, 201, 5.3F);
        cars car2 = new cars("Mercedes-Benz", 13500, 4, 100, 7.2F);
        cars car3 = new cars("Lexus", 15000, 4, 150, 9.5F);
        cars car4 = new cars("Tesla", 20000, 2, 250, 4.F);
        cars car5 = new cars("Skoda", 5600, 4, 350, 13.F);
        cars[] array = {car1,car2,car3,car4,car5};
        // використав клас a1 ,шоб відсортувати машини по ціні за зростанням
        Arrays.sort(array, new a1());
        System.out.println("sorting machines by price in descending order: ");

        for (cars cars : array) {
            System.out.println(cars.bran + " - " + cars.price);
        }
        System.out.println(" ");
        // використав клас a2 ,шоб відсортувати машини по пробігу за спаданням
        Arrays.sort(array, new a2());
        System.out.println("sorting machines by price in ascending order: ");
        for (cars cars : array) {
            System.out.println(cars.bran + " - " + cars.mileage);
        }

    }
}
