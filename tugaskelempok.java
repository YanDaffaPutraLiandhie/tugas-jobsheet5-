import java.util.Scanner;
public class tugaskelempok{
public static void main(String[] args) {
    Scanner input00 = new Scanner (System.in);
    int angka;
    System.out.println("masukkan angka");
    angka = input00.nextInt();

    if (angka % 2 == 0) {
            System.out.println(angka + " is even.");
        } else {
            System.out.println(angka + " is odd.");
        }
        input00.close();
}
}