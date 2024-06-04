package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_13_DocxReader_Logic_Edit_Back extends commonBase {

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
	public void TC_001_Logic_Gallery_Edit_Back() {
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
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 2);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.BTN_CONFIRM));
	}
	@Test
	public void TC_002_Logic_Photo_Edit_Back() {
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
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		click(PageUI_DocxReader_Scanner.BTN_BACK);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN));
		click(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.BTN_CONFIRM));
	}
	@Test
	public void TC_003_Logic_Edit_Gallery_Back_Cancel() {
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
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 2);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_CROP);
		click(PageUI_DocxReader_Scanner.BTN_NO_CROP);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DISCARD);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DISCARD_CONTENT);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_DISCARD);
		click(PageUI_DocxReader_Scanner.BTN_DISCARD_CANCEL);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_004_Logic_Edit_Gallery_Back_Discard() {
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
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 2);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_CROP);
		click(PageUI_DocxReader_Scanner.BTN_NO_CROP);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		click(PageUI_DocxReader_Scanner.BTN_DISCARD);
		getElementPresent(PageUI_DocxReader_Scanner.TITLE_GALLERY);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.BTN_CONFIRM));
	}
	@Test
	public void TC_005_Logic_Edit_Photo_Back_Cancel() {
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
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_CROP);
		click(PageUI_DocxReader_Scanner.BTN_NO_CROP);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DISCARD);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DISCARD_CONTENT);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_DISCARD);
		click(PageUI_DocxReader_Scanner.BTN_DISCARD_CANCEL);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_006_Logic_Edit_Photo_Back_Discard() {
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
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_CROP);
		click(PageUI_DocxReader_Scanner.BTN_NO_CROP);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		click(PageUI_DocxReader_Scanner.BTN_DISCARD);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN));
	}

	private Management_Account managementAccount;

}
