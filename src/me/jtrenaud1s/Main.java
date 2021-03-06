package me.jtrenaud1s;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Quadratic Formula");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);


        TextField aText = new TextField();
        aText.setPromptText("Enter the value of a: ");
        aText.setPrefColumnCount(10);
        aText.getText();
        GridPane.setConstraints(aText, 0, 0);
        GridPane.setColumnSpan(aText, 2);
        grid.getChildren().add(aText);

        TextField bText = new TextField();
        bText.setPromptText("Enter the value of b: ");
        GridPane.setConstraints(bText, 0, 1);
        GridPane.setColumnSpan(bText, 2);
        grid.getChildren().add(bText);

        TextField cText = new TextField();
        cText.setPrefColumnCount(15);
        cText.setPromptText("Enter the value of c: ");
        GridPane.setConstraints(cText, 0, 2);
        GridPane.setColumnSpan(cText, 2);
        grid.getChildren().add(cText);

        Button submit = new Button("Calculate");
        GridPane.setConstraints(submit, 0, 3);
        GridPane.setFillWidth(submit, true);
        grid.getChildren().add(submit);

        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 3);
        GridPane.setFillWidth(clear, true);
        grid.getChildren().add(clear);

        Scene scene = new Scene(grid);

        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculate(Double.parseDouble(aText.getText()), Double.parseDouble(bText.getText()), Double.parseDouble(cText.getText()));
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aText.setText("");
                bText.setText("");
                cText.setText("");
            }
        });
    }
    
    private void calculate(double a, double b, double c) {
        boolean complex = false;
        double det = (b * b) - 4 * a * c;
        if(det <= 0)
            complex = true;
        if(complex){
            String result = -b + " + " + Math.sqrt(-det) + "i /\n\t\t" + (2 * a);
            String result2 = -b + " - " + Math.sqrt(-det) + "i /\n\t\t" + (2 * a);
            JOptionPane.showMessageDialog(null, result + "\n" + result2);
        } else {
            String result = (-b + Math.sqrt(det)) / (2 * a) + "";
            String result2 = (-b - Math.sqrt(det)) / (2 * a) + "";

            JOptionPane.showMessageDialog(null, "x = " + result + ", " + result2);

        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
