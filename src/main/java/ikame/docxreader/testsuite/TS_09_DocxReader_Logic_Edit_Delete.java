package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_09_DocxReader_Logic_Edit_Delete extends commonBase {

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
	public void TC_001_Logic_Button_Delete_1Anh_Cancel() {
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
		pause(3000);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BUTTON_DELETE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE_CONTENT);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CONFIRM_DELETE);
		click(PageUI_DocxReader_Scanner.TEXT_CANCEL_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		getElementPresent(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		
	}

	@Test
	public void TC_002_Logic_Button_Delete_1Anh_XoaAnh() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();
		
		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);

		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		pause(3000);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BUTTON_DELETE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TITLE_GALLERY);
		verifyContains("1", getText(PageUI_DocxReader_Scanner.BTN_CONFIRM));
	}
	@Test
	public void TC_003_Logic_Button_Delete_NhieuAnh_Xoa1Anh() {
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
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		pause(3000);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BUTTON_DELETE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		getElementPresent(PageUI_DocxReader_Scanner.BUTTON_DELETE);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	
	

	private Management_Account managementAccount;

}
