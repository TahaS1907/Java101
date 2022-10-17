
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
int[] sayilar={1,2,3,2,3,5,6,6,6,5,2,3};
    int[] cift=new int[sayilar.length+1];int tekrar1=0;int say=0;
    int tekrar2=0;int say2=0;
int sayi;int[] tekrar=new int[10];
    for(int i=0;i<=sayilar.length+2;i++){
      
    if(sayilar[i]%2==0){
cift[i]=sayilar[i];
    }    
    }Arrays.sort(cift);
    for(int j=0;j<=cift.length+1;j++){
    if(cift[j]==cift[j+1]){
tekrar1+=tekrar1;}if(cift[j]!=cift[j+1]){
tekrar[0]=tekrar1;say=cift[j];
  
}if(cift[j]==cift[j+1]&&cift[j]!=say){
tekrar2+=tekrar2;say2=cift[j];
  
}tekrar[1]=tekrar2;

    }if(tekrar[0]>tekrar[1]){System.out.println(say);}
    else System.out.println(say2);

    
  }
}