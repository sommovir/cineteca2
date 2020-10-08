/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca.gui.mr;


import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import videoteca.entities.Regista;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class RegistaTableRenderer extends DefaultTableCellRenderer {

//    private Icon star = new ImageIcon(getClass().getResource("/it/cnr/istc/sponsor/tt/gui/icons/star16.png"));
//    private Icon notestar = new ImageIcon(getClass().getResource("/it/cnr/istc/sponsor/tt/gui/icons/notestar.png"));
//    private Icon note = new ImageIcon(getClass().getResource("/it/cnr/istc/sponsor/tt/gui/icons/note16.png"));

    private boolean pm = false;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        TableModel model = table.getModel();
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        if (value != null && value instanceof Regista) {
            
            ((JLabel)c).setText(((Regista)value).getNome());
        }
        return c;
    }
}
