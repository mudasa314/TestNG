package Gun07;

import Utills.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends GenelWebDriver {
    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
    @Test
    void ipod()
    {
        WebElement ipod= driver.findElement(By.xpath("//*[@name='search']"));
        ipod.sendKeys("ipod");

        WebElement search=driver.findElement(By.xpath("//*[@class='btn btn-default btn-lg']"));
        search.click();

        WebElement ipodeClasic=driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
        ipodeClasic.click();

        WebElement shoppingCart=driver.findElement(By.xpath("//*[text()='shopping cart']"));
        shoppingCart.click();

        WebElement Checkout=driver.findElement(By.xpath("(//*[text()='Checkout'])[1]"));
        Checkout.click();

        WebElement countinue=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        countinue.click();

        WebElement countinue2=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        countinue2.click();

        WebElement countinue3=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        countinue3.click();

       WebElement countinue5=driver.findElement(By.xpath("//*[@id='button-shipping-method']"));
        countinue5.click();

        WebElement checkbox=driver.findElement(By.xpath("//*[@name='agree']"));
        checkbox.click();

        WebElement countinue4=driver.findElement(By.xpath("(//*[@value='Continue'])[4]"));
        countinue4.click();

        WebElement confirm=driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[5]"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("succes"));
        WebElement h1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='content']>h1")));
        Assert.assertEquals(h1.getText(),"Your order has been placed!");

    }
}
