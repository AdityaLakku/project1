package ddd;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zul.theme.Themes;

public class hhhThemeWebAppInit implements WebAppInit {

	private final static String GGG_NAME = "ggg";
	private final static String GGG_DISPLAY = "Ggg";
	private final static int GGG_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		Themes.register(GGG_NAME, GGG_DISPLAY, GGG_PRIORITY);
	}

}
