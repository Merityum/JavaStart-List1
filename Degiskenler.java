public class Degiskenler {


    public static void main(String[] args) {
        int not = 40;
        // 50 ve üzeri geçti
        //40-49 : butunleme
        //0-39 kaldi
        if (not >= 50) {
            System.out.println("Geçti");
        } else if (not >= 40) {
            System.out.println("Bütünleme");
        } else {
            System.out.println("Kaldı");
        }


    }
}