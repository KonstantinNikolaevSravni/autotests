package tests;

import lib.CoreTestCase;
import lib.ui.MainPageObject;
import org.junit.Test;

public class AndroidNUMfo extends CoreTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    @Test
    public void testMfoFlow (){

    }
}
