module com.mycompany.countryflags {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.countryflags to javafx.fxml;
    exports com.mycompany.countryflags;
}
