package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_15_DocxReader_Logic_Edit_Save_Document extends commonBase {

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
	public void TC_001_Edit_Save_Document_View_File() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.IMG_FILE);
		getElement(PageUI_DocxReader_Scanner.TITLE_FILE_NAME);
		getElement(PageUI_DocxReader_Scanner.ICON_FULL_SCREEN);
	}
	@Test
	public void TC_002_Edit_Save_Document_View_File_Full_Screen() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.IMG_FILE);
		click(PageUI_DocxReader_Scanner.ICON_FULL_SCREEN);
		getElement(PageUI_DocxReader_Scanner.TEXT_PAGE_DISPLAY);
		checkElementNotPresent(PageUI_DocxReader_Scanner.ICON_FULL_SCREEN, 5000);
	}
	@Test
	public void TC_003_Edit_Save_Document_View_File_Double_Tab() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.IMG_FILE);
		doubleTab(547, 1133);
		pause(3000);
		getElement(PageUI_DocxReader_Scanner.TEXT_PAGE_DISPLAY);
		//checkElementNotPresent(PageUI_DocxReader_Scanner.ICON_FULL_SCREEN, 5000);
	}
	@Test
	public void TC_004_Edit_Save_Document_View_File_Back() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.IMG_FILE);
		click(PageUI_DocxReader_Scanner.BTN_BACK_VIEW_FILE);
		getElement(PageUI_DocxReader_Scanner.BTN_SHARE);
		getElement(PageUI_DocxReader_Scanner.BTN_HOME);
	}


	@Test
	public void TC_005_Edit_Save_Document_Share() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_SHARE);
		getElement(PageUI_DocxReader_Scanner.TEXT_SHARE_FILE);
		getElement(PageUI_DocxReader_Scanner.TEXT_FILE_NAME_SEVED);
	}
	@Test
	public void TC_006_Edit_Save_Document_Home() {
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
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		click(PageUI_DocxReader_Scanner.BTN_HOME);
		getElement(PageUI_DocxReader.TEXT_DOCX_READER);
		getElement(PageUI_DocxReader.ICON_AVATAR);
		getElement(PageUI_DocxReader.BUTTON_SEARCH);
	}


	private Management_Account managementAccount;
}
