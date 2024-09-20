import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BullsAndCowsControllerTest {
    @Test
    public void testBullsAndCowsController() {
        BullsAndCowsModel model = new BullsAndCowsModel(4, false);
        BullsAndCowsView view = new BullsAndCowsView();
        BullsAndCowsController controller = new BullsAndCowsController(model, view);

        // Test if the secret number is generated correctly
        int[] secretNumber = model.getSecretNumber();
        assertEquals(4, secretNumber.length);

        // Test if the game logic works correctly
        String userInput = "1234"; // Assuming the secret number is "1234"
        controller.processUserInput(userInput);
        int bulls = controller.getBulls();
        int cows = controller.getCows();
        assertEquals(0, bulls);
        assertEquals(0, cows);
    }
}