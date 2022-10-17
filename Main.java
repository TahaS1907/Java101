class Main {
  public static void main(String[] args) {
   int[] dizi = {1, 9, 0, 7, 5};
        double toplam = 0;
        for (int i : dizi) {if(i==0){toplam=toplam;}
            toplam = toplam + (1.0 / i);
        }

        System.out.println("Harmonik Ortalama: " + (dizi.length / toplam));
  }
}