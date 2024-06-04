package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_10_DocxReader_Logic_Edit_Signature extends commonBase {

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
	public void TC_001_Logic_Button_Signature() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		getElement(PageUI_DocxReader_Scanner.SUB_TITLE_SIGNATURE);
		getElement(PageUI_DocxReader_Scanner.TEXT_SIGN_HERE);
		getElement(PageUI_DocxReader_Scanner.ICON_COLOR);
		getElement(PageUI_DocxReader_Scanner.ICON_ERASE);
		getElement(PageUI_DocxReader_Scanner.ICON_HISTORY);
		getElement(PageUI_DocxReader_Scanner.BTN_CANCEL_SIGNATURE);
		getElement(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		
	}
	@Test
	public void TC_002_Logic_Button_Signature_Color() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		captureScreen(driver, "MauChuKyMacDinhDen");
	}
	@Test
	public void TC_003_Logic_Button_Signature_Any_Color() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_COLOR);
		click(PageUI_DocxReader_Scanner.ICON_COLOR_BLUE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		checkElementNotPresent(PageUI_DocxReader_Scanner.TEXT_SIGN_HERE, 5000);
		captureScreen(driver, "MauChuKyMauXanhDaTroi");
	}
	@Test
	public void TC_004_Logic_Button_Signature_Erase() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		checkElementNotPresent(PageUI_DocxReader_Scanner.TEXT_SIGN_HERE, 5000);
		click(PageUI_DocxReader_Scanner.ICON_ERASE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_SIGN_HERE);
		
		
	}
	@Test
	public void TC_005_Logic_Button_Signature_History_Ko_Ton_Tai_Chu_Ky() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_NO_FILE_FOUND);
		
	}
	@Test
	public void TC_006_Logic_Button_Signature_History_Xoa_Chu_Ky_Da_Luu() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		getElement(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_DELETE_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE_CONTENT);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_CANCEL_DELETE);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_NO_FILE_FOUND);
	}
	@Test
	public void TC_007_Logic_Button_Signature_History_Huy_Xoa_Chu_Ky_Da_Luu() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		getElement(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_DELETE_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.TEXT_DELETE_CONTENT);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CONFIRM_DELETE);
		click(PageUI_DocxReader_Scanner.TEXT_CANCEL_DELETE);
		getElementPresent(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_DELETE_SIGNATURE);
	}
	
	
	@Test
	public void TC_008_Logic_Button_Signature_History_Edit_Signature() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		click(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		getElementPresent(PageUI_DocxReader_Scanner.ICON_DONE_EDIT_SIGNATURE);
		captureScreen(driver, "EditSignature");
		
	}
	@Test
	public void TC_009_Logic_Button_Signature_History_Edit_Signature_Delete() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		click(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		getElementPresent(PageUI_DocxReader_Scanner.ICON_DONE_EDIT_SIGNATURE);
		captureScreen(driver, "TruocKhiClickDeleteEditSignature");
		singleTab(282, 517);
		pause(5000);
		captureScreen(driver, "SauKhiClickDeleteEditSignature");
	}
	@Test
	public void TC_010_Logic_Button_Signature_History_Edit_Signature_Reflect() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		click(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		getElementPresent(PageUI_DocxReader_Scanner.ICON_DONE_EDIT_SIGNATURE);
		captureScreen(driver, "TruocKhiClickReflectEditSignature");
		singleTab(881, 517);
		pause(5000);
		captureScreen(driver, "SauKhiClickReflectEditSignature");
	}
	@Test
	public void TC_011_Logic_Button_Signature_History_Edit_Signature_Resize() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_HISTORY);
		click(PageUI_DocxReader_Scanner.IMG_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		getElementPresent(PageUI_DocxReader_Scanner.ICON_DONE_EDIT_SIGNATURE);
		captureScreen(driver, "TruocKhiClickResizeEditSignature");
		singleTab(871, 1130);
		pause(5000);
		captureScreen(driver, "SauKhiClickResizeEditSignature");
	}
	@Test
	public void TC_012_Logic_Button_Signature_History_Edit_Signature_Cancel() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.BTN_CANCEL_FILTER);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_ADD);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		
	}
	@Test
	public void TC_013_Logic_Button_Signature_History_Edit_Signature_Done() {
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
		scrollToElementWithTouchAction(PageUI_DocxReader_Scanner.BTN_SIGNATURE,"E", 0.5, 0.2,5,2400,2350);
		click(PageUI_DocxReader_Scanner.BTN_SIGNATURE);
		singleTab(458, 1054);
		pause(3000);
		singleTab(565, 1168);
		click(PageUI_DocxReader_Scanner.BTN_DONE_SIGNATURE);
		click(PageUI_DocxReader_Scanner.ICON_DONE_EDIT_SIGNATURE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_ADD);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SAVE);
		
	}

	private Management_Account managementAccount;

}
