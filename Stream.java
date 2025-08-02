
import java.util.ArrayList;
import java.util.List;


public class Stream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i=0;i<=100;i++){
            list.add(i);
        }
        long bolunebilensayi=list.stream().filter(sayi -> sayi%2==0 && sayi %4 == 0).count();
        System.out.println("1 ve 100 arasında, 2 ve 4 e bölünebilen sayıların adedi:" + bolunebilensayi);

        long teksayilar=list.stream().filter(sayi -> sayi%2==1).count();
        long teksayilartoplami=list.stream().filter(sayi -> sayi%2==1).mapToInt(Integer:: intValue).sum();

        System.out.println("Tek sayıların adedi:"+teksayilar);
        System.out.println("Tek sayıların toplamı:"+teksayilartoplami);


        long çiftsayilar=list.stream().filter(sayi -> sayi%2==0).count();
        long çifttoplam=list.stream().filter(sayi -> sayi%2==0).mapToInt(Integer:: intValue).sum();

        System.out.println("Çift sayıların adedi:"+çiftsayilar);
        System.out.println("Çift sayıların toplamı:"+çifttoplam);





        };

      
    }

