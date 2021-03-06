package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class Dropdown {

    @Test
    public void verifyDropdown() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        clickOnTheDesiredLink1("Dropdown");

        Driver.get().close();
    }

    @Test
    public void verifyDropdown1() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        //comment
        clickOnTheDesiredLink1("Dropdown");
        Assert.assertEquals(Driver.get().getCurrentUrl().contains("dropdown"),true);
        Driver.get().close();
    }
}
