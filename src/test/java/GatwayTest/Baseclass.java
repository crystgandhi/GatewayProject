package GatwayTest;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;

public class Baseclass {
	GatwayUtilityFiles.ReadConfig readconfig = new GatwayUtilityFiles.ReadConfig(); // Object creation for ReadConfig
	
	public static WebDriver ldriver;
	public String BaseUrl = readconfig.getApplicationUrl();
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			ldriver = new ChromeDriver();
		} else if (br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", readconfig.getedgepath());
			ldriver = new EdgeDriver();
		}
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ldriver.get(BaseUrl);
	}
	
	@AfterClass
	public void tearDown() {
		ldriver.close();
	}

	public void CaptureScreenshot(WebDriver driver, String tname) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("img.png"));
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(ldriver);
        ImageIO.write(s.getImage(),"PNG",new File("C:\\projectScreenshots\\OrderScreenshot.png"));
 
	}
	
}
