import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.kon;
import javax.swing.table.DefaultTableModel;
public class MasterKostumer extends javax.swing.JFrame {
    Connection conn = kon.conn();
    Statement s;
    ResultSet rs;
    
     private void tampil(){
      DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Perusahaan");
        model.addColumn("Alamat");
        model.addColumn("Provinsi");
        model.addColumn("Kota");
        model.addColumn("Kode pos");
        model.addColumn("No Hp");
        try {
            String sql = "select * from kostumer";
            s = conn.createStatement();
            rs = s.executeQuery(sql);
            
            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                     rs.getString("no_pengirim"),rs.getString("nama"),rs.getString("nama_perusahaan"),rs.getString("alamat")
                        ,rs.getString("provinsi"),rs.getString("kota"),rs.getString("kode_pos"),rs.getString("no_hp")
                });
            }
            tblcustomer.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
      
    
    private void bersih(){
        tno.setText("");
        tnama.setText("");
        tnamap.setText("");
        talamat.setText("");
        cprov.setSelectedIndex(0);
        tkota.setText("");
        tkodep.setText("");
        thp.setText("");
        tno.requestFocus();
    }
    public MasterKostumer() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Kembali = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tkodep = new javax.swing.JTextField();
        cprov = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        tnamap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tpencarian = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tkota = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        thp = new javax.swing.JTextField();
        Pencarian = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        Minimsize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Kostumer T&T Express");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Kembali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 255));
        Kembali.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kembali.png"))); // NOI18N
        Kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KembaliMouseClicked(evt);
            }
        });
        jPanel1.add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 660, 60, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Pengirim");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel1.add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Perusahaan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        talamat.setColumns(20);
        talamat.setRows(5);
        jScrollPane1.setViewportView(talamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 240, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel1.add(tkodep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 90, -1));

        cprov.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih Provinsi--", "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi", "Bengkulu", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Lampung", "Banten", "DKI Jakarta", "Jawa Barat", "Jawa Tengah", "Jawa Timur", "DIY Yogyakarta", "Bali", "Nusa Tenggara Timur", "Nusa Tenggara Barat", "Kalimantan Barat", "Kalimantan Selatan", "Kalimantan Tengah", "Kalimantan Timur", "Kalimantan Utara", "Gorontalo", "Sulawesi Barat", "Sulawesi Selatan", "Sulawesi Tenggara", "Sulawesi Tengah", "Sulawesi Utara", "Maluku", "Maluku Utara", "Papua", "Papua Barat" }));
        jPanel1.add(cprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 352, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Provinsi");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(tnamap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kota / Kabupaten");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        tpencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpencarianKeyPressed(evt);
            }
        });
        jPanel1.add(tpencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 330, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kode Pos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));
        jPanel1.add(tkota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 240, -1));

        tblcustomer.setBackground(new java.awt.Color(153, 0, 255));
        tblcustomer.setForeground(new java.awt.Color(255, 255, 255));
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblcustomer.setOpaque(false);
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        tblcustomer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblcustomerComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(tblcustomer);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 660, 500));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No Handphone");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));
        jPanel1.add(thp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 240, -1));

        Pencarian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pencarian.setForeground(new java.awt.Color(255, 255, 255));
        Pencarian.setText("Pencarian");
        jPanel1.add(Pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));

        breset.setBackground(new java.awt.Color(153, 51, 255));
        breset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        breset.setForeground(new java.awt.Color(255, 255, 255));
        breset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        jPanel1.add(breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 130, 50));

        bsimpan.setBackground(new java.awt.Color(153, 51, 255));
        bsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsimpan.setForeground(new java.awt.Color(255, 255, 255));
        bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save_Icon_icon-icons.com_69139.png"))); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.setOpaque(false);
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 130, 50));

        bhapus.setBackground(new java.awt.Color(153, 51, 255));
        bhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close_Icon_icon-icons.com_69144.png"))); // NOI18N
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel1.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 130, 50));

        bedit.setBackground(new java.awt.Color(153, 51, 255));
        bedit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pen-on-square-of-paper-interface-symbol_icon-icons.com_56779.png"))); // NOI18N
        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel1.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 130, 50));

        Minimsize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Minimsize.setForeground(new java.awt.Color(255, 255, 255));
        Minimsize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimsize.setText("-");
        Minimsize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimsize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimsizeMouseClicked(evt);
            }
        });
        jPanel1.add(Minimsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 30, 20));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/maxresdefault.jpg"))); // NOI18N
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 720));

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

        setSize(new java.awt.Dimension(1097, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KembaliMouseClicked
        // TODO add your handling code here:
        menu utama = new menu();
        utama.setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliMouseClicked

    private void MinimsizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimsizeMouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_MinimsizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        String no = tno.getText();
        String nama = tnama.getText();
        String nama_perusahaan = tnamap.getText();
        String alamat = talamat.getText();
        String prov = cprov.getSelectedItem().toString();
        String kota = tkota.getText();
        String kode_pos = tkodep.getText();
        String no_hp = thp.getText();
         if (tno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Mohon masukan data untuk di input","PERHATIAN", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                s = conn.createStatement();
                rs = s.executeQuery("SELECT * FROM kostumer WHERE no_pengirim='"+tno.getText()+"'or nama='"+tnama.getText()+"'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Data sudah Ada coba masukan lagi","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                    tno.requestFocus();
                }else{
                    String sql = "insert into kostumer VALUES('"+no+"','"+nama+"','"+nama_perusahaan+"','"+alamat+"','"+prov+"','"
                            +kota+"','"+kode_pos+"','"+no_hp+"')";
                    s = conn.createStatement();
                    s.executeUpdate(sql);

                    bersih();
                    tampil();

                    JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN","SUKSES",JOptionPane.INFORMATION_MESSAGE);
                }
                s.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bresetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_formWindowOpened

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        // TODO add your handling code here:
        int baris = tblcustomer.getSelectedRow();
        tno.setText(tblcustomer.getModel().getValueAt(baris, 0).toString());
        tnama.setText(tblcustomer.getModel().getValueAt(baris, 1).toString());
        tnamap.setText(tblcustomer.getModel().getValueAt(baris, 2).toString());
        talamat.setText(tblcustomer.getModel().getValueAt(baris, 3).toString());
        cprov.setSelectedItem(tblcustomer.getModel().getValueAt(baris, 4).toString());
        tkota.setText(tblcustomer.getModel().getValueAt(baris, 5).toString());
        tkodep.setText(tblcustomer.getModel().getValueAt(baris, 6).toString());
        thp.setText(tblcustomer.getModel().getValueAt(baris, 7).toString());
    }//GEN-LAST:event_tblcustomerMouseClicked

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah Data ini ingin dihapus ?","Konfrmasi",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == 0) {
            try {
                String sql = "delete from kostumer where no_pengirim='"+tno.getText()+"'";
                s = conn.createStatement();
                s.executeUpdate(sql);

                bersih();
                tampil();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        String prov = cprov.getSelectedItem().toString();  
         try {
            String sql = "update kostumer set nama='"+tnama.getText()
            +"',nama_perusahaan='"+tnamap.getText()+"', alamat='"+talamat.getText()+"', provinsi='"+prov+"',kota='"+tkota.getText()
                    +"', kode_pos='"+tkodep.getText()+"', no_hp='"+thp.getText()+
                    "'WHERE no_pengirim ='"+tno.getText()+"'";
            s = conn.createStatement();
            s.executeUpdate(sql);

            bersih();
            tampil();
             JOptionPane.showMessageDialog(null, "Data Berhasi Di Ubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_beditActionPerformed

    private void tpencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpencarianKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Perusahaan");
        model.addColumn("Alamat");
        model.addColumn("Provinsi");
        model.addColumn("Kota");
        model.addColumn("Kode pos");
        model.addColumn("No Hp");
        try {
            String sql = "select * from kostumer where no_pengirim like '%"+tpencarian.getText()+"%' or nama like '%"+tpencarian.getText()+"%' or nama_perusahaan like '%"+tpencarian.getText()+"%' or alamat like '%"+tpencarian.getText()+"%'";
            s = conn.createStatement();
            rs = s.executeQuery(sql);

            int no = 0;
            while(rs.next()){
                no++;
                model.addRow(new Object[]{
                   rs.getString("no_pengirim"),rs.getString("nama"),rs.getString("nama_perusahaan"),rs.getString("alamat")
                        ,rs.getString("provinsi"),rs.getString("kota"),rs.getString("kode_pos"),rs.getString("no_hp")
                });
            }
            tblcustomer.setModel(model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tpencarianKeyPressed

    private void tblcustomerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblcustomerComponentShown
        // TODO add your handling code here:
     
    }//GEN-LAST:event_tblcustomerComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown

    }//GEN-LAST:event_jPanel1ComponentShown

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
  
    }//GEN-LAST:event_jLabel1ComponentShown

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
            java.util.logging.Logger.getLogger(MasterKostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterKostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterKostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterKostumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterKostumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Kembali;
    private javax.swing.JLabel Minimsize;
    private javax.swing.JLabel Pencarian;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsimpan;
    private javax.swing.JComboBox cprov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea talamat;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField thp;
    private javax.swing.JTextField tkodep;
    private javax.swing.JTextField tkota;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnamap;
    private javax.swing.JTextField tno;
    private javax.swing.JTextField tpencarian;
    // End of variables declaration//GEN-END:variables
}
