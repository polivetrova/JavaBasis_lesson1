package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button sendButton;

    @FXML
    public TextField enterText;

    @FXML
    public TextArea chatArea;

    private String text = "";

    public void sendMessage() {
        text += enterText.getText() + "\n";
        chatArea.setText(text);
        enterText.setText(" ");
    }

    public void deleteText() {
        enterText.setText("");
    }
}
