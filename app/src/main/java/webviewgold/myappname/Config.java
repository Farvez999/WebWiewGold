package webviewgold.myappname;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Config {

    // 4. Enjoy your app! :)
    static boolean darkStatusBarText = false;
    /**
     * Main Configuration Of Your WebViewGold App
     */
    // Domain host and subdomain without any https:// or http:// prefixes (e.g., "www.example.org")
    public static final String HOST = "www.app.senangoda.com";
//    public static final String HOST = "www.app.senangoda.com";

    // Your URL including https:// or http:// prefix and including www. or any required subdomain (e.g., "https://www.example.org")
//    public static String HOME_URL = "https://app.senangoda.com/";
    public static String HOME_URL = "https://fdcnews24.com/";

    // Set to "false" to disable the progress spinner/loading spinner
    public static final boolean ACTIVATE_PROGRESS_BAR = true;

    // Set the phone orientation to either "portrait", "landscape", or "auto"
    public static final String PHONE_ORIENTATION = "portrait";

    // Set the tablet orientation to either "portrait", "landscape", or "auto"
    public static final String TABLET_ORIENTATION = "portrait";

    // Set a customized UserAgent for WebView URL requests (or leave it empty to use the default Android UserAgent)
    public static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 7.0; Moto G (4) Build/NPJ25.93-14; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/56.0.2924.87 Mobile Safari/537.36";

    // Set to "true" if you want to extend URL request by the system language like ?webview_language=LANGUAGE CODE (e.g., ?webview_language=EN for English users)
    public static final boolean APPEND_LANG_CODE = false;

    // Set to "true" if you want to use the "local-html" folder fallback if the user is offline
    public static final boolean FALLBACK_USE_LOCAL_HTML_FOLDER_IF_OFFLINE = false;

    // Set to (0) to open external links in-app by default; (1) to ALWAYS open in a new tab (an additional in-app browser); (2) to ALWAYS open in another browser
    public static final int EXTERNAL_URL_HANDLING_OPTIONS = 0;

    // Set to "true" to open links with attributes (_blank, _self) in new a tab by default; Set to "false" to open them in-app
    // NOTE: is overridden by EXTERNAL_URL_HANDLING_OPTIONS (options 1 or 2) if it is also an external link
    public static final boolean OPEN_SPECIAL_URLS_IN_NEW_TAB = true;

    // Set to "true" to clear the WebView cache on each app startup and do not use cached versions of your web app/website
    public static final boolean CLEAR_CACHE_ON_STARTUP = false;

    //Set to "true" to use local "assets/index.html" file instead of URL
    public static final boolean USE_LOCAL_HTML_FOLDER = false;

    //Set to "true" to enable deep linking for App Links & Push (take a look at the documentation for further information)
    public static final boolean IS_DEEP_LINKING_ENABLED = true;

    //Set to "true" to open the notification deep linking URLs in the system browser instead of your app
    public static final boolean OPEN_NOTIFICATION_URLS_IN_SYSTEM_BROWSER = false;

    // Set to "true" to activate the splash screen
    public static final boolean SPLASH_SCREEN_ACTIVATED = true;

    //Set the splash screen timeout time in milliseconds (the loading sign screen will show after this time duration if the home URL still has some loading to do)
    public static final int SPLASH_TIMEOUT = 5000;

    //Set to "true" to show the splash screen until the home URL has finished loading (overrides SPLASH_TIMEOUT)
    public static final boolean REMAIN_SPLASH_OPTION = false;

    //Set the splash screen image size with respect to device smallest width/height; range in percentage [0-100]; Caution: value  = 0 will hide the image completely
    public static final double SCALE_SPLASH_IMAGE = 25;

    //Set to "true" for black status bar text; Set to "false" for white status bar text; Use 'colorPrimaryDark' in style.xml to choose the status bar background color
    static boolean blackStatusBarText = false;

    //Set to "true" to prevent the device from going into sleep while the app is active
    public static final boolean PREVENT_SLEEP = false;

    //Set to "true" to enable navigation by swiping left or right to move back or forward a page
    public static final boolean ENABLE_SWIPE_NAVIGATE = false;

    //Set to "true" to enable swiping down to refresh the page
    public static final boolean ENABLE__PULL_REFRESH = true;

    //Set to "true" to close the app by pressing the hardware back button (instead of going back to the last page)
    public static final boolean EXIT_APP_BY_BACK_BUTTON_ALWAYS = false;
    //Set to "true" to close the app by pressing the hardware back button if the user is on the home page (which does not allow going to a prior page)
    public static final boolean EXIT_APP_BY_BACK_BUTTON_HOMEPAGE = true;

    /**
     * Dialog Options
     */
    public static boolean SHOW_FIRSTRUN_DIALOG = true; //Set to false to disable the First Run Dialog
    public static boolean SHOW_FACEBOOK_DIALOG = false; //Set to false to disable the Follow On Facebook Dialog
    public static boolean SHOW_RATE_DIALOG = true; //Set to false to disable the Rate This App Dialog

    // Set the minimum number of days to be passed after the application is installed before the "Rate this app" dialog is displayed
    public static final int RATE_DAYS_UNTIL_PROMPT = 3;
    // Set the minimum number of application launches before the "Rate this app" dialog will be displayed
    public static final int RATE_LAUNCHES_UNTIL_PROMPT = 3;

    // Set the minimum number of days to be passed after the application is installed before the "Follow on Facebook" dialog is displayed
    public static final int FACEBOOK_DAYS_UNTIL_PROMPT = 2;
    // Set the minimum number of application launches before the "Rate this app" dialog will be displayed
    public static final int FACEBOOK_LAUNCHES_UNTIL_PROMPT = 4;
    // Set the URL of your Facebook page
    public static final String FACEBOOK_URL = "https://www.facebook.com/";

    // Set to "false" to prevent the "Download images" pop-up box from appearing when long-pressing on an image
    public static final boolean ALLOW_IMAGE_DOWNLOAD = true;


    /**
     * OneSignal Push Notification Options
     */
    //Set to "true" to activate OneSignal Push (set OneSignal ID below)
    public static final boolean PUSH_ENABLED = false;

    public static final String ONESIGNAL_APP_ID = "c3a19420-948a-4956-8424-9c59a75dcb5d"; //please also change in build.gradle

    //Set to "true" if you want to extend URL request by ?onesignal_push_id=XYZ (set the OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_ENHANCE_WEBVIEW_URL = false;

    //Set to "true" if WebView should be reloaded when the app gets a UserID from OneSignal (set the OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_RELOAD_ON_USERID = false;

    /**
     * Firebase Push Notification Options
     */
    //Set to "true" to activate Firebase Push (download the google-services.json file and replace the existing one via Mac Finder/Windows Explorer)
    public static final boolean FIREBASE_PUSH_ENABLED = false;

    public static final String firebasechanneltopic = "NONE"; //Topic name of Firebase channel

    //Set to "true" if you want to extend URL request by ?firebase_push_id=XYZ (set the OneSignal IDs in the build.gradle file)
    public static final boolean FIREBASE_PUSH_ENHANCE_WEBVIEW_URL = false;



    /**
     * Ad Options
     */
    //Set to "true" if you want to display AdMob banner ads (set the AdMob IDs in the strings.xml file)
    public static final boolean SHOW_BANNER_AD = false;

    //Set to "true" if you want to display AdMob fullscreen interstitial ads after X website clicks (set the AdMob IDs in the strings.xml file)
    public static final boolean SHOW_FULL_SCREEN_AD = false;

    //X website clicks for AdMob interstitial ads (set the AdMob IDs in the strings.xml file)
    public static final int SHOW_AD_AFTER_X = 5;

    //Allow normal URL clicks to increment SHOW_AD_AFTER_X
    public static final boolean INCREMENT_WITH_REDIRECTS = true;

    //Set to "true" to use Facebook ads instead of AdMob ads (set the Ad IDs in the strings.xml file)
    public static boolean USE_FACEBOOK_ADS = false;

    //Add the file formats that should trigger the file downloader functionality
    public static List<String> downloadableExtension =
            Collections.unmodifiableList(
                    Arrays.asList(".epub", ".pdf", ".pptx", ".docx", ".doc", ".xlsx", ".mp3", ".mp4", ".wav") //Add them here!
            );

    /**
     * Social Media Login Helper Tool
     *
     * Note: To be used if the login link fails to open in-app / doesn't work and other methods like
     *  EXTERNAL_URL_HANDLING_OPTIONS, OPEN_SPECIAL_URLS_IN_NEW_TAB and the custom USER_AGENT
     *  do not help.
     */

    //Define the URL prefixes that load during Google login for your website; acts as a trigger for the helper
    public static String[] GOOGLE_LOGIN_HELPER_TRIGGERS = {}; //Example: {"https://accounts.google.com/", "https://accounts.google.com/o/oauth2/"}

    //Define the URL prefixes that load during Facebook login for your website; acts as a trigger for the helper
    public static String[] FACEBOOK_LOGIN_HELPER_TRIGGERS = {}; //Example: {"https://m.facebook.com", "https://www.facebook.com"}

    //Define the URL for logout to clear login cookies (optional)
    public static String HOME_URL_LOGOUT = "https://www.example.com/logout";

    /**
     * Manual Cookie Sync Tool
     *
     * Note: To be used if you require cookies to be synced UNDER every 30 seconds
     */

    //Set to "true" to enable the Manual Cookie Sync tool
    public static final boolean MANUAL_COOKIE_SYNC = false;

    // Define how often the cookies should sync with the app in milliseconds (ms)
    public static final int COOKIE_SYNC_TIME = 5000;

    // Define the URL prefixes you want to use the Manual Cookie Sync tool on
    // Note: If MANUAL_COOKIE_SYNC_TRIGGERS is empty, it will automatically check every page
    public static String[] MANUAL_COOKIE_SYNC_TRIGGERS = {}; //Example: {"https://example.com/login", "https://example.com/data"}

    /**
     * Android Permission Options
     */
    static boolean requireLocation = true; //Set to "false" if you do NOT require location services/GPS coordinates
    static boolean requireStorage = true; //Set to "false" if you do NOT require APIs related to downloads or uploads
    static boolean requireCamera = true; //Set to "false" if you do NOT require APIs related to camera images / camera videos
    static boolean requireRecordAudio = true; //Set to "false" if you do NOT require APIs related to recording audio

}
