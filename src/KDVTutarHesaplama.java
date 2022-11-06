import java.util.Scanner;

public class KDVTutarHesaplama {
    public static void main(String[] args) {

        double tutar;
        double kdvOranı;
        double kdvTutarı;
        double kdvliTutar;
        boolean kdvDurumu;


                Scanner scan=new Scanner(System.in);

                System.out.print("Ucret Tutarini Giriniz: ");
                tutar=scan.nextDouble();


                kdvDurumu=(0<tutar) && (tutar<1000);
                kdvOranı=kdvDurumu ? 0.18d: 0.08d;



                System.out.println("Girilen tutar "+ kdvOranı + " KDV oraninda hesaplanacaktır.");
                kdvTutarı=tutar*kdvOranı;
                kdvliTutar=kdvTutarı+tutar;



                System.out.println(" KDV'siz Tutar: "+tutar);
                System.out.println(" KDV orani    : "+kdvOranı);
                System.out.println(" KDV Tutari   : "+kdvTutarı);
                System.out.println(" KDV'li Tutar: "+kdvliTutar);


            }
        }
