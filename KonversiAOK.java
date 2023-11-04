import java.util.*;

public class KonversiAOK {
    public static void main(String[] args) {

    //Menambahkan scanner untuk membaca input dari user
        Scanner input = new Scanner(System.in);
        boolean working = true;
        
    //Menu untuk dipilih user
    while(working){
        System.out.println("Program konversi bilangan");
        System.out.println("Pilih Menu: ");
        System.out.println("1. Konversi Bilangan Biner ke Desimal");
        System.out.println("2. Konversi Bilangan Desimal ke Biner");
        System.out.println("3. Konversi Bilangan Biner ke Heksadesimal");
        System.out.println("4. Konversi Bilangan Heksadesimal ke Biner");
        System.out.println("5. Konversi Bilangan Desimal ke Heksadesimal");
        System.out.println("6. Konversi Bilangan Heksadesimal ke Desimal");
        System.out.println("0. Keluar Program");
        System.out.println(" ");

        System.out.print("Pilihan anda: ");
        int menu = input.nextInt();
        
    //Switch case sebagai program-program bagian untuk menghitung masing-masing menu konversi bilangan
        switch (menu) {
            case 1:
                System.out.print("Masukkan bilangan biner: ");
                String bin1 = input.next();
                int dec1 = 0;
                for (int i = 0; i < bin1.length(); i++) {
                    char bit = bin1.charAt(i);
                    if (bit == '1') {
                        dec1 += Math.pow(2, bin1.length() - i - 1);
                    }
                }
                System.out.println("Hasil konversi: " + dec1);
                break;

            case 2:
                System.out.print("Masukkan bilangan desimal: ");
                int dec2 = input.nextInt();
                String bin2 = "";
                while (dec2 > 0) {
                    bin2 = (dec2 % 2) + bin2;
                    dec2 /= 2;
                }
                System.out.println("Hasil konversi: " + bin2);
                break;

            case 3:
                System.out.print("Masukkan bilangan biner: ");
                String bin3 = input.next();
                int dec3 = 0;
                for (int i = 0; i < bin3.length(); i++) {
                    char bit = bin3.charAt(i);
                    if (bit == '1') {
                        dec3 += Math.pow(2, bin3.length() - i - 1);
                    }
                }
                String hex3 = Integer.toHexString(dec3);
                System.out.println("Hasil konversi: " + hex3);
                break;

            case 4:
                System.out.print("Masukkan bilangan Heksadesimal: ");
                String hex4 = input.next();
                int dec4 = Integer.parseInt(hex4, 16);
                String bin4 = Integer.toBinaryString(dec4);
                System.out.println("Hasil konversi: " + bin4);
                break;

            case 5:
                System.out.print("Masukkan bilangan desimal: ");
                int dec5 = input.nextInt();
                String hex5 = Integer.toHexString(dec5);
                System.out.println("Hasil konversi: " + hex5);
                break;

            case 6:
                System.out.print("Masukkan bilangan Heksadesimal: ");
                String hex6 = input.next();
                int dec6 = Integer.parseInt(hex6, 16);
                System.out.println("Hasil konversi: " + dec6);
                break;

            case 0:
                System.out.println("Terima kasih sudah menggunakan program!");
                working = false; 
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
         }
    /*  Di bawah ini adalah program untuk memilih apakah user ingin menggunakan menu lain dengan kembali
        ke menu utama dan memilih salah satu menu untuk dijalankan */
            if (working) {
                System.out.print("Kembali ke menu utama? (yes/no): ");
                String continueChoice = input.next().toLowerCase();
                if (!continueChoice.equals("yes")) {
                    working = false; 
                    System.out.println("Terima kasih sudah menggunakan program!");
                }
            }

        } while (working);

        input.close();
    }
}