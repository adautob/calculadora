/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Adauto Bueno
 */
public class Calculadora extends javax.swing.JFrame {

    
    // visor = Usado para contruir a String que vai ser usada no cálculo
    private StringBuilder visor;
    // termo = Usado para melhor trabalhar com a parte decimal da equação
    private StringBuilder termo;
    // sinal = caso o resultado seja negativo, auxilia no cálculo
    private char sinal;
    // resultado = armazena o resultado do cálculo
    private Double resultado;
    
    public Calculadora() {
        initComponents();
        termo = new StringBuilder("0");
        visor = new StringBuilder("0");
        resultado = 0d;
        atualizaVisor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTextVisor = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(264, 368));
        setMinimumSize(new java.awt.Dimension(264, 368));

        jLabelTitulo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelTitulo.setText("Calculadora");

        jTextVisor.setEditable(false);
        jTextVisor.setBackground(new java.awt.Color(255, 255, 255));
        jTextVisor.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextVisor.setActionCommand("<Not Set>");
        jTextVisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextVisor.setMaximumSize(new java.awt.Dimension(160, 50));
        jTextVisor.setMinimumSize(new java.awt.Dimension(160, 50));
        jTextVisor.setPreferredSize(new java.awt.Dimension(160, 50));

        jButton7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton0.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton0.setPreferredSize(new java.awt.Dimension(60, 40));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonDecimal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonDecimal.setText(".");
        jButtonDecimal.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonDecimal.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonDecimal.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDecimalActionPerformed(evt);
            }
        });

        jButtonApagar.setBackground(new java.awt.Color(255, 255, 204));
        jButtonApagar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.setMaximumSize(new java.awt.Dimension(90, 40));
        jButtonApagar.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonApagar.setPreferredSize(new java.awt.Dimension(90, 40));
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonIgual.setBackground(new java.awt.Color(102, 153, 255));
        jButtonIgual.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonDividir.setText("/");
        jButtonDividir.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonDividir.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonDividir.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonMultiplicar.setText("*");
        jButtonMultiplicar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonMultiplicar.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonMultiplicar.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonSomar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonSomar.setText("+");
        jButtonSomar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonSomar.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonSomar.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonSubtrair.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonSubtrair.setPreferredSize(new java.awt.Dimension(60, 40));
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonC.setBackground(new java.awt.Color(255, 153, 153));
        jButtonC.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButtonC.setText("Limpar");
        jButtonC.setMaximumSize(new java.awt.Dimension(90, 40));
        jButtonC.setMinimumSize(new java.awt.Dimension(60, 40));
        jButtonC.setPreferredSize(new java.awt.Dimension(90, 40));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jLabelTotal.setText("Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelTotal)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Código dos botões, dá append na StringBuilder visor e mostra
     * no visor da calculadora, construindo a String que ser usado no cálculo
     * 
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("7");
        termo.append("7");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("8");
        termo.append("8");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("9");
        termo.append("9");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("4");
        termo.append("4");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("5");
        termo.append("5");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("6");
        termo.append("6");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("1");
        termo.append("1");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("2");
        termo.append("2");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("3");
        termo.append("3");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if (visor.toString().equals("0"))
            visor = new StringBuilder("");
        visor.append("0");
        termo.append("0");
        calcular();
        atualizaVisor();
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDecimalActionPerformed
        String t = termo.toString();
        String v = visor.toString();
        
        // termo = usado nas validações para nao inserir o decimal "."
        // caso já tenha sido usado
        if (!t.contains("."))
            if (!v.endsWith("+")
                &&!v.endsWith("-")
                &&!v.endsWith("*")
                &&!v.endsWith("/")
                &&!v.endsWith(".")){
                    visor.append(".");
                    termo.append(".");
                }
            
        
        atualizaVisor();
    }//GEN-LAST:event_jButtonDecimalActionPerformed

    
    // Código dos botões dos operadores, adiciona os operadores
    // na String do visor, para o cálculo posterior
    // Botão dividir
    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        String s = visor.toString();
        // faz as validações, se operador ainda não foi inserido
        // faz o append na String
        if (!s.endsWith("+")
                &&!s.endsWith("-")
                &&!s.endsWith("*")
                &&!s.endsWith("/")
                &&!s.endsWith(".")){
            visor.append("/");
            termo = new StringBuilder("0");
        }
        
        atualizaVisor();
    }//GEN-LAST:event_jButtonDividirActionPerformed

    // igual código acima, botão Multiplicar
    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        String s = visor.toString();
        if (!s.endsWith("+")
                &&!s.endsWith("-")
                &&!s.endsWith("*")
                &&!s.endsWith("/")
                &&!s.endsWith(".")){
            visor.append("*");
            termo = new StringBuilder("0");
        }
        
        atualizaVisor();
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    // igual código acima, botão Subtrair
    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        String s = visor.toString();
        if (!s.endsWith("+")
                &&!s.endsWith("-")
                &&!s.endsWith("*")
                &&!s.endsWith("/")
                &&!s.endsWith(".")){
            visor.append("-");
            termo = new StringBuilder("0");
        }
        
        atualizaVisor();
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    // igual código acima, botão Somar
    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        String s = visor.toString();
        if (!s.endsWith("+")
                &&!s.endsWith("-")
                &&!s.endsWith("*")
                &&!s.endsWith("/")
                &&!s.endsWith(".")){
            visor.append("+");
            termo = new StringBuilder("0");
        }
        
        atualizaVisor();

    }//GEN-LAST:event_jButtonSomarActionPerformed

    // código botão para zerar o visor
    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        visor = new StringBuilder("0");
        termo = new StringBuilder("0");
        atualizaVisor();
        calcular();
    }//GEN-LAST:event_jButtonCActionPerformed

    // código botão backspace
    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        // chama método para fazer o backspace no visor
        removerUltimoCaractere();
    }//GEN-LAST:event_jButtonApagarActionPerformed

    // botão igual, atribui resultado no visor
    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if (!visor.toString().equals("0")){
            visor = new StringBuilder(String.valueOf(resultado));
            termo = new StringBuilder(String.valueOf(resultado));        
        }
   
        atualizaVisor();
    }//GEN-LAST:event_jButtonIgualActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JTextField jTextVisor;
    // End of variables declaration//GEN-END:variables

    // método para fazer o backspace no visor
    private void removerUltimoCaractere() {
        if (visor.length()>0)
            visor.deleteCharAt(visor.length()-1);
        if (termo.length()>0)
            termo.deleteCharAt(termo.length()-1);
        if (visor.length()==1&&visor.toString().startsWith("-"))
            visor = new StringBuilder("0");
        if (termo.length()==1&&termo.toString().startsWith("-"))
            termo = new StringBuilder("0");
        if (visor.length()==0)
            visor = new StringBuilder("0");
        if (termo.length()==0)
            termo = new StringBuilder("0");
            
        atualizaVisor();
        

        calcular();

        
   
        
    }

    // método atribuir valor da variável visor para o jText na tela
    private void atualizaVisor() {
        jTextVisor.setText(visor.toString());
    }

    // método para fazer o cálculo da operação
    private void calcular() {
        String v = visor.toString();
        boolean primeiroTermoNegativo = false;
        
        // validação se o primeiro termo da String é negativo
        if (v.startsWith("-")){
            v = v.substring(1, v.length());
            primeiroTermoNegativo = true;
            
        }
        
        // se String termina com algum operador,
        // será removido antes do cálculo
        if ((v.endsWith("+"))
                ||(v.endsWith("-"))
                ||(v.endsWith("*"))
                ||(v.endsWith("/"))){
            v = v.substring(0, v.length()-1);
        }
        
        // declaração variável do operador
        StringBuilder o = new StringBuilder("");
        // declaração Array que conterá os Termos da operação
        // que foram splitados da String do visor usando regex
        String[] arrayVisor = v.split("\\+|\\-|\\*|\\/");
        
        // percorre String do visor, e pega os sinais dos operadores
        // e monta outra String com os mesmos
        for (int i = 0; i < v.length(); i++){
            if ((!Character.isDigit(v.charAt(i))) && (v.charAt(i)!='.'))
                o.append(v.charAt(i));
        }
        
        // já inicializa a variável resultado com
        // valor do primeiro termo da String do visor
        if (primeiroTermoNegativo)
            resultado = -Double.parseDouble(arrayVisor[0]);
        else
            resultado = Double.parseDouble(arrayVisor[0]);
        
            // código do cálculo, percorre o array dos operadores
            // fazendo um switch e faz o cálculo usando o índice
            // do For para acessar os elementos do Array onde
            // estão os Termos da operação e assim fazer o cálculo
            // e atribuido na variável Resultado
            for (int i = 0; i < o.length(); i++){
                try{
                    switch (o.charAt(i)) {
                        case '+':
                            resultado += Double.parseDouble(arrayVisor[i+1]);
                            break;
                        case '-':
                            resultado -= Double.parseDouble(arrayVisor[i+1]);
                            break;
                        case '*':
                            resultado *= Double.parseDouble(arrayVisor[i+1]);
                            break;
                        case '/':
                            resultado /= Double.parseDouble(arrayVisor[i+1]);
                            break;
                        default:
                            break;
                    }                
                } catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Erro: "+e.getMessage());
                }
                
            }        

        // validação para caso ocorra divisão por zero
        // ou algum outro resultado inesperado no cálculo
        if (resultado.isInfinite()||resultado.isNaN()){
            JOptionPane.showMessageDialog(rootPane, "Erro na operação");
            resultado = 0d;
        }
        // mostra na tela, resultado da operação a cada incremento no visor
        jLabelTotal.setText("Total: " + resultado);

    }
}
