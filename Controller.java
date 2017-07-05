  package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameSpace;
    @FXML
    private Button siemaaButton;
    @FXML
    private Button naraaButton;
    @FXML
    private CheckBox clearingBox;

    @FXML
    public void initialize(){
        siemaaButton.setDisable(true);
        naraaButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if (e.getSource().equals(siemaaButton)){
            System.out.println("Siemaa " + nameSpace.getText() + "!");
        }
        else if (e.getSource().equals(naraaButton)){
            System.out.println("Naraa " + nameSpace.getText() + "!");
        }
        if(clearingBox.isSelected()){
            nameSpace.clear();
        }
    }

    @FXML
    public void handleKeyReleased(){
        String tekst = nameSpace.getText();
        boolean disabbleButtons = tekst.isEmpty() || tekst.trim().isEmpty();
        siemaaButton.setDisable(disabbleButtons);
        naraaButton.setDisable(disabbleButtons);
    }

    @FXML
    public void boxChecked(){
        System.out.println("Checbox selected");
    }


}
