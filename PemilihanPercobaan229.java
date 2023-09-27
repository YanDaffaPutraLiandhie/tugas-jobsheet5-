import java.util.Scanner;
public class PemilihanPercobaan229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("nilai uas :");
        float uas = input29.nextFloat();
        System.out.print("nilai uts :");
        float uts = input29.nextFloat();
        System.out.println("nilai kuis :");
        float kuis = input29.nextFloat();
        System.out.println("nilai tugas :");
        float tugas = input29.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir =" + total + "sehingga" + message);

}
}
