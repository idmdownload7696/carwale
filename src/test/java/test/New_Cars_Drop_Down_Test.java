package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actions.New_Cars_Drop_Down_Action;
import base.CarwaleBaseFile;

public class New_Cars_Drop_Down_Test extends CarwaleBaseFile{
	New_Cars_Drop_Down_Action new_cars_drop_down;

	@BeforeClass
	public void browser_call() throws InterruptedException {
	browser();
	new_cars_drop_down=new New_Cars_Drop_Down_Action();

	}

		
		@Test(priority = 1)
		public void New_Cars_Drop_Down_Text() {
			new_cars_drop_down.new_cars_drop_down_link_text();
		}
		@Test(priority = 2)
		public void Latest_Cars_Avability() throws InterruptedException {
			new_cars_drop_down.new_lanuch_link_text();
		}
		@Test(priority = 3)
		public void New_Cars_By_Brand() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_brand_landrover();
		}
		@Test(priority = 4)
		public void New_Cars_Price_Range() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_budget();
		}
		@Test(priority = 5)
		public void New_Cars_By_Fuel_Type() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_fuel_type();
		}
		@Test(priority = 6)
		public void New_Cars_By_Transmission_Type() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_transmission_type();
		}
		@Test(priority = 7)
		public void New_Cars_By_Popularity() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_popularity();
		}
		@Test(priority = 8)
		public void New_Cars_Low_To_High_Price() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_low_to_high_price();
		}
		@Test(priority = 9)
		public void New_Cars_High_To_Low_Price() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_high_to_low_price();
		}
		@Test(priority = 10)
		public void New_Cars_By_Seating_Capacity() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_seating_capacity();
		}
		@Test(priority = 11)
		public void New_Cars_By_Safety_Rarings() throws InterruptedException {
			new_cars_drop_down.find_new_car_by_safety_ratings();
		}
		
		
		
		
		

}
