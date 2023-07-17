import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEditor extends JFrame implements ActionListener {
	JTextArea TextArea;
	JScrollPane ScrollPane;
	JMenuBar menubar;
	JMenu menu1;
	JMenu menu2;
	JMenu menu3;
	JMenuItem newfile;
	JMenuItem open;
	JMenuItem save;
	JMenuItem print;
	JMenuItem exit;
	JMenuItem one;
	JMenuItem Two;
	JMenuItem Three;
	JMenuItem Four;
	JMenuItem Help;

	public TextEditor(){
		TextArea = new JTextArea();
		TextArea.setWrapStyleWord(true);
		TextArea.setLineWrap(true);
		TextArea.setFont(new Font("Segoe UI Semilight",Font.PLAIN,25));
		
		ScrollPane = new JScrollPane(TextArea);
		ScrollPane.setPreferredSize(new Dimension(700,700));
		ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		menubar.setBorderPainted(true);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		menubar.setBorder(border);
		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		menu3 = new JMenu("Help");

		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		newfile = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		print = new JMenuItem("Print");
		exit = new JMenuItem("Exit");
		one = new JMenuItem("Select all");
		Two = new JMenuItem("Cut");
		Three = new JMenuItem("Copy");
		Four = new JMenuItem("Paste");
		Help = new JMenuItem("Help");
		
		
		
		menu1.add(newfile);
		menu1.add(open);
		menu1.add(save);
		menu1.add(print);
		menu1.add(exit);
		menu2.add(one);  
		menu2.add(Two);
		menu2.add(Three);
		menu2.add(Four);
		menu3.add(Help);
		
		
		newfile.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);
		one.addActionListener(this);
		Two.addActionListener(this);
		Three.addActionListener(this);
		Four.addActionListener(this);
		Help.addActionListener(this);
		
       
        add(ScrollPane);
		setTitle("Text Editor");
		setVisible(true);
		setSize(500,500);
        setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextEditor();
	}
	// diwanroshan143@gmail.com
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()== newfile)
		{
			TextArea.setText("");
		}

		if(e.getSource()==open) 
		{
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
			fileChooser.setFileFilter(filter);
			
			int response = fileChooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File File=new File(fileChooser.getSelectedFile().getAbsolutePath());
			    Scanner fileIn = null;
			 
			 try 
			 {
			  fileIn = new Scanner(File);
			  if(File.isFile()) {
				while(fileIn.hasNextLine()) {
				String line = fileIn.nextLine()+"\n";
				TextArea.append(line);
			   }
			  }
			 }
			 catch (FileNotFoundException e1) 
			 {
			  e1.printStackTrace();
			 }
			}
			 
		}
		   
		if(e.getSource()==save) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("."));
			
		    int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
			 File file;
			 PrintWriter fileOut = null;
			 
			 file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			 try {
			  fileOut = new PrintWriter(file);
			  fileOut.println(TextArea.getText());
			 } 
			 catch (FileNotFoundException e1) {
				e1.printStackTrace();
			 }
			 finally{
				fileOut.close();
			 }
			}
		   
		
		}
		if(e.getSource()==print)
		{
			try {
				TextArea.print();}
			catch(Exception except) {
				System.out.println("OOPS! something went wrong");}
		}
		
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		
		if(e.getSource()==one)
		{
			TextArea.selectAll();
		}
		
		if(e.getSource()==Two)
		{
			TextArea.cut();
		}
		
		if(e.getSource()==Three)
		{
			TextArea.copy();
		}
		
		if(e.getSource()==Four)
		{
			TextArea.paste();
		}
		
        if(e.getSource()==Help)
		{
            JOptionPane.showMessageDialog(this,"SORRY, THE SERVICE IS TEMPORARILY NOT AVAILABLE");

		}

		
	
	// diwanroshan143@gmail.com	
	}
}
