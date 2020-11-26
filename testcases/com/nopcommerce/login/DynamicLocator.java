package com.nopcommerce.login;

public class DynamicLocator {

	public static void main(String[] args) {
		String DYNAMIC_FOOTER_LINK = "//div[@class='footer']//a[text()='%s']";

		clickToFooterLink(DYNAMIC_FOOTER_LINK, "Search");
		clickToFooterLink(DYNAMIC_FOOTER_LINK, "News");
		clickToFooterLink(DYNAMIC_FOOTER_LINK, "Blog");
		clickToFooterLink(DYNAMIC_FOOTER_LINK, "Sitemap");
		clickToFooterLink(DYNAMIC_FOOTER_LINK, "Orders");

	}

	public static void clickToFooterLink(String locator, String pageName) {

		locator = String.format(locator, pageName);
		System.out.println("Locator: " + locator);
	}

}
