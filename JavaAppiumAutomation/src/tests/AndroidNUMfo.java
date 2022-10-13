package tests;

import lib.CoreCreditTestCase;
import lib.CoreTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class AndroidNUMfo extends CoreCreditTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9577000010";
    String SMSCode = "1234";

    @Test
    public void testAuth()
        {
            lib.ui.StartPageObject StartPageObject = new StartPageObject(driver);

            StartPageObject.AuthCredit(PhoneNumber, SMSCode);
        }

    @Test
    public void testMfoFlow() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        StartPageObject.pressButton("Получить");

        StartPageObject.pressButton("Подобрать займ");

        driver.context("WEBVIEW_ru.sravni.android.bankproduct.debug");

        //summ
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"error",50);
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/span"),"error",50);
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"10091","error");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //term
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[1]/div[1]/div/div/div/div/input"),"error",50);
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[7]/div/div[6]"),"error",50);

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //FIO
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/textarea"),"Кейдж Константин Дмитриевич","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //birthday
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/div/input"),"03.04.1990","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //passport
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/div/input"),"5816268974","");

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/div[1]/div/div/div/div/input"),"03.04.2021","");

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[4]/div/div[1]/textarea"),"гор. Москва","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //code

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"600003","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //address

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/textarea"),"Казань шамиля усманова 12","");

        Thread.sleep(2000);

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[2]/div/div/div[1]/div"),"",60);

        Thread.sleep(2000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //address true
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/label/div"),"",60);

        Thread.sleep(3000);

        //work
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        Thread.sleep(3000);

        //monthlyincome

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"50000","");

        Thread.sleep(2000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //next - dlc
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //family

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/label/div"),"",60);

        Thread.sleep(3000);

        //children

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        Thread.sleep(3000);

        //education

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        Thread.sleep(3000);

        //snils
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/div/input"),"16759425819","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"nikolaeff@yandex.sravni","");

        Thread.sleep(3000);

        //next
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button[2]/span"),"",60);

        Thread.sleep(3000);

        //final

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button"),"",60);

        Thread.sleep(10000);

        driver.context("NATIVE_APP");

        //offer
        StartPageObject.pressButton("Получить деньги");

        Thread.sleep(3000);

        //offer shtorka
        StartPageObject.pressButton("Ввести данные карты");

        Thread.sleep(3000);















    }
}

