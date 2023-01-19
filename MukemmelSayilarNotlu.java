
public class MukemmelSayilarNotlu {
    public static void main(String[] args) {

        //mükemmel sayı tam bölenlerinin toplamına eşit ise mükemmel sayıdır.
        //6---> 1,2,3
        //28--->1,2,4,7,14

        int number = 6;
        int total = 0;    // 0 a eşit bi değer atamak için

        for (int i = 1; i < number; i++) {
            // nedden i=1 çünkü bölmeye 1 den baslayacak.
            if (number % i == total) {         //if= öyleyse number ı i ye bölsüz sırayla 1 ekleyerek ve bu 0 a eşit olmalı böylece numberı bölüp
                //kalanını 0 bulduğu sonuçlar benim i değerlerim olacak. i değerlerinin toplamıda number a eşitse mükemmel sayıyı bulmuş olucağız.
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("mükemmel sayıdır");

        } else {
            System.out.println("mükemmel sayı değildir");
        }

    }
}
