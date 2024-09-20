public class Main {
    public static void main(String[] args) {
        BullsAndCowsModel model = new BullsAndCowsModel(4, false);
        BullsAndCowsView view = new BullsAndCowsView();
        BullsAndCowsController controller = new BullsAndCowsController(model, view);

        controller.playGame();
    }
}