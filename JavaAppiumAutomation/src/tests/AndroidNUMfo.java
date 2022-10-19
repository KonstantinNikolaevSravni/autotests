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

    String PhoneNumber = "9577000028";
    String SMSCode = "1234";
    String FIO = "Кейдж Иван Сергеевич";

    @Test
    public void testAuth()
        {
            lib.ui.StartPageObject StartPageObject = new StartPageObject(driver);

            StartPageObject.AuthCredit(PhoneNumber, SMSCode);
        }

    @Test
    public void testMfoReactLessThen15() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        CreditPageObject CreditPageObject = new CreditPageObject(driver);

        StartPageObject.pressButton("Получить");

        StartPageObject.pressButton("Подобрать займ");

        driver.context("WEBVIEW_ru.sravni.android.bankproduct.debug");

        //summ

        CreditPageObject.mfoSummLessThen15();

        CreditPageObject.mfoPause();

        //next
        CreditPageObject.mfoReactNext();

        //term
        StartPageObject.waitForElementAndClick(By.cssSelector("#formShortTerm > div._rur2v > div._1brh8gh > div > div > div > div > input"),"error",50);
        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div > div.month > div:nth-child(7) > div > div:nth-child(7)"),"error",50);

        //next
        CreditPageObject.mfoReactNext();

        //FIO
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formPassportFio > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),FIO,"");

        //next
        CreditPageObject.mfoReactNext();

        //birthday
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formBirthDate > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"03.04.1990","");

        //next
        CreditPageObject.mfoReactNext();

        //passport
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formNumberPassport > div:nth-child(2) > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"5816268974","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportPassportIssueDateField"),"03.04.2021","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportBirthplaceField"),"гор. Москва","");

        //next
        CreditPageObject.mfoReactNext();

        //code

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalPassport > div._rur2v > div._e08cv5 > div > div > div > input"),"600003","");

        //next
        CreditPageObject.mfoReactNext();


        //address

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistration > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Казань шамиля усманова 12","");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",60);

        //next
        CreditPageObject.mfoReactNext();

        //address flat
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistrationFlat > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > input"),"60","error");

        //next
        CreditPageObject.mfoReactNext();

        //address true
        StartPageObject.waitForElementAndClick(By.cssSelector("#formLivingQuestion > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        //work
        StartPageObject.waitForElementAndClick(By.cssSelector("#formEmploymentType > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("#formJobType > div:nth-child(4) > label"),"",15);

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formOrganizationName > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Сравни","");

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",15);

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formLastExperienceStartDate > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"02.2021","");

        CreditPageObject.mfoReactNext();

        //Salary

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeSalary > div._rur2v > div._2d4dpp > div > div > div > input"),"50000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalIncome > div._rur2v > div._2d4dpp > div > div > div > input"),"15000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeLoanpaymentTotal > div._rur2v > div._2d4dpp > div > div > div > input"),"5000","");

        CreditPageObject.mfoReactNext();

        //family

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraMaritalStatus > div:nth-child(3) > label"),"",60);

        CreditPageObject.mfoPause();

        //children

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraDependentsCount > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        //education

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraEducation > div:nth-child(4) > label"),"",60);

        CreditPageObject.mfoPause();

        //snils
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraSnils > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"16759425819","");

        //next
        CreditPageObject.mfoReactNext();

        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraEmail > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > input"),"nikolaeff@yandex.sravni","");

        //next
        CreditPageObject.mfoReactNext();

        //final

        StartPageObject.waitForElementAndClick(By.cssSelector("#root > div > div > footer > button"),"",60);

        CreditPageObject.mfoPause();

        driver.context("NATIVE_APP");

        //offer

//        StartPageObject.pressButton("Получить деньги");

 //       CreditPageObject.mfoPause();

        //offer shtorka
  //      StartPageObject.pressButton("Ввести данные карты");

 //       CreditPageObject.mfoPause();
    }

    @Test
    public void testMfoReactLessThen15Offer(){


    }

    @Test
    public void testMfoReactMoreThen15() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        CreditPageObject CreditPageObject = new CreditPageObject(driver);

        StartPageObject.pressButton("Получить");

        StartPageObject.pressButton("Подобрать займ");

        driver.context("WEBVIEW_ru.sravni.android.bankproduct.debug");

        StartPageObject.waitForElementAndClick(By.cssSelector("#formSumm > span:nth-child(10)"),"",15);

        CreditPageObject.mfoPause();
        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndClick(By.cssSelector("#formTerm > span:nth-child(7)"),"",15);

        CreditPageObject.mfoPause();
        CreditPageObject.mfoReactNext();

        //FIO
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formPassportFio > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Кейдж Константин Дмитриевич","");

        //next
        CreditPageObject.mfoReactNext();

        //birthday
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formBirthDate > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"03.04.1990","");

        //next
        CreditPageObject.mfoReactNext();

        //passport
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formNumberPassport > div:nth-child(2) > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"5816268974","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportPassportIssueDateField"),"03.04.2021","");

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportBirthplaceField"),"гор. Москва","");

        //next
        CreditPageObject.mfoReactNext();

        //code

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalPassport > div._rur2v > div._e08cv5 > div > div > div > input"),"600003","");

        //next
        CreditPageObject.mfoReactNext();


        //address

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistration > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Казань шамиля усманова 12","");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",60);

        //next
        CreditPageObject.mfoReactNext();

        //address flat
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistrationFlat > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > input"),"60","error");

        //next
        CreditPageObject.mfoReactNext();

        //address true
        StartPageObject.waitForElementAndClick(By.cssSelector("#formLivingQuestion > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        //work
        StartPageObject.waitForElementAndClick(By.cssSelector("#formEmploymentType > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("#formJobType > div:nth-child(4) > label"),"",15);

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formOrganizationName > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),"Сравни","");

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",15);

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formLastExperienceStartDate > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"02.2021","");

        CreditPageObject.mfoReactNext();

        //Salary

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeSalary > div._rur2v > div._2d4dpp > div > div > div > input"),"50000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalIncome > div._rur2v > div._2d4dpp > div > div > div > input"),"15000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeLoanpaymentTotal > div._rur2v > div._2d4dpp > div > div > div > input"),"5000","");

        CreditPageObject.mfoReactNext();

        //family

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraMaritalStatus > div:nth-child(3) > label"),"",60);

        CreditPageObject.mfoPause();

        //children

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraDependentsCount > div:nth-child(2) > label"),"",60);

        CreditPageObject.mfoPause();

        //education

        StartPageObject.waitForElementAndClick(By.cssSelector("#formExtraEducation > div:nth-child(4) > label"),"",60);

        CreditPageObject.mfoPause();

        //snils
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraSnils > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > div > input"),"16759425819","");

        //next
        CreditPageObject.mfoReactNext();

        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraEmail > div._rur2v > div.MuDHqotyyd6HDfeo9vWj > div > div > div > input"),"nikolaeff@yandex.sravni","");

        //next
        CreditPageObject.mfoReactNext();

        //final

        StartPageObject.waitForElementAndClick(By.cssSelector("#root > div > div > footer > button"),"",60);

        CreditPageObject.mfoPause();

        driver.context("NATIVE_APP");


    }
}

