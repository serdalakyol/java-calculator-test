import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    @BeforeAll
    public static void setupClass(){
        System.out.println("SetupClass Methodu Çalıştırıldı"); //bir kez çalıştırılır // All komutlarında Static kullanılır
    }



    HesapMakinesi hesapMakinesi;
    @BeforeEach
    public void setup(){
        hesapMakinesi =  new HesapMakinesi();
        System.out.println("setup methodu uygulamamızda çalıştırıldı "); // her TeST ESNASINDA YENİDEN ÇALIŞTIRILIR
    }
        @Test
     public void toplamaTesti(){
         double toplamaSonucu= hesapMakinesi.toplama(1.3,2.7);
         Assertions.assertEquals(4,toplamaSonucu);
     }
    //Dısabled TeST KOŞUMUNU durdurur ve diğer testleri yapmaya devam eder paratez içine istediğimiz mesajı yazarsak kosolda gösterir
    @Test
     public void cikarmaTesti(){
         double cikarmaSonucu = hesapMakinesi.cikarma(3.6,2.5);
         Assertions.assertEquals(1.1,cikarmaSonucu);

     }
     @Test
     public void carpmaTesti (){

            double carpmaSonucu= hesapMakinesi.carpma(2.5,2);
            Assertions.assertEquals(5,carpmaSonucu);
     }

     @AfterEach
     public void tearDown (){     //TearDown = Kapama demektir
         System.out.println("TearDown Methodu Çalıştırıldı");
     }

    @AfterAll
    public static void tearDownClass (){     //TearDown = Kapama demektir // All komutlarında Static kullanılır
        System.out.println("TearDownClass Methodu Çalıştırıldı");
    }
}
