public class Calculator extends javax.swing.JFrame {

    double num,ans;
    int calculation;
    
    
    public Calculator() {
        initComponents();
        jRadioButton1.setEnabled(false);
    }
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: ans=num+Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
            case 2: ans=num-Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
            case 3: ans=num*Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
            case 4: ans=num/Double.parseDouble(jTextField1.getText());
            jTextField1.setText(Double.toString(ans));
            break;
            
            
        }
    }
    // diwanroshan143@gmail.com
    
    public void enable(){
    jTextField1.setEnabled(true);
     jRadioButton1.setEnabled(false);
    jRadioButton2.setEnabled(true);
    jButton1.setEnabled(true);
    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    jButton8.setEnabled(true);
    jButton4.setEnabled(true);
    jButton5.setEnabled(true);
    jButton6.setEnabled(true);
    jButton9.setEnabled(true);
    jButton10.setEnabled(true);
    jButton11.setEnabled(true);
    jButton12.setEnabled(true);
    jButton13.setEnabled(true);
    jButton14.setEnabled(true);
    jButton15.setEnabled(true);
    jButton16.setEnabled(true);
    jButton17.setEnabled(true);
    jButton18.setEnabled(true);
    jButton19.setEnabled(true);
   
    
    
    
    
    
    }

    public void disable(){
    jTextField1.setEnabled(false);
    jRadioButton1.setEnabled(true);
    jRadioButton2.setEnabled(false);
    jButton1.setEnabled(false);
    jButton2.setEnabled(false);
    jButton3.setEnabled(false);
    jButton8.setEnabled(false);
    jButton4.setEnabled(false);
    jButton5.setEnabled(false);
    jButton6.setEnabled(false);
    jButton9.setEnabled(false);
    jButton10.setEnabled(false);
    jButton11.setEnabled(false);
    jButton12.setEnabled(false);
    jButton13.setEnabled(false);
    jButton14.setEnabled(false);
    jButton15.setEnabled(false);
    jButton16.setEnabled(false);
    jButton17.setEnabled(false);
    jButton18.setEnabled(false);
    jButton19.setEnabled(false);
    
    
    }
    
    
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); 
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("ON");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
 // diwanroshan143@gmail.com
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); 
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 182, 54));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 182, 54));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 132, 252));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("7");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 132, 252));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 132, 252));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("*");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 132, 252));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("/");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("0");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("8");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
 // diwanroshan143@gmail.com
        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("5");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("2");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText(".");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("9");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("6");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("=");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        num=Double.parseDouble(jTextField1.getText());
         calculation=3;
         jTextField1.setText("");
         jLabel1.setText(num +"*");
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText(jTextField1.getText()+"7");
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        int length= jTextField1.getText().length();
        int number= jTextField1.getText().length() -1;
        String store;
        if(length>0){
            StringBuilder back =new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store=back.toString();
            jTextField1.setText(store);
        }
        
        
        
    }                                        

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       disable();
    }                                             

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
       enable();
    }                                             

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         jTextField1.setText(jTextField1.getText()+"4");
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jTextField1.setText(jTextField1.getText()+"1");
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+"0");
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+"8");
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+"5");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jTextField1.setText(jTextField1.getText()+"2");
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+".");
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+"9");
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         jTextField1.setText(jTextField1.getText()+"6");
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       jTextField1.setText(jTextField1.getText()+"3");
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       arithmetic_operation();
       jLabel1.setText("");
    }                                         

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        num=Double.parseDouble(jTextField1.getText());
         calculation=4;
         jTextField1.setText("");
         jLabel1.setText(num +"/");
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         num=Double.parseDouble(jTextField1.getText());
         calculation=2;
         jTextField1.setText("");
         jLabel1.setText(num +"-");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         num=Double.parseDouble(jTextField1.getText());
         calculation=1;
         jTextField1.setText("");
         jLabel1.setText(num +"+");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
    }                                        

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
   // diwanroshan143@gmail.com             
}