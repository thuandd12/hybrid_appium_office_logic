package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_11_DocxReader_Logic_Edit_Scrollbar extends commonBase {

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
	public void TC_001_Logic_Edit_Scrollbar() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();
		
		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click btn Multiple");
		click(PageUI_DocxReader_Scanner.BTN_MULTIPLE);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		click(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		pause(2000);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BUTTON_DELETE,"E", 0.5, 0.2,5,2400,2350);
		getElementPresent(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		captureScreen(driver, "KeoTuPhaiQuaTraiSAVEKoDoiViTri");
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_ADD,"E", 0.2, 0.5,5,2400,2350);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_ADD);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_RETAKE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		captureScreen(driver, "KeoTuTraiQuaPhaiSAVEKoDoiViTri");
	}
	

	private Management_Account managementAccount;

}
