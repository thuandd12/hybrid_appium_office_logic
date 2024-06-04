package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;
import ikame.docxreader.ui.PageUI_DocxReader_Scanner;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_03_DocxReader_Logic_Gallery extends commonBase {

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
	public void TC_001_Logic_Gallery_Select_Folder() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_CAMERA);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_IMAGES);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_CAMERA), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
	}
	@Test
	public void TC_002_Logic_Gallery_Import_1Anh_1ThuMuc() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_CAMERA);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_CAMERA), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		getElement(PageUI_DocxReader_Scanner.BTN_DONE);
		verifyContains("1",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_003_Logic_Gallery_Import_2Anh_2ThuMuc() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_CAMERA);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_CAMERA), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_SCREENSHOTS);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_SCREENSHOTS), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		getElement(PageUI_DocxReader_Scanner.BTN_DONE);
		verifyContains("2",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_004_Logic_Gallery_Import_1Anh_1ThuMuc_1Anh_AllImage() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click icon Gallery");
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_CAMERA);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_CAMERA), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		clickListElement(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES, 1);
		
		click(PageUI_DocxReader_Scanner.BTN_CONFIRM);
		getElement(PageUI_DocxReader_Scanner.BTN_DONE);
		verifyContains("1",getText(PageUI_DocxReader_Scanner.BTN_TOTAL_OF_PHOTO_TAKEN));
	}
	@Test
	public void TC_005_Logic_Gallery_DropdownList_AllImage_NgoaiVung() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.TEXT_ALL_IMAGE);
		singleTab(504, 1200);
		verifyCompare("All Image", getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_IMAGES);
	}
	@Test
	public void TC_006_Logic_Gallery_DropdownList_ThuMucKhac_NgoaiVung() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click tab Tool");
		click(PageUI_DocxReader.TEXT_TOOL);

		info("Click tab Scan File");
		click(PageUI_DocxReader.TAB_SCAN_FILE);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.DROPDOWN_LIST_IMAGE);
		click(PageUI_DocxReader_Scanner.TEXT_CAMERA);
		singleTab(504, 1200);
		verifyCompare(getText(PageUI_DocxReader_Scanner.TEXT_CAMERA), getText(PageUI_DocxReader_Scanner.TITLE_GALLERY));
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_CHECKBOX_IMAGES);
		getElementPresent(PageUI_DocxReader_Scanner.LIST_OF_IMAGES);
	}
	@Test
	public void TC_007_Logic_Gallery_Back_Key() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Click button Create New");
		click(PageUI_DocxReader.ICON_CREATE);

		info("Click button Scanner");
		click(PageUI_DocxReader.TAB_SCANNER);
		
		info("Click icon Gallery");
		click(PageUI_DocxReader_Scanner.BTN_GALLERY);
		click(PageUI_DocxReader_Scanner.BTN_IV_BACK);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_MULTIPLE);
		getElementPresent(PageUI_DocxReader_Scanner.BTN_SINGLE);
	}

	private Management_Account managementAccount;

}
