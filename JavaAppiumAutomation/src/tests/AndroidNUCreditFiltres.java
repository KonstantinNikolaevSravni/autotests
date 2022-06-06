package tests;

import lib.CoreCreditTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;

public class AndroidNUCreditFiltres extends CoreCreditTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    String PhoneNumber = "9575000050";
    String SMSCode = "1234";

    @Test
    public void testAuth()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);

        StartPageObject.writePhone(PhoneNumber);
        StartPageObject.sendPhone();
        StartPageObject.writeSMS(SMSCode);
        StartPageObject.mainElementTitle("Главная");
    }

    @Test
    public void testCreditFilters(){

        lib.ui.CreditPageObject CreditPageObject = new CreditPageObject(driver);
        CreditPageObject.creditRecentAndClick();
        CreditPageObject.creditExtraditionUser();



    }

    @Test
    public void testLogOut()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);
        StartPageObject.LogOut();
    }
}
