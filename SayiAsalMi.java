public class SayiAsalMi {
    public static void main(String[] args) {
        int number = 15;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayi asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("geçersiz sayi");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime == true) {
            System.out.println("sayi asaldır");
        } else {
            System.out.println("sayi asal değildir");
        }
    }
}
