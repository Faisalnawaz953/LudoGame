/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class HelpFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
        initComponents();
         ImageIcon icon1=new ImageIcon("ludoicon1.png");
        this.setIconImage(icon1.getImage());
        this.setLocation(450, 75);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 860));
        setPreferredSize(new java.awt.Dimension(1150, 860));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1130, 860));
        jPanel1.setPreferredSize(new java.awt.Dimension(1130, 860));
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nLudo is a children's game created in late Victorian times and based upon the ancient Indian game of Pachisi. There are other Western versions of Pachisi such as Parchís from Spain, Parcheesi from the USA and Uckers, a form of Ludo played in the Royal Navy (and apparently some non-British navies) on a Ludo board.  \n\nEquipment\nA Ludo board is is square with a pattern on it in the shape of a cross, each arm being divided into three adjacent columns of eight squares.  The middle squares form the home column for each colour and cannot be landed upon by other colours. The middle of the cross forms a large square which is the 'home' area and which is divided into 4 home triangles, one of each colour. At each corner, separate to the main circuit are coloured circles (or squares) where the pieces are placed to begin.\n\nCounters start their circuit one square in from the end of the arm and adjacent to the starting circle. Avoid modern boards which incorrectly place the first square at the end of the arm.\n\nThe starting square, the starting circle, the home triangle and all the home column squares are coloured to match the corresponding pieces.\n\nEach player chooses one of the 4 colours (green, yellow, red or blue) and places the 4 pieces of that colour in the corresponding starting circle. A single die is thrown to determine movement.\n\n \n\nPlay\nPlayers take turns in a clockwise order; highest throw of the die starts.\n\nEach throw, the player decides which piece to move. A piece simply moves in a clockwise direction around the track given by the number thrown. If no piece can legally move according to the number thrown, play passes to the next player.\n\nA throw of 6 gives another turn.\n\nA player must throw a 6 to move a piece from the starting circle onto the first square on the track. The piece moves 6 squares around the circuit beginning with the appropriately coloured start square (and the player then has another turn).\n\nIf a piece lands on a piece of a different colour, the piece jumped upon is returned to its starting circle.\n\nIf a piece lands upon a piece of the same colour, this forms a block. This block cannot be passed or landed on by any opposing piece.\n\n \n\nWinning\nWhen a piece has circumnavigated the board, it proceeds up the home column. A piece can only be moved onto the home triangle by an exact throw.\n\nThe first person to move all 4 pieces into the home triangle wins.\n\n ");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 950, 670);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\LUDO\\backicon.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(960, 690, 160, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Help");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 40, 150, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PlayFrame obj9=new PlayFrame();
        obj9.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
