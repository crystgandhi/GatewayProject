package GatwayUtilityFiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		pro = new Properties();
		File src = new File("./Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}
	public String getChromepath(){
		String chromepath=pro.getProperty("chromedriverpath");
		return chromepath;
		}
	public String getedgepath(){
		String edgepath=pro.getProperty("edgedriverpath");
		return edgepath;
		}
	public String getApplicationUrl() {
		String baseurl = pro.getProperty("Baseurl");
		return baseurl;
	   }
}
