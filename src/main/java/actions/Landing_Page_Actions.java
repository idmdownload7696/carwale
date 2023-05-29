package actions;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



import base.CarwaleBaseFile;


public class Landing_Page_Actions extends CarwaleBaseFile{
	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	//JavascriptExecutor jsExecutor;
	Actions action = new Actions(driver);

	public void logo() {
		WebElement logo = driver.findElement(By.xpath("//img[@src='https://imgd.aeplcdn.com/0x0/cw/static/icons/new-header/logo.svg']"));
		//driver.switchTo().alert().dismiss();
		Assert.assertEquals(logo.isDisplayed(), true);
	}
	public void search_bar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchbar.sendKeys(prop.getProperty("car1"));
		Thread.sleep(3000);
		WebElement search_button = driver.findElement(By.xpath("(//*[local-name()='svg' and @class='o-dlrcWp o-eoatGj o-cqgkZn o-euTeMg o-bfWOPh o-bJvRsk o-cpNAVm o-fznJFh o-cpnuEd'])[1]"));
		search_button.click();
		String cartitle = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(cartitle);
		Thread.sleep(3000);
		Assert.assertEquals(cartitle, "Volvo XC90");
		driver.navigate().back();
	}

	public void location() throws InterruptedException {
		Thread.sleep(5000);
		WebElement location = driver.findElement(By.xpath("//div[@title='Location']"));
		location.click();
		Thread.sleep(5000);
		WebElement location_search_box = driver.findElement(By.xpath("//input[@placeholder='Type your Pincode or City']"));
		location_search_box.sendKeys("Hyderabad");
		location_search_box.sendKeys(Keys.ENTER);
		WebElement location_search_close_button = driver.findElement(By.xpath("//div[@class=' o-cpnuEd o-eoatGj o-bfyaNx o-eemiLE o-cXBIhK o-dsALUH    o-bXKmQE o-ezujfR oEBYyU']//span"));
		location_search_close_button.click();
		location.click();
		String cityname = location_search_box.getAttribute("value");
		Thread.sleep(3000);
		Assert.assertEquals(cityname, "Hyderabad");
		location_search_close_button.click();
		driver.navigate().to(prop.getProperty("url"));
	}

	public void language() throws InterruptedException {
		
		WebElement language_icon = driver.findElement(By.xpath("//div[@class='o-cKuOoN B6Jxqq']"));
		action.moveToElement(language_icon).perform();
		language_icon.click();		//action.moveToElement(language).perform();
		Thread.sleep(3000);
		WebElement Hindi = driver.findElement(By.xpath("//input[@value='hi']"));
		Hindi.click();
		Thread.sleep(3000);
		String hindi_url=driver.getCurrentUrl();
		System.out.println(hindi_url);
		Assert.assertEquals(hindi_url, "https://www.carwale.com/hi/");

		WebElement language_hindi_icon = driver.findElement(By.xpath("//*[local-name()='svg' and @class='o-dlrcWp o-eoatGj o-cqgkZn o-euTeMg o-eVIFUq o-cUSgRL o-fzptZU o-fzptOu lang-icon']"));
		language_hindi_icon.click();
		//action.moveToElement(language_hindi_icon).perform();
		Thread.sleep(3000);
		WebElement English = driver.findElement(By.xpath("//input[@value='en']"));
		English.click();

	}


	public void find_right_new_car_search() throws InterruptedException {
		WebElement language = driver.findElement(By.xpath("//div[@class='o-cKuOoN B6Jxqq']"));
		action.moveToElement(language).perform();
		WebElement new_car_search_box = driver.findElement(By.xpath("(//input[contains(@placeholder,'Type to select car name,')])[1]"));
		Thread.sleep(3000);
		new_car_search_box.sendKeys("Land Rover Range Rover Autobiography");
		Thread.sleep(3000);
		new_car_search_box.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		new_car_search_box.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//WebElement new_car_search_button = driver.findElement(By.xpath("//button[text()='Search']"));
		//new_car_search_button.click();
		String cartitle = driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(cartitle, "Land Rover Range Rover Autobiography 3.0 Diesel");
		driver.navigate().back();

	}

	public void find_right_used_car_search() throws InterruptedException {
		Thread.sleep(7000);
		WebElement used_car_drop_down_icon = driver.findElement(By.xpath("//span[@data-unique-key='new']"));	
		String x = used_car_drop_down_icon.getText();
		System.out.println(x);
	
		if(x.equals("New")) {
			used_car_drop_down_icon.click();
		}
		else {
			System.out.println("Used Icon is Already activated");
		}
		//action.moveToElement(used_car_drop_down_icon);
		//used_car_drop_down_icon.click();
//		Thread.sleep(3000);
		WebElement used_car_drop_down = driver.findElement(By.xpath("//span[text()='Used']"));	
		//action.moveToElement(used_car_drop_down);
		used_car_drop_down.click();
		Thread.sleep(3000);
		WebElement used_car_search_box = driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']"));	
		used_car_search_box.sendKeys("delhi");
		Thread.sleep(3000);
		WebElement click_on_search_city = driver.findElement(By.xpath("//mark[@class='o-eqqVmt o-eZTujG o-foCBAZ']"));	
		click_on_search_city.click();

		//mark[text()='Delhi']
		//used_car_search_box.sendKeys(Keys.ARROW_DOWN);
		//used_car_search_box.sendKeys(Keys.ENTER);
		//WebElement choose_your_budget_button = driver.findElement(By.xpath("//div[text()='Choose your Budget']"));
		//choose_your_budget_button.click();
		WebElement min_amount = driver.findElement(By.xpath("//input[@placeholder='Min']"));
		min_amount.sendKeys("3");
		WebElement search_button = driver.findElement(By.xpath("//button[text()='Search']"));
		search_button.click();
		Thread.sleep(3000);
		boolean citytitle = driver.findElement(By.xpath("//h1[contains(text(),'Used Cars')]")).isDisplayed();
		Assert.assertEquals(citytitle, true);
		driver.navigate().back();


	}
	public void featured_car_popular() throws InterruptedException {
		
		//WebElement first_car_show_price_button1 = driver.findElement(By.xpath("(//div[text()='View Price Breakup'])[1]"));
		
		WebElement first_car_show_price_button = driver.findElement(By.xpath("(//button[text()='Show price in my city' and @data-model-page-url='/maruti-suzuki-cars/fronx/'])[1]"));
//		String x = first_car_show_price_button1.getText();
//		System.out.println(x);
//	
//		if(x.equals("Show price in my city")) {
//			first_car_show_price_button1.click();
//		}
//		else {
//			first_car_show_price_button2.click();
//		}
		first_car_show_price_button.click();
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//span[text()='Bangalore']"));
		city.click();
		WebElement close_button = driver.findElement(By.xpath("//span[@aria-label='Close Popup']"));
		action.moveToElement(close_button).perform();
		close_button.click();
		WebElement on_road_price_city = driver.findElement(By.xpath("//div[@data-lang-id='pricetype_with_city']"));
		String on_road_price_city_text= on_road_price_city.getText();
		Assert.assertEquals(on_road_price_city_text, "On-Road Price, Bangalore");
		driver.navigate().back();

	}
	
	public void featured_car_popular_scroller_right() throws InterruptedException {
		
		WebElement popular_car_right_scroll_button_right = driver.findElement(By.xpath("(//div[@data-direction='right'])[1]"));
		Thread.sleep(4000);
		popular_car_right_scroll_button_right.click();
		Thread.sleep(4000);
		WebElement mahindracartitle = driver.findElement(By.xpath("//div[@title='Mahindra Scorpio']"));
		String mahindracartitle_text= mahindracartitle.getAttribute("title");
		Assert.assertEquals(mahindracartitle_text, "Mahindra Scorpio");
	}

	public void just_launched() {
		WebElement just_launched_text = driver.findElement(By.xpath("//span[text()='JUST LAUNCHED']"));
		just_launched_text.click();

		WebElement first_car_show_price_button = driver.findElement(By.xpath("(//button[text()='View Price Breakup'])[10]"));
		first_car_show_price_button.click();
		WebElement mumbai_city = driver.findElement(By.xpath("//span[text()='Banglore']"));
		mumbai_city.click();
		WebElement close_button = driver.findElement(By.xpath("(//span[@role='button' and @aria-label='Close Popup'])[2]"));
		close_button.click();
		//
		WebElement on_road_price_city = driver.findElement(By.xpath("//div[@data-lang-id='pricetype_with_city']"));
		String on_road_price_city_text= on_road_price_city.getText();
		Assert.assertEquals(on_road_price_city_text, "On-Road Price, Banglore");

	}
	public void just_launched_scroller_right() throws InterruptedException {
		driver.navigate().back();
		WebElement just_launched_text = driver.findElement(By.xpath("//span[text()='JUST LAUNCHED']"));
		just_launched_text.click();
		WebElement just_launched_car_right_scroll_button_right = driver.findElement(By.xpath("(//div[@data-direction='right'])[2]"));
		Thread.sleep(4000);
		just_launched_car_right_scroll_button_right.click();
		Thread.sleep(4000);
		WebElement mahindracartitle = driver.findElement(By.xpath("//div[@title='Maruti Suzuki Fronx']"));
		String mahindracartitle_text= mahindracartitle.getAttribute("title");
		Assert.assertEquals(mahindracartitle_text, "Maruti Suzuki Fronx");
	}
	public void upcoming() throws InterruptedException {
		driver.navigate().refresh();
		WebElement upcoming_text = driver.findElement(By.xpath("//span[text()='Upcoming']"));
		upcoming_text.click();

		WebElement Alert_Me_When_Launched = driver.findElement(By.xpath("(//span[text()='Alert Me When Launched'])[1]"));

		//Alert_Me_When_Launched.click();
		//action.moveToElement(Alert_Me_When_Launched).perform();
		jsExecutor.executeScript("arguments[0].click();", Alert_Me_When_Launched);


		WebElement email_box = driver.findElement(By.xpath("//input[@id='email']"));
		email_box.sendKeys(prop.getProperty("email"));

		WebElement subscribe_button = driver.findElement(By.xpath("//button[text()='Subscribe Now']"));
		subscribe_button.click();

		WebElement thank_you_text_message = driver.findElement(By.xpath("//p[text()='Thank You!']"));
		String thank_you_text_message_text= thank_you_text_message.getText();
		Assert.assertEquals(thank_you_text_message_text, "Thank You!");
		WebElement done_button = driver.findElement(By.xpath("//button[text()='Done']"));
		done_button.click();

	}

	public void upcomming_scroller_right() throws InterruptedException {

		WebElement upcoming_text = driver.findElement(By.xpath("//span[text()='Upcoming']"));
		upcoming_text.click();
		WebElement upcoming_right_icon = driver.findElement(By.xpath("(//div[@data-direction='right'])[3]"));
		upcoming_right_icon.click();
		Thread.sleep(4000);

		WebElement hyndaiexter = driver.findElement(By.xpath("//div[@title='Hyundai Exter']"));
		String hyndaiexter_text= hyndaiexter.getAttribute("title");
		Assert.assertEquals(hyndaiexter_text, "Hyundai Exter");
	}

	public void view_all_popular_car() throws InterruptedException {
		WebElement View_All_Popular_Cars = driver.findElement(By.xpath("//div[text()='View All Popular Cars']"));
		View_All_Popular_Cars.click();
		WebElement popular_car_page_heading = driver.findElement(By.xpath("//h1"));
		String popular_car_page_heading_text= popular_car_page_heading.getText();
		Assert.assertEquals(popular_car_page_heading_text, "Popular Cars");
		driver.navigate().back();
	}

	public void view_all_newly_launched_cars() throws InterruptedException {
		WebElement just_launched_text = driver.findElement(By.xpath("//span[text()='JUST LAUNCHED']"));
		just_launched_text.click();

		WebElement View_All_Newly_Launched_Cars = driver.findElement(By.xpath("//div[text()='View All Newly Launched Cars']"));
		View_All_Newly_Launched_Cars.click();

		WebElement new_launched_car_page_heading = driver.findElement(By.xpath("//h1"));
		String new_launched_car_page_heading_text= new_launched_car_page_heading.getText();
		Assert.assertEquals(new_launched_car_page_heading_text, "New Car Launches");
		driver.navigate().back();

	}
	public void view_all_upcoming_cars() throws InterruptedException {
		WebElement view_all_upcoming_cars_button = driver.findElement(By.xpath("//span[text()='Upcoming']"));
		view_all_upcoming_cars_button.click();
		WebElement View_All_Upcoming_Cars = driver.findElement(By.xpath("//div[text()='View All Upcoming Cars']"));
		View_All_Upcoming_Cars.click();
		WebElement View_All_Upcoming_Cars_heading = driver.findElement(By.xpath("//h1"));
		String View_All_Upcoming_Cars_heading_text= View_All_Upcoming_Cars_heading.getText();
		Assert.assertEquals(View_All_Upcoming_Cars_heading_text, "Upcoming Cars");
		driver.navigate().back();
	}
	public void tata_cars() throws InterruptedException {
		WebElement View_All_Popular_Cars = driver.findElement(By.xpath("//div[text()='View All Popular Cars']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",View_All_Popular_Cars );
		WebElement tata_icon = driver.findElement(By.xpath("//img[@title='Tata']"));
		tata_icon.click();
		WebElement Tata_cars_page_heading = driver.findElement(By.xpath("//h1"));
		String Tata_cars_heading_text= Tata_cars_page_heading.getText();
		Assert.assertEquals(Tata_cars_heading_text, "Tata Cars");
		driver.navigate().back();

	}
	public void skoda_cars() throws InterruptedException {
		WebElement View_All_Popular_Cars = driver.findElement(By.xpath("//div[text()='View All Popular Cars']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",View_All_Popular_Cars );
		WebElement skoda_icon = driver.findElement(By.xpath("//img[@title='Skoda']"));
		skoda_icon.click();
		WebElement Skoda_cars_page_heading = driver.findElement(By.xpath("//h1"));
		String Skoda_cars_page_heading_text= Skoda_cars_page_heading.getText();
		Assert.assertEquals(Skoda_cars_page_heading_text, "Skoda Cars");
		driver.navigate().back();

	}
	
	public void view_more_brands() throws InterruptedException {
		WebElement All_Brands_text = driver.findElement(By.xpath("//h2[text()='All Brands']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",All_Brands_text );
		WebElement View_More_Brands_Text_Link = driver.findElement(By.xpath("//div[text()='View More Brands']"));
		View_More_Brands_Text_Link.click();
		
		WebElement View_Less_Brands_Link = driver.findElement(By.xpath("//div[text()='View Less Brands']"));
		String View_Less_Brands_Link_text= View_Less_Brands_Link.getText();
		Assert.assertEquals(View_Less_Brands_Link_text, "View Less Brands");
		View_Less_Brands_Link.click();

	}
	public void budget_cars() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		WebElement under_5_lakh_icon = driver.findElement(By.xpath("//a[@data-label='under 5 lakh-Click']"));
		under_5_lakh_icon.click();
		WebElement Cars_Under_5_Lakh_page_heading = driver.findElement(By.xpath("//h1"));
		String Cars_Under_5_Lakh_page_heading_text= Cars_Under_5_Lakh_page_heading.getText();
		Assert.assertEquals(Cars_Under_5_Lakh_page_heading_text, "Best Cars Under 5 Lakh");
		driver.navigate().back();
	}
	public void luxry_cars() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement luxrycar = driver.findElement(By.xpath("//a[@data-label='luxury cars-Click']"));
		luxrycar.click();
		Thread.sleep(4000);
		WebElement luxrycar_page_heading = driver.findElement(By.xpath("//h1"));
		String luxrycar_page_heading_page_heading_text= luxrycar_page_heading.getText();
		Assert.assertEquals(luxrycar_page_heading_page_heading_text, "Luxury Cars");
		driver.navigate().back();
	}
	
	public void body_type_PLUS_SUV() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement body_type_button = driver.findElement(By.xpath("//span[text()='BODY TYPE']"));
		body_type_button.click();
		Thread.sleep(4000);
		WebElement suv = driver.findElement(By.xpath("//span[text()='SUV']"));
		suv.click();
		WebElement SUV_page_heading = driver.findElement(By.xpath("//h1"));
		String SUV_page_heading_page_heading_text= SUV_page_heading.getText();
		Assert.assertEquals(SUV_page_heading_page_heading_text, "SUV Cars");
		driver.navigate().back();
	}
	public void body_type_convertable() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement body_type_button = driver.findElement(By.xpath("//span[text()='BODY TYPE']"));
		body_type_button.click();
		Thread.sleep(4000);
		WebElement convertiable = driver.findElement(By.xpath("//span[text()='Convertible']"));
		convertiable.click();
		WebElement convertiable_page_heading = driver.findElement(By.xpath("//h1"));
		String convertiable_page_heading_page_heading_text= convertiable_page_heading.getText();
		Assert.assertEquals(convertiable_page_heading_page_heading_text, "CONVERTIBLES");
		driver.navigate().back();
	}
	public void body_type_sedan() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement body_type_button = driver.findElement(By.xpath("//span[text()='BODY TYPE']"));
		body_type_button.click();
		Thread.sleep(4000);
		WebElement Sedan = driver.findElement(By.xpath("//span[text()='Sedan']"));
		Sedan.click();
		WebElement Sedan_page_heading = driver.findElement(By.xpath("//h1"));
		String Sedan_page_heading_page_heading_text= Sedan_page_heading.getText();
		Assert.assertEquals(Sedan_page_heading_page_heading_text, "Sedan Cars");
		driver.navigate().back();
	}
	public void fule_type_plus_petrol() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement fule_type_button = driver.findElement(By.xpath("//span[text()='FUEL TYPE']"));
		fule_type_button.click();
		Thread.sleep(4000);
		WebElement petrol = driver.findElement(By.xpath("//span[text()='Petrol']"));
		petrol.click();
		WebElement Petrol_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String Petrol_Cars_page_heading_page_heading_text= Petrol_Cars_page_heading.getText();
		Assert.assertEquals(Petrol_Cars_page_heading_page_heading_text, "Petrol Cars");
		driver.navigate().back();
	}
	public void fule_type_cng() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement fule_type_button = driver.findElement(By.xpath("//span[text()='FUEL TYPE']"));
		fule_type_button.click();
		Thread.sleep(4000);
		WebElement cng = driver.findElement(By.xpath("//span[text()='CNG']"));
		cng.click();
		WebElement cng_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String cng_Cars_page_heading_ext= cng_Cars_page_heading.getText();
		Assert.assertEquals(cng_Cars_page_heading_ext, "CNG Cars");
		driver.navigate().back();
	}
	public void fule_type_hybrid() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement fule_type_button = driver.findElement(By.xpath("//span[text()='FUEL TYPE']"));
		fule_type_button.click();
		Thread.sleep(4000);
		WebElement hybrid = driver.findElement(By.xpath("//span[text()='Hybrid']"));
		hybrid.click();
		WebElement hybrid_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String hybrid_Cars_page_heading_page_heading_text= hybrid_Cars_page_heading.getText();
		Assert.assertEquals(hybrid_Cars_page_heading_page_heading_text, "Hybrid Cars");
		driver.navigate().back();
	}
	public void fule_type_electric() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement fule_type_button = driver.findElement(By.xpath("//span[text()='FUEL TYPE']"));
		fule_type_button.click();
		Thread.sleep(4000);
		WebElement electric = driver.findElement(By.xpath("//span[text()='Electric']"));
		electric.click();
		WebElement electric_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String electric_Cars_page_heading_page_heading_text=electric_Cars_page_heading.getText();
		Assert.assertEquals(electric_Cars_page_heading_page_heading_text, "Electric Cars In India");
		driver.navigate().back();
	}
	public void transmission_automatic() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement transmission_type_button = driver.findElement(By.xpath("//span[text()='TRANSMISSION']"));
		transmission_type_button.click();
		Thread.sleep(4000);
		WebElement automatic = driver.findElement(By.xpath("//span[text()='Automatic']"));
		automatic.click();
		WebElement automatic_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String automatic_Cars_page_heading_page_heading_text=automatic_Cars_page_heading.getText();
		Assert.assertEquals(automatic_Cars_page_heading_page_heading_text, "Automatic Cars");
		driver.navigate().back();
	}
	public void seating_capacity_5() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement seating_capacity_type_button = driver.findElement(By.xpath("//span[text()='SEATING CAPACITY']"));
		seating_capacity_type_button.click();
		Thread.sleep(4000);
		WebElement five_seater = driver.findElement(By.xpath("//a[text()='5 Seater']"));
		five_seater.click();
		WebElement seven_seater_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String seven_seater_Cars_page_heading_page_heading_text=seven_seater_Cars_page_heading.getText();
		Assert.assertEquals(seven_seater_Cars_page_heading_page_heading_text, "5 Seater Cars");
		driver.navigate().back();
	}
	public void seating_capacity_7() throws InterruptedException {
		WebElement Find_The_Cars_Of_Your_Choice_text = driver.findElement(By.xpath("//h2[text()='Find The Cars Of Your Choice']"));
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);",Find_The_Cars_Of_Your_Choice_text );
		Thread.sleep(4000);
		WebElement seating_capacity_type_button = driver.findElement(By.xpath("//span[text()='SEATING CAPACITY']"));
		seating_capacity_type_button.click();
		Thread.sleep(4000);
		WebElement seven_seater = driver.findElement(By.xpath("//a[text()='7 Seater']"));
		seven_seater.click();
		WebElement seven_seater_Cars_page_heading = driver.findElement(By.xpath("//h1"));
		String seven_seater_Cars_page_heading_page_heading_text=seven_seater_Cars_page_heading.getText();
		Assert.assertEquals(seven_seater_Cars_page_heading_page_heading_text, "7 Seater Cars");
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	











}	

