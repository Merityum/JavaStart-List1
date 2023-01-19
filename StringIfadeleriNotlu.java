public class StringIfadeleriNotlu {
    public class Main {
        public static void main(String[] args) {
            String mesaj = "Bugün Hava çok güzel.";
            System.out.println("eleman sayısı :" + mesaj.length()); //mesaj kısmmındaki eleman sayısını veriri boşluklar dahil.
            System.out.println("5. eleman:" + mesaj.charAt(4)); //mesajda ki yani string ifadesindeki 5. elemanı gösterir 0-1-2-3-4
            System.out.println(mesaj.concat(" Süper"));//mesajın sonuna ifade ekler fakat sadece bu kod için.
            System.out.println(mesaj);
            System.out.println(mesaj.startsWith("A"));//mesaj isimli string ne ile başlıyor "A" ile başlıyor (false)-büyük küçükten etkilenir.
            System.out.println(mesaj.endsWith("."));//sonu . ile bitiyor (true).           VOİD ELEMENT NE DEMEK ARKA PLANDA BİR ŞEY DÖNDÜRMEYEN.
            char[] karakterler = new char[5];//charımızda kaç tane karakter oldugunu belitrttik.

            mesaj.getChars(0, 5, karakterler, 0); //bizden karakterleri istiyor o yüzden yukardaki char kodunu yazıyoruz. bu dizi 0.danbaşla 4. yani 5.de bitir.karakterler için 0.dan itibaren yazdır.
            System.out.println(karakterler);//getChars a özgü yukarıdaki kodda srcEnd 4 iken 4. yü dahil etmiyor o yüzden 4. yü de istiyorsak 5 yazmamız lazım yani 1 sayı üstünü yazacağız.
            System.out.println(mesaj.indexOf("a"));// bu indexOf kodu belirtilen karakterin mesajın içinde kaçıncı eleman olduğunu bulmayı sağlıyor."asd" böyle veya 'asd' böyle yazılabilir.ilk bulduğunda aramayı bitirir.
            System.out.println(mesaj.lastIndexOf("a")); //sondan sayarak bakar eğer o istenilen şeyden mesaj içinde 1 tane varsa baştan saymış gibi bir sonuç çıkartır.

            System.out.println("--------------------------------");

            //ders 2 nin notları
            //String fonksiyonlarının çoğu ana metnin kendisini değiştirmez. Yeni bir çıktı üretir.

            String yeniMesaj = mesaj.replace(' ', '-'); //replace = değiştirme demek

            System.out.println(yeniMesaj);
            System.out.println(mesaj.substring(2));//substring metnin içinden parça almaktır.  SUBSTRİNG FAZLASIYLA KULLANILAN BİR METODTUR.
            System.out.println(mesaj.substring(2, 5));//2.den başla 5.ye kadar al demek 5.dahil değil.
            //BİR METNİ BELLİ BİR KARAKTER DİZİSİNE ALARAK PARÇALAMAYA YARAR.

            for (String kelime : mesaj.split(" ")) {           //bir dizi olduğu (4 kelime) for kullanıyoruz.
                System.out.println(kelime);

            }

            System.out.println(mesaj.toLowerCase()); //LowerCase küçük harf demek mesajı küçük harfe çeviriyor. Özellikle veri tabanlarına arama ifadesi gönderildiğinde kullanılır. çünkü büyük Ü küçük ü vs.vs. karışabiliyor.
            System.out.println(mesaj.toUpperCase()); //harfleri büyük yapıyor.
            System.out.println(mesaj.trim());//özellikle data farklı kaynaklardan alındıysa başında sonunda boşluk olabiliyor onu yok etmek için kullanılan bir kod.

            String adim = "   mert yıldırım   ";
            System.out.println(adim.trim());//özellikle data farklı kaynaklardan alındıysa başında sonunda boşluk olabiliyor onu yok etmek için kullanılan bir kod.
            //fakat ortadaki boşlukları etkilemiyor.


        }
    }
}
