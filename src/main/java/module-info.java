module sharetea_pos {
    requires javafx.controls;
    requires javafx.fxml;

    opens sharetea_pos to javafx.fxml;
    exports sharetea_pos;
}
