/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UNEducationProject;

import javax.swing.*;

/**
 *
 * @author marky
 */
public class ScienceQuizForm extends javax.swing.JFrame {

    /**
     * Creates new form ScienceQuizForm
     */
    String [][] scienceQuiz = new String[12][6];
    private int scienceQuestion = 0;
    public int scienceScore = 0;
    GradeCalculator myCalc = new GradeCalculator();
    
    public ScienceQuizForm() {
        initComponents();
        initialiseQuiz();
        update();
    }

    public void update(){
        if(scienceQuestion<12){
            QuestionLabel.setText(scienceQuiz[scienceQuestion][0]);
            QuizBtn1.setText(scienceQuiz[scienceQuestion][1]);QuizBtn2.setText(scienceQuiz[scienceQuestion][2]);
            QuizBtn3.setText(scienceQuiz[scienceQuestion][3]);QuizBtn4.setText(scienceQuiz[scienceQuestion][4]);
            scoreTracker.setText(""+scienceScore);
        }
        else{
            ResultsGUI frame1 = new ResultsGUI();
            ScienceQuizForm frame2 = new ScienceQuizForm();
            frame2.setVisible(false);
            frame1.setVisible(true);
            dispose();
        }
    }

    public void initialiseQuiz(){
        scienceQuiz[0][0]= "What is the pigment that causes plants to be green and is used in photosynthesis?";
        scienceQuiz[0][1]= "Membrane"; scienceQuiz[0][2]= "Chlorophyll"; scienceQuiz[0][3]= "Glucose"; scienceQuiz[0][4]= "Chloroplasts";
        scienceQuiz[0][5]= "2";
        scienceQuiz[1][0]= "How do plants spead their seeds?";
        scienceQuiz[1][1]= "Wind"; scienceQuiz[1][2]= "Animals"; scienceQuiz[1][3]= "Water"; scienceQuiz[1][4]= "All of the Above";
        scienceQuiz[1][5]= "4";
        scienceQuiz[2][0]= "In the lungs, what is responsible for moving oxygen into the blood?";
        scienceQuiz[2][1]= "Trachea"; scienceQuiz[2][2]= "Alveoli"; scienceQuiz[2][3]= "Bronchus"; scienceQuiz[2][4]= "Bronchiole";
        scienceQuiz[2][5]= "2";
        scienceQuiz[3][0]= "What brings oxygenated blood AWAY from the heart?";
        scienceQuiz[3][1]= "Arteries"; scienceQuiz[3][2]= "Veins"; scienceQuiz[3][3]= "Capillaries"; scienceQuiz[3][4]= "Valves";
        scienceQuiz[3][5]= "1";
        scienceQuiz[4][0]= "If a car travels 120km in 3 hours, what speed is it going?";
        scienceQuiz[4][1]= "50km/hr"; scienceQuiz[4][2]= "60km/hr"; scienceQuiz[4][3]= "40km/hr"; scienceQuiz[4][4]= "30km/hr";
        scienceQuiz[4][5]= "3";
        scienceQuiz[5][0]= "If you ride a bike from Dublin City Centre to Bray, a route of 24km and you're speed is 18km/hr, how long will it take?";
        scienceQuiz[5][1]= "1hr 15mins"; scienceQuiz[5][2]= "1hr 30mins"; scienceQuiz[5][3]= "1hr 25mins"; scienceQuiz[5][4]= "1hr 20mins";
        scienceQuiz[5][5]= "4";
        scienceQuiz[6][0]= "What is the process of breaking white light into it's seperate distinct colours?";
        scienceQuiz[6][1]= "Refraction"; scienceQuiz[6][2]= "Reflection"; scienceQuiz[6][3]= "Photosynthesis"; scienceQuiz[6][4]= "Dispersion";
        scienceQuiz[6][5]= "4";
        scienceQuiz[7][0]= "Which of these is not a distinct colour that makes up white light?";
        scienceQuiz[7][1]= "Pink"; scienceQuiz[7][2]= "Indigo"; scienceQuiz[7][3]= "Red"; scienceQuiz[7][4]= "Violet";
        scienceQuiz[7][5]= "1";
        scienceQuiz[8][0]= "What test is used to determine a subatance in accordance with the pH Scale?";
        scienceQuiz[8][1]= "Flame"; scienceQuiz[8][2]= "Lather"; scienceQuiz[8][3]= "Litmus"; scienceQuiz[8][4]= "Silver-Mirror";
        scienceQuiz[8][5]= "3";
        scienceQuiz[9][0]= "What colour would hydrocloric acid be on the PH Scale?";
        scienceQuiz[9][1]= "Red"; scienceQuiz[9][2]= "Purple"; scienceQuiz[9][3]= "White"; scienceQuiz[9][4]= "Blue";
        scienceQuiz[9][5]= "1";
        scienceQuiz[10][0]= "What component of the atom is extremely light and negatively charged?";
        scienceQuiz[10][1]= "Proton"; scienceQuiz[10][2]= "Electron"; scienceQuiz[10][3]= "Neutron"; scienceQuiz[10][4]= "Molecule";
        scienceQuiz[10][5]= "2";
        scienceQuiz[11][0]= "Carbon has an atomic number of 6, and a mass number of 12, which of the following represents a non charged atom of carbon?";
        scienceQuiz[11][1]= "6 protons, 6 electrons, 6 neutrons"; scienceQuiz[11][2]= "6 protons, 12 electrons, 6 neutrons"; scienceQuiz[11][3]= "6 protons, 12 electrons, 12 neutrons"; scienceQuiz[11][4]= "12 protons, 12 electrons, 6 neutrons";
        scienceQuiz[11][5]= "1";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        QuizBtn1 = new javax.swing.JButton();
        QuizBtn2 = new javax.swing.JButton();
        QuizBtn3 = new javax.swing.JButton();
        QuizBtn4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreTracker = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        QuestionLabel = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        QuizBtn1.setBackground(new java.awt.Color(0, 102, 102));
        QuizBtn1.setForeground(new java.awt.Color(255, 255, 255));
        QuizBtn1.setText("QuizBtn1");
        QuizBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtn1ActionPerformed(evt);
            }
        });

        QuizBtn2.setBackground(new java.awt.Color(0, 102, 102));
        QuizBtn2.setForeground(new java.awt.Color(255, 255, 255));
        QuizBtn2.setText("QuizBtn2");
        QuizBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtn2ActionPerformed(evt);
            }
        });

        QuizBtn3.setBackground(new java.awt.Color(0, 102, 102));
        QuizBtn3.setForeground(new java.awt.Color(255, 255, 255));
        QuizBtn3.setText("QuizBtn3");
        QuizBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtn3ActionPerformed(evt);
            }
        });

        QuizBtn4.setBackground(new java.awt.Color(0, 102, 102));
        QuizBtn4.setForeground(new java.awt.Color(255, 255, 255));
        QuizBtn4.setText("QuizBtn4");
        QuizBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtn4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCORE:");

        scoreTracker.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scoreTracker.setForeground(new java.awt.Color(255, 255, 255));
        scoreTracker.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("/12");

        QuestionLabel.setEditable(false);
        QuestionLabel.setBackground(new java.awt.Color(153, 0, 255));
        QuestionLabel.setColumns(20);
        QuestionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionLabel.setLineWrap(true);
        QuestionLabel.setRows(3);
        QuestionLabel.setWrapStyleWord(true);
        QuestionLabel.setAutoscrolls(false);
        QuestionLabel.setBorder(null);
        QuestionLabel.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        QuestionLabel.setEnabled(false);
        QuestionLabel.setSelectionColor(new java.awt.Color(153, 0, 255));
        jScrollPane2.setViewportView(QuestionLabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreTracker, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(QuizBtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuizBtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuizBtn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuizBtn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scoreTracker)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(QuizBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuizBtn2)
                .addGap(18, 18, 18)
                .addComponent(QuizBtn3)
                .addGap(18, 18, 18)
                .addComponent(QuizBtn4)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuizBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtn2ActionPerformed
        if(scienceQuiz[scienceQuestion][5]=="2"){
            scienceScore++;
            myCalc.gradeScore++;
        }
        scienceQuestion++;
        update();
    }//GEN-LAST:event_QuizBtn2ActionPerformed

    private void QuizBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtn1ActionPerformed
        if(scienceQuiz[scienceQuestion][5]=="1"){
            scienceScore++;
            myCalc.gradeScore++;
        }
        scienceQuestion++;
        update();
    }//GEN-LAST:event_QuizBtn1ActionPerformed

    private void QuizBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtn3ActionPerformed
        if(scienceQuiz[scienceQuestion][5]=="3"){
            scienceScore++;
            myCalc.gradeScore++;
        }
        scienceQuestion++;
        update();
    }//GEN-LAST:event_QuizBtn3ActionPerformed

    private void QuizBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtn4ActionPerformed
        if(scienceQuiz[scienceQuestion][5]=="4"){
            scienceScore++;
            myCalc.gradeScore++;
        }
        scienceQuestion++;
        update();
    }//GEN-LAST:event_QuizBtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(ScienceQuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScienceQuizForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScienceQuizForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea QuestionLabel;
    private javax.swing.JButton QuizBtn1;
    private javax.swing.JButton QuizBtn2;
    private javax.swing.JButton QuizBtn3;
    private javax.swing.JButton QuizBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel scoreTracker;
    // End of variables declaration//GEN-END:variables
}
