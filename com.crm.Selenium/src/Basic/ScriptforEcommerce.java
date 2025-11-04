package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptforEcommerce {

	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_myh38910b_e&adgrpid=1324913121555467&hvadid=82807336470514&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=157151&hvtargid=kwd-82807957656483:loc-90&hydadcr=5620_2377278&mcid=bf83b4991e2f3eb79d07c8f0ac1b5488");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.meesho.com/");
		driver.get("https://www.myntra.com/");
		driver.get("https://www.ajio.com/?utm_source=icubes&utm_medium=affiliate&utm_campaign=465&utm_term=&clickid=68d7b2fbec50ed00011586e2&pid=12&offer_id=2&attribution_window=1D&return_cancellation_window=45D");
		driver.close();
	}
}
