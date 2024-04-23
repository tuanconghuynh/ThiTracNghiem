/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CLIENT.UI;

import CLIENT.BLL.QuestionBLL;
import CLIENT.BLL.ValidatorBLL;
import CLIENT.DTO.ExamDTO;
import CLIENT.DTO.QuestionDTO;
import CLIENT.DTO.UserDTO;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author tuanc
 */
public class CreateExam extends javax.swing.JPanel {

     private int DEFALUT_WIDTH;
     private ExamDTO exam;
     private UserDTO user;
     private QuestionBLL qsBLL=new QuestionBLL();
     private static ArrayList<QuestionDTO> listQuestion=new ArrayList<>();
     private int currentPostitionQuestion=0;
     private int flag=0; // 1-> Next // 2 -> Prev
     
    public CreateExam() {
          this.setSize(1090, 750);
        initComponents();
    }

    public CreateExam(int width) {
         DEFALUT_WIDTH = width;
        initComponents();
        this.setSize(this.DEFALUT_WIDTH - 200, 750);
        initComponents();
        init();
    }
      public CreateExam(int width,ExamDTO exam, UserDTO user) {
         DEFALUT_WIDTH = width;
         this.exam=exam;
         this.user=user;
        initComponents();
        this.setSize(this.DEFALUT_WIDTH - 200, 750);
        initComponents();
        init();
    }
      private void init(){
          txID.setText(exam.getId().toString());
          txClassRoom.setText(exam.getClass_room());
          txQuantity.setText(String.valueOf(exam.getQuantity()));
          txSubject.setText(exam.getSubject());
          txTime.setText(String.valueOf(exam.getTotal_time()));
          txUser.setText(String.valueOf(exam.getUserID()));
        
          txtSerialQuestion.setText(String.valueOf(currentPostitionQuestion));
          txtOptionAnswerA.setActionCommand("A");
        txtOptionAnswerB.setActionCommand("B");
        txtOptionAnswerC.setActionCommand("C");
        txtOptionAnswerD.setActionCommand("D");
        btnComplete.setVisible(false);
        if(listQuestion.size()<1) btnPrevQuestion.setVisible(false);
      }
      public void refreshView(){
          listQuestion=null;
          currentPostitionQuestion=0;
          flag=0;
      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupAnswer = new javax.swing.ButtonGroup();
        HEADER = new javax.swing.JPanel();
        lbSoLuong1 = new javax.swing.JLabel();
        pInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnswerB = new javax.swing.JTextField();
        txtAnswerC = new javax.swing.JTextField();
        txtAnswerD = new javax.swing.JTextField();
        txtAnswerA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOptionAnswerB = new javax.swing.JRadioButton();
        txtOptionAnswerD = new javax.swing.JRadioButton();
        txtOptionAnswerC = new javax.swing.JRadioButton();
        txtOptionAnswerA = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        txtSerialQuestion = new javax.swing.JTextField();
        pInput4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        pButton = new javax.swing.JPanel();
        btnPrevQuestion = new javax.swing.JButton();
        btnNextQuestion = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        pInput5 = new javax.swing.JPanel();
        txID = new javax.swing.JTextField();
        txSubject = new javax.swing.JTextField();
        txClassRoom = new javax.swing.JTextField();
        txQuantity = new javax.swing.JTextField();
        txTime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        HEADER.setBackground(new java.awt.Color(0, 153, 0));

        lbSoLuong1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbSoLuong1.setForeground(new java.awt.Color(255, 255, 255));
        lbSoLuong1.setText("TẠO BỘ CÂU HỎI");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(425, 425, 425))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pInput.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Đáp Án:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Câu Hỏi:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Đáp Án Đúng:");

        txtAnswerB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtAnswerC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerCActionPerformed(evt);
            }
        });

        txtAnswerD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtAnswerA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("A");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("C");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("D");

        groupAnswer.add(txtOptionAnswerB);
        txtOptionAnswerB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerB.setText("B");
        txtOptionAnswerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerBActionPerformed(evt);
            }
        });

        groupAnswer.add(txtOptionAnswerD);
        txtOptionAnswerD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerD.setText("D");
        txtOptionAnswerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerDActionPerformed(evt);
            }
        });

        groupAnswer.add(txtOptionAnswerC);
        txtOptionAnswerC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerC.setText("C");
        txtOptionAnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerCActionPerformed(evt);
            }
        });

        groupAnswer.add(txtOptionAnswerA);
        txtOptionAnswerA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerA.setText("A");
        txtOptionAnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerAActionPerformed(evt);
            }
        });

        txtQuestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(txtQuestion);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("Câu Hỏi Số: ");

        txtSerialQuestion.setEditable(false);

        pInput4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pInput4Layout = new javax.swing.GroupLayout(pInput4);
        pInput4.setLayout(pInput4Layout);
        pInput4Layout.setHorizontalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        pInput4Layout.setVerticalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        btnSave.setBackground(new java.awt.Color(255, 51, 51));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addGroup(pInputLayout.createSequentialGroup()
                                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAnswerA, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                            .addComponent(txtAnswerB)
                                            .addComponent(txtAnswerC)
                                            .addComponent(txtAnswerD))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addGap(52, 52, 52)
                                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOptionAnswerA)
                                    .addComponent(txtOptionAnswerB)
                                    .addGroup(pInputLayout.createSequentialGroup()
                                        .addComponent(txtOptionAnswerD)
                                        .addGap(18, 18, 18)
                                        .addComponent(pInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtOptionAnswerC)))
                            .addComponent(txtSerialQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSerialQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOptionAnswerC)))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtOptionAnswerD))
                        .addGap(35, 35, 35)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOptionAnswerA)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addComponent(txtOptionAnswerB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pButton.setBackground(new java.awt.Color(153, 204, 255));

        btnPrevQuestion.setBackground(new java.awt.Color(0, 0, 153));
        btnPrevQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrevQuestion.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevQuestion.setText("Câu Trước Đó ");
        btnPrevQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevQuestionActionPerformed(evt);
            }
        });

        btnNextQuestion.setBackground(new java.awt.Color(255, 128, 0));
        btnNextQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNextQuestion.setText("Câu Tiếp Theo");
        btnNextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextQuestionActionPerformed(evt);
            }
        });

        btnComplete.setBackground(new java.awt.Color(0, 153, 0));
        btnComplete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(255, 255, 255));
        btnComplete.setText("Hoàn Tất");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonLayout = new javax.swing.GroupLayout(pButton);
        pButton.setLayout(pButtonLayout);
        pButtonLayout.setHorizontalGroup(
            pButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnPrevQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComplete)
                .addGap(51, 51, 51))
        );
        pButtonLayout.setVerticalGroup(
            pButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pInput5.setBackground(new java.awt.Color(255, 255, 204));

        txID.setEditable(false);
        txID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txSubject.setEditable(false);
        txSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txClassRoom.setEditable(false);
        txClassRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txQuantity.setEditable(false);
        txQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txTime.setEditable(false);
        txTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mã Đề Thi :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tiêu Đề");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Mã Phòng Thi");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Số Lượng Câu Hỏi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Thời Gian");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Người Tạo");

        txUser.setEditable(false);
        txUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout pInput5Layout = new javax.swing.GroupLayout(pInput5);
        pInput5.setLayout(pInput5Layout);
        pInput5Layout.setHorizontalGroup(
            pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInput5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel14)
                        .addGap(34, 34, 34)
                        .addComponent(txUser)
                        .addGap(243, 243, 243))
                    .addGroup(pInput5Layout.createSequentialGroup()
                        .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pInput5Layout.createSequentialGroup()
                                .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txClassRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addComponent(jLabel11))
                            .addComponent(txQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTime, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(201, 201, 201))))
            .addComponent(jSeparator1)
        );
        pInput5Layout.setVerticalGroup(
            pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInput5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txID)
                    .addComponent(jLabel14)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addGroup(pInput5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInput5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pInput5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pInput5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void saveQuestionIntoArray(){
       String quesName=txtQuestion.getText();
       String anA=txtAnswerA.getText();
       String anB=txtAnswerB.getText();
       String anC=txtAnswerC.getText();
       String anD=txtAnswerD.getText();
       String answer=(txtOptionAnswerA.isSelected())?"A":(
               (txtOptionAnswerB.isSelected())?"B":((txtOptionAnswerC.isSelected())?"C":"D"));
       QuestionDTO question =new  QuestionDTO();
       question.setExamID(exam.getId());
       question.setQuestion(quesName);
       question.setA(anA);
       question.setB(anB);
       question.setC(anC);
       question.setD(anD);
       question.setAnswer(answer);
        if(flag==2 )

           listQuestion.set(currentPostitionQuestion,question);
        else {
            listQuestion.add(question);  
              currentPostitionQuestion=currentPostitionQuestion+1;
        }
        if(listQuestion.size()>=2) btnPrevQuestion.setVisible(true);
          System.out.println("total"+listQuestion.size()+"---"+currentPostitionQuestion);
    }
    public void getQuestionFromArray(int index){
         QuestionDTO instantQs=listQuestion.get(index-1);
       txtQuestion.setText(instantQs.getQuestion());
       txtAnswerA.setText(instantQs.getA());
       txtAnswerB.setText(instantQs.getB());
       txtAnswerC.setText(instantQs.getC());
       txtAnswerD.setText(instantQs.getD());
       String answer = instantQs.getAnswer();
         if (answer.equalsIgnoreCase("A"))
             txtOptionAnswerA.setSelected(true);
         else if (answer.equalsIgnoreCase("B"))
             txtOptionAnswerB.setSelected(true);
         else if (answer.equalsIgnoreCase("C"))
             txtOptionAnswerC.setSelected(true);
         else
             txtOptionAnswerD.setSelected(true);
       if(currentPostitionQuestion>=exam.getQuantity()) btnNextQuestion.setVisible(false);
    }
    private void btnPrevQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevQuestionActionPerformed
        System.out.println("total"+listQuestion.size()+"---"+currentPostitionQuestion);
        // load question prev 
        try {
              currentPostitionQuestion=currentPostitionQuestion-1;
        txtSerialQuestion.setText(String.valueOf(currentPostitionQuestion));
        getQuestionFromArray(currentPostitionQuestion);
        if(currentPostitionQuestion<=1) btnPrevQuestion.setVisible(false);
        if(currentPostitionQuestion<listQuestion.size()) btnNextQuestion.setVisible(true); 
       flag=2;
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println("Sau khi prev: total"+listQuestion.size()+"---"+currentPostitionQuestion);
    }//GEN-LAST:event_btnPrevQuestionActionPerformed

    private void txtAnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerCActionPerformed

    private void txtOptionAnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerAActionPerformed

    private void txtOptionAnswerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerBActionPerformed

    private void txtOptionAnswerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerDActionPerformed

    private void txtOptionAnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerCActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
            try {
            String mess=qsBLL.addListQuestion(listQuestion);
                JOptionPane.showMessageDialog(this,mess,"Thông Báo",JOptionPane.INFORMATION_MESSAGE);
            refreshView();
            ManageExam.openListExamPanel(exam, user);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể tạo các câu hỏi ",
                    "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCompleteActionPerformed
    private void clearField(){
        groupAnswer.clearSelection();
        txtOptionAnswerA.setSelected(false);
        txtOptionAnswerB.setSelected(false);
        txtOptionAnswerC.setSelected(false);
        txtOptionAnswerD.setSelected(false);
        txtAnswerA.setText("");
        txtAnswerB.setText("");
        txtAnswerC.setText("");
        txtAnswerD.setText("");
        txtQuestion.setText("");
        
        
        
    }
    private void btnNextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextQuestionActionPerformed
//       System.out.println("total"+listQuestion.size()+"---"+currentPostitionQuestion);
        // this.currentPostitionQuestion=currentPostitionQuestion+1;// current luôn đi truoc1 hay sao.        
        if(currentPostitionQuestion<exam.getQuantity()){
             flag=1;
        // validate
       
     
      if (currentPostitionQuestion<listQuestion.size()) {
          currentPostitionQuestion=currentPostitionQuestion+1;
          getQuestionFromArray(currentPostitionQuestion);
      }      
      else  {
          clearField();
            txtSerialQuestion.setText(String.valueOf(currentPostitionQuestion+1));
      }
        }
        else btnNextQuestion.setVisible(false);
          txtSerialQuestion.setText(String.valueOf(currentPostitionQuestion));
          if(listQuestion.size()>=2) btnPrevQuestion.setVisible(true);
          //  System.out.println("Sau khi next: total"+listQuestion.size()+"---"+currentPostitionQuestion);
        
       if(currentPostitionQuestion+1==exam.getQuantity())  btnComplete.setVisible(true);
            
    }//GEN-LAST:event_btnNextQuestionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         StringBuilder sb = new StringBuilder();
            ValidatorBLL.checkEmpty(txtQuestion, sb, "Câu hỏi còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerA, sb, "Đáp án A còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerB, sb, "Đáp án B còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerC, sb, "Đáp án C còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerD, sb, "Đáp án D còn trống!");
            ValidatorBLL.checkEmpty(txtOptionAnswerA,txtOptionAnswerB,txtOptionAnswerC,txtOptionAnswerD, sb, "Đáp án đúng còn trống!");
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

        saveQuestionIntoArray();
     
       if(listQuestion.size()==exam.getQuantity()) btnNextQuestion.setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HEADER;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnNextQuestion;
    private javax.swing.JButton btnPrevQuestion;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup groupAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbSoLuong1;
    private javax.swing.JPanel pButton;
    private javax.swing.JPanel pInput;
    private javax.swing.JPanel pInput4;
    private javax.swing.JPanel pInput5;
    private javax.swing.JTextField txClassRoom;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txQuantity;
    private javax.swing.JTextField txSubject;
    private javax.swing.JTextField txTime;
    private javax.swing.JTextField txUser;
    private javax.swing.JTextField txtAnswerA;
    private javax.swing.JTextField txtAnswerB;
    private javax.swing.JTextField txtAnswerC;
    private javax.swing.JTextField txtAnswerD;
    private javax.swing.JRadioButton txtOptionAnswerA;
    private javax.swing.JRadioButton txtOptionAnswerB;
    private javax.swing.JRadioButton txtOptionAnswerC;
    private javax.swing.JRadioButton txtOptionAnswerD;
    private javax.swing.JTextPane txtQuestion;
    private javax.swing.JTextField txtSerialQuestion;
    // End of variables declaration//GEN-END:variables
}
