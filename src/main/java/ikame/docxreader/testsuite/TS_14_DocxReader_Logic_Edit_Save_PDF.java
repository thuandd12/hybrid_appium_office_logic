package ikame.docxreader.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_14_DocxReader_Logic_Edit_Save_PDF extends commonBase {

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
	private String fileName ="ikame";

	@Test
	public void TC_001_Logic_Edit_Save_PDF_Quality_Khac_Max() {
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
		String value = managementAccount.getFileName(fileName);
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, value);
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		verifyContains(fileName, getText(PageUI_DocxReader_Scanner.TEXTBOX_RENAME));
		click(PageUI_DocxReader_Scanner.BTN_SAVE_TO_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_HOME);
		String value2 = parseStringToObject(PageUI_DocxReader_Scanner.TEXT_FILE_NAME, fileName);
		getElementPresent(By.xpath(value2));
	}

	@Test
	public void TC_002_Logic_Edit_Save_PDF_Quality_Max() {
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
		String value = managementAccount.getFileName(fileName);
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, value);
		singleTab(999, 2331);
		pause(3000);
		singleTab(386, 2030);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		verifyContains(fileName, getText(PageUI_DocxReader_Scanner.TEXTBOX_RENAME));
		click(PageUI_DocxReader_Scanner.BTN_SAVE_TO_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_HOME);
		String value2 = parseStringToObject(PageUI_DocxReader_Scanner.TEXT_FILE_NAME, fileName);
		getElementPresent(By.xpath(value2));
	}

	@Test
	public void TC_003_Logic_Edit_Save_PDF_De_Trong_Textbox_Rename() {
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
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, "");
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		captureScreen(driver, "DeTrongTXBRename");
		getElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME);
		getElement(PageUI_DocxReader_Scanner.TEXT_IMAGE_QUALITY);
	}

	@Test
	public void TC_004_Logic_Edit_Save_PDF_Nhap_Khoang_Trang_Textbox_Rename() {
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
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, "               ");
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		captureScreen(driver, "NhapKhoangTrangTXBRename");
		getElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME);
		getElement(PageUI_DocxReader_Scanner.TEXT_IMAGE_QUALITY);
	}

	@Test
	public void TC_005_Logic_Edit_Save_PDF_Nhap_1000_Ky_Tu_Textbox_Rename() {
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
		String value = managementAccount.generateRandomString(1000);
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, value);
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		captureScreen(driver, "Nhap1000KyTuTXBRename");
		getElement(PageUI_DocxReader_Scanner.BTN_ADD);
		getElement(PageUI_DocxReader_Scanner.BTN_SAVE);
	}

	@Test
	public void TC_006_Logic_Edit_Save_PDF_Nhap_Khoang_Trang_Dau_Va_Cuoi_Textbox_Rename() {
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
		String value = managementAccount.getFileName(fileName);
		String valueInput = " " + value + " ";
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, valueInput);
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		verifyContains(fileName, getText(PageUI_DocxReader_Scanner.TEXTBOX_RENAME));
		click(PageUI_DocxReader_Scanner.BTN_SAVE_TO_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_HOME);
		String value2 = parseStringToObject(PageUI_DocxReader_Scanner.TEXT_FILE_NAME, fileName);
		getElementPresent(By.xpath(value2));
	}
	@Test
	public void TC_007_Logic_Edit_Save_PDF_Back() {
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
		pause(3000);
		singleTab(465, 357);
		getElement(PageUI_DocxReader_Scanner.BTN_ADD);
		getElement(PageUI_DocxReader_Scanner.BTN_SAVE);
	}
	@Test
	public void TC_008_Logic_Edit_Save_PDF_Nhap_Khoang_Trang_Dau_Va_Cuoi_Textbox_Rename() {
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
		String value = managementAccount.getFileName(fileName);
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, value);
		pause(3000);
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		verifyContains(fileName, getText(PageUI_DocxReader_Scanner.TEXTBOX_RENAME));
		click(PageUI_DocxReader_Scanner.BTN_SAVE_TO_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_HOME);
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
		sendKeyToElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME, value);
		pause(3000);
		singleTab(999, 2331);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		captureScreen(driver, "NhapTrungFileName");
		getElement(PageUI_DocxReader_Scanner.TEXTBOX_RENAME);
		getElement(PageUI_DocxReader_Scanner.TEXT_IMAGE_QUALITY);
		
		
	}
	private Management_Account managementAccount;
}
