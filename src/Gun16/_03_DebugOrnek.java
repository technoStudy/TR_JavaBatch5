package Gun16;

public class _03_DebugOrnek {
    public static void main(String[] args) {
        // F8 -> sonraki adım
        // F9 -> bir break pointten , diğerine atlamak için kullanılır
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlaması istedğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılı.Program ilk olarak breakpoint de
        // durur ve F8 ile adım adım ilerletilir.Bu şekilde hem değerler izlenir
        // hemde nasıl çalıştığı test edilebilir.F9 ile bir break Pointten diğer
        // Break Pointe atlanabilir.

        int a=10;

        a=1000;

        a=a+100;

        a=a+5;

        System.out.println("a = " + a);


    }
}
