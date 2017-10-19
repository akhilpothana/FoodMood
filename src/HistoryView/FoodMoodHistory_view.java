/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistoryView;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Akhil
 */
public class FoodMoodHistory_view extends JFrame
{
    
    private JTable historyTable;
    private TableModel tableModel;
            
    public FoodMoodHistory_view(TableModel t)
    {
        tableModel = t;
        initTable();
    }
    
    private void initTable()
    {
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
        Object columnNames[] = { "Food", "How you felt", "Misc" };
        JTable table = new JTable(rowData, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);
        this.setSize(300, 150);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        System.out.println("Testing the FoodMoodHistory_view class by displaying a sample table");

    }
    
    /**
     * The method returns the values for food and mood
     * @param fd - received list of foods
     * @return fd 
     */
    public ArrayList<String> displayFood(ArrayList<String> fd)
    {
        return fd;
    }
    
    /**
     * 
     * @param md - received list of moods
     * @return md
     */
    public ArrayList<String> displayMood(ArrayList<String> md)
    {
        return md;
    }
}
