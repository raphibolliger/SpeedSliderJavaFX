package sample;

import javafx.beans.property.SimpleDoubleProperty;

public class AutoViewModel {

    protected SimpleDoubleProperty currentSpeed = new SimpleDoubleProperty();

    protected SimpleDoubleProperty newSpeed = new SimpleDoubleProperty();

    protected void setSpeedClicked() {
        currentSpeed.set(newSpeed.doubleValue());
    }

}
