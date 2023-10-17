package ReadNumbers;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadNumbers {

    public static void main(String[] args) {


        try {
            //Okunacak metin dosyasının yolunu FileReader nesnesine veriyoruz.
            FileReader file = new FileReader("\\input.txt");

            BufferedReader input = new BufferedReader(file);
            String line;
            int number;                //Değişkenleri tanımlıyoruz.
            int total=0;
            System.out.println("Okunan sayılar: ");
            while ((line = input.readLine()) != null) {
                //Verileri satır satır okuyoruz.
               number=Integer.parseInt(line);            //Okunan satırları int değere dönüştürme.
                System.out.println( line);
               total+=number;                          //Sayıları topla.
            }
            input.close();
            System.out.println("Sayıların toplamı: "+total);    //Yazdır.
        } catch (Exception e) {
            e.getStackTrace();


        }
    }
}

