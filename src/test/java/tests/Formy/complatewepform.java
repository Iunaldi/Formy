package tests.Formy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import static utils.ReusableMethods.clickOnTheDesiredLink1;

public class complatewepform {

    @Test
    public void verifyDropdown1() throws Exception {

        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        //comment
        clickOnTheDesiredLink1("Complete Web Form");
        Assert.assertEquals(Driver.get().getCurrentUrl().contains("form"),true);
        Driver.get().close();
    }

}
