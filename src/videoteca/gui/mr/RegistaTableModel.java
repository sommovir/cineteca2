/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca.gui.mr;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import videoteca.abstracts.AbstractLCTableModel;
import videoteca.entities.Regista;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class RegistaTableModel extends AbstractLCTableModel<Regista> {

    public RegistaTableModel() {
        super(new String[]{"Regista"}, null);
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (this.datas.isEmpty()) {
            return null;
        }
        Regista pa = this.datas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pa.getNome();
           
            default:
                return 0;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 10) {
            return true;
        }
        return super.isCellEditable(row, col); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        
        if (col == 10) {
//            System.out.println("VALUE -> " + value);
//            ParsedAccount pa = this.datas.get(row);
//            Account a = pa.getAccount();
//            pa.setSleeping((Boolean) value);
//            a.setSleeping((Boolean) value);
//            if (((Boolean) value)) {
//                TrainerManager.getInstance().getDormientsIds().add(a.getId());
//                GuiEventManager.getInstance().newDormient(a.getId());
//            } else {
//                TrainerManager.getInstance().getDormientsIds().remove(a.getId());
//                GuiEventManager.getInstance().dormientWokeup(a.getId());
//            }
//            MQTTClient.getInstance().setSleeping(a, ((Boolean) value));
        }
    }



    @Override
    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }

    @Override
    public void addRowElement(Regista element) {
        super.addRowElement(element); //To change body of generated methods, choose Tools | Templates.   
    }

    public Regista getRegistaByRow(int row) {
        Regista pa = this.datas.get(row);
//        Person personByID = TrainerManager.getInstance().getPersonByID(pa.getAccount().getId());
        return pa;
    }




    public void deleteUser(Long id) {
        int i = 0;
        for (Regista data : datas) {
            if (data.getId().equals(id)) {
                this.removeRowElement(i);
                break;
            }
            i++;
        }
    }

    public void update() {
        fireTableDataChanged();
    }
}
