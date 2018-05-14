package main;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author SofiaJetson
 */
public class FrameMain extends JFrame implements java.awt.event.ActionListener{

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        createMainFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        panelControl = new javax.swing.JPanel();
        panelIdea = new javax.swing.JPanel();
        panelCode = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        contentPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        contentPane.setForeground(new java.awt.Color(102, 102, 102));
        contentPane.setPreferredSize(new java.awt.Dimension(1000, 600));

        panelTitle.setBackground(new java.awt.Color(255, 255, 255));
        panelTitle.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelControl.setForeground(new java.awt.Color(102, 102, 102));
        panelControl.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        panelIdea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelIdea.setForeground(new java.awt.Color(102, 102, 102));
        panelIdea.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout panelIdeaLayout = new javax.swing.GroupLayout(panelIdea);
        panelIdea.setLayout(panelIdeaLayout);
        panelIdeaLayout.setHorizontalGroup(
            panelIdeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        panelIdeaLayout.setVerticalGroup(
            panelIdeaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        panelCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelCode.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelCodeLayout = new javax.swing.GroupLayout(panelCode);
        panelCode.setLayout(panelCodeLayout);
        panelCodeLayout.setHorizontalGroup(
            panelCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        panelCodeLayout.setVerticalGroup(
            panelCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelIdea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCode, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIdea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 344, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void createMainFrame(){
        /// title bar
        btnMinimize = new JLabel();
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimize_button.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimize.setBounds( panelTitle.getWidth() - 55, 8 , 24,24);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        panelTitle.add(btnMinimize);
        
        btnClose = new JLabel();
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close_button.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setBounds( panelTitle.getWidth() - 30, 8 , 24,24);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        panelTitle.add(btnClose);
        
        lbTitle = new JLabel("Mô phỏng thuật toán");
        lbTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pizza.png"))); // NOI18N
        lbTitle.setBounds(5,5,300,30);
        panelTitle.add(lbTitle);
        
        ///panel control
        btnImport = new JLabel("Nhập mảng");
        btnImport.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contract.png"))); // NOI18N
        btnImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnImport.setForeground(new java.awt.Color(102, 102, 102));
        btnImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImport.setBounds(50,10,200,30);
        btnImport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));
        btnImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importButtonMouseClicked(evt);
            }
        });
        panelControl.add(btnImport);
        
        rdAscending = new JRadioButton();
        rdAscending.setBounds(50,btnImport.getY() + btnImport.getHeight() + 20,24,24);
        panelControl.add(rdAscending);
        lbAscending = new JLabel();
        lbAscending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ascending.png"))); // NOI18N
        lbAscending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAscending.setBounds(rdAscending.getX() + rdAscending.getWidth() + 2,rdAscending.getY(),24,24);
        panelControl.add(lbAscending);
        
        rdDescending = new JRadioButton();
        rdDescending.setBounds(lbAscending.getX() + lbAscending.getWidth() + 10,rdAscending.getY(),24,24);
        panelControl.add(rdDescending);
        lbDescending = new JLabel();
        lbDescending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descending.png"))); // NOI18N
        lbDescending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDescending.setBounds(rdDescending.getX() + rdDescending.getWidth() + 2,rdDescending.getY(),24,24);
        panelControl.add(lbDescending);
        
        btnPause = new JLabel();
        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pause.png"))); // NOI18N
        btnPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPause.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPause.setBounds( 300-75, lbDescending.getY() , 24,24);
        btnPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        panelControl.add(btnPause);
        
        btnStart = new JLabel();
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play-button.png"))); // NOI18N
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.setBounds( btnPause.getX() - 30, rdDescending.getY() , 24,24);
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startLabelMouseClicked(evt);
            }
        });
        panelControl.add(btnStart);
        
        cmbAlgorithm = new JComboBox(strAlgorithm);
        cmbAlgorithm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbAlgorithm.setBackground(new java.awt.Color(102,102,102));
        cmbAlgorithm.setBounds(rdAscending.getX(), rdAscending.getY() + rdAscending.getHeight() + 10,btnImport.getWidth(),btnImport.getHeight());
        cmbAlgorithm.setSelectedIndex(0);
        cmbAlgorithm.addActionListener(this);
        panelControl.add(cmbAlgorithm);
        
        lbIdea = new JLabel("Ý tưởng thuật toán");
        lbIdea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbIdea.setForeground(new java.awt.Color(102, 102, 102));
        lbIdea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/idea.png"))); // NOI18N
        lbIdea.setBounds(5,5,300,30);
        panelIdea.add(lbIdea);
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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
    
    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
        System.exit(0);
    }                                       
    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {                                           
       this.setState(MainFrame.ICONIFIED);
    }                                          
    private void importButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
            FrameInput input = new FrameInput();
            input.setVisible(true);
            input.setLocationRelativeTo(null);
    }
    private void startLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
    } 
    private void pauseLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
    } 
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmbAlgorithm){
            JComboBox cmb = (JComboBox)e.getSource();
            String algorithm = (String) cmb.getSelectedItem();
            switch(algorithm){
                case  "Interchange Sort":
                    break;
                case "Bubble Sort":
                    break;
                case "InsertionSort": 
                    break;
                case "Shell Sort": case "HeapSort":
                    break;
                case "Quick Sort":
                    break;
                case "Merge Sort":
                    break;
                default:
                    return;

            }
        }
    }
    
    private final int MAIN_FRAME_WIDTH = 1000;
    private final int MAIN_FRAME_HEIGHT = 600;
    private JLabel lbTitle, btnMinimize, btnClose;
    private JLabel btnImport,lbAscending,lbDescending,btnStart,btnPause;
    private JRadioButton rdAscending,rdDescending;
    private JComboBox cmbAlgorithm;
    private String[] strAlgorithm = {"Interchange Sort", "Bubble Sort", "InsertionSort", "Shell Sort", "HeapSort", "Quick Sort", "Merge Sort"};
    private JLabel lbIdea;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel panelCode;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelIdea;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables

}
