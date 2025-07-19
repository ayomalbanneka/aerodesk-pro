package com.adp.customRenderComponent;

import com.adp.constant.Colors;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Frame;
import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ActionButtonRender {

    public void actionButton(TableColumn actionColumn, JTable actionTable, String modelType, Frame parentFrame) {

        actionColumn.setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton btn = new JButton();
            btn.setIcon(new FlatSVGIcon("com\\adp\\recources\\icons\\Edit.svg", 25, 25));
            btn.setForeground(Color.WHITE);
            btn.setBackground(Colors.PRIMARAY);
            btn.setBorder(null);
            btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btn.setFocusPainted(false);
            return btn;
        });

        actionColumn.setCellEditor(new DefaultCellEditor(new JCheckBox()) {
            private final JButton button = new JButton();

            {
                button.setIcon(new FlatSVGIcon("com\\adp\\recources\\icons\\Edit.svg", 25, 25));
                button.setForeground(Color.WHITE);
                button.setBackground(Colors.PRIMARAY);
                button.setBorder(null);
                button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                button.setFocusPainted(false);

                button.addActionListener((ActionEvent e) -> {

                    System.out.println("Hello world");
                    System.out.println(actionTable.getSelectedRow());

                    fireEditingStopped();
                });
            }

            @Override
            public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
                return button;
            }
        });
    }
}
