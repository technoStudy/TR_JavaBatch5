package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız=");
        String ad=oku.nextLine();

        System.out.print("Soyadınız=");
        String soyad=oku.nextLine();

        System.out.println("Adınız ve Soyadınız= " + ad+" "+soyad);
    }
}
