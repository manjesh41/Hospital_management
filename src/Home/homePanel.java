package Home;

public class homePanel extends javax.swing.JFrame {

    /**
     * Creates new form homePanel
     */
    public homePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menuBar = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        panelFirst = new javax.swing.JPanel();
        panelSecond = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSpecialist = new javax.swing.JButton();
        btnDoctorDetails = new javax.swing.JButton();
        BtnScheduleAppointment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        menuBar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menuBar.setLabel("setting\n");
        menuBar1.add(menuBar);

        menu2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        menu2.setLabel("setting\n");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Panel");

        panelFirst.setBackground(new java.awt.Color(0, 153, 153));

        panelSecond.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ABC Hospital");


        //logoutbutten
        BtnLogout.setBackground(new java.awt.Color(204, 0, 0));
        BtnLogout.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        BtnLogout.setText("LOG-Out");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSecondLayout = new javax.swing.GroupLayout(panelSecond);
        panelSecond.setLayout(panelSecondLayout);
        panelSecondLayout.setHorizontalGroup(
                panelSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSecondLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(BtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSecondLayout.setVerticalGroup(
                panelSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSecondLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(panelSecondLayout.createSequentialGroup()
                                .addComponent(BtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital-256.png"))); // NOI18N


        //button specialist
        btnSpecialist.setBackground(new java.awt.Color(255, 102, 102));
        btnSpecialist.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSpecialist.setText("Specialist");
        btnSpecialist.setAutoscrolls(true);
        btnSpecialist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnSpecialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecialistActionPerformed(evt);
            }
        });
   //doctor details button
        btnDoctorDetails.setBackground(new java.awt.Color(153, 255, 153));
        btnDoctorDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnDoctorDetails.setText("Doctor Details");
        btnDoctorDetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnDoctorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorDetailsActionPerformed(evt);
            }
        });

        //schedule appointment button

        BtnScheduleAppointment.setBackground(new java.awt.Color(102, 102, 255));
        BtnScheduleAppointment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BtnScheduleAppointment.setText("Schedule Appointment");

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Find your doctor here!!");


        //first panel

        javax.swing.GroupLayout panelFirstLayout = new javax.swing.GroupLayout(panelFirst);
        panelFirst.setLayout(panelFirstLayout);
        panelFirstLayout.setHorizontalGroup(
                panelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFirstLayout.createSequentialGroup()
                                .addContainerGap(99, Short.MAX_VALUE)
                                .addComponent(btnSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoctorDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                        .addGroup(panelFirstLayout.createSequentialGroup()
                                .addGroup(panelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(BtnScheduleAppointment)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFirstLayout.setVerticalGroup(
                panelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFirstLayout.createSequentialGroup()
                                .addGroup(panelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(btnSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                .addComponent(panelSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(jLabel2))
                                                        .addGroup(panelFirstLayout.createSequentialGroup()
                                                                .addGap(122, 122, 122)
                                                                .addComponent(btnDoctorDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(BtnScheduleAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 11, Short.MAX_VALUE)
                                .addComponent(panelFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>


    //button specaialist action performer
    private void btnSpecialistActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    //button docotrdeatils action performer
    private void btnDoctorDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnScheduleAppointment;
    private javax.swing.JButton btnDoctorDetails;
    private javax.swing.JButton btnSpecialist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menuBar;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel panelFirst;
    private javax.swing.JPanel panelSecond;
    // End of declare
}
