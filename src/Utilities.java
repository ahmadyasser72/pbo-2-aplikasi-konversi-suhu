
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author x
 */
public class Utilities {

    public static boolean validasiTidakKosong(JTextField textField, String nama) {
        if (textField.getText().isEmpty()) {
            Utilities.showErrorDialog("inputan nilai " + nama + " tidak boleh kosong!");
            return true;
        }

        return false;
    }
    
    public static boolean validasiTidakNull(JComboBox combobox, String nama) {
        var idx = combobox.getSelectedIndex();
        if (idx == -1 || idx > (combobox.getModel().getSize() - 1)) {
            Utilities.showErrorDialog("inputan pilihan " + nama + " belum dipilih!");
            return true;
        }
        
        return false;
    }

    public static boolean validasiInputHanyaAngka(KeyEvent event) {
        char c = event.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            Utilities.showErrorDialog("inputan ini hanya boleh input angka!");
            event.consume();
            return true;
        }

        return false;
    }

    static void showErrorDialog(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "error", JOptionPane.ERROR_MESSAGE);
    }
}
