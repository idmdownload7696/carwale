package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.CarwaleBaseFile;

public class New_Cars_Drop_Down_Action extends CarwaleBaseFile{

	JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
	//JavascriptExecutor jsExecutor;
	Actions action = new Actions(driver);

	public void new_cars_drop_down_link_text() {
		WebElement new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		//driver.switchTo().alert().dismiss();
		Assert.assertEquals(new_cars_drop_down.isDisplayed(), true);
	}

	public void new_lanuch_link_text() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement new_launched_link_text = driver.findElement(By.xpath("//div[text()='New Launches']"));
		new_launched_link_text.click();
		Thread.sleep(2000);
		String new_cars_launch_heading = driver.findElement(By.xpath("//h1")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(new_cars_launch_heading, "New Car Launches");
		driver.navigate().back();
	}
	public void find_new_car_by_brand_landrover() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();
		String landrover_heading = driver.findElement(By.xpath("//h1")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(landrover_heading, "Land Rover Cars");
		driver.navigate().back();
	}
	public void find_new_car_by_budget() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement view_more_brands_link_text = driver.findElement(By.xpath("//div[text()='View More Brands']"));
		jsExecutor.executeScript("arguments[0].click();", view_more_brands_link_text);

		WebElement Under_30_Lakh_button = driver.findElement(By.xpath("//a[text()='Under 30 Lakh']"));
		Under_30_Lakh_button.click();
		String Under_30_Lakh_page_heading = driver.findElement(By.xpath("//h1")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(Under_30_Lakh_page_heading, "Best Cars Under 30 Lakh");
		driver.navigate().back();
	}
	public void find_new_car_by_fuel_type() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();


		WebElement more_filter_button = driver.findElement(By.xpath("//span[text()='More Filter']"));
		more_filter_button.click();

		WebElement fuel_type_drop_down_button = driver.findElement(By.xpath("//p[text()='Fuel Type']"));
		fuel_type_drop_down_button.click();

		WebElement petrol_icon = driver.findElement(By.xpath("//p[text()='Petrol']"));
		petrol_icon.click();

		WebElement apply_filter_button = driver.findElement(By.xpath("//button[text()='Apply Filters']"));
		apply_filter_button.click();

		Thread.sleep(5000);


		WebElement petrol_select_box_in_petrol_car_page = driver.findElement(By.xpath("//span[text()='Petrol']"));
		String petrol_select_box_in_petrol_car_page_text = petrol_select_box_in_petrol_car_page.getText();
		Assert.assertEquals(petrol_select_box_in_petrol_car_page_text, "Petrol");
		driver.navigate().back();
	}
	public void find_new_car_by_transmission_type() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();


		WebElement more_filter_button = driver.findElement(By.xpath("//span[text()='More Filter']"));
		more_filter_button.click();

		WebElement transmission_type_drop_down_button = driver.findElement(By.xpath("//p[text()='Transmission Type']"));
		transmission_type_drop_down_button.click();

		WebElement automatic_icon = driver.findElement(By.xpath("//p[text()='Automatic']"));
		automatic_icon.click();

		WebElement apply_filter_button = driver.findElement(By.xpath("//button[text()='Apply Filters']"));
		apply_filter_button.click();

		Thread.sleep(5000);


		WebElement automatic_car_page = driver.findElement(By.xpath("//span[text()='Automated Manual Transmission (AMT)']"));
		String automatic_car_page_text = automatic_car_page.getText();
		Assert.assertEquals(automatic_car_page_text, "Automated Manual Transmission (AMT)");
		driver.navigate().back();
	}
	public void find_new_car_by_popularity() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();
		
		WebElement popularity_selected_text = driver.findElement(By.xpath("//option[text()='Popularity']"));
		Assert.assertEquals(popularity_selected_text.isDisplayed(), true);
		driver.navigate().back();
	}
	public void find_new_car_by_low_to_high_price() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();
		Thread.sleep(2000);
		WebElement popularity_drop_down = driver.findElement(By.xpath("//div[@class='o-brXWGL o-cpnuEd o-dsiSgT']/select"));
		Select select=new Select(popularity_drop_down);
		select.selectByValue("price-asc"); // this is low to high option
		
		WebElement low_to_high = driver.findElement(By.xpath("//div[@class='o-brXWGL o-cpnuEd o-dsiSgT']/select/option[3]"));
		Assert.assertEquals(low_to_high.isSelected(), true);	
	}
	public void find_new_car_by_high_to_low_price() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();
		Thread.sleep(2000);
		WebElement popularity_drop_down = driver.findElement(By.xpath("//div[@class='o-brXWGL o-cpnuEd o-dsiSgT']/select"));
		Select select=new Select(popularity_drop_down);
		select.selectByValue("price-desc");  // this is high to low option
		
		WebElement high_to_low = driver.findElement(By.xpath("//div[@class='o-brXWGL o-cpnuEd o-dsiSgT']/select/option[4]"));
		Assert.assertEquals(high_to_low.isSelected(), true);	
	}
	public void find_new_car_by_seating_capacity() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();


		WebElement more_filter_button = driver.findElement(By.xpath("//span[text()='More Filter']"));
		more_filter_button.click();

		WebElement seating_capacity_drop_down_button = driver.findElement(By.xpath("//p[text()='Seating Capacity']"));
		seating_capacity_drop_down_button.click();

		WebElement _7seater_icon = driver.findElement(By.xpath("//span[text()='7 Seater']"));
		_7seater_icon.click();

		WebElement apply_filter_button = driver.findElement(By.xpath("//button[text()='Apply Filters']"));
		apply_filter_button.click();

		Thread.sleep(5000);

		WebElement seven_seater_selct_box = driver.findElement(By.xpath("//span[text()='7 Seater']"));
		String seven_seater_selct_box_text = seven_seater_selct_box.getText();
		Assert.assertEquals(seven_seater_selct_box_text, "7 Seater");
		driver.navigate().back();
	}
	public void find_new_car_by_safety_ratings() throws InterruptedException {
		WebElement  new_cars_drop_down = driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Thread.sleep(2000);
		action.moveToElement(new_cars_drop_down).perform();
		Thread.sleep(5000);
		WebElement find_new_cars_link_text = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		find_new_cars_link_text.click();
		Thread.sleep(2000);
		WebElement landrover_icon_click = driver.findElement(By.xpath("//div[text()='Land Rover']"));
		landrover_icon_click.click();


		WebElement more_filter_button = driver.findElement(By.xpath("//span[text()='More Filter']"));
		more_filter_button.click();

		WebElement seating_capacity_drop_down_button_scroll = driver.findElement(By.xpath("//p[text()='Seating Capacity']"));
		jsExecutor.executeScript("arguments[0].click();", seating_capacity_drop_down_button_scroll);
		
		WebElement safety_ratings_drop_down_button = driver.findElement(By.xpath("//p[text()='Safety ratings']"));
		safety_ratings_drop_down_button.click();
		
		
		
		WebElement _4_star_icon = driver.findElement(By.xpath("//span[text()='4 Star']"));
		_4_star_icon.click();

		WebElement apply_filter_button = driver.findElement(By.xpath("//button[text()='Apply Filters']"));
		apply_filter_button.click();

		Thread.sleep(5000);

		WebElement _4_star_selct_box = driver.findElement(By.xpath("//span[text()='4 Star']"));
		String _4_star_selct_box_text = _4_star_selct_box.getText();
		Assert.assertEquals(_4_star_selct_box_text, "4 Star");
		driver.navigate().back();
	}
	
	
	
}


























