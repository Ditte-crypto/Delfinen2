import Controller.MainController;

public class Main {
    public static int seniorRate = 1600;
    public static int juniorRate = 1000;
    public static int passiveRate = 500;
    public static int pensioneerRatePercentage = 25;

    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.run();
    }
}
