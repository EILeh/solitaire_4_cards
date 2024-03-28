package example.app.solitaire;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application 
{

    private ArrayList<Label> cards = new ArrayList<>(52);
    @Override
    public void start(Stage stage) 
    {
        Button restartBtn = new Button("Restart");
        GridPane gameBoard = new GridPane();

        Scene scene = new Scene(gameBoard, 500, 500);
        stage.setScene(scene);

        Rectangle rectangle1 = new Rectangle(50, 50 ,50, 70);
        Rectangle rectangle2 = new Rectangle(50, 50 ,50, 70);
        Rectangle rectangle3 = new Rectangle(50, 50 ,50, 70);
        Rectangle rectangle4 = new Rectangle(50, 50 ,50, 70);

        //VBox vBox = new VBox(10);
        StackPane cardPile1 = new StackPane(rectangle1);
        StackPane cardPile2 = new StackPane(rectangle2);
        StackPane cardPile3 = new StackPane(rectangle3);
        StackPane cardPile4 = new StackPane(rectangle4);
        //vBox.getChildren().add(cardPile1);

        gameBoard.add(cardPile1, 0, 0);
        gameBoard.add(cardPile2, 1, 0);
        gameBoard.add(cardPile3, 2, 0);
        gameBoard.add(cardPile4, 3, 0);

//        Rectangle rectangle1OnPile1 = new Rectangle(50, 50 ,50, 70);
//
//        StackPane cardPile1Card = new StackPane(rectangle1OnPile1);
//        gameBoard.add(cardPile1Card, 0, 1);


        gameBoard.setHgap(10);






//        Rectangle rectangle2D1 = new Rectangle(50, 50, 50, 50);
//        StackPane gameBoard = new StackPane(rectangle2D, rectangle2D1, restartBtn);



        stage.setTitle("Solitaire");

        gameBoard.setPadding(new Insets(10, 10, 10, 10));

        stage.show();


    }

    public void addCards()
    {

    }

    public static void main(String[] args) 
    {
        launch();
    }

}