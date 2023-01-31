import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {


    //1. Kullanıcı girişi yapılarak sepete ürün eklenmesi
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    // Kullanıcı giriş işlemi yapılır.
    // Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
    // Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
    // Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.

        //2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
    // Kullanıcı Hepsiburada.com sitesini ziyaret eder.
    //  Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
    // Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.
    // Seçilen ürünün doğru olarak eklendiği 'Sepetim' sayfasında doğrulanmalıdır.
    //UI automation done
    //Used by:
    //-Tool: Selenium WebDriver, Maven, Log4j
    //-Framework: TestNG, POM
    //-Language: Java
    //-IDE: Intellij
    //--istenmemiş ama raporlama bu işin olmazsa olmazı
    //Dünki dersten eksikler
    //src/test/java/Tests/TC001.java --> extends BaseTest
    //log4j2.xml
    // private static final Logger LOGGER= LogManager.getLogger(HomePage.class);
        AllPages allPages=new AllPages();
    @Test
    public void test01(){
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("useremail"), ConfigReader.getProperty("userpassword"));
        allPages.userDashboardPage().verifyValidLogin("mizgin esen");
        allPages.userDashboardPage().searchProduct("robot süpürge");

    }
}
