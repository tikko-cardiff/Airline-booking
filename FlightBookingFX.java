package mock_exam;

import mock_exam.Airline;
import mock_exam.FlightBooking;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import  javafx.stage.Stage;

public class FlightBookingFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField numberEdit = new TextField();
        TextField customerEdit = new TextField();
        TextField flightEdit = new TextField();
        TextField departureEdit = new TextField();
        TextField DurationInMinuteEdit = new TextField();
        TextField priceEdit = new TextField();

        ChoiceBox<Airline> AirlineChoice = new ChoiceBox<>();
        AirlineChoice.getItems().setAll(Airline.values());
        AirlineChoice.setValue(Airline.BRITISH_AIRWAYS);

        Button processBtn = new Button("Process");

        numberEdit.setPrefWidth(120);
        customerEdit.setPrefWidth(120);
        flightEdit.setPrefWidth(120);
        departureEdit.setPrefWidth(120);
        DurationInMinuteEdit.setPrefWidth(120);
        priceEdit.setPrefWidth(120);
        AirlineChoice.setPrefWidth(120);
        processBtn.setPrefWidth(120);

        Label numberLabel = new Label("Customer Number");
        Label customerLabel = new Label("Customer Name");
        Label flightLabel = new Label("Flight");
        Label departureLabel = new Label("Departure");
        Label DurationInMinuteLabel = new Label("Flight Duration");
        Label priceLabel = new Label("Price");
        Label AirlineLabel = new Label("Airline");
        Label btnLabel = new Label("Process");

        numberLabel.setPrefWidth(100);
        customerLabel.setPrefWidth(100);
        flightLabel.setPrefWidth(100);
        departureLabel.setPrefWidth(100);
        DurationInMinuteLabel.setPrefWidth(100);
        priceLabel.setPrefWidth(100);
        AirlineLabel.setPrefWidth(100);
        btnLabel.setPrefWidth(100);
        AirlineLabel.setPrefWidth(100);

        HBox numberBox = new HBox();
        numberBox.setPadding(new Insets(10, 10, 10, 10));
        numberBox.setSpacing(10);
        numberBox.setStyle("-fx-background-color: #ffffff;");
        numberBox.getChildren().addAll  (numberLabel, numberEdit);

        HBox customerBox = new HBox();
        customerBox.setPadding(new Insets(10, 10, 10, 10));
        customerBox.setSpacing(10);
        customerBox.setStyle("-fx-background-color: #ffffff;");
        customerBox.getChildren().addAll(customerLabel, customerEdit);

        HBox flightBox = new HBox();
        flightBox.setPadding(new Insets(10, 10, 10, 10));
        flightBox.setSpacing(10);
        flightBox.setStyle("-fx-background-color: #ffffff;");
        flightBox.getChildren().addAll(flightLabel, flightEdit);
        
        HBox departureBox = new HBox();
        departureBox.setPadding(new Insets(10, 10, 10, 10));
        departureBox.setSpacing(10);
        departureBox.setStyle("-fx-background-color: #ffffff;");
        departureBox.getChildren().addAll(departureLabel, departureEdit);
        
        HBox DurationInMinuteBox = new HBox();
        DurationInMinuteBox.setPadding(new Insets(10, 10, 10, 10));
        DurationInMinuteBox.setSpacing(10);
        DurationInMinuteBox.setStyle("-fx-background-color: #ffffff;");
        DurationInMinuteBox.getChildren().addAll(DurationInMinuteLabel, DurationInMinuteEdit);
        
        HBox priceBox = new HBox();
        priceBox.setPadding(new Insets(10, 10, 10, 10));
        priceBox.setSpacing(10);
        priceBox.setStyle("-fx-background-color: #ffffff;");
        priceBox.getChildren().addAll(priceLabel, priceEdit);

        HBox AirlineBox = new HBox();
        AirlineBox.setPadding(new Insets(10, 10, 10, 10));
        AirlineBox.setSpacing(10);
        AirlineBox.setStyle("-fx-background-color: #ffffff;");
        AirlineBox.getChildren().addAll(AirlineLabel, AirlineChoice);

        HBox btnBox = new HBox();
        btnBox.setPadding(new Insets(10, 10, 10, 10));
        btnBox.setSpacing(10);
        btnBox.setStyle("-fx-background-color: #ffffff;");
        btnBox.getChildren().addAll(btnLabel, processBtn);

        GridPane detailsGrid = new GridPane();
        detailsGrid.add(numberBox, 0, 0);
        detailsGrid.add(customerBox, 0, 1);
        detailsGrid.add(flightBox, 0, 2);
        detailsGrid.add(departureBox, 0, 3);
        detailsGrid.add(DurationInMinuteBox, 0, 4);
        detailsGrid.add(price, 0, 5);
        detailsGrid.add(AirlineBox, 0, 6);
        detailsGrid.add(btnBox, 0, 7);

        processBtn.setOnAction((event) -> {
            
            Airline a = AirlineChoice.getValue();
            String n = numberEdit.getText();
            String c = customerEdit.getText();
            String f = flightEdit.getText();
            DateTime d = departureEdit.getText();
            int di = Integer.parseInt(DurationInMinuteEdit.getText());
            double p = Double.parseDouble(price.getText());
            
            
            // public TestClass(String postcode,  String phone,  String name, Choice choice){

            FlightBooking fb = new FlightBooking(n,c,a,f,d,di,p);
            System.out.println(fb.toString());
            
        });

        StackPane root = new StackPane();
        root.getChildren().add(detailsGrid);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Details");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}