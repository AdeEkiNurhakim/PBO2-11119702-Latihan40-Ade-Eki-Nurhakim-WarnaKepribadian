/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warnakepribadian;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String nama, warna;
        System.out.println((char)27+"[01;31m Yuk"+(char)27+"[00;32m Cek"+(char)27+"[01;33m Kepribadian"+(char)27+"[01;34m Dari"+(char)27+"[01;35m Warna"+(char)27+"[01;36m Favoritmu"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;31m Merah"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;32m Hijau"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;33m Kuning"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;34m Biru"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;31m Unggu"+(char)27+"[00;00m");
        System.out.println();
        System.out.println("PILIH WARNA FAVORIT KAMU : ");
        warna = scan.nextLine();
        System.out.println("NAMA KAMU : ");
        nama = scan.nextLine();
        System.out.println();
        System.out.println("====== HASIL TEST KEPRIBADIAN =====");
        System.out.println("NAMA KAMU : "+ nama);
        System.out.println("");
        switch(warna){
            case "merah":
        System.out.println("PILIHAN WARNA FAVORIT KAMU : MERAH");
        System.out.println("1. Periang");
        System.out.println("2. Pemberani");
        System.out.println("3. Berani Mengambil Resiko");
        System.out.println("4. Menyukai Tantangan");
        System.out.println("5.Kurang Sabar");
        break;
        case "kuning":
        System.out.println("PILIHAN WARNA FAVORIT KAMU : KUNING");
        System.out.println("1. Optimis");
        System.out.println("2. Suka Bergaul");
        System.out.println("3. Periang");
        System.out.println("4. Senang Menolong");
        System.out.println("5. Lincah Dan Aktip");
        System.out.println("6. Tidak Suka Kekurangan Orang Lain");
        System.out.println("7. Loyal");
        System.out.println("8. Hangat");
        System.out.println("9. Meskipun Karakternya Optimis dan idealis, Seringkali goyah dan tidak Stabil");
       System.out.println("10. Cenderung Penakut");
        break;
       case "hijau":
        System.out.println("PILIHAN WARNA FAVORIT KAMU : HIAJU");
        System.out.println("1. Romantis");
        System.out.println("2. Menyukai hal berbau alam dankeindahan");
        System.out.println("3. Teguh Pada Prinsip");
        System.out.println("4. Menginginkan Kesempurnaan");
        System.out.println("5. Mudah Cemburu");
        System.out.println("6. Mudah Merasa Iri");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");
        break;
        case "biru":
        System.out.println("PILIHAN WARNA FAVORIT KAMU : BIRU");
        System.out.println("1. Menyenangkan");
        System.out.println("2. Bijaksana");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
        System.out.println("4. Dinamis");
        System.out.println("5. Senang Berbagi");
        System.out.println("6. Bersahabat");
        System.out.println("7. Tidak Terlalu suka menjadi sorotan banyak orang");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
        break;
        case "unggu":
        System.out.println("PILIHAN WARNA FAVORIT KAMU : UNGU");
        System.out.println("1. Optimis");
        System.out.println("2. Tidak Pernah Ragu");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat");
        System.out.println("4. Memiliki ambisi yang besar");
        System.out.println("5. Memiliki empati yang besar");
        System.out.println("6. Memiliki sis misterius sebab seringkali menutupi perasaannya");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
        break;
        default:
        System.out.println("Warna Salah !!!");
    }
}
}

