module com.champlain.oop2test1f23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.champlain.oop2test1f23 to javafx.fxml;
    exports com.champlain.oop2test1f23;
}