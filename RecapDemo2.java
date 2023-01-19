public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = { 1.2, 2.3, 8.5, 6.7 };
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            System.out.println(number);
            total = total + number;
        }
        System.out.println("En büyük sayi : " + max);
        System.out.println("Toplam : " + total);
    }
}
