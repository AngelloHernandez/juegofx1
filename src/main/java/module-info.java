module com.g02.juegofx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.g02.juegofx1 to javafx.fxml;
    exports com.g02.juegofx1;
}
