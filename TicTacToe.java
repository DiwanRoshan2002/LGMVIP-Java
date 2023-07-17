import javax.swing.JOptionPane;

public class TicTacToe extends javax.swing.JFrame {
    int turn =2;
    int  buttonused[]={0,0,0,0,0,0,0,0,0};
    int pXwon[]={0,0,0,0,0,0,0,0,0};
    int pOwon[]={0,0,0,0,0,0,0,0,0};
    
    int pXwon()
    {
        if(pXwon[0]==1 && pXwon[1]==1 && pXwon[2]==1){
            return 1;
        }
        if(pXwon[3]==1 && pXwon[4]==1 && pXwon[5]==1){
            return 1;
        }
        if(pXwon[6]==1 && pXwon[7]==1 && pXwon[8]==1){
            return 1;
        }
        if(pXwon[0]==1 && pXwon[3]==1 && pXwon[6]==1){
            return 1;
        }
        if(pXwon[1]==1 && pXwon[4]==1 && pXwon[7]==1){
            return 1;
        }if(pXwon[2]==1 && pXwon[5]==1 && pXwon[8]==1){
            return 1;
        }
        if(pXwon[2]==1 && pXwon[4]==1 && pXwon[6]==1){
            return 1;
        }
        if(pXwon[0]==1 && pXwon[4]==1 && pXwon[8]==1){
            return 1;
        }
        return 0;
    }
    
    
    
    
    int pOwon()
    {
        if(pOwon[0]==1 && pOwon[1]==1 && pOwon[2]==1){
            return 1;
        }
        if(pOwon[3]==1 && pOwon[4]==1 && pOwon[5]==1){
            return 1;
        }
        if(pOwon[6]==1 && pOwon[7]==1 && pOwon[8]==1){
            return 1;
        }
        if(pOwon[0]==1 && pOwon[3]==1 && pOwon[6]==1){
            return 1;
        }
        if(pOwon[1]==1 && pOwon[4]==1 && pOwon[7]==1){
            return 1;
        }if(pOwon[2]==1 && pOwon[5]==1 && pOwon[8]==1){
            return 1;
        }
        if(pOwon[2]==1 && pOwon[4]==1 && pOwon[6]==1){
            return 1;
        }
        if(pOwon[0]==1 && pOwon[4]==1 && pOwon[8]==1){
            return 1;
        }
        return 0;
    }
    
    
// diwanroshan143@gmail.com
    
    public TicTacToe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jb6 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jb6.setBackground(new java.awt.Color(221, 101, 33));
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(221, 101, 33));
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(221, 101, 33));
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(221, 101, 33));
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(221, 101, 33));
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(221, 101, 33));
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(221, 101, 33));
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(221, 101, 33));
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(221, 101, 33));
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 186, 71));
        reset.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); 
        reset.setForeground(new java.awt.Color(51, 0, 51));
        reset.setText("PlayAgain");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 3, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tic Tac Toe");
        jLabel4.setAlignmentY(1.0F);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb7, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                // diwanroshan143@gmail.com
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                       

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {                                    
    if(buttonused[0]==0){
    if(turn%2==0){
    turn++;
    jb0.setText("X");
    buttonused[0]=1;
    pXwon[0]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb0.setText("O");
    buttonused[0]=1;
    pOwon[0]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }
    }                                   

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
if(buttonused[1]==0){
    if(turn%2==0){
    turn++;
    jb1.setText("X");
    buttonused[1]=1;
    pXwon[1]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    // diwanroshan143@gmail.com
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb1.setText("O");
    buttonused[1]=1;
    pOwon[1]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }        
    }                                   

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[2]==0){
    if(turn%2==0){
    turn++;
    jb2.setText("X");
    buttonused[2]=1;
    pXwon[2]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb2.setText("O");
    buttonused[1]=1;
    pOwon[1]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }        
   
    }                                   

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[3]==0){
    if(turn%2==0){
    turn++;
    jb3.setText("X");
    buttonused[3]=1;
    pXwon[3]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
// diwanroshan143@gmail.com
    }
    else{
    turn++;
    jb3.setText("O");
    buttonused[3]=1;
    pOwon[3]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }  
    }                                   

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        
        if(buttonused[4]==0){
    if(turn%2==0){
    turn++;
    jb4.setText("X");
    buttonused[4]=1;
    pXwon[4]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb4.setText("O");
    buttonused[4]=1;
    pOwon[4]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }    
        
    }                                   

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[5]==0){
    if(turn%2==0){
    turn++;
    jb5.setText("X");
    buttonused[5]=1;
    pXwon[5]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb5.setText("O");
    buttonused[5]=1;
    pOwon[5]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    // diwanroshan143@gmail.com
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }        
        
    }                                   

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[6]==0){
    if(turn%2==0){
    turn++;
    jb6.setText("X");
    buttonused[6]=1;
    pXwon[6]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb6.setText("O");
    buttonused[6]=1;
    pOwon[6]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }   
        
    }                                   

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[7]==0){
    if(turn%2==0){
    turn++;
    jb7.setText("X");
    buttonused[7]=1;
    pXwon[7]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb7.setText("O");
    buttonused[7]=1;
    pOwon[7]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }        
        
    }                                   

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(buttonused[8]==0){
    if(turn%2==0){
    turn++;
    jb8.setText("X");
    buttonused[8]=1;
    pXwon[8]=1;
    // diwanroshan143@gmail.com
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    else{
    turn++;
    jb8.setText("O");
    buttonused[8]=1;
    pOwon[8]=1;
    
    int result1=pXwon();
    int result2=pOwon();
    
    if(result1==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER X WON");
    }
    else if(result2==1){
    JOptionPane.showMessageDialog(rootPane,"PLAYER O WON");
    }
    
    }
    }else{
        JOptionPane.showMessageDialog(rootPane, "TRY ANOTHER ONE IT IS ALREADY USED");
    }        
        
    }                                   

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jb0.setText("");
        jb1.setText("");
        jb2.setText("");
        jb3.setText("");
        jb4.setText("");
        jb5.setText("");
        jb6.setText("");
        jb7.setText("");
        jb8.setText("");
        
        turn=2;
        for(int i=0;i<9;i++)
        {
            buttonused[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            pXwon[i]=0;
        }
        for(int i=0;i<9;i++)
        {
            pOwon[i]=0;
        }
        
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton reset;                  
}