package utils;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TypeUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(TypeUtils.class);

    public static void sendKeys(WebElement element, String text){
        LOGGER.debug("sending keys = {} to element = {}", text, element);
        try{
            element.sendKeys(text);
        }
        catch (Exception e){
            LOGGER.debug("general error occured on sendKeys! will retry! error - ", e);
            threadSleep(500);
            element.sendKeys(text);
        }
    }

    public static void threadSleep(long millis){
        LOGGER.debug("sleeping thread in = {} milliseconds", millis);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
