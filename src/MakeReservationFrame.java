import javax.swing.*;
import java.util.ArrayList;

public class MakeReservationFrame extends javax.swing.JFrame {


   
    public MakeReservationFrame() {
        initComponents();
         updateRoomList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblRoomNumber = new javax.swing.JLabel();
        lblGuestName = new javax.swing.JLabel();
        lblCheckInDate = new javax.swing.JLabel();
        lblCheckOutDate = new javax.swing.JLabel();
        txtGuestName = new javax.swing.JTextField();
        txtCheckInDate = new javax.swing.JTextField();
        txtCheckOutDate = new javax.swing.JTextField();
        btnMakeReservation = new javax.swing.JButton();
        btnReturnMainMenu = new javax.swing.JButton();
        cmbRoomNumber = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRoomNumber.setText("Room Number:");
        lblRoomNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblGuestName.setText("Guest Name :");
        lblGuestName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblCheckInDate.setText("Check-in Date MM-DD-YYYY :");
        lblCheckInDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblCheckOutDate.setText("Check-out Date MM-DD-YYYY :");
        lblCheckOutDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnMakeReservation.setText("Make a Reservation");
        btnMakeReservation.setBorder(new javax.swing.border.MatteBorder(null));
        btnMakeReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeReservationActionPerformed(evt);
            }
        });

        btnReturnMainMenu.setText("Return to Main Menu");
        btnReturnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMainMenuActionPerformed(evt);
            }
        });

        cmbRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGuestName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCheckInDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCheckOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMakeReservation)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(btnReturnMainMenu)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGuestName)
                            .addComponent(txtCheckInDate)
                            .addComponent(txtCheckOutDate)
                            .addComponent(cmbRoomNumber, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(cmbRoomNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCheckOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCheckOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMakeReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturnMainMenu))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMakeReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeReservationActionPerformed
       String guestName = txtGuestName.getText().trim();
        String checkInDate = txtCheckInDate.getText().trim();
        String checkOutDate = txtCheckOutDate.getText().trim();
        String roomNumberStr = (String) cmbRoomNumber.getSelectedItem();

        if (guestName.isEmpty() || checkInDate.isEmpty() || checkOutDate.isEmpty() || roomNumberStr == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidDateFormat(checkInDate) || !isValidDateFormat(checkOutDate)) {
            JOptionPane.showMessageDialog(this, "Please enter dates in MM-DD-YYYY format.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int roomNumber = Integer.parseInt(roomNumberStr.split(" ")[1]);
        boolean reservationMade = FinalRequirement.makeReservation(roomNumber, guestName, checkInDate, checkOutDate);
        if (reservationMade) {
            JOptionPane.showMessageDialog(this, "Reservation successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            updateRoomList();
        } else {
            JOptionPane.showMessageDialog(this, "Room " + roomNumber + " is not available.", "Reservation Error", JOptionPane.ERROR_MESSAGE);
        
        }
    
    }//GEN-LAST:event_btnMakeReservationActionPerformed

    private void btnReturnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMainMenuActionPerformed
        // TODO add your handling code here:
         MainMenuFrame mainMenu = new MainMenuFrame();
        mainMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnMainMenuActionPerformed

      private String[] getAvailableRooms() {
        // Generate list of available rooms
        ArrayList<String> availableRooms = new ArrayList<>();
        for (int i = 0; i < FinalRequirement.numRooms; i++) {
            if (FinalRequirement.Availroom[i]) {
                availableRooms.add("Room " + (i + 1));
            }
        }
        return availableRooms.toArray(new String[0]);
    }

    private void updateRoomList() {
        // Update combo box with current available rooms
        cmbRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(getAvailableRooms()));
        cmbRoomNumber.setSelectedIndex(-1);
    }

    private boolean isValidDateFormat(String date) {
        // Regular expression for MM-DD-YYYY format
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    
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
            java.util.logging.Logger.getLogger(MakeReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeReservationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMakeReservation;
    private javax.swing.JButton btnReturnMainMenu;
    private javax.swing.JComboBox<String> cmbRoomNumber;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel lblCheckInDate;
    private javax.swing.JLabel lblCheckOutDate;
    private javax.swing.JLabel lblGuestName;
    private javax.swing.JLabel lblRoomNumber;
    private javax.swing.JTextField txtCheckInDate;
    private javax.swing.JTextField txtCheckOutDate;
    private javax.swing.JTextField txtGuestName;
    // End of variables declaration//GEN-END:variables

  
    }
