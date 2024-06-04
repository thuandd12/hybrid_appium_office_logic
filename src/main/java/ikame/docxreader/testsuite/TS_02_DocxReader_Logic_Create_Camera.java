package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_02_DocxReader_Logic_Create_Camera extends commonBase {

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
	public void TC_001_Logic_Camera_ID_Cards() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		click(PageUI_DocxReader_Scanner.TAB_ID_CARDS);
		captureScreen(driver, "TabIDCards");
		getElement(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		verifyCompare("false", getAttribute(PageUI_DocxReader_Scanner.TAB_ID_CARDS,"selected"));
	}
	@Test
	public void TC_002_Logic_Camera_Document() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		click(PageUI_DocxReader_Scanner.TAB_DOCUMENT);
		getElement(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		verifyCompare("true", getAttribute(PageUI_DocxReader_Scanner.TAB_DOCUMENT,"selected"));
	}
	@Test
	public void TC_003_Logic_Camera_To_Text() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		click(PageUI_DocxReader_Scanner.TAB_TO_TEXT);
		verifyCompare("true", getAttribute(PageUI_DocxReader_Scanner.TAB_TO_TEXT,"selected"));
		click(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
		pause(3000);
		click(PageUI_DocxReader_Scanner.BTN_NEXT);
		click(PageUI_DocxReader_Scanner.BTN_DONE);
		click(PageUI_DocxReader_Scanner.COMBO_BOX_SELECT_LANGUAGE);
		getListElement(PageUI_DocxReader_Scanner.OPTION_LANGUAGE);
		clickListElement(PageUI_DocxReader_Scanner.OPTION_LANGUAGE, 0);
		click(PageUI_DocxReader_Scanner.BTN_SAVE);
		getElement(PageUI_DocxReader_Scanner.TEXT_RECOGNIZE);
		getElement(PageUI_DocxReader_Scanner.TEXT_FINISH);
		getElement(PageUI_DocxReader_Scanner.TEXT_RESULT);
		getElement(PageUI_DocxReader_Scanner.TEXT_CANNOT_RECOGNIZE);
		getElement(PageUI_DocxReader_Scanner.BTN_COPY);
		getElement(PageUI_DocxReader_Scanner.BTN_EDIT);
		getElement(PageUI_DocxReader_Scanner.TEXT_SHARE);
		click(PageUI_DocxReader_Scanner.TEXT_FINISH);
		getElement(PageUI_DocxReader_Scanner.TEXT_CREATING_PDF);
		getElement(PageUI_DocxReader_Scanner.TEXTBOX_ENTER_FILE_NAME);
		getElement(PageUI_DocxReader_Scanner.BTN_CANCEL);
		getElement(PageUI_DocxReader_Scanner.TAB_CONFIRM);
	}
	@Test
	public void TC_004_Logic_Camera_QR_Code() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		click(PageUI_DocxReader_Scanner.TAB_QR_CODE);
		getElement(PageUI_DocxReader_Scanner.IMG_CAMERA_SCAN_LINE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_QR_CODE);
		getElement(PageUI_DocxReader_Scanner.BTN_TAKE_PHOTO);
	}

	private Management_Account managementAccount;

}
