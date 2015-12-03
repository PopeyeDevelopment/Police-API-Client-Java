package uk.co.pped.policeapi.utilities;

public enum ContactUsageHelper {
	
	ADDRESS("address"),
	BEBO("bebo"),
	BLOG("blog"),
	EMAIL("email"),
	EMESSAGING("e-messaging"),
	FACEBOOK("facebook"),
	FAX("fax"),
	FLICKR("flickr"),
	FORUM("forum"),
	GOOGLEPLUS("google-plus"),
	MOBILE("mobile"),
	MYSPACE("myspace"),
	RSS("rss"),
	TELEPHONE("telephone"),
	TWITTER("twitter"),
	WEB("web"),
	YOUTUBE("youtube");
	
	private final String contactUsage;
	
	ContactUsageHelper(String contactUsage) {
		this.contactUsage = contactUsage;
	}
	
}
