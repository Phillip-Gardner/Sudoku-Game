module com.phillipgardner.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.phillipgardner.sudokugame to javafx.fxml;
    exports com.phillipgardner.sudokugame;
}