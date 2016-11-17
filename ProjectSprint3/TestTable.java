package DIT215H16_Team01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
 
public class TestTable extends JPanel {
  
    public TestTable(SearchQuery query) {
        super(new GridLayout(1,0));
        //////photo to be added  /////
        
        JTable table = new JTable();
        FillTable(table, query.getQuery());
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        table.setShowGrid(false);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        
 
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    /*private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Trailer Park");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Table newContentPane = new Table();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }*/
 
   /* public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }*/
    
	public void FillTable(JTable table, String Query) {
		String[] columnNames = {"Id",
                "Title",
                "Length",
                "Director"};
		

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setColumnIdentifiers(columnNames);
		
		    try
		    {
		    	Connection conn = (Connection) DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
		    
		        Statement stat = (Statement) conn.createStatement();
				
		        ResultSet rs = stat.executeQuery(Query);

		        //To remove previously added rows
		        while(table.getRowCount() > 0) 
		        {
		            ((DefaultTableModel) table.getModel()).removeRow(0);
		        }
		        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		        int columns = rsmd.getColumnCount();
		        while(rs.next())
		        {  
		            Object[] row = new Object[columns];
		            for (int i = 0; i < columns; i++)
		            {  
		                row[i] = rs.getObject(i+1);
		                
		            }
		          
		            model.addRow(row);
		            
		        }
		        table.setModel(model);
		        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		            @Override
		            public void valueChanged(ListSelectionEvent event) {
		                if (table.getSelectedRow() > -1) {
		                    // print first column value from selected row
		                    FirstPage.workPage.getInternalFrame().setContentPane(new MovieInfo(table.getValueAt(table.getSelectedRow(), 1).toString()));
		                    
		                    FirstPage.workPage.setVisible(true);
		                    
		                    
		                }
		            }
		        });
		        rs.close();
		        stat.close();
		        conn.close();
		    }
		    catch ( Exception ex ) {
				ex.printStackTrace() ;
		    {
    		    	
    		    }
		
    		    }
    	}
   
}

/*
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
 
public class Table extends JPanel {
  
    public Table() {
        super(new GridLayout(1,0));
        //////photo to be added  /////
 
        
        Scanner input = new Scanner(System.in) ;
    	String title = input.next() ;
        JTable table = new JTable();
        FillTable(table, "SELECT * FROM `TrailerPark` WHERE title REGEXP '[[:<:]]" + title + "[[:>:]]'");
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        table.setShowGrid(false);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
    }
 
    *//**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     *//*
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Table newContentPane = new Table();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
	public void FillTable(JTable table, String Query) {
		String[] columnNames = {"Picture",
                "Title",
                "Year",
                "Rating"};

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setColumnIdentifiers(columnNames);
		
		    try
		    {
		    	Connection conn = (Connection) DriverManager.getConnection( "jdbc:mysql://leia.skip.chalmers.se:3306/team_01", "team_01", "yOZGjlGknjwdiG4B" ) ;
		    
		        Statement stat = (Statement) conn.createStatement();
				
		        ResultSet rs = stat.executeQuery(Query);

		        //To remove previously added rows
		        while(table.getRowCount() > 0) 
		        {
		            ((DefaultTableModel) table.getModel()).removeRow(0);
		        }
		        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		        int columns = rsmd.getColumnCount();
		        while(rs.next())
		        {  
		            Object[] row = new Object[columns];
		            for (int i = 0; i < columns; i++)
		            {  
		                row[i] = rs.getObject(i+1);
		            }
		           // ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
		            model.addRow(row);
		        }
		        table.setModel(model);
		        rs.close();
		        stat.close();
		        conn.close();
		    }
		    catch ( Exception ex ) {
				ex.printStackTrace() ;
		    {
    		    	
    		    }
    		    }
    	}
   
}*/