package qa.Utility;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import com.google.common.collect.ImmutableList;

import io.appium.java_client.AppiumDriver;

public class LongPress {

	public static void longPress (WebElement el) {

		Point location = el.getLocation();
		
		PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
		
		Sequence swipe =new Sequence(input, 0);

		swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), location.x, location.y));
		swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));


		swipe.addAction(input.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), location.x, location.y));
		swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		((AppiumDriver)Scroll.driver).perform(ImmutableList.of(swipe));


	}
}
