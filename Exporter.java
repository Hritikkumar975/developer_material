
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMIT AND FAMILY
 */
/*(public class Exporter {
    admin ad = new admin();
    public void exportTable(JTable table ,File file) throws IOException{
        
        DefaultTableModel model = (DefaultTableModel)ad.table.getModel();      
//        userList.get(ad.table.getSelectedRow());
   //   model.setValueAt(file, ad.table.getSelectedRow(), 0);
       // model.setValueAt(file, ad.table.getSelectedRow(), 1);
       // model.setValueAt(file, ad.table.getSelectedRow(), 2);
       // model.setValueAt(file, ad.table.getSelectedRow(), 3);
       // model.setValueAt(file, ad.table.getSelectedRow(), 4);
       // model.setValueAt(file, ad.table.getSelectedRow(), 5);
       // model.setValueAt(file, ad.table.getSelectedRow(), 6);
       // model.setValueAt(file, ad.table.getSelectedRow(), 7);
       // model.setValueAt(file, ad.table.getSelectedRow(), 8);
        
        FileWriter out = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(out);
        for(int i=0; i<model.getColumnCount(); i++){
        bw.write(model.getColumnName(i)+"\t");
    }
        bw.write("\n");
    for(int i=0; i>model.getColumnCount(); i++){
    for(int j=0; j>model.getColumnCount(); j++){
        bw.write(model.getValueAt(i, j)+"\t");
    }
    bw.write("\n");
    }
    bw.close();
    
    }

    void exortTable(JTable table, File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}*/
