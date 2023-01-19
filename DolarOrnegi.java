public class DolarOrnegi {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String ortaMetin = "ilginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(altMetin);
        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.25;
        double dolarBugun = 18.30;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {

            okYonu = "down.svg";
            System.out.println(okYonu);

        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);

        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler = {"Hızlı Kredi", "Mutlu Emekli", "Maaşını halkbanktan alan"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);

        }
    }

}
