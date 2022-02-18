import java.util.Scanner;

public class manavKasa{

  public static void main(String[] args){

  double armut, elma, domates, muz, patlican, toplam;

  Scanner kacKilo = new Scanner(System.in);

  System.out.print(" Kaç Kilo Armut Aldınız: ");
  armut = kacKilo.nextInt();
  
  System.out.print(" Kaç Kilo Elma Aldınız: ");
  elma = kacKilo.nextInt();

  System.out.print(" Kaç Kilo Domates Aldınız: ");
  domates = kacKilo.nextInt();

  System.out.print(" Kaç Kilo Muz Aldınız: ");
  muz = kacKilo.nextInt();

  System.out.print(" Kaç Kilo Patlican Aldınız: ");
  patlican = kacKilo.nextInt();

  toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);

  System.out.println("Toplam Tutar :" + toplam + "TL");

  kacKilo.close();

  }

}