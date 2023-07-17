import javax.swing.JOptionPane;

public class Currency extends javax.swing.JFrame {

   public Currency() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 130, 227));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the Amount");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To");

        txtamount.setBackground(new java.awt.Color(0, 0, 0));
        txtamount.setForeground(new java.awt.Color(255, 255, 255));
        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        txtfrom.setBackground(new java.awt.Color(0, 0, 0));
        txtfrom.setForeground(new java.awt.Color(255, 255, 255));
        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "USD", "EUR", "GBP", " " }));

        txtto.setBackground(new java.awt.Color(0, 0, 0));
        txtto.setForeground(new java.awt.Color(255, 255, 255));
        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "IndianRupees", "SrilankaRupees" }));

        jButton1.setBackground(new java.awt.Color(0, 193, 101));
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Currency Converter");
        jLabel4.setAlignmentY(1.0F);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
                // diwanroshan143@gmail.com
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtamount)
                            .addComponent(txtfrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtto, 0, 176, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                  // diwanroshan143@gmail.com
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                       

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    Double total;
    Double amount = Double.parseDouble(txtamount.getText());
    
    if(amount<0){
         JOptionPane.showMessageDialog(this,"Negative currency cannot be generated  ");
    }
    if(amount==0){
         JOptionPane.showMessageDialog(this,"Enter any amount to convert");
    }
    
    
    
    if(amount>0){
        
         if(txtfrom.getSelectedItem().toString()== "USD" && txtto.getSelectedItem().toString() == "--SELECT--")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the TO Currency");
    }
         
         if(txtfrom.getSelectedItem().toString()== "EUR" && txtto.getSelectedItem().toString() == "--SELECT--")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the TO Currency");
    }
         
         if(txtfrom.getSelectedItem().toString()== "GBP" && txtto.getSelectedItem().toString() == "--SELECT--")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the TO Currency");
    }
         
         
         
         if(txtfrom.getSelectedItem().toString()== "--SELECT--" && txtto.getSelectedItem().toString() == "SrilankaRupees")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the from Currency");
    }
         
          if(txtfrom.getSelectedItem().toString()== "--SELECT--" && txtto.getSelectedItem().toString() == "IndianRupees")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the from Currency");
    }
        
         if(txtfrom.getSelectedItem().toString()== "--SELECT--" && txtto.getSelectedItem().toString() == "--SELECT--")
    { 
    
    JOptionPane.showMessageDialog(this,"Select the Currency");
    }
        
         if(txtfrom.getSelectedItem().toString()== "USD" && txtto.getSelectedItem().toString() == "IndianRupees")
    { 
    total = amount *82.12;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    if(txtfrom.getSelectedItem().toString()== "USD" && txtto.getSelectedItem().toString() == "SrilankaRupees")
    { 
    total = amount *294.89;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    if(txtfrom.getSelectedItem().toString()== "EUR" && txtto.getSelectedItem().toString() == "IndianRupees")
    { 
    total = amount *88.56;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    if(txtfrom.getSelectedItem().toString()== "EUR" && txtto.getSelectedItem().toString() == "SrilankaRupees")
    { 
    total = amount *317.27;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    if(txtfrom.getSelectedItem().toString()== "GBP" && txtto.getSelectedItem().toString() == "IndianRupees")
    { 
    total = amount *103.16;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    if(txtfrom.getSelectedItem().toString()== "GBP" && txtto.getSelectedItem().toString() == "SrilankaRupees")
    { 
    total = amount *369.50;
    JOptionPane.showMessageDialog(this,"your Amount will be: "+total.toString());
    }
    
    
    }
     
    }                                        

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency().setVisible(true);
            }
        });
    }

                        
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;                   
}
  // diwanroshan143@gmail.com
