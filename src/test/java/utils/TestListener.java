package utils;

import java.io.File;
import java.util.UUID;

public class TestListener implements ITestListener {

    private void takeScreenshot (){
        try {
            TakesScreenshot takesScreenshot = ((TakesScreenshot) Driver.getDriver());
            File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);

            // ./screenshots/screenshot-fkjdkfd-fdfdfd-fdfdfd-fdfd.png
            String directory = "./screenshots";
            File screenshotFile = new File(directory + "/screenshot-" + UUID.randomUUID() + ".png");
            FileUtils.copyFile(screenshotRaw, screenshotFile);

        } catch (Exception ex){
            System.out.println("Exception wile taking a screenshot: " + ex);
        }
    }
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();

    }

}