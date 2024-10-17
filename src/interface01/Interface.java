
package interface01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    List<Cadastro>clientes = new ArrayList<>();
    
    private ListIterator<Cadastro> moveRegistro;
    
    Cadastro cadastro = new Cadastro();
    
    public Interface() {
       initComponents();
       this.setLocationRelativeTo(null);
       btInserir.enableInputMethods(false);
    }
    
    private void inserirClientes(){
        clientes.add(cadastro);
        moveRegistro = clientes.listIterator();
        ultimoCliente();
    }
    
    private void mostrarCliente(Cadastro cadastro){
        clientes.forEach(item->JOptionPane.showMessageDialog(null, item));
    }
    
    private void ultimoCliente(){
        for(;moveRegistro.hasNext(); moveRegistro.next());
    }
    
    
    private void ordemCliente(){
        tfCodigo.setText(Integer.toString(clientes.get(moveRegistro.nextIndex() - 1).getCodCliente()));
        tfNome.setText(clientes.get(moveRegistro.nextIndex()-1).getNomeCliente());
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCadastro = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btMostrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEsquerda = new javax.swing.JButton();
        btDireita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCodigo.setText("Código:");

        lbNome.setText("Nome:");

        lbCadastro.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbCadastro.setText("Cadastro");

        tfCodigo.setEditable(false);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btMostrar.setText("Mostrar");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEsquerda.setText("<");
        btEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsquerdaActionPerformed(evt);
            }
        });

        btDireita.setText(">");
        btDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDireitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lbCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btNovo)
                                .addGap(12, 12, 12)
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btMostrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodigo)
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEsquerda)
                                .addGap(18, 18, 18)
                                .addComponent(btDireita))
                            .addComponent(btSair))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodigo)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEsquerda)
                            .addComponent(btDireita))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btMostrar)
                    .addComponent(btSair)
                    .addComponent(btInserir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        btInserir.setEnabled(true);
        
        tfCodigo.setText("");
        tfNome.setText("");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
        mostrarCliente(cadastro);
    }//GEN-LAST:event_btMostrarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        tfCodigo.setText(Integer.toString(cadastro.getCodCliente()));
        cadastro = new Cadastro(tfNome.getText());
        inserirClientes();
        JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsquerdaActionPerformed
        if(moveRegistro.hasPrevious()){
            moveRegistro.previous();
        }
        ordemCliente();
    }//GEN-LAST:event_btEsquerdaActionPerformed

    private void btDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDireitaActionPerformed
       if(moveRegistro.hasNext()){
           moveRegistro.next();
       }
       ordemCliente();
    }//GEN-LAST:event_btDireitaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDireita;
    private javax.swing.JButton btEsquerda;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btMostrar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
