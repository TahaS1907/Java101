import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int boyut;
        System.out.println("Bir sayı giriniz n:");
        boyut= scanner.nextInt();
        int[] dizi=new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.println(i+1+"."+" "+"Elemanı giriniz:");
            int say= scanner.nextInt();
            dizi[i]=say;

        }
        Arrays.sort(dizi);
System.out.println("Sıralama:");
           for(int i:dizi){System.out.println(i);}


    }
}
