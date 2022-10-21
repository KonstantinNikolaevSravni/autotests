package tests;

import lib.CoreCreditTestCase;
import lib.CoreTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class AndroidNUMfo extends CoreTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9577000035";
    String SMSCode = "1234";
    String FIO = "Кейдж Иван Сергеевич";
    String Birthday = "03.04.1990";
    String Passport = "5816268974";
    String DateOfIssue = "03.04.2021";
    String WhereIssued = "город Москва";
    String Code = "600003";
    String Address = "Казань шамиля усманова 12";
    String AddressFlat = "60";
    String Work = "Сравни";

    @Test
    public void testMfoReactLessThen15() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        CreditPageObject CreditPageObject = new CreditPageObject(driver);

        StartPageObject.authWithPromo(PhoneNumber, SMSCode);

        StartPageObject.pressButton("Получить");

        StartPageObject.pressButton("Подобрать займ");

        driver.context("WEBVIEW_ru.sravni.android.bankproduct.debug");

        //summ

        CreditPageObject.mfoSummLessThen15();

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
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formBirthDate > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),Birthday,"");

        //next
        CreditPageObject.mfoReactNext();

        //passport
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formNumberPassport > div:nth-child(2) > div.yjx27nTIvZKWP6pxeid0._e08cv5 > div > div > div > input"),Passport,"");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportPassportIssueDateField"),DateOfIssue,"");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportBirthplaceField"),WhereIssued,"");

        //next
        CreditPageObject.mfoReactNext();

        //code

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalPassport > div._rur2v > div._e08cv5 > div > div > div > input"),Code,"");

        //next
        CreditPageObject.mfoReactNext();


        //address

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistration > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),Address,"");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",60);

        //next
        CreditPageObject.mfoReactNext();

        //address flat
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistrationFlat > div._rur2v > div.dXl6bRV8htgCUW_EiACO._124u4y8 > div > div > input"),AddressFlat,"error");

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

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formOrganizationName > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),Work,"");

        StartPageObject.waitForElementAndClick(By.cssSelector("body > div:nth-child(2) > div > div > div:nth-child(1)"),"",15);

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formLastExperienceStartDate > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),"02.2021","");

        CreditPageObject.mfoReactNext();

        //Salary

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeSalary > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"50000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalIncome > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"15000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeLoanpaymentTotal > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"5000","");

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
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraSnils > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),"16759425819","");

        //next
        CreditPageObject.mfoReactNext();

        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraEmail > div._rur2v > div.dXl6bRV8htgCUW_EiACO._124u4y8 > div > div > input"),"nikolaeff@yandex.sravni","");

        //next
        CreditPageObject.mfoReactNext();
    }

    @Test
    public void testMfoReactMoreThen15() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        CreditPageObject CreditPageObject = new CreditPageObject(driver);

        StartPageObject.authWithPromo(PhoneNumber, SMSCode);

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
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formPassportFio > div._rur2v > div.LrTHzpuAr5zE7bl8MoZK._1dadv81 > div > div > textarea"),FIO,"");

        //next
        CreditPageObject.mfoReactNext();

        //birthday
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formBirthDate > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),"03.04.1990","");

        //next
        CreditPageObject.mfoReactNext();

        //passport
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formNumberPassport > div:nth-child(2) > div.yjx27nTIvZKWP6pxeid0._e08cv5 > div > div > div > input"),"5816268974","");

        CreditPageObject.mfoPause();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#passportPassportIssueDateField"),"03.04.2021","");

        CreditPageObject.mfoPause();

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
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formRegistrationFlat > div._rur2v > div.dXl6bRV8htgCUW_EiACO._124u4y8 > div > div > input"),"60","error");

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

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formLastExperienceStartDate > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),"02.2021","");

        CreditPageObject.mfoReactNext();

        //Salary

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeSalary > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"50000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formAdditionalIncome > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"15000","");

        CreditPageObject.mfoReactNext();

        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formIncomeLoanpaymentTotal > div._rur2v > div.kRjNTm3mWM3UzEXkyEgG._2d4dpp > div > div > div > input"),"5000","");

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
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraSnils > div._rur2v > div.yjx27nTIvZKWP6pxeid0.bhOO9u_uHjcL9DjpZ4w3._e08cv5 > div > div > div > input"),"16759425819","");

        //next
        CreditPageObject.mfoReactNext();

        //e-mail
        StartPageObject.waitForElementAndSendKeys(By.cssSelector("#formExtraEmail > div._rur2v > div.dXl6bRV8htgCUW_EiACO._124u4y8 > div > div > input"),"nikolaeff@yandex.sravni","");

        //next
        CreditPageObject.mfoReactNext();

    }

}

