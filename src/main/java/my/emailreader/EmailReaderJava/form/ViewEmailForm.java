package my.emailreader.EmailReaderJava.form;

import my.emailreader.EmailReaderJava.bll.*;
import my.emailreader.EmailReaderJava.model.*;
import my.emailreader.EmailReaderJava.util.Message;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author bienphongvnn
 */
public class ViewEmailForm extends javax.swing.JFrame {
    User user = null;
    ArrayList idListReceive;
    ArrayList idListSend;
    EmailProcess emailProcess = new EmailProcess();
    boolean refreshClick = false;
    boolean refreshClick1 = false;
    /**
     * Creates new form ViewEmailForm
     */
    public ViewEmailForm(User user) {
        initComponents();
        if(user!=null)
            this.user = user;
        else
            Message.showError("User không tồn tại");
        setListEmail();
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
        txtTitle = new javax.swing.JLabel();
        txtSR = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSoan = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listReceive = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSend = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTitle.setText("Không có tin");

        txtSR.setText("Người gửi :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtSR)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSR))
        );

        btnSoan.setText("Soạn email");
        btnSoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoanActionPerformed(evt);
            }
        });

        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnSoan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 325, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSoan)
                    .addComponent(btnRefresh)))
        );

        listReceive.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listReceiveValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listReceive);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hộp thư đến");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hộp thư đã gửi");

        listSend.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSendValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listSend);

        txtMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane3.setViewportView(txtMessage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listReceiveValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listReceiveValueChanged
            if(refreshClick1){
                refreshClick1 = false;
                return;
            }
            int index = listReceive.getSelectedIndex();
            String title = listReceive.getSelectedValue();
            String sender= UserProcess.getEmailById(emailProcess.getEmailById((int)idListReceive.get(index)).getSender());
            String message = emailProcess.getEmailById((int)idListReceive.get(index)).getMessage();
        
            txtTitle.setText(title);
            txtSR.setText("Người gửi:"+sender);
            txtMessage.setText(message);
        
    }//GEN-LAST:event_listReceiveValueChanged

    private void listSendValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSendValueChanged
            if(refreshClick){
                refreshClick = false;
                return;
            }
            int index = listSend.getSelectedIndex();
            String title = listSend.getSelectedValue();
            String receiver= UserProcess.getEmailById(emailProcess.getEmailById((int)idListSend.get(index)).getReceiver());
            String message = emailProcess.getEmailById((int)idListSend.get(index)).getMessage();
        
            txtTitle.setText(title);
            txtSR.setText("Người nhận:"+receiver);
            txtMessage.setText(message);
       
    }//GEN-LAST:event_listSendValueChanged

    private void btnSoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoanActionPerformed
        SendEmailForm sendForm = new SendEmailForm(user);
        sendForm.pack();
        sendForm.setLocationRelativeTo(null);
        sendForm.setVisible(true);
    }//GEN-LAST:event_btnSoanActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshClick = true;
        refreshClick1 = true;
        setListEmail();
    }//GEN-LAST:event_btnRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    private void setListEmail(){
        //get Email receive

        Email[] emailsReceived = emailProcess.getListEmailsReceiveToScreen(user.getId());
        DefaultListModel dlm = new DefaultListModel();
        idListReceive = new ArrayList();
        for(int i = 0 ; i < emailsReceived.length; i++)
        {
            dlm.addElement(emailsReceived[i].getTitle());
            idListReceive.add(emailsReceived[i].getId());
        }
        listReceive.setModel(dlm);
        
        //get Email send
        Email[] emailsSend = emailProcess.getListEmailsSendToScreen(user.getId());
        DefaultListModel dlm1 = new DefaultListModel();
        idListSend = new ArrayList();
        for(int j = 0 ; j < emailsSend.length; j++)
        {
            dlm1.addElement(emailsSend[j].getTitle());
            idListSend.add(emailsSend[j].getId());
        }
        listSend.setModel(dlm1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listReceive;
    private javax.swing.JList<String> listSend;
    private javax.swing.JLabel txtMessage;
    private javax.swing.JLabel txtSR;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}