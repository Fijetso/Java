/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SofiaJetson
 */
public class FrameInput extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
        private final int CONTENTPANE_WIDTH = 1000;
        private final int CONTENTPANE_HEIGHT = 400;
	private JPanel contentPane;
	private JTextField spNum;
	private JTextField[] txtArrays;
	private JLabel[] lbArrays;
	private int[] arrays;
	private JButton btnOK;
        private int numberElement;
        
    public void setNumberElement(int numberElement){
        this.numberElement = numberElement;
    }
    /**
     * Creates new form FrameInput
     */
    public FrameInput() {
        initComponents();
        contentPane = new JPanel();
        contentPane.setBackground(new java.awt.Color(225,225,225));
        contentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 5, true));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        ///Title label
        JLabel jLabel1 = new JLabel("Nhập mảng");
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/donut.png"))); // NOI18N
        jLabel1.setBounds(5,5,150,40);
        jLabel1.setText("Nhập mảng");
        contentPane.add(jLabel1);
        
        ///import button
        JLabel importButton = new JLabel("Nhập từ file");
        importButton.setForeground(new java.awt.Color(102, 102, 102));
        importButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        importButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        importButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contract.png"))); // NOI18N
        importButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        importButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importButton.setBounds(CONTENTPANE_WIDTH/2 - 150,CONTENTPANE_HEIGHT/2 + 50,150,40);
        contentPane.add(importButton);
        
        ///random button
        JLabel randomButton = new JLabel("Nhập ngẫu nhiên");
        randomButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        randomButton.setForeground(new java.awt.Color(102, 102, 102));
        randomButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        randomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shuffle.png"))); // NOI18N
        randomButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        randomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        randomButton.setBounds(importButton.getX()+importButton.getWidth()+10,importButton.getY(),200,40);
        contentPane.add(randomButton);
        
        ///cancel button
        JLabel cancelButton = new JLabel("Thoát");
        cancelButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(102, 102, 102));
        cancelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setBounds(this.getWidth()-105,this.getHeight()-50,100,40);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        contentPane.add(cancelButton);
        
        ///ok button
        JLabel okButton = new JLabel("OK");
        okButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        okButton.setForeground(new java.awt.Color(102, 102, 102));
        okButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        okButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okButton.setBounds(cancelButton.getX()-70 -5,cancelButton.getY(),70,40);
        okButton.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
            okButtonMouseClicked(evt);
            }
        });
        contentPane.add(okButton);
    }
    
    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        this.setVisible(false);
    }     
    
    private void okButtonMouseClicked(java.awt.event.MouseEvent evt){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhập dữ liệu");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInput().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
