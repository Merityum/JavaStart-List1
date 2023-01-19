public class SayiBulucuUpdate {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aranacak = 15;
        boolean varMi = sayiAra(sayilar, aranacak);
        mesajVer(varMi, aranacak);
    }

    public static void mesajVer(boolean varMi, int aranacak) {
        String mesaj = "";
        if (varMi == true) {
            mesaj = "sayi mevcuttur: " + aranacak;
            System.out.println(mesaj);
        } else {
            mesaj = "sayi mevcut değildir: " + aranacak;
            System.out.println(mesaj);
        }
    }

    public static boolean sayiAra(int[] sayilar, int aranacak) {
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        return varMi;
    }
}

