module App {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires javafx.swing;
    requires opencv;
    requires com.jfoenix;
    opens App to javafx.fxml;
    exports App;
}