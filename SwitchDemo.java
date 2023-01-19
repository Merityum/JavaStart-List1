public class SwitchDemo {


        public static void main(String[] args) {
            char grade = 'B';
            switch (grade) {
                case 'A':
                    System.out.println("Mükemmel geçtiniz");
                    break;
                case 'B':
                    System.out.println("Çok güzel geçtiniz");
                    break;
                default:
                    System.out.println("Geçersiz not girdiniz");
            }
        }
}
