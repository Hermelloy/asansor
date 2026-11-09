import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String yon;
     int hesap;
        // TODO: 1. Kullanıcıdan mevcut katı ve hedef katı alın
    System.out.println("Bulundugunuz kati giriniz (1-10)");
        int bulunan = sc.nextInt();
    System.out.println("hedef kati giriniz. (1-10)");
        int hedef = sc.nextInt();
        // TODO: 2. Girdileri kontrol edin (1-10 arası olmalı)
    if (bulunan<1 || bulunan>10) {System.out.println("gecersiz bulunan kat girisi"); 
        }else if (hedef<1 || hedef>10) {System.out.println("gecersiz hedef kat girisi"); 
        // TODO: 3. Hareket yönüne karar verin   TODO: 4. Hareket mesafesini hesaplayın TODO: 5. Sonucu ekrana yazdırın
 }if (bulunan<=10 && bulunan>=1 && hedef<=10 && hedef>=1){
         if (hedef<bulunan) {yon=("asagi");
         hesap=(bulunan-hedef);
              System.out.println(hesap + " kat " + yon );
         }else if (bulunan<hedef) {yon=("yukari");
         hesap=(hedef-bulunan); 
             System.out.println(hesap + " kat " + yon );
         }else if (bulunan==hedef) {yon=("mevcut");
             System.out.println("hareket yok");

                                    
             scanner.close();
                                    
    }
} 

}
    }
