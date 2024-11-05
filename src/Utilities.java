
import java.awt.event.FocusEvent;
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

    private boolean silent = false;

    public Utilities(boolean silent) {
        this.silent = silent;
    }

    public void clearSaatFocus(FocusEvent evt) {
        var source = evt.getSource();
        if (source instanceof JTextField) {
            ((JTextField) source).setText("");
        }
    }

    public boolean validasiTidakKosong(JTextField textField, String nama) {
        if (textField.getText().isEmpty()) {
            this.showErrorDialog("inputan nilai " + nama + " tidak boleh kosong!");
            return true;
        }

        return false;
    }

    public boolean validasiTidakNull(JComboBox combobox, String nama) {
        var idx = combobox.getSelectedIndex();
        if (idx == -1 || idx > (combobox.getModel().getSize() - 1)) {
            this.showErrorDialog("inputan pilihan " + nama + " belum dipilih!");
            return true;
        }

        return false;
    }

    public boolean validasiInputHanyaAngka(KeyEvent event) {
        char c = event.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            this.showErrorDialog("inputan ini hanya boleh input angka!");
            event.consume();
            return true;
        }

        return false;
    }

    public void showErrorDialog(String pesan) {
        if (!this.silent) {
            JOptionPane.showMessageDialog(null, pesan, "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
