package tests;

import lib.CoreCreditTestCase;
import lib.ui.CreditPageObject;
import lib.ui.MainPageObject;
import lib.ui.StartPageObject;
import org.junit.Test;
import org.openqa.selenium.By;

public class AndroidNUCreditFilters extends CoreCreditTestCase {

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
        lib.ui.StartPageObject StartPageObject = new StartPageObject(driver);

        StartPageObject.AuthCredit(PhoneNumber, SMSCode);
    }

    @Test
    public void testCreditFilters(){

        lib.ui.CreditPageObject CreditPageObject = new CreditPageObject(driver);

        CreditPageObject.creditOpenExtradition();
        CreditPageObject.creditFilterType();
        CreditPageObject.creditFilterSumm();
        CreditPageObject.creditFilterDate();
        CreditPageObject.swipeElementToLeft(By.id("ru.sravni.android.bankproduct.debug:id/tagBorder"),"");
        CreditPageObject.creditFilterPurpose();

    }

    @Test
    public void testLogOut()
    {
        StartPageObject StartPageObject = new StartPageObject(driver);
        StartPageObject.LogOut();
    }
}
