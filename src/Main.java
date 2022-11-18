import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yon;
        double normaltutar, indirimlitutar, yasindirimi, toplamtutar, ciftyonbiletindirimi;


        Scanner input = new Scanner(System.in);

        System.out.println("KM'yi Giriniz");
        km = input.nextInt();
        normaltutar = (km * 0.10);

        System.out.println("Yolculuk Tipini Giriniz 1- Tek Yön, 2 Çift Yön");
        yon = input.nextInt();

        System.out.println("Yaşınızı Giriniz");
        yas = input.nextInt();
        if (yas < 12) {
            yasindirimi = normaltutar * 0.50;
            indirimlitutar = normaltutar - yasindirimi;

            switch (yon) {
                case 1:
                    System.out.println("Bilet Fiyatı : " + indirimlitutar);
                    break;
                case 2:
                    ciftyonbiletindirimi = indirimlitutar * 0.20;
                    toplamtutar = indirimlitutar - ciftyonbiletindirimi;
                    System.out.println("Bilet Fiyatı : " + toplamtutar);
                    break;
                default:
                    System.out.println("Hatalı Giriş yaptınız");
            }

        } else if ((yas > 12) && (yas < 24)) {
            yasindirimi = normaltutar * 0.10;
            indirimlitutar = normaltutar - yasindirimi;

            switch (yon) {
                case 1:
                    System.out.println("Bilet Fiyatı : " + indirimlitutar);
                    break;
                case 2:
                    ciftyonbiletindirimi = indirimlitutar * 0.20;
                    toplamtutar = indirimlitutar - ciftyonbiletindirimi;
                    System.out.println("Bilet Fiyatı : " + toplamtutar);
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız");
            }

        } else if (yas > 65) {
            yasindirimi = normaltutar * 0.30;
            indirimlitutar = normaltutar - yasindirimi;

            switch (yon) {
                case 1:
                    System.out.println("Bilet Fiyatı : " + indirimlitutar);
                    break;
                case 2:
                    ciftyonbiletindirimi = indirimlitutar * 0.20;
                    toplamtutar = indirimlitutar - ciftyonbiletindirimi;
                    System.out.println("Bilet Fiyatı : " + toplamtutar);
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız");
            }

        }


    }
}