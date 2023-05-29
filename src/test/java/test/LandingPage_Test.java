package test;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import actions.Landing_Page_Actions;
import base.CarwaleBaseFile;


public class LandingPage_Test extends CarwaleBaseFile{

Landing_Page_Actions landing_page_actions;

@BeforeClass
public void browser_call() throws InterruptedException {
browser();
landing_page_actions=new Landing_Page_Actions();

}

	
	@Test(priority = 1)
	public void brand_logo() {
		landing_page_actions.logo();
	}
	@Test(priority = 2)
	public void search_bar() throws InterruptedException {
		landing_page_actions.search_bar();
	}
	@Test(priority = 3)
	public void location() throws InterruptedException {
		landing_page_actions.location();
	}
	@Test(priority = 4)
	public void language() throws InterruptedException {
		landing_page_actions.language();
	}
	@Test(priority = 5)
	public void find_right_new_car_search() throws InterruptedException {
		landing_page_actions.find_right_new_car_search();
	}
	@Test(priority = 6)
	public void find_right_used_car_search1() throws InterruptedException {
		landing_page_actions.find_right_used_car_search();
	}
	@Test(priority = 7)
	public void popular_price_in_my_city() throws InterruptedException {
		landing_page_actions.featured_car_popular();
	}
	@Test(priority = 8)
	public void featured_car_popular_scroller_right() throws InterruptedException {
		landing_page_actions.featured_car_popular_scroller_right();
	}
	
	@Test(priority = 9)
	public void just_launched_show_price_in_my_city() throws InterruptedException {
		landing_page_actions.just_launched();
	}
	@Test(priority = 10, dependsOnMethods = "just_launched_show_price_in_my_city")
	public void just_launched_scroller_right() throws InterruptedException {
		landing_page_actions.just_launched_scroller_right();
	}
	@Test(priority = 11)
	public void upcoming() throws InterruptedException {
		landing_page_actions.upcoming();
	}
	
	@Test(priority = 12)
	public void upcomming_scroller_right() throws InterruptedException {
		landing_page_actions.upcomming_scroller_right();
	}
	@Test(priority = 13)
	public void view_all_popularCars() throws InterruptedException {
		landing_page_actions.view_all_popular_car();
	}
	@Test(priority = 14)
	public void view_all_newly_launched_Cars() throws InterruptedException {
		landing_page_actions.view_all_newly_launched_cars();
	}
	@Test(priority = 15)
	public void view_all_upcoming_Cars() throws InterruptedException {
		landing_page_actions.view_all_upcoming_cars();
	}
	@Test(priority = 16)
	public void tata_brand() throws InterruptedException {
		landing_page_actions.tata_cars();
	}
	@Test(priority = 17)
	public void skoda_brand() throws InterruptedException {
		landing_page_actions.skoda_cars();
	}
	@Test(priority = 18)
	public void view_more_brands() throws InterruptedException {
		landing_page_actions.view_more_brands();
	}
	
	//------------------------------------
	
	@Test(priority = 19)
	public void car_under_5_lakh() throws InterruptedException {
		landing_page_actions.budget_cars();
	}
	
	@Test(priority = 20)
	public void luxrycars() throws InterruptedException {
		landing_page_actions.luxry_cars();
	}
	@Test(priority = 21)
	public void body_type_plus_suv() throws InterruptedException {
		landing_page_actions.body_type_PLUS_SUV();
	}
	@Test(priority = 22)
	public void convertiable() throws InterruptedException {
		landing_page_actions.body_type_convertable();
	}
	@Test(priority = 23)
	public void sedan() throws InterruptedException {
		landing_page_actions.body_type_convertable();
	}
	@Test(priority = 24)
	public void petrol() throws InterruptedException {
		landing_page_actions.fule_type_plus_petrol();
	}
	@Test(priority = 25)
	public void cng() throws InterruptedException {
		landing_page_actions.fule_type_cng();
	}
	@Test(priority = 26)
	public void hybrid() throws InterruptedException {
		landing_page_actions.fule_type_hybrid();
	}
	@Test(priority = 27)
	public void electric() throws InterruptedException {
		landing_page_actions.fule_type_electric();
	}
	@Test(priority = 28)
	public void automatic() throws InterruptedException {
		landing_page_actions.transmission_automatic();
	}
	
	@Test(priority = 29)
	public void five_seater_capacity() throws InterruptedException {
		landing_page_actions.seating_capacity_5();
	}
	@Test(priority = 30)
	public void seven_seater_capacity() throws InterruptedException {
		landing_page_actions.seating_capacity_7();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}