module com.example.scenebuilderdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.scenebuilderdemo to javafx.fxml;
    exports com.example.scenebuilderdemo;
}