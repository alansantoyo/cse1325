package mdi;
public class Controller {
    private Store store;
    private View view;
    private Menu mainMenu;
    private boolean isRunning;
    private Scanner in;
    public Controller(String storeName) {
        this.store = store;
        this.view = view;
        this.mainMenu = mainMenu;
        this.isRunning = isRunning;
        this.in = in;
    }
    public void mdi() {
    }

    private void exit() {

        isRunning = false;
    }
    private void placeOrder() {

    }
    private void newCustomer() {
    }
    private void newTool() {
    }
    private void newPlant() {
    }
    private void switchView() {
    }
    private String getView() {
    }
    private int selectFromMenu() {
    }
    private void print(String s) {
    }
    private void getString(String prompt) {
    }
    private int getInt(String prompt) {
    }
    private double getDouble(String prompt) {
    }
}
