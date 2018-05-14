/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private int[] arrays;
        public static int numberElement = 2;
        private JTextField txtNumberElement;
        private JLabel jLabel2;
        private JLabel btnEnter;
        private JLabel jLabel1;
        private JLabel btnImport;
        private JLabel btnRandom;
        private JLabel btnCancel;
        private JLabel btnOK;
        private boolean alreadyEnter = false;
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
        
        ///condition of number element
        jLabel2 = new JLabel("Số phần tử phải lớn hơn 1 và nhỏ hơn 16!");
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/warning.png"))); // NOI18N
        jLabel2.setBounds(10,50,350,40);
        contentPane.add(jLabel2);
        
        ///number Element textField
        txtNumberElement = new JTextField(Integer.toString(numberElement));
        txtNumberElement.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNumberElement.setForeground(new java.awt.Color(102, 102, 102));
        txtNumberElement.setBounds(jLabel2.getX()+jLabel2.getWidth() + 5,jLabel2.getY(),100,40);
        contentPane.add(txtNumberElement);
        
        /// Enter button
        btnEnter = new JLabel("Tạo mảng");
        btnEnter.setForeground(new java.awt.Color(102, 102, 102));
        btnEnter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setBounds(txtNumberElement.getX() + txtNumberElement.getWidth() + 5,txtNumberElement.getY(),100,40);
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterButtonMouseClicked(evt);
            }
        });
        contentPane.add(btnEnter);
        
        ///Title label
        jLabel1 = new JLabel("Nhập mảng");
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/donut.png"))); // NOI18N
        jLabel1.setBounds(5,5,150,40);
        contentPane.add(jLabel1);
        
        ///import button
        btnImport = new JLabel("Nhập từ file");
        btnImport.setForeground(new java.awt.Color(102, 102, 102));
        btnImport.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contract.png"))); // NOI18N
        btnImport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        btnImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImport.setBounds(CONTENTPANE_WIDTH/2 - 150,CONTENTPANE_HEIGHT/2 + 50,150,40);
//        contentPane.add(btnImport);
        
        ///random button
        btnRandom = new JLabel("Nhập ngẫu nhiên");
        btnRandom.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnRandom.setForeground(new java.awt.Color(102, 102, 102));
        btnRandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shuffle.png"))); // NOI18N
        btnRandom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        btnRandom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRandom.setBounds(btnImport.getX()+btnImport.getWidth()+10,btnImport.getY(),200,40);
        btnRandom.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randomButtonMouseClicked(evt);
            }
        });
        contentPane.add(btnRandom);
        
        ///cancel button
        btnCancel = new JLabel("Thoát");
        btnCancel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setBounds(this.getWidth()-105,this.getHeight()-50,100,40);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        contentPane.add(btnCancel);
        
        ///ok button
        btnOK = new JLabel("OK");
        btnOK.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(102, 102, 102));
        btnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.setBounds(btnCancel.getX()-70 -5,btnCancel.getY(),70,40);
        btnOK.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
            okButtonMouseClicked(evt);
            }
        });
        contentPane.add(btnOK);
        createArray();
    }
    
    private void randomButtonMouseClicked(java.awt.event.MouseEvent evt){
        Random ran = new Random();
        for(int i = 0;i<numberElement;i++){
            txtArrays[i].setText(Integer.toString(ran.nextInt(90)));
        }
    }
    private void enterButtonMouseClicked(java.awt.event.MouseEvent evt){
        deleteArray();
        createArray();
        alreadyEnter = true;
    }
    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        this.setVisible(false);
    }     
    private void okButtonMouseClicked(java.awt.event.MouseEvent evt){
        arrays = new int[numberElement];
        for(int i = 0;i<numberElement;i++){
            arrays[i]=Integer.parseInt(txtArrays[i].getText());
        }
//        for(int c:arrays){
//            System.out.println(c);
//        }
    }
    private static int parseNumberElement(String s) {
        int result;
        if (s == null){
            JOptionPane.showMessageDialog(null,"Yêu cầu nhập số phần tử trước!","Nhập số phần tử",JOptionPane.WARNING_MESSAGE);
        }
        else{
             try{
            result = Integer.parseInt(s);
            if(result<2 || result>15){
                JOptionPane.showMessageDialog(null,"Số phần tử bạn nhập yêu cầu phải lớn hơn 1 và nhỏ hơn 16","Nhập số phần tử",JOptionPane.WARNING_MESSAGE);
            }
            else{
                return result;
            }
            }
            catch(HeadlessException | NumberFormatException e){
                 JOptionPane.showMessageDialog(null,"Số phần tử bạn nhập vào không phù hợp","Nhập số phần tử",JOptionPane.WARNING_MESSAGE);
            }
        }
        return 0;
    }
    public void setNumberElement(int numberElement){
    this.numberElement = numberElement;
    }
    public void createArray(){
//        if(alreadyEnter)
//            deleteArray();
        numberElement = parseNumberElement(txtNumberElement.getText());
        if (numberElement == 0)
            return;
        txtArrays = new JTextField[numberElement];
        arrays = new int[numberElement];
        
        for(int i = 0;i<numberElement;i++){
            txtArrays[i] = new JTextField("0");
            txtArrays[i].setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            txtArrays[i].setBounds(20+(i*45),jLabel2.getY()+jLabel2.getHeight()+5,40,40);
            txtArrays[i].setForeground(new java.awt.Color(102, 102, 102));
            txtArrays[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            contentPane.add(txtArrays[i]);
        }
        contentPane.setVisible(true);
        contentPane.validate();
        contentPane.repaint();
    }
    public void deleteArray() {
        for (int i = 0; i < numberElement; i++) {
                txtArrays[i].setVisible(false);
                contentPane.remove(txtArrays[i]);
        }
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
