package code4life.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BrowserUtils {


    public void  wait(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

public static String getScreenshot  (String name) throws IOException {
        Date date = new Date();
        name =date.toString().replace(":", "_").replace(" ", "_");

        String path = "";
    System.out.println("OS Name " + System.getProperty("os.name"));
    if (System.getProperty("os.name").startsWith("Mac")){
        path = System.getProperty("user.dir")+"/test-output/screenshot/" +name +".png";
    } else {
        path = System.getProperty("user.dir")+"\\test-output\\screenshot\\"+name+".png";
    }

    TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

    File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
    File destination = new File(path);

    FileUtils.copyFile(source, destination);

        return  path;



}

public   static void  waitHour(int second ){
        int total = second*3600;
    System.out.println("total = "+ total);
    try {
        Thread.sleep(9000000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }


}






}
