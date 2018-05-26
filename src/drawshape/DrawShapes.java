package drawshape;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;

import javafx.scene.shape.Shape;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

public class DrawShapes extends Application {

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {

// Create a circle and set its properties

        Circle circle = new Circle();

        circle.setCenterX(100);

        circle.setCenterY(100);

        circle.setRadius(50);

        circle.setStroke(Color.BLACK);

        circle.setStrokeWidth(3.0);

        circle.setFill(Color.BLUE);


        Rectangle r = new Rectangle();

        r.setX(250);

        r.setY(50);

        r.setWidth(200);

        r.setHeight(100);

        r.setArcWidth(20);

        r.setArcHeight(20);

        r.setFill(Color.RED);


        Circle exclamationFace = new Circle();

        exclamationFace.setCenterX(270);

        exclamationFace.setCenterY(300);

        exclamationFace.setRadius(100);

        exclamationFace.setStroke(Color.BLACK);

        exclamationFace.setStrokeWidth(3.0);

        exclamationFace.setFill(Color.CHOCOLATE);


        Circle eye1 = new Circle();

        eye1.setCenterX(230);

        eye1.setCenterY(270);

        eye1.setRadius(10);

        eye1.setStroke(Color.BLACK);

        eye1.setStrokeWidth(1.0);

        eye1.setFill(Color.BLACK);



        Circle eye2 = new Circle();

        eye2.setCenterX(310);

        eye2.setCenterY(270);

        eye2.setRadius(10);

        eye2.setStroke(Color.BLACK);

        eye2.setStrokeWidth(1.0);

        eye2.setFill(Color.BLACK);


        Rectangle mouth = new Rectangle();

        mouth.setX(245);

        mouth.setY(320);

        mouth.setWidth(50);

        mouth.setHeight(65);

        mouth.setArcWidth(100);

        mouth.setArcHeight(100);

        mouth.setFill(Color.WHITE);


        Text text = new Text("Oh!");

        text.setFont(new Font(20));

        text.setX(252);

        text.setY(362);


// Create a pane to hold the circle

        Pane pane = new Pane();

        pane.getChildren().add(circle);


        pane.getChildren().add(r);


        pane.getChildren().add(exclamationFace);


        pane.getChildren().add(eye1);


        pane.getChildren().add(eye2);


        pane.getChildren().add(mouth);


        pane.getChildren().add(text);


// Create a scene and place it in the stage

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Draw Shapes"); // Set the stage title

        primaryStage.setScene(scene); // Place the scene in the stage

        primaryStage.show(); // Display the stage

    }


    void DrawMyStuff(Pane myPane, Shape myShape)

    {

        myPane.getChildren().add(myShape);

    }


    /**
     * The main method is only needed for the IDE with limited
     * <p>
     * JavaFX support. Not needed for running from the command line.
     */

    public static void main(String[] args) {

        launch(args);

    }
}