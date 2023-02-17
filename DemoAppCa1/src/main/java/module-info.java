module com.captandat.demoappca1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.captandat.demoappca1 to javafx.fxml;
    exports com.captandat.demoappca1;
}
