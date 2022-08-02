package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreditPageObject extends MainPageObject
{
    private static final String
        BIG_CREDIT = "//*[contains(@text,'Подбор кредита')]",
        PURPOSE = "//*[contains(@text,'Просто деньги')]",
        SUMMA = "//*[contains(@text,'100 000')]",
        TERM = "//*[contains(@text,'1 год')]",
        CHAT = "ru.sravni.android.bankproduct.debug:id/chatMessage",
        ACTV_ANSWER = "ru.sravni.android.bankproduct.debug:id/actvAnswer",
        ET_ANSWER = "ru.sravni.android.bankproduct.debug:id/etAnswer",
        SEND_ANSWER = "ru.sravni.android.bankproduct.debug:id/imgSendAnswer",
        SAVED_SEARCH = "//*[contains(@text,'Николаев К.Д.')]";

    public CreditPageObject(AppiumDriver driver)
    {
        super(driver);
    }
    public void creditBigButtonTap()
    {
        this.waitForElementAndClick(By.xpath(BIG_CREDIT),"Большая плашка не найдена");
    }

    public void creditParams()
    {
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/rvParams"),"Не найден экран параметров");
    }

    public void creditTap()
    {
        this.waitForElementAndClick(By.xpath(PURPOSE),"");
        this.waitForElementAndClick(By.xpath(SUMMA),"");
        this.waitForElementAndClick(By.xpath(TERM),"");
    }

    public void creditNext()
    {
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/mbNext"),"Не найдена кнопка ДАЛЕЕ");
    }

    public void creditWriteActvMessage(String value)
    {
        this.waitForElementAndSendKeys(By.id(ACTV_ANSWER),value, value);
    }

    public void creditWriteEtMessageAndSendMessage(String value)
    {
        this.waitForElementAndSendKeys(By.id(ET_ANSWER),value, value);
        this.creditSendMessage();
    }


    public void creditSendMessage()
    {
        this.waitForElementAndClick(By.id(SEND_ANSWER),"Не найдена кнопка Отправить");
    }

    public void creditAutoCity()
    {
        WebElement City =  waitForElementPresent(
                By.id(ACTV_ANSWER),
                "Автоподстановка города не работает"
        );

        String article_title = City.getText();
        Assert.assertEquals(
                "Автоподстановка города не работает",
                "Москва",
                article_title
        );
    }

    public void creditReg(){
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'г Нижний Новгород, пр-кт Ленина, д 88 к 45')]"),"");
    }

    public void creditYesButton()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Да')]"),"Не удалось нажать кнопку ДА");
    }

    public void creditNoButton()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Нет')]"),"Не удалось нажать кнопку НЕТ");
    }



    public void creditManualInput()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Ручной ввод')]"),"");
    }

    public void creditManualScoring()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Ввести вручную')]"),"");
    }


    public void creditNotWork()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Не работаю')]"),"");
    }

    public void creditAllRight()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Все верно')]"),"");
    }


    public void creditRetiredJudge()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Судья в отставке')]"),"");
    }

    public void creditEducation()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Высшее')]"),"");
    }

    public void creditIncome()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'По форме банка')]"),"");
    }

    public void creditMyPhone()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Мой номер')]"),"");
    }

    public void creditSingle()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Холост/не замужем')]"),"");
    }

    public void creditFinal()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Перейти к результатам')]"),"");
    }

    public void creditScoring()
    {
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Кредитный рейтинг')]"),"");
    }

    public void creditSavedSearch()
    {
        WebElement City =  waitForElementPresent(
                By.xpath(SAVED_SEARCH),
                "Выдача не отобразилась"
        );

        String article_title = City.getText();
        Assert.assertEquals(
                "Выдача не отобразилась",
                "Николаев К.Д.",
                article_title
        );
    }
    public void creditFlat()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Квартира')]"),"");
    }

    public void creditScoringMainAndClick()
    {
        this.swipeUpToFindElement(By.xpath("//*[contains(@text,'Кредитный рейтинг')]"),"",1);
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Узнай вероятность одобрения кредита в банках')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Следи за финансовой безопасностью')]"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/incScoringProgressBar"),"");
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/btnScoringFind"),"");
    }

    public void creditOpenExtradition()
    {
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvRecentSummaryTitle"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvRecentSummarySubTitle"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvRecentSummaryMessage"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/imgRecentDraft"),"");
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/btnRecentSummary"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/clPersonalData"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvName"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/tvForm"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/ivAvatarIcon"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/avatarCardView"),"");
        this.waitForElementPresent(By.id("ru.sravni.android.bankproduct.debug:id/ivEdit"),"");
    }

    public void creditOrder()
    {
        this.waitForElementAndClick(By.id("ru.sravni.android.bankproduct.debug:id/vOptional"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'О кредите')]"),"");
        this.waitForElementAndClick(By.id("//*[contains(@text,'ОТПРАВИТЬ ЗАЯВКУ')]"),"");


    }

    public void creditFilterType()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Все кредиты')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Тип кредита')]"),"");
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Кредиты наличными')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Кредиты наличными')]"),"");
    }

    public void creditFilterSumm()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'800 000 ₽')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Сумма')]"),"");
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'200 000 ₽')]"),"");
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Готово')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'200 000 ₽')]"),"");
    }

    public void creditFilterDate()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'5 лет')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Срок кредита')]"),"");
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'3 года')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'3 года')]"),"");
    }

    public void creditFilterPurpose()
    {
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Просто деньги')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Цель')]"),"");
        this.waitForElementAndClick(By.xpath("//*[contains(@text,'Рефинансирование')]"),"");
        this.waitForElementPresent(By.xpath("//*[contains(@text,'Рефинансирование')]"),"");
    }

}
