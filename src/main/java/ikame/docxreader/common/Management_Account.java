package ikame.docxreader.common;

import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

import ikame.docxreader.common.constant.CT_Account;
import ikame.docxreader.ui.PageUI_DocxReader;
import io.appium.java_client.AppiumDriver;

public class Management_Account extends commonBase {
	public Management_Account(AppiumDriver dr) {
		driver = dr;
	}

	public void optionLanguage(String value) {
		String TEXT_LANGUAGE = parseStringToObject(PageUI_DocxReader.OPTION_LANGUAGE, value);
		scrollDown(2);
		click(TEXT_LANGUAGE);
	}

	public void openHomePage() {
		pause(8000);
		clickElementIfDisplay(CT_Account.BUTTON_CONTINUE);
		clickElementIfDisplay(CT_Account.BUTTON_SELECT);
		clickElementIfDisplay(CT_Account.BUTTON_SKIP);
		// clickElementIfDisplay(CT_Account.BUTTON_CLOSE_PREMIUM);
	}

	public void openHomePageWithSelectLanguage(String value) {
		pause(8000);
		clickElementIfDisplay(CT_Account.BUTTON_CONTINUE);
		optionLanguage(value);
		clickElementIfDisplay(CT_Account.BUTTON_SELECT);
		clickElementIfDisplay(CT_Account.BUTTON_SKIP);
	}

	private Locale locale = new Locale("en");
	private Faker faker = new Faker(locale);

	public String generateRandomString(int length) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public String getFirstName() {
		return faker.address().firstName();
	}

	public String getLastName() {
		return faker.address().lastName();
	}

	public String getCompanyName() {
		return faker.company().name();
	}

	public String getFullName() {
		return faker.name().fullName();
	}

	public String getFileName(String nameFile) {
		return nameFile + generateFakeNumber();
	}

	public String getAddress() {
		return faker.address().streetAddress();
	}

	public String getEmail() {
		return faker.internet().emailAddress();
	}

	public String getNumberPhone() {
		return faker.phoneNumber().phoneNumber();
	}

	public String getCityName() {
		return faker.address().cityName();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

}
