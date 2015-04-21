package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

public class AutoView extends AutoViewModel {

    @FXML
    private Slider speedSlider;

    @FXML
    private TextField currentSpeed;

    @FXML
    private TextField newSpeed;

    @FXML
    private Button setSpeed;

    public void initialize() {
        speedSlider.valueProperty().bindBidirectional(super.newSpeed);
        newSpeed.textProperty().bindBidirectional(super.newSpeed, new NumberStringConverter());
        currentSpeed.textProperty().bindBidirectional(super.currentSpeed, new NumberStringConverter());
    }

    @Override
    @FXML
    protected void setSpeedClicked() {
        super.setSpeedClicked();
    }

}
