package validandonumeros;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Integer numero, validado;
    
    @FXML
    private Button button;

    @FXML
    private TextField cxnumero;

    @FXML
    private Label label;

    @FXML
    private Label label1;

    @FXML
    private TextField cxresult;

    @FXML
    void validar(ActionEvent event) {
numero=Integer.valueOf(cxnumero.getText());
cxresult.setText(VerificaValor(numero));
        
    }

    private String VerificaValor(Integer numero) {
        String valor;
        if (numero >80)
            valor="O numero "+numero+" é MAIOR que 80.";
        else if (numero <25)
            valor="O numero "+numero+" é MENOR que 25.";
        else if (numero == 40)
            valor="O numero "+numero+" é IGUAL que 40.";
        else
            valor="O numero não está entre o parametro determinado.";
        return valor;
    }

}