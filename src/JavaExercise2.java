import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaExercise2 {

//(//*[@ng-bind=’food.name’])[3]
//(//*[@ng-bind=’food.name’])[5]
	    private static WebDriver driver;
		public static void main(String[] args){
		
			List<WebElement> foodNames= driver.findElements(By.xpath("//*[@ng-bind=’food.name’]"));
					List<WebElement> foodServings = driver.findElements( By.xpath("//*[@ng-bind=’food.servingDesc]"));
					HashMap<String, String> foods = new HashMap<String,String>();
					for(int i =0; i < foodNames.size();i++){
					
					foods.put("foodName", foodNames.get(i).getText());
					foods.put("foodServingDesc", foodServings.get(i).getText());
					}

					String food = foods.values().iterator().next();
					while((food) != null){
					    System.out.println(foods);
					    food = foods.values().iterator().next();
					}
		}
	}
