package main;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Nguyen Thi Ngoc Huyen
 */
public class FrameMain extends JFrame implements java.awt.event.ActionListener{

    public FrameMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        createMainFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        panelControl = new javax.swing.JPanel();
        panelIdea = new javax.swing.JPanel();
        panelCode = new javax.swing.JPanel();
        panelWork = new javax.swing.JPanel();

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

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
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
                .addComponent(panelCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        groupSort = new ButtonGroup();
        
        rdAscending = new JRadioButton();
        rdAscending.setBounds(50,btnImport.getY() + btnImport.getHeight() + 20,24,24);
        panelControl.add(rdAscending);
        lbAscending = new JLabel();
        lbAscending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ascending.png"))); // NOI18N
        lbAscending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAscending.setBounds(rdAscending.getX() + rdAscending.getWidth() + 2,rdAscending.getY(),24,24);
        groupSort.add(rdAscending);
        rdAscending.setSelected(true);
        panelControl.add(lbAscending);
        rdAscending.addActionListener(this);
        
        rdDescending = new JRadioButton();
        rdDescending.setBounds(lbAscending.getX() + lbAscending.getWidth() + 10,rdAscending.getY(),24,24);
        panelControl.add(rdDescending);
        lbDescending = new JLabel();
        lbDescending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/descending.png"))); // NOI18N
        lbDescending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDescending.setBounds(rdDescending.getX() + rdDescending.getWidth() + 2,rdDescending.getY(),24,24);
        groupSort.add(rdDescending);
        panelControl.add(lbDescending);
        rdDescending.addActionListener(this);
        
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
        
        ///idea panel
        lbIdea = new JLabel("Ý tưởng thuật toán");
        lbIdea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbIdea.setForeground(new java.awt.Color(102, 102, 102));
        lbIdea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/idea.png"))); // NOI18N
        lbIdea.setBounds(5,5,300,30);
        panelIdea.add(lbIdea);
        
        txtIdea = new JTextArea();
        txtIdea.setEditable(false);
        txtIdea.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtIdea.setForeground(new java.awt.Color(102, 102, 102));
        txtIdea.setText("This is the idea of algorithm");
        txtIdea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 2, true));
        txtIdea.setBackground(new java.awt.Color(225,225,225));
        txtIdea.setWrapStyleWord(true);
        txtIdea.setLineWrap(true);
        txtIdea.setBounds(lbIdea.getX(),lbIdea.getY() + lbIdea.getHeight() + 5,
                panelIdea.getWidth() - 10, panelIdea.getHeight() - lbIdea.getY() - lbIdea.getHeight() - 10);
        panelIdea.add(txtIdea);
        
        ///code Panel
        lbCode = new JLabel("Thuật toán theo C/C++");
        lbCode.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbCode.setForeground(new java.awt.Color(102, 102, 102));
        lbCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/script.png"))); // NOI18N
        lbCode.setBounds(5,5,300,30);
        panelCode.add(lbCode);
        
        scrollCode = new JScrollPane();
        scrollCode.setBounds(lbCode.getX(),lbCode.getY() + lbCode.getHeight() + 5,
                panelCode.getWidth() - 10, panelCode.getHeight() - lbCode.getY() - lbCode.getHeight() - 10);
        scrollCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true));
        panelCode.add(scrollCode);
        model = new DefaultListModel<>();
        listCode = new JList<String>(model);
        listCode.setBackground(new java.awt.Color(225,225,225));
        listCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255)));
        listCode.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listCode.setForeground(new java.awt.Color(102, 102, 102));
        listCode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        listCode.setSelectedIndex(0);
        listCode.ensureIndexIsVisible(listCode.getSelectedIndex());
        scrollCode.setViewportView(listCode);
        writeInterchangeSort();

        /// infor button
        btnInfor = new JLabel();
        btnInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        btnInfor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfor.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfor.setBounds( panelWork.getWidth() - 30, panelWork.getHeight() - 30 , 24,24);
        btnInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inforLabelMouseClicked(evt);
            }
        });
        panelWork.add(btnInfor);
        
        lbPoint1.setSize(50, 25);
                lbPoint1.setOpaque(true);
                lbPoint1.setLocation(50, 50);
                lbPoint1.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 17));
                lbPoint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPoint1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                panelWork.add(lbPoint1);
                panelWork.add(lbPoint2);
                lbPoint2.setSize(50, 25);
                lbPoint2.setOpaque(true);
                lbPoint2.setLocation(50, 50);
                lbPoint2.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 17));
                lbPoint2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPoint2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                panelWork.add(lbPointM);
                lbPointM.setSize(50, 25);
                lbPointM.setOpaque(true);
                lbPointM.setLocation(50, 50);
                lbPointM.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 17));
                lbPointM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbPointM.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }
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
    
    public void createArray(){
        if (array!=null){
            deleteArray();
        }
        if (array.length == 0)
            return;
        numberElement = array.length;
        lbArray = new JLabel[numberElement];
        int l = numberElement * (40 + 10) - 10;
        for(int i = 0;i<numberElement;i++){
            lbArray[i] = new JLabel(Integer.toString(array[i]));
            lbArray[i].setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
            if(i==0){
                lbArray[i].setBounds((panelWork.getWidth() - l)/2,(panelWork.getHeight() - 40)/2,40,40);
            }
            else{
                lbArray[i].setBounds(lbArray[i-1].getX() + 45,lbArray[i-1].getY(),40,40);
            }
            lbArray[i].setForeground(new java.awt.Color(102, 102, 102));
            lbArray[i].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102)));
            lbArray[i].setBackground(new java.awt.Color(225,225,225));
            lbArray[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lbArray[i].setVerticalAlignment(javax.swing.SwingConstants.CENTER);
            panelWork.add(lbArray[i]);
        }
        panelWork.setVisible(true);
        panelWork.validate();
        panelWork.repaint();
    }
    public void deleteArray() {
        for (int i = 0; i < numberElement; i++) {
                lbArray[i].setVisible(false);
                contentPane.remove(lbArray[i]);
        }
    }
    //<editor-fold  desc="Điều khiển bằng chuột">
     private void inforLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
         InforFrame infor = new InforFrame();
         infor.setLocationRelativeTo(null);
         infor.setVisible(true);
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
    public boolean alreadySorted() {
    	if (isAscending) {
    		for (int i = 0; i < array.length - 1; i++)
    			if (array[i] > array[i+1])
    				return false;
    	}	
    	else {
    		for (int i = 0; i < array.length - 1; i++)
    			if (array[i] < array[i+1])
    				return false;
    	}
    	return true;
    }
    private void startLabelMouseClicked(java.awt.event.MouseEvent evt) { 
        if(alreadySorted()){
            JOptionPane.showMessageDialog(null, "Phần tử đã được sắp xếp. Chọn mảng khác");
            return;
            }
            for(int i = 0;i<numberElement;i++){
                lbArray[i].setBackground(Color.WHITE);
            }        
        JComboBox cmb = cmbAlgorithm;
        String algorithm = (String) cmb.getSelectedItem();
        if(algorithm.equals("Interchange Sort")){
            InterchangeSort();
        }
        if(algorithm.equals("Insertion Sort")){
            InsertionSort();
        }
        waitEnd();
    } 
    private void pauseLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
    } 
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rdAscending){
            isAscending = true;
            JComboBox cmb = cmbAlgorithm;
            String algorithm = (String) cmb.getSelectedItem();
            if ("Interchange Sort".equals(algorithm))
                    model.set(4, "                    if(a[j] < a[i])");
            if ("Insertion Sort".equals(algorithm))
                    model.set(6,"          while ((postion >= 0) && (a[position] > x)) {");            
            if ("Selection Sort".equals(algorithm))
                    model.set(5, "               if (a[j] < a[[position])");
            if ("Bubble Sort".equals(algorithm))
                    model.set(4,"               if(a[j] < a[j-1])");
            return;
        }
        if(e.getSource() == rdDescending){
            isAscending = false;
            JComboBox cmb = cmbAlgorithm;
            String algorithm = (String) cmb.getSelectedItem();  
            if (algorithm.equals("Interchange Sort"))
                    model.set(4, "                    if(a[j] > a[i])");
            if (algorithm.equals("Selection Sort"))
                    model.set(5, "               if (a[j] > a[position])");
            if (algorithm.equals("Bubble Sort"))
                    model.set(4,"               if(a[j] > a[j-1])");
            if (algorithm.equals("Insertion Sort"))
                    model.set(6,"          while ((position >= 0) && (a[position] < x)) {");
            return;
        }
        if(e.getSource() == cmbAlgorithm){
            JComboBox cmb = (JComboBox)e.getSource();
            String algorithm = (String) cmb.getSelectedItem();
            model.removeAllElements();
            switch(algorithm){
                case  "Interchange Sort":
                    writeInterchangeSort();
                    break;
                case "Selection Sort":
                    writeSelectionSort();
                    txtIdea.setText("Giả sử ta chọn được thành phần có khóa nhỏ nhất trên "
                            + "mảng là A[k]. Tráo đổi A[0] với A[k], vậy thì lúc này "
                            + "ta sẽ nhận được A[0] là phần tử có khóa nhỏ nhất. "
                            + "Ta cần tìm thành phần có khóa nhỏ nhất trong các "
                            + "phần tử từ A[i] đến A[n-1].Giả sử thành phần đó "
                            + "là A[k] sao cho i <= k <= n-1. Ta lại tráo đổi "
                            + "A[i] với A[k], ta có A[0].key <= A[1].key <= ... "
                            + "<= A[i-1].key <= A[i].key. "
                            + "Tương tự lặp lại cho tới i = n-1");
                    break;
                case "Bubble Sort":
                    writeBubbleSort();
                    txtIdea.setText("*Xét lần lượt các cặp 2 phần tử liên tiếp."
                            + "Nếu phần tử đứng sau nhỏ hơn phần tử đứng "
                            + "trước, ta đổi chỗ 2 phần tử. Nói cách khác, "
                            + "phần tử nhỏ nhất sẽ nổi lên trên."
                            + "*Lặp lại đến khi không còn 2 phần tử nào "
                            + "thỏa mãn. Có thể chứng minh được số lần "
                            + "lặp không quá n-1, do một phần tử chỉ có "
                            + "thể nổi lên trên không quá n-1 lần.");
                    break;
                case "Insertion Sort": 
                    writeInsertionSort();
                    txtIdea.setText("Ý tưởng chính của thuật toán là ta sẽ sắp "
                            + "xếp lần lượt từng đoạn gồm 1 phần tử đầu "
                            + "tiên, 2 phần tử đầu tiên, ...,  phần tử."
                            + "Giả sử ta đã sắp xếp xong  phần tử của mảng."
                            + "Để sắp xếp  phần tử đầu tiên, ta tìm vị "
                            + "trí phù hợp của phần tử thứ và \"chèn\" "
                            + "nó vào đó.");
                    break;
                case "Shell Sort": 
                    writeShellSort();
                    txtIdea.setText("Mỗi row được group bởi các step gap, mỗi group "
                            + "sử dụng insertion sort để sắp xếp, khi step gap "
                            + "giảm các group chứa được nhiều record hơn. Khi "
                            + "giá trị của gap được giảm xuống còn 1 toàn bộ dữ "
                            + "liệu được kết hợp thành một group để tạo thành "
                            + "một bộ dữ liệu đã được sắp xếp.");
                    break;
                case "Heap Sort":
                    writeHeapSort();
                    break;
                case "Quick Sort":
                    writeQuickSort();
                    break;
                case "Merge Sort":
                    break;
                default:
                    break;
            }
            listCode.setSelectedIndex(0);
            rdAscending.setSelected(true);
            return;
        }
    }
 //</editor-fold>
    //<editor-fold  desc="Viết thuật toán lên Code C/C++">
    public void writeInterchangeSort() {
            model.addElement("void InterchangeSort(int a[], int n) {");
            model.addElement("     int i, j;");
            model.addElement("          for (i = 0 ; i<n-1 ; i++) {");
            model.addElement("               for (j =i+1; j < n ; j++) {");
            model.addElement("                    if(a[j ]< a[i])");
            model.addElement("                         Swap(a[i], a[j]);");
            model.addElement("               }");
            model.addElement("          }");
            model.addElement("}");
	}
    public void writeSelectionSort() {
            model.addElement("void SelectionSort(int a[],int n ) {");
            model.addElement("     int position,i,j;");
            model.addElement("     for (i=0; i<n-1 ; i++) {");
            model.addElement("          position = i;");
            model.addElement("          for(j = i+1; j <N ; j++) {");
            model.addElement("               if (a[j] < a[position])");
            model.addElement("                    position = j;");
            model.addElement("               Swap(a[position],a[i]);");
            model.addElement("          }");
            model.addElement("     }");
            model.addElement("}");
	}
    public void writeBubbleSort() {
        model.addElement("void BubbleSort(int a[],int n) {");
        model.addElement("     int i, j;");
        model.addElement("     for (i = 0 ; i<n-1 ; i++) {");
        model.addElement("          for (j =n-1; j >i ; j --) {");
        model.addElement("               if(a[j] < a[j-1])");
        model.addElement("                    Swap(a[j], a[j-1];");
        model.addElement("          }");
        model.addElement("      }");
        model.addElement("}");
	}
    public void writeInsertionSort() {
        model.addElement("void InsertionSort(int a[], int n ) {");
        model.addElement("     int postion, i;");
        model.addElement("     int x;");
        model.addElement("     for(i = 1; i < n; i++) {"); 
        model.addElement("          x = a[i];");
        model.addElement("          pos = i - 1;");
        model.addElement("          while ((position >= 0) && (a[postion] > x)) {");
        model.addElement("               a[position+1] = a[position];");
        model.addElement("               position--;");
        model.addElement("          }");
        model.addElement("     a[position+1] = x];");
        model.addElement("     }");
        model.addElement("}");
    }
    public void writeShellSort() {
        model.addElement("void ShellSort(int a[], int n) {");
        model.addElement("    int gap, i, j, x;");
        model.addElement("    for (gap = n/2; len > 0; gap /= 2) {");
        model.addElement("        for (i = gap; i < n; i++) {");
        model.addElement("            x = a[i];");
        model.addElement("            j = i - gap;");
        model.addElement("            while (j >= 0 && x < a[i]) {");
        model.addElement("                a[j + gap] = a[j];");
        model.addElement("            }");
        model.addElement("            j -= gap;");
        model.addElement("        }");
        model.addElement("        a[j + gap] = x;");
        model.addElement("    }");
        model.addElement("}");
    }
    public void writeHeapSort() {
    	model.addElement("void HeapSort(int a[],int n) {");
    	model.addElement("     int r;");
    	model.addElement("     CreateHeap(a,n);");
    	model.addElement("     r=n-1;");
    	model.addElement("     while(r>0) {");
    	model.addElement("          Swap(a[0],a[r]);");
    	model.addElement("          r--;");
    	model.addElement("          if(r>0)");
    	model.addElement("               shift(a,0,r);");
    	model.addElement("     }");
    	model.addElement("}");
    	model.addElement("");
      	model.addElement("void CreateHeap(int a[],int n) {");
    	model.addElement("     int l;");
    	model.addElement("     l=n/2-1;");
    	model.addElement("     while(l>=0) {");
    	model.addElement("          shift(a,l,n-1);");
    	model.addElement("          l=l-1;");
    	model.addElement("     }");
    	model.addElement("}");
    	model.addElement("");
    	model.addElement("void shift(int a[],int l,int r) {");
    	model.addElement("     int x,i,j;");
    	model.addElement("     i=l;");
    	model.addElement("     j=2*i+1;");
    	model.addElement("     x=a[i];");
    	model.addElement("     while(j<=r) {");
    	model.addElement("          if(j<r)");
    	model.addElement("          if(a[j]<a[j+1])");
    	model.addElement("          j++;");
    	model.addElement("          if(a[j]<=x)");
    	model.addElement("               return;");
    	model.addElement("          else {");
    	model.addElement("               a[i]=a[j]");
    	model.addElement("               a[j]=x;");
    	model.addElement("               i=j;");
    	model.addElement("               j=2*i+1;");
    	model.addElement("               x=a[i];");
    	model.addElement("          }");
    	model.addElement("     }");
    	model.addElement("}");  	
    }
    public void writeQuickSort() {
    	model.addElement("void QuickSort(int a[], int left, int right) {");
    	model.addElement("     int i, j, x;");
    	model.addElement("     x = a[(left+right)/2];");
    	model.addElement("     i = left; j = right;");
    	model.addElement("     while(i < j) {");
    	model.addElement("          while(a[i] < x) i++;");
    	model.addElement("          while(a[j] > x) j--;");
    	model.addElement("          if(i <= j) {");
    	model.addElement("               Swap(a[i],a[j]);");
    	model.addElement("               i++ ; j--;");
    	model.addElement("          }");
    	model.addElement("     }");
    	model.addElement("     if(left<j)");
    	model.addElement("          QuickSort(a, left, j)");
    	model.addElement("     if(i<right)");
    	model.addElement("          QuickSort(a, i, right);");
    	model.addElement("}");
    }
    //</editor-fold>
    //<editor-fold desc="Sắp xếp thuật toán">
    public void InterchangeSort() {
		if (isAscending) {
			highLight(1);
			int i, j;
			for (i = 0 ; i < numberElement ; i++) {
				highLight(2);
                                setlbPoint(lbPoint1, i, "i = ");
				for (j = i + 1; j < numberElement ; j++) {
                                    setlbPoint(lbPoint2, j, "j = ");
					highLight(3);
					highLight(4);
					if(array[j] < array[i]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						highLight(5);
						Swap(lbArray[i], lbArray[j]);
					}
				}
			}
			highLight(0);
		} else {
			highLight(1);
			int i, j;
			for (i = 0 ; i < numberElement ; i++) {
				highLight(2);
                                setlbPoint(lbPoint1, i, "i = ");
				for (j = i + 1; j < numberElement ; j++) {
                                    setlbPoint(lbPoint2, j, "j = ");
					highLight(3);
					highLight(4);
					if(array[j] > array[i]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						highLight(5);
						Swap(lbArray[i], lbArray[j]);
					}
				}
			}
			highLight(0);
		}
	}
    public void InsertionSort() {
    	if (isAscending) {
	        int pos, i;
	        highLight(1);
	        int x;
	        highLight(2);
	        for (i = 1; i < numberElement; i++) {
                    highLight(3);
                    setlbPoint(lbPoint1, i, "i = ");
	            x = array[i];
	            highLight(4);
	            pos = i - 1;
	            highLight(5);
	            while ((pos >= 0) && (array[pos] > x)) {
	            	highLight(6);
                        setlbPoint(lbPoint2, pos, "j = ");
	                array[pos + 1] = array[pos];
	                highLight(7);
	                if (pos > 0 && array[pos - 1] <= x) {
	                    Move(lbArray[pos + 1], lbArray[pos], 0);
	                } else {
	                    Move(lbArray[pos + 1], lbArray[pos], pos);
	                }	              
	                pos--;
	                highLight(8);
	            }
	            highLight(9);
	            array[pos + 1] = x;
                    setlbPoint(lbPoint2, -1, null);
	        }
	        highLight(0);
    	}
    	else {
    		int pos, i;
    		highLight(1);
	        int x;
	        highLight(2);
	        for (i = 1; i < numberElement; i++) {
                    highLight(3);
                    setlbPoint(lbPoint1, i, "i = ");
	            x = array[i];
	            highLight(4);
	            pos = i - 1;
	            highLight(5);
	            while ((pos >= 0) && (array[pos] < x)) {
	            	highLight(6);
                        setlbPoint(lbPoint2, pos, "j = ");
	                array[pos + 1] = array[pos];
	                highLight(7);
	                if (pos > 0 && array[pos - 1] >= x) {
	                    Move(lbArray[pos + 1], lbArray[pos], 0);
	                } else {
	                    Move(lbArray[pos + 1], lbArray[pos], pos);
	                }
	                pos--;
	                highLight(8);
	            }
	            array[pos + 1] = x;
	            highLight(9);
                    setlbPoint(lbPoint2, -1, null);
	        }
	        highLight(0);
    	}
    }
    
    public void Move(JLabel lb1, JLabel lb2, int pos) {
        int x1 = lb1.getX();
        int x2 = lb2.getX();
        curT ++;
        
        int cur = curT;
        threads[cur] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (cur != 0) {
                        threads[cur - 1].join();
                    }
                    lb1.setOpaque(true);
                    lb2.setOpaque(true);
                    lb1.setBackground(Color.CYAN);
                    lb2.setBackground(Color.CYAN);
                    while (lb1.getY() > 100) {
                        lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                        Thread.sleep(time);
                    }
                    while (lb1.getX() > x2) {
                        lb2.setLocation(lb2.getX() + 10, lb2.getY());
                        lb1.setLocation(lb1.getX() - 10, lb1.getY());
                        Thread.sleep(time);
                    }
                    while (pos == 0 && lb1.getY() < 150) {
                        lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                        Thread.sleep(time);
                    }
                    String txtLb1 = lb1.getText();
                    lb1.setText(lb2.getText());
                    lb2.setText(txtLb1);
                    int y1 = lb1.getY();
                    lb1.setLocation(x1, lb2.getY());
                    lb2.setLocation(x2, y1);
                    lb1.setBackground(SystemColor.inactiveCaption);
                    if (pos == 0)
                        lb2.setBackground(SystemColor.inactiveCaption);
               } catch (Exception e) {
               }
           }
        });
        threads[cur].start();
    }
    public void waitEnd() {
    	curT++;
		
		int cur = curT;
		threads[cur] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (cur != 0) {
			    		threads[cur-1].join();
			    	}
		    		setState(4);
		    		for (int i = 0; i < numberElement; i++) {
		    			lbArray[i].setForeground(Color.darkGray);
		    		}
                                lbPoint1.setText("");
                                lbPoint2.setText("");
                                lbPointM.setText("");
		    		JOptionPane.showMessageDialog(null,"Đã hoàn thành sắp xếp thuật toán");
		    	} catch (Exception e) {
		    		
		    	}
		    }
		});
		threads[cur].start();
    }
    public void highLight(int line) {
             curT++;

             int cur = curT;
             threads[cur] = new Thread(new Runnable() {
                 @Override
                 public void run() {
                     try {
                             if (cur != 0) {
                                     threads[cur-1].join();
                             }
                             listCode.setSelectedIndex(line);
                             listCode.ensureIndexIsVisible(line); // Tu cuon den dong dang highlight
                             Thread.sleep(time);
                     } catch (Exception e) {

                     }
                 }
             });
             threads[cur].start();
     }
    public void stopAllThreads() {
     for (int i = 0; i < curT; i++) {
                     try {
                     threads[i].interrupt();
                     } catch (Exception e) {

                     }
             }
             curT = -1;
 }
    public void setlbPoint(JLabel lbPoint, int i, String s) {
  curT ++;
  System.out.println(curT);
  int cur = curT;
  threads[cur] = new Thread(new Runnable() {
      @Override
      public void run() {
          try {
              if (cur != 0)
                  threads[cur - 1].join();
              if (i == -1) {
                  lbPoint.setText("");
                  return;
              }
              if (s.charAt(0) == 'm') {
                  lbPoint.setLocation(lbArray[i].getX(), 200);
                  lbPoint.setText(s);
              } else if (s.charAt(0) == 'k') {
                  lbPoint.setLocation(oriLocat[i], 200);
                  lbPoint.setText(s + i);
              } else {
                  lbPoint.setLocation(lbArray[i].getX(), 275);
                  lbPoint.setText(s + i);
              }
          } catch (Exception e){}
      }
  });
  threads[cur].start();
}
    public void Swap(JLabel lb1, JLabel lb2) {
         int x1 = lb1.getX();
         int x2 = lb2.getX();
         curT ++;

         int cur = curT;
         threads[cur] = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                         if (cur != 0) {
                                 threads[cur-1].join();
                         }

                         lb1.setBackground(SystemColor.BLUE);
                         lb2.setBackground(SystemColor.BLACK);
                         while (lb1.getY() > 100) {
                                 lb1.setLocation(lb1.getX(), lb1.getY() - 10);
                                 lb2.setLocation(lb2.getX(), lb2.getY() + 10);
                                 lbPointM.setLocation(x2, lbPointM.getY() + 10);
                                 Thread.sleep(time);
                         }
                         while (lb1.getX() < x2) {
                                 lb1.setLocation(lb1.getX() + 10, lb1.getY());
                                 lb2.setLocation(lb2.getX() - 10, lb2.getY());
                                 lbPointM.setLocation(lb2.getX(), 250);
                                 Thread.sleep(time);
                         }
                         while (lb1.getY() < 140) {
                                 lb1.setLocation(lb1.getX(), lb1.getY() + 10);
                                 lb2.setLocation(lb2.getX(), lb2.getY() - 10);
                                 lbPointM.setLocation(x1, lbPointM.getY() - 10);
                                 Thread.sleep(time);
                         }
                         String txtLb1 = lb1.getText();
                         lb1.setText(lb2.getText());
                         lb2.setText(txtLb1);
                         lb1.setLocation(x1, 150);
                         lb2.setLocation(x2, 150);
                         lb1.setBackground(SystemColor.inactiveCaption);
                         lb2.setBackground(SystemColor.inactiveCaption);
                 } catch (Exception e) {
                 }
             }
         });
         threads[cur].start();
 }
    //</editor-fold>
    //<editor-fold desc="Khởi tạo các thuộc tính">
    private int[] oriLocat = new int[15];
    private int curT = -1;
    private Thread[] threads = new Thread[1000000];
    private int time = 50;
    private JLabel lbPoint1 = new JLabel();
    private JLabel lbPoint2 = new JLabel();
    private JLabel lbPointM = new JLabel();

    private final int MAIN_FRAME_WIDTH = 1000;
    private final int MAIN_FRAME_HEIGHT = 600;
    private boolean isAscending = true;
    private int numberElement;
    
    private JLabel lbTitle, btnMinimize, btnClose;
    private JLabel btnImport,lbAscending,lbDescending,btnStart,btnPause;
    private JRadioButton rdAscending,rdDescending;
    private ButtonGroup groupSort;
    private JComboBox cmbAlgorithm;
    private String[] strAlgorithm = {"Interchange Sort", "Selection Sort", "Bubble Sort", "Insertion Sort", "Shell Sort", "Heap Sort", "Quick Sort", "Merge Sort"};
    private JLabel lbIdea;
    private JTextArea txtIdea;
    
    private JLabel lbCode;
    private JScrollPane scrollCode;
    private DefaultListModel<String> model;
    private JList<String> listCode;
    
    private JLabel btnInfor;
    
    public static int[] array;
    private JLabel[] lbArray;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPane;
    private javax.swing.JPanel panelCode;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelIdea;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelWork;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
