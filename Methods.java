public class Methods {public static void main(String[] args) {

    mesajVer("Mert");
    System.out.println(topla(9,3));
    System.out.println(toplananIkiSayininYuzdeOnu(100,10));

}


    public static void mesajVer(String isim) {
        System.out.println("Merhaba "+isim);

    }
    public static int topla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        return toplam;

    }
    //toplanan iki sayinin %10 unu bul

    public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
        int toplam = (sayi1+sayi2);
        double sonuc = toplam * 10/100;
        return sonuc;

    }
    public static double krediHesapla(double krediMiktari) { //hesaplari yapiyor

        return 125000;
    }
}
