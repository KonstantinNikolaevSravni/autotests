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

    String PhoneNumber = "9577000014";
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

        CreditPageObject CreditPageObject = new CreditPageObject(driver);

        StartPageObject.pressButton("Получить");

        StartPageObject.pressButton("Подобрать займ");

        driver.context("WEBVIEW_ru.sravni.android.bankproduct.debug");

        //summ

        StartPageObject.waitForElementAndClick(By.cssSelector("#formSumm > div._rur2v > div._2d4dpp > div > div > div > input"),"error",50);
        StartPageObject.waitForElementAndClick(By.cssSelector("#formSumm > div._rur2v > div._2d4dpp > div > span"),"error",50);
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formSumm > div._rur2v > div._2d4dpp > div > div > div > input"),"8000","Не введена сумма");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();

        //term
        StartPageObject.waitForElementAndClick(By.cssSelector("#formShortTerm > div._rur2v > div._1brh8gh > div > div > div > div > input"),"error",50);
        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div > div.month > div:nth-child(7) > div > div:nth-child(7)"),"error",50);

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //FIO
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formPassportFio > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Кейдж Константин Дмитриевич","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //birthday
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formBirthDate > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"03.04.1990","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //passport
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formNumberPassport > div:nth-child(2) > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"5816268974","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportPassportIssueDateField"),"03.04.2021","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportBirthplaceField"),"гор. Москва","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //code

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalPassport > div._rur2v > div._e08cv5 > div > div > div > input"),"600003","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //address

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistration > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Казань шамиля усманова 12","");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",60);

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();

        //address flat
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistrationFlat > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > input"),"60","error");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();

        CreditPageObject.mfoPause();

        //address true
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/label/div"),"",60);

        CreditPageObject.mfoPause();

        //work
        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        CreditPageObject.mfoPause();

        //monthlyincome

        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"50000","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //next - dlc
        CreditPageObject.mfoReactNext();


        //family

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/label/div"),"",60);

        CreditPageObject.mfoPause();

        //children

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        CreditPageObject.mfoPause();

        //education

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/main/form/div[3]/label/div"),"",60);

        CreditPageObject.mfoPause();

        //snils
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/div/input"),"16759425819","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.xpath("/html/body/div[1]/div/div/main/form/div[2]/div[1]/div/div/div/input"),"nikolaeff@yandex.sravni","");

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();


        //final

        StartPageObject.waitForElementAndClick(By.xpath("/html/body/div[1]/div/div/footer/button"),"",60);

        CreditPageObject.mfoPause();

        driver.context("NATIVE_APP");

        Thread.sleep(9000);

        //offer
        StartPageObject.pressButton("Получить деньги");

        CreditPageObject.mfoPause();

        //offer shtorka
        StartPageObject.pressButton("Ввести данные карты");

        CreditPageObject.mfoPause();















    }
}

