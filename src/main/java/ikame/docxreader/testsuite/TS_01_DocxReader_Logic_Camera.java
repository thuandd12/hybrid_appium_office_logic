package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_01_DocxReader_Logic_Camera extends commonBase {

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
	public void TC_001_Logic_Camera_CreateNew() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();
		click(PageUI_DocxReader.BUTTON_ALLOW);
		click(PageUI_DocxReader.BUTTON_SWITCH_OFF);

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click btn Home verify back về màn hình Create New");
		click(PageUI_DocxReader.BUTTON_HOME);
		getElement(PageUI_DocxReader.ICON_CREATE);
		
	}
	@Test
	public void TC_002_Logic_Camera_Tool() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Home verify back về màn hình Tool");
		click(PageUI_DocxReader.BUTTON_HOME);
		getElement(PageUI_DocxReader.TAB_SCAN_FILE);
		
	}
	@Test
	public void TC_003_Logic_Camera_Multiple() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Multiple");
		click(PageUI_DocxReader_Scanner.BTN_MULTIPLE);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN),"2");
		click(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.BTN_CONFIRM));
		
	}
	@Test
	public void TC_004_Logic_Camera_Multiple_Next() {
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
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN),"2");
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		
	}
	@Test
	public void TC_005_Logic_Camera_Single() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Single");
		click(PageUI_DocxReader_Scanner.BTN_SINGLE);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		getElement(PageUI_DocxReader_Scanner.BTN_DONE);
		verifyContains("1",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_006_Logic_Camera_Flash() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click btn Flash");
		pause(3000);
		captureScreen(driver, "AnhIconFlashOff");
		click(PageUI_DocxReader_Scanner.ICON_FLASH);
		pause(3000);
		captureScreen(driver, "AnhIconFlashOnCheDo1");
		getElementPresent(PageUI_DocxReader_Scanner.ICON_FLASH);
		click(PageUI_DocxReader_Scanner.ICON_FLASH);
		pause(3000);
		captureScreen(driver, "AnhIconFlashOnCheDo2");
		getElementPresent(PageUI_DocxReader_Scanner.ICON_FLASH);
	}
	@Test
	public void TC_007_Logic_Camera_Grid_Mode() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Grid mode");
		pause(3000);
		captureScreen(driver, "AnhIconGridModeOff");
		click(PageUI_DocxReader_Scanner.BTN_GRID_MODE);
		pause(3000);
		captureScreen(driver, "AnhIconGridModeOn");
		getElement(PageUI_DocxReader_Scanner.BTN_GRID_MODE);
	}
	@Test
	public void TC_008_Logic_Camera_Gallery() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		getElementPresent(PageUI_DocxReader_Scanner.TITLE_GALLERY);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_IMAGES);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CONFIRM);
	}
	@Test
	public void TC_009_Logic_Camera_Take_Photo() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Take Photo");
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN),"2");
		
	}

	private Management_Account managementAccount;

}
