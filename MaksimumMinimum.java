import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] list = {15,12,788,1,-1,-778,2,0};
      Scanner scanner=new Scanner(System.in);
    int min=list[0];
    int maks=list[0];
    int byak=111111110;
    int kyak=-100;
    int sayi;
    System.out.println("lütfen bir sayı giriniz:");
sayi=scanner.nextInt();
        for (int i : list) {
          
            if (i < sayi) {
             
              min=i;
             
            }
            if (i > sayi ) {
             maks=i;
            }
           if(min>kyak&&min<sayi){kyak=min;}
          if(maks<byak&&maks>sayi){byak=maks;}
            }
        
        System.out.println("Minimum değere en yakın değer " + kyak);
        System.out.println("Maximum değere en yakın değer " + byak);
  }
}
