/*package com.cucumber.grid.extentlisteners;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentManager {
	    
	    public static ExtentReports extent;
	    public static BaseSteps obj_BaseSteps;
	    static Date d= new Date();
	    static String fileName="Extent_"+d.toString().replace(":", "_").replace(" ", "_") + ".html";
	    
	    public synchronized static ExtentReports getReporter() {
	    	if (extent == null){
	    		
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/" +fileName);
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("Automation tester", "Hitesh");
	        extent.setSystemInfo("Organization", "Freelancer");  
	    }
	    	 return extent;
	    }
	    
	    
	    public static String screenshotPath;
		public static String screenshotName;
		static int i=0;
		
	public static void captureScreenshot() {
		i = i + 1;
		File scrFile = ((TakesScreenshot) obj_BaseSteps.getDriver()).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + "_"+ i + ".jpg";
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+ "\\reports\\" + screenshotName));
		} catch (IOException e) {
	}
	}

}
*/