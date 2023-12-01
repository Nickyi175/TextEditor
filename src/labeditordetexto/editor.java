package labeditordetexto;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.rtf.RTFEditorKit;

public class editor extends javax.swing.JFrame {

    public editor() {
        initComponents();
        doc = vis.getStyledDocument();
        estilo = vis.addStyle("n", null);
        f();

    }

    private void f() {
        DefaultComboBoxModel mod = (DefaultComboBoxModel) fuente.getModel();
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String listaF[] = e.getAvailableFontFamilyNames();
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (int i = 0; i < fonts.length; i++) {
            mod.addElement(fonts[i]);
        }
        fuente.setModel(mod);
    }
    StyledDocument doc;
    Style estilo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fuente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vis = new javax.swing.JTextPane();
        color = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sub = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quitar_sub = new javax.swing.JButton();
        tamaño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        quitFondo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bold = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        byeBold = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        byeIta = new javax.swing.JButton();
        crearArchivo = new javax.swing.JButton();
        abrirArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de texto");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        fuente.setBackground(new java.awt.Color(255, 255, 255));
        fuente.setForeground(new java.awt.Color(0, 0, 0));
        fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fuenteItemStateChanged(evt);
            }
        });
        fuente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fuenteMouseClicked(evt);
            }
        });
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Fuente:");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Tamaño:");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Color:");

        jScrollPane2.setViewportView(vis);

        color.setBackground(new java.awt.Color(0, 0, 0));
        color.setForeground(new java.awt.Color(255, 255, 255));
        color.setText("A");
        color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Subrayar:");

        sub.setBackground(new java.awt.Color(255, 255, 51));
        sub.setForeground(new java.awt.Color(0, 0, 0));
        sub.setText("Sub");
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Quitar sub:");

        quitar_sub.setBackground(new java.awt.Color(255, 255, 255));
        quitar_sub.setForeground(new java.awt.Color(0, 0, 0));
        quitar_sub.setText("sub :( ");
        quitar_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitar_subMouseClicked(evt);
            }
        });

        tamaño.setBackground(new java.awt.Color(255, 255, 255));
        tamaño.setForeground(new java.awt.Color(0, 0, 0));
        tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "8", "10", "12", "14", "16", "18", "20", "24", "28", "30", "36", "40", "44", "48", "52", "60", "70", "80", "90", "100" }));
        tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Fondo:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("...");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Quitar fondo:");

        quitFondo.setBackground(new java.awt.Color(255, 255, 255));
        quitFondo.setForeground(new java.awt.Color(0, 0, 0));
        quitFondo.setText("...");
        quitFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitFondoMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Negrita:");

        bold.setBackground(new java.awt.Color(255, 255, 255));
        bold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bold.setForeground(new java.awt.Color(0, 0, 0));
        bold.setText("B");
        bold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boldMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Quitar Negrita:");

        byeBold.setBackground(new java.awt.Color(255, 255, 255));
        byeBold.setForeground(new java.awt.Color(0, 0, 0));
        byeBold.setText("B");
        byeBold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                byeBoldMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Italic:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("I");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Quitar Italic:");

        byeIta.setBackground(new java.awt.Color(255, 255, 255));
        byeIta.setForeground(new java.awt.Color(0, 0, 0));
        byeIta.setText("I");
        byeIta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                byeItaMouseClicked(evt);
            }
        });

        crearArchivo.setBackground(new java.awt.Color(255, 255, 255));
        crearArchivo.setForeground(new java.awt.Color(0, 0, 0));
        crearArchivo.setText("Guardar");
        crearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearArchivoMouseClicked(evt);
            }
        });

        abrirArchivo.setBackground(new java.awt.Color(255, 255, 255));
        abrirArchivo.setForeground(new java.awt.Color(0, 0, 0));
        abrirArchivo.setText("Abrir archivo");
        abrirArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirArchivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tamaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(abrirArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(crearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(color)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(bold)
                                            .addComponent(jButton2)
                                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quitFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(byeBold)
                                            .addComponent(byeIta)
                                            .addComponent(quitar_sub))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bold, byeBold, byeIta, jButton1, jButton2, quitFondo, quitar_sub, sub});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fuente, tamaño});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(quitar_sub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitFondo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(byeBold, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(byeIta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(crearArchivo)
                                .addGap(13, 13, 13)
                                .addComponent(abrirArchivo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(color))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sub)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bold)
                                    .addComponent(jLabel8))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bold, byeBold, byeIta, jButton1, jButton2, quitFondo, quitar_sub, sub});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fuente, tamaño});

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

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorMouseClicked
        try {
            StyleConstants.setForeground(estilo, JColorChooser.showDialog(this, "Elija color", Color.yellow));

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("error en color");
        }
    }//GEN-LAST:event_colorMouseClicked

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
        try {
            StyleConstants.setUnderline(estilo, true);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
//            sub.setVisible(false);
//            quitar_sub.setVisible(true);
            System.out.println("subrayó");
        } catch (Exception ex) {
            System.out.println("error en subrayar");
        }

    }//GEN-LAST:event_subMouseClicked

    private void quitar_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitar_subMouseClicked
        try {
            StyleConstants.setUnderline(estilo, false);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
//            sub.setVisible(true);
//            quitar_sub.setVisible(false);
            System.out.println("quitó subrayado");
        } catch (Exception ex) {
            System.out.println("error en quitar highlighter");
        }
    }//GEN-LAST:event_quitar_subMouseClicked

    private void tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoActionPerformed
        StyleConstants.setFontSize(estilo, Integer.parseInt(tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
    }//GEN-LAST:event_tamañoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            StyleConstants.setBackground(estilo, Color.YELLOW);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("ups");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void quitFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitFondoMouseClicked
        try {
            StyleConstants.setBackground(estilo, Color.white);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("ups");
        }
    }//GEN-LAST:event_quitFondoMouseClicked

    private void fuenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fuenteMouseClicked

    }//GEN-LAST:event_fuenteMouseClicked

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuenteActionPerformed

    private void fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fuenteItemStateChanged
        StyleConstants.setFontFamily(estilo, fuente.getSelectedItem().toString());
        doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);

    }//GEN-LAST:event_fuenteItemStateChanged

    private void boldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boldMouseClicked
        try {
            StyleConstants.setBold(estilo, true);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("error bold");
        }
    }//GEN-LAST:event_boldMouseClicked

    private void byeBoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byeBoldMouseClicked
        try {
            StyleConstants.setBold(estilo, false);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("error quitar bold");
        }
    }//GEN-LAST:event_byeBoldMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            StyleConstants.setItalic(estilo, true);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("error italic");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void byeItaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_byeItaMouseClicked
        try {
            StyleConstants.setItalic(estilo, false);

            doc.setCharacterAttributes(vis.getSelectionStart(), vis.getSelectionEnd() - vis.getSelectionStart(), vis.getStyle("n"), true);
        } catch (Exception ex) {
            System.out.println("ups");
        }
    }//GEN-LAST:event_byeItaMouseClicked

    private void abrirArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirArchivoMouseClicked
        JFileChooser fac = new JFileChooser();
        fac.setCurrentDirectory(new File("."));
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("TXT files", "txt");
        fac.setFileFilter(fnef);

        int AA = fac.showOpenDialog(null);

        if (AA == JFileChooser.APPROVE_OPTION) {
            File file = new File(fac.getSelectedFile().getAbsolutePath());

            try {
                FileInputStream fis = new FileInputStream(file);
                vis.setText("");
                JOptionPane.showMessageDialog(null, "SE HA ABIERTO EL ARCHIVO");
                StyledDocument doc = vis.getStyledDocument();
                RTFEditorKit kit = new RTFEditorKit();
                kit.read(fis, doc, 0);

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException | BadLocationException e2) {
                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_abrirArchivoMouseClicked

    private void crearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearArchivoMouseClicked
        if (vis.getText().isEmpty() || vis.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "NO HA INGRESADO TEXTO");
        } else {
            JFileChooser fac = new JFileChooser();
            fac.setCurrentDirectory(new File("."));

            int AA = fac.showSaveDialog(null);

            if (AA == JFileChooser.APPROVE_OPTION) {
                File file = new File(fac.getSelectedFile().getAbsolutePath() + ".txt");
                try {
                    StyledDocument doc = vis.getStyledDocument();
                    FileOutputStream fos = new FileOutputStream(file);
                    RTFEditorKit kit = new RTFEditorKit();
                    kit.write(fos, doc, 0, doc.getLength());
                    vis.setText("");
                    JOptionPane.showMessageDialog(null, "ARCHIVO GUARDADO");
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException | BadLocationException e2) {
                    e2.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_crearArchivoMouseClicked

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirArchivo;
    private javax.swing.JButton bold;
    private javax.swing.JButton byeBold;
    private javax.swing.JButton byeIta;
    private javax.swing.JButton color;
    private javax.swing.JButton crearArchivo;
    private javax.swing.JComboBox<String> fuente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton quitFondo;
    private javax.swing.JButton quitar_sub;
    private javax.swing.JButton sub;
    private javax.swing.JComboBox<String> tamaño;
    private javax.swing.JTextPane vis;
    // End of variables declaration//GEN-END:variables

}
