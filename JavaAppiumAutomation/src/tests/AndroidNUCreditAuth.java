package tests;
import lib.CoreTestCase;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;
import org.openqa.selenium.By;

public class AndroidNUCreditAuth extends CoreTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9565000409";
    String SMSCode = "1234";

    @Test
    public void testLoginFull() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        // Первый экран промо

        StartPageObject.promoScreen("ОСАГО онлайн", "Купите или продлите любой полис ОСАГО. Сохраним все скидки, без комиссии, с экономией до 3 500 ₽");
        StartPageObject.promoButtonNext();

        // Второй экран промо

        StartPageObject.promoScreen("Персональный подбор кредита", "Заполните информацию о себе, сравните персональные предложения и узнайте какой банк одобрит кредит или кредитную карту");
        StartPageObject.promoButtonNext();

        // Третий экран промо

        StartPageObject.promoScreen("Кредитный рейтинг", "Узнайте свой кредитный рейтинг – он влияет на решение банков о выдаче кредита");
        StartPageObject.promoButtonNext();

        // Четвертый экран промо

        StartPageObject.promoScreen("Умный чат бот", "Поможет легко заполнить любую информацию");
        StartPageObject.promoButtonNext();

        // Пятый экран промо

        StartPageObject.promoScreen("И много других продуктов…", "Сравните вклады, ипотеку, дебетовые карты, каско, страховки путешествий и многое другое");
        StartPageObject.promoButtonNext();

        // Шестой экран промо

        StartPageObject.promoScreen("Безопасность – наш приоритет", "Ваши данные надежно защищены. Мы соблюдаем закон о защите персональных данных и используем многоуровневую защиту");
        StartPageObject.promoButtonNextFinal();

        // Ввод номера

        StartPageObject.phoneElementTitle("Добро пожаловать!");
        StartPageObject.phoneElementMessage("Введите ваш номер телефона, чтобы войти или зарегистрироваться. Для проверки мы отправим на него СМС с кодом подтверждения");
        StartPageObject.writePhone(PhoneNumber);
        StartPageObject.sendPhone();

        // Ввод смс-кода

        StartPageObject.smsElementTitle("Введите код");
//        StartPageObject.smsElementMessage("В течение пары минут на номер\n+7 (957) 500-06-99 придет СМС с кодом подтверждения");
        StartPageObject.writeSMS(SMSCode);

        // Главный экран

        StartPageObject.mainElementTitle("Главная");

    }

    @Test
    public void testUserAgreement()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);

        MainPageObject.waitForElementPresent(By.xpath("//*[contains(@text,'Нажимая «Далее», я соглашаюсь c правилами предоставления информации и согласием на обработку персональных данных')]"),"");

        MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'правилами предоставления информации')]"),"",5);

        MainPageObject.waitForElementPresent(By.xpath("//*[contains(@text,'Пользовательское соглашение сервиса Сравни.ру')]"),"",10);
        driver.navigate().back();

        MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'согласием на обработку персональных данных')]"),"",5);

        MainPageObject.waitForElementPresent(By.xpath("//*[contains(@text,'СОГЛАСИЕ НА ОБРАБОТКУ ПЕРСОНАЛЬНЫХ ДАННЫХ')]"),"");




        StartPageObject.promoScreen("ОСАГО онлайн", "Купите или продлите любой полис ОСАГО. Сохраним все скидки, без комиссии, с экономией до 3 500 ₽");
        StartPageObject.promoSwipe("//*[contains(@text,'ОСАГО онлайн')]");
        MainPageObject.waitForElementPresent(By.xpath("//*[contains(@text,'Все банки предоставляют разные условия, например, ставки от 5.99% до 30% годовых…')]"),"");
        MainPageObject.waitForElementAndClick(By.xpath("//*[contains(@text,'Подробнее')]"),"",5);

        MainPageObject.waitForElementPresent(By.xpath("//*[contains(@text,'Все банки предоставляют разные условия, например, ставки от 5.99% до 30% годовых, срок кредита от 6 месяцев до 15 лет. Пример расчета: по кредиту на сумму 350 000 руб. на 3 года под ставку 9% годовых общая сумма выплат составит 400 716 руб. с ежемесячным платежом 11 131 руб./мес. Штраф за просрочку ежемесячного платежа: 0,05% - 0,2% от суммы просроченной задолженности за каждый день нарушения обязательств. Не является публичной офертой.')]"),"");
        MainPageObject.waitForElementAndClick(By.xpath("//*[@content-desc='Navigate up']"),"",5);
        StartPageObject.promoScreen("Персональный подбор кредита", "Заполните информацию о себе, сравните персональные предложения и узнайте какой банк одобрит кредит или кредитную карту");

    }

    @Test
    public void testLoginFullSwipe() throws InterruptedException {

        StartPageObject StartPageObject = new StartPageObject(driver);

        StartPageObject.promoSwipe("//*[contains(@text,'ОСАГО онлайн')]");
        StartPageObject.promoSwipe("//*[contains(@text,'Персональный подбор кредита')]");
        StartPageObject.promoSwipe("//*[contains(@text,'Кредитный рейтинг')]");
        StartPageObject.promoSwipe("//*[contains(@text,'Умный чат бот')]");
        StartPageObject.promoSwipe("//*[contains(@text,'И много других продуктов…')]");
        StartPageObject.promoButtonNextFinal();

        // Ввод номера

        StartPageObject.phoneElementTitle("Добро пожаловать!");
        StartPageObject.phoneElementMessage("Введите ваш номер телефона, чтобы войти или зарегистрироваться. Для проверки мы отправим на него СМС с кодом подтверждения");
        StartPageObject.writePhone(PhoneNumber);
        StartPageObject.sendPhone();

        // Ввод смс-кода

        StartPageObject.smsElementTitle("Введите код");
//        StartPageObject.smsElementMessage("В течение пары минут на номер\n+7 (957) 500-06-99 придет СМС с кодом подтверждения");
        StartPageObject.writeSMS(SMSCode);

        // Главный экран

        StartPageObject.mainElementTitle("Главная");

        driver.runAppInBackground(5);

        StartPageObject.mainElementTitle("Главная");
    }
}