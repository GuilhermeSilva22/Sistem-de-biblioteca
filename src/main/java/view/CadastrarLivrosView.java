/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LivroModel;
import javax.swing.JOptionPane;
import repositories.LivroRepository;

/**
 *
 * @author Samsung
 */
public class CadastrarLivrosView extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarLivrosView
     */
    public CadastrarLivrosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descricao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_estante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_prateleira = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txt_descricao.setColumns(20);
        txt_descricao.setRows(5);
        jScrollPane2.setViewportView(txt_descricao);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("VOLTAR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(141, 124, 108));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(162, 173, 145), new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(219, 219, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(81, 71, 75)));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 71, 75));
        jLabel1.setText("Cadastrar Livros");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("T??tulo do Livro");

        txt_titulo.setBackground(new java.awt.Color(204, 204, 204));
        txt_titulo.setForeground(new java.awt.Color(0, 0, 0));
        txt_titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tituloKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quantidade de Livros");

        txt_quantidade.setBackground(new java.awt.Color(204, 204, 204));
        txt_quantidade.setForeground(new java.awt.Color(0, 0, 0));
        txt_quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_quantidadeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("N??mero da Estante");

        txt_estante.setBackground(new java.awt.Color(204, 204, 204));
        txt_estante.setForeground(new java.awt.Color(0, 0, 0));
        txt_estante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_estanteKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("N??mero da Prateleira");

        txt_prateleira.setBackground(new java.awt.Color(204, 204, 204));
        txt_prateleira.setForeground(new java.awt.Color(0, 0, 0));
        txt_prateleira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_prateleiraKeyPressed(evt);
            }
        });

        btn_cadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(51, 51, 51));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(204, 204, 204));
        btn_voltar.setForeground(new java.awt.Color(0, 0, 0));
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(67, 67, 67))
                    .addComponent(txt_titulo)
                    .addComponent(txt_estante))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(66, 66, 66))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_prateleira))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(258, 258, 258))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo)
                    .addComponent(txt_quantidade))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prateleira)
                    .addComponent(txt_estante))
                .addGap(46, 46, 46)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_voltar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        try {
            MenuView menu = new MenuView();
            LivroRepository l = new LivroRepository();
            LivroModel livro = new LivroModel();
            livro.setTitulo(txt_titulo.getText());
            String c = txt_quantidade.getText();
            if (c.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo quantidade n??o pode ser vazio");
            } else if (c.contains(".") || c.contains(",")) {
                JOptionPane.showMessageDialog(null, "O campo quantidade n??o pode conter n??meros decimais");
            }
            int i = Integer.parseInt(c);
            livro.setQuantidade(i);
            livro.setEstante(txt_estante.getText());
            livro.setPrateleira(txt_prateleira.getText());
            l.Cadastrar(livro);
            this.setVisible(false);
            menu.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarLivrosView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarLivrosView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarLivrosView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        this.setVisible(false);
        MenuView menu = new MenuView();
        menu.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_tituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tituloKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_quantidade.requestFocus();
            
        }
    }//GEN-LAST:event_txt_tituloKeyPressed

    private void txt_quantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantidadeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_estante.requestFocus();
        }
    }//GEN-LAST:event_txt_quantidadeKeyPressed

    private void txt_estanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estanteKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txt_prateleira.requestFocus();
            
        }
    }//GEN-LAST:event_txt_estanteKeyPressed

    private void txt_prateleiraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prateleiraKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btn_cadastrar.requestFocus();
            
        }
    }//GEN-LAST:event_txt_prateleiraKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarLivrosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarLivrosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txt_descricao;
    private javax.swing.JTextField txt_estante;
    private javax.swing.JTextField txt_prateleira;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
