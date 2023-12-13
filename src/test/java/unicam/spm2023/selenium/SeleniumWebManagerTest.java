package unicam.spm2023.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeleniumWebManagerTest {


        static WebDriver driver;

        static ChromeOptions options;

        @Test
        void checkProsSite() throws InterruptedException {

                driver.get("http://pros.unicam.it/");

                Thread.sleep(3000);

                String at = driver.getTitle();
                String et = "PROS - PROcesses & Services lab | Computer Science division @Unicam";

                //System.out.println(at);
                Thread.sleep(4000);

                assertEquals(et,at);

        }



        /**
         * @throws java.lang.Exception
         */
        @BeforeAll
        static void setUpBeforeClass() throws Exception {
                WebDriverManager.chromedriver().setup();

        }


        /**
         * @throws java.lang.Exception
         */
        @AfterAll
        static void tearDownAfterClass() throws Exception {

        }

        /**
         * @throws java.lang.Exception
         */
        @BeforeEach
        void setUp() throws Exception {
        }

        /**
         * @throws java.lang.Exception
         */
        @AfterEach
        void tearDown() throws Exception {
                driver.close();
                driver.quit();
        }
}
