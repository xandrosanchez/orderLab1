import View.View;
import controller.Controller;
import model.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        var view = new View();
        var model = new QuadraticEquation();
        var presenter = new Controller(model,view);
        presenter.start();
    }
}