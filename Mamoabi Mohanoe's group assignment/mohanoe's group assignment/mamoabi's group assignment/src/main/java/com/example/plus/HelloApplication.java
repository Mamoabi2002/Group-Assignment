package com.example.plus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.paint.Color.WHITE;

public class HelloApplication extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        Image img1 = new Image("download.jpg");
        Image img2 = new Image("church.jpg");
        Image img3 = new Image("tom.jpg");

        ImageView a = new ImageView(img1);
        ImageView b = new ImageView(img2);
        ImageView c = new ImageView(img3);

        Label label = new Label("Home");
        Label label1 = new Label("Video Catagory!");
        label.setTextFill(WHITE);
        label.setFont(Font.font(36));
        label1.setTextFill(WHITE);
        label1.setFont(Font.font(36));
        a.setFitHeight(60);
        a.setPreserveRatio(true);
        b.setFitHeight(70);
        b.setPreserveRatio(true);
        c.setFitHeight(70);
        c.setPreserveRatio(true);

        Button button = new Button();
        button.setGraphic(a);
        button.setGraphic(b);
        button.setGraphic(c);

        BorderPane root = new BorderPane();
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        ImageView imageView = new ImageView();
        imageView.setFitWidth(600);
        imageView.setFitHeight(600);
        imageView.setPreserveRatio(true);
        root.setCenter(imageView);

        HBox vBox = new HBox();
        HBox box=new HBox();
        vBox.setSpacing(15);

        root.setTop(vBox);
        root.setCenter(imageView);
        root.setPadding(new Insets(50));



        Button o = new Button("a");
        Button t = new Button("b");
        Button ree = new Button("c");

        o.setPrefSize(150, 80);
        t.setPrefSize(100, 1000);
        ree.setPrefSize(80, 80);

        o.setTranslateX(240);
        o.setTranslateY(25);
        t.setTranslateX(240);
        t.setTranslateY(25);
        ree.setTranslateX(225);
        ree.setTranslateY(25);


        a.setOnMouseClicked((event) -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            try {
                Scene scene = new Scene(fxmlLoader.load(), 800, 600);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        b.setOnMouseClicked((event) -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("romance.fxml"));
            try {
                Scene scene = new Scene(fxmlLoader.load(), 800, 600);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        c.setOnMouseClicked((event) -> {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("comedy.fxml"));
            try {
                Scene scene = new Scene(fxmlLoader.load(), 800, 600);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        vBox.getChildren().addAll(label,a,b,c,label1);
        Scene scene = new Scene(root, 800, 200);
        stage.setTitle("Group assignment(Video Catagories!) ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}