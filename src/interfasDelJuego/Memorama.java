/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfasDelJuego;

import memo.Ordenamiento;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Dark
 */
public class Memorama extends javax.swing.JFrame {

    private FondoDelPanel fondo;
    private Ordenamiento log = new Ordenamiento();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public Memorama() {
        initComponents();
        fondo = new FondoDelPanel(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        setCards();
    }       
    
    private void setCards() {
        int[] numbers = log.getCardNumbers();
        
        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[0]+".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[1]+".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[2]+".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[3]+".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[4]+".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[5]+".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[6]+".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[7]+".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[8]+".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[9]+".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[10]+".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[11]+".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[12]+".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[13]+".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[14]+".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("../cartas/c"+numbers[15]+".png")));
    }    
    
    private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 2;
            pregwin();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                
            }
            caraUp = false;
        }
    }
    
    private void reiniciar() {
        
        btnC1.setEnabled(true);
        btnC2.setEnabled(true);
        btnC3.setEnabled(true);
        btnC4.setEnabled(true);
        btnC5.setEnabled(true);
        btnC6.setEnabled(true);
        btnC7.setEnabled(true);
        btnC8.setEnabled(true);
        btnC9.setEnabled(true);
        btnC10.setEnabled(true);
        btnC11.setEnabled(true);
        btnC12.setEnabled(true);
        btnC13.setEnabled(true);
        btnC14.setEnabled(true);
        btnC15.setEnabled(true);
        btnC16.setEnabled(true);
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
        setCards();
    }
    
    private void pregwin() {
        if(!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled() && 
                !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled() && 
                !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled()) {
            JOptionPane.showMessageDialog(this, "GAME OVER!!!!. SOLO LOGRASTE: "+puntaje +" PUNTITOS", "JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EL MEMORAMA SAW BY ANDRES SORIA");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUE COMIENCE EL JUEGO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setFocusable(false);
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setFocusable(false);
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setFocusable(false);
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setFocusable(false);
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setFocusable(false);
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setFocusable(false);
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setFocusable(false);
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setFocusable(false);
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setFocusable(false);
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setFocusable(false);
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setFocusable(false);
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setFocusable(false);
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setFocusable(false);
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setFocusable(false);
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setFocusable(false);
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartas/c0.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setFocusable(false);
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnC13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC2)
                    .addComponent(btnC1)
                    .addComponent(btnC3)
                    .addComponent(btnC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC6)
                    .addComponent(btnC5)
                    .addComponent(btnC7)
                    .addComponent(btnC8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC9)
                    .addComponent(btnC10)
                    .addComponent(btnC11)
                    .addComponent(btnC12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC13)
                    .addComponent(btnC14)
                    .addComponent(btnC15)
                    .addComponent(btnC16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReiniciar.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(204, 0, 0));
        btnReiniciar.setText("TE ATREVES!");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(910, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        btnEnabled(btnC15);
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        btnEnabled(btnC16);
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:        
        compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnC1;
    public javax.swing.JButton btnC10;
    public javax.swing.JButton btnC11;
    public javax.swing.JButton btnC12;
    public javax.swing.JButton btnC13;
    public javax.swing.JButton btnC14;
    public javax.swing.JButton btnC15;
    public javax.swing.JButton btnC16;
    public javax.swing.JButton btnC2;
    public javax.swing.JButton btnC3;
    public javax.swing.JButton btnC4;
    public javax.swing.JButton btnC5;
    public javax.swing.JButton btnC6;
    public javax.swing.JButton btnC7;
    public javax.swing.JButton btnC8;
    public javax.swing.JButton btnC9;
    javax.swing.JButton btnReiniciar;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
