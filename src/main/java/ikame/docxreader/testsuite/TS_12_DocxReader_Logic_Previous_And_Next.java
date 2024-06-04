package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_12_DocxReader_Logic_Previous_And_Next extends commonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("WorkOffice.apk", "5t4haexcqwlzypd6", "Android", "13.0", "com.happydev.wordoffice",
				"com.happydev.wordoffice.business.splash.SplashActivity", "windows", "8201");
		managementAccount = new Management_Account(driver);
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}

	@Test
	public void TC_001_Logic_2Anh() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click btn Multiple");
		click(PageUI_DocxReader_Scanner.BTN_MULTIPLE);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		verifyCompare("true", getAttribute(PageUI_DocxReader_Scanner.BTN_IV_RIGHT, "enabled"));
		verifyCompare("false", getAttribute(PageUI_DocxReader_Scanner.BUTTON_IV_LEFT, "enabled"));
		verifyCompare("1/2", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		click(PageUI_DocxReader_Scanner.BTN_IV_RIGHT);
		pause(3000);
		verifyCompare("2/2", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "2AnhPreviousEnableNextDisable");
		click(PageUI_DocxReader_Scanner.BUTTON_IV_LEFT);
		pause(3000);
		verifyCompare("1/2", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "2AnhPreviousDisableNextEnable");
	}
	@Test
	public void TC_002_Logic_3Anh() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click btn Multiple");
		click(PageUI_DocxReader_Scanner.BTN_MULTIPLE);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(1000);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(1000);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(1000);
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		verifyCompare("true", getAttribute(PageUI_DocxReader_Scanner.BTN_IV_RIGHT, "enabled"));
		verifyCompare("false", getAttribute(PageUI_DocxReader_Scanner.BUTTON_IV_LEFT, "enabled"));
		verifyCompare("1/3", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		click(PageUI_DocxReader_Scanner.BTN_IV_RIGHT);
		pause(1000);
		verifyCompare("2/3", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "3AnhPreviousEnableNextEnable");
		click(PageUI_DocxReader_Scanner.BTN_IV_RIGHT);
		pause(1000);
		verifyCompare("3/3", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "3AnhPreviousEnableNextDisble");
		click(PageUI_DocxReader_Scanner.BUTTON_IV_LEFT);
		pause(1000);
		verifyCompare("2/3", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "3Anh_PreviousEnableNextEnable");
		click(PageUI_DocxReader_Scanner.BUTTON_IV_LEFT);
		pause(1000);
		verifyCompare("1/3", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		captureScreen(driver, "3Anh_PreviousDisbleNextEnable");
	}

	private Management_Account managementAccount;

}
