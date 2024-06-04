package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_16_DocxReader_Logic_Edit extends commonBase {

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
	public void TC_001_Logic_AddButton_DieuHuong() {
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
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		getElement(PageUI_DocxReader_Scanner.TEXT_FEATURE);
		getElement(PageUI_DocxReader_Scanner.TAB_FROM_CAMERA);
		getElement(PageUI_DocxReader_Scanner.TAB_FROM_GALLERY);
	}
	@Test
	public void TC_002_Logic_AddButton_From_Camera() {
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
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		click(PageUI_DocxReader_Scanner.TAB_FROM_CAMERA);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PICTURE);
		getElement(PageUI_DocxReader_Scanner.ICON_CANCEL);
		getElement(PageUI_DocxReader_Scanner.ICON_DONE);
		
	}
	@Test
	public void TC_003_Logic_AddButton_From_Camera_BtnCancel() {
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
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		click(PageUI_DocxReader_Scanner.TAB_FROM_CAMERA);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PICTURE);
		click(PageUI_DocxReader_Scanner.ICON_CANCEL);
		getElement(PageUI_DocxReader_Scanner.BTN_TAKE_PICTURE);
		
	}
	@Test
	public void TC_004_Logic_AddButton_From_Camera_BtnDone() {
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
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN),"1");
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		click(PageUI_DocxReader_Scanner.TAB_FROM_CAMERA);
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PICTURE);
		click(PageUI_DocxReader_Scanner.ICON_DONE);
		verifyNotContains("2",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_005_Logic_AddButton_From_Gallery() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		verifyContains("1", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		click(PageUI_DocxReader_Scanner.TAB_FROM_GALLERY);
		getElement(PageUI_DocxReader_Scanner.TEXT_SELECT_IMAGES);
		getListElement(PageUI_DocxReader_Scanner.LIST_IMG);
		clickListElement(PageUI_DocxReader_Scanner.LIST_IMG,1);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		getElement(PageUI_DocxReader_Scanner.BTN_SAVE);
		verifyContains("2", getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
		
	}
	@Test
	public void TC_006_Logic_AddButton_From_Gallery_Button_Back() {
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
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_NUMBER_OF_PHOTO_TAKEN),"1");
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.BTN_ADD);
		click(PageUI_DocxReader_Scanner.TAB_FROM_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_NAVIGATE_UP);
		getElement(PageUI_DocxReader_Scanner.TEXT_FEATURE);
		getElement(PageUI_DocxReader_Scanner.TAB_FROM_CAMERA);
		getElement(PageUI_DocxReader_Scanner.TAB_FROM_GALLERY);
	}

	private Management_Account managementAccount;

}
