module com.finals.myfinalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.finals.myfinalproject to javafx.fxml;
    exports com.finals.myfinalproject;
}