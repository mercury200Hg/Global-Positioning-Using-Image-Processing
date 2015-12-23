
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.min;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Place_and_GPS_Finder extends javax.swing.JFrame {
    
    String filename;
    
    public Place_and_GPS_Finder() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        File_Chooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        location = new javax.swing.JTextField();
        gps_val = new javax.swing.JTextField();
        image_label = new javax.swing.JLabel();
        given_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        File_Chooser.setDialogTitle("Select the Image");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setPreferredSize(new java.awt.Dimension(1400, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Meiryo", 0, 24)); // NOI18N
        jLabel1.setText("Location and GPS Value Finder");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 375, 40));

        jLabel2.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        jLabel2.setText("Select the Image");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 27));

        jLabel3.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        jLabel3.setText("Location of the Image");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 215, 27));

        jLabel4.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        jLabel4.setText("GPS Value");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 181, 27));

        jButton1.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, -1));

        jButton2.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jButton3.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jButton4.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, -1, -1));

        location.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        getContentPane().add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 290, 490, -1));

        gps_val.setFont(new java.awt.Font("Meiryo", 0, 18)); // NOI18N
        getContentPane().add(gps_val, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 350, 490, -1));
        getContentPane().add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 350, 230));
        getContentPane().add(given_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 350, 210));

        jLabel5.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 120, 20));

        jLabel6.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int returnVal = File_Chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = File_Chooser.getSelectedFile();
            filename = file.getAbsolutePath();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BufferedImage given_img = null;
        try {
            given_img = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
        }
        int given_r = given_img.getHeight();
        int given_c = given_img.getWidth();
        int [][] given_R = new int [given_r][given_c];
        int [][] given_G = new int [given_r][given_c];
        int [][] given_B = new int [given_r][given_c];
        for (int i = 0; i < given_r; i++) {
            for (int j = 0; j < given_c; j++) {
                int given_rgb = given_img.getRGB(j, i);
                given_R[i][j] = (given_rgb >> 16) & 0xff;
                given_G[i][j] = (given_rgb >> 8 ) & 0xff;
                given_B[i][j] = (given_rgb      ) & 0xff;
            }
        }
        int [][] given_scaled_R = new int [50][50];
        int [][] given_scaled_G = new int [50][50];
        int [][] given_scaled_B = new int [50][50];
        int given_row_times = given_r / 50;
        int given_col_times = given_c / 50;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                int r_sum = 0;
                int g_sum = 0;
                int b_sum = 0;
                for (int k = i * given_row_times; k < min(given_r,(i + 1) * given_row_times); k++) {
                    for (int l = j * given_col_times; l < min(given_c,(j + 1) * given_col_times); l++) {
                        r_sum += given_R[k][l];
                        g_sum += given_G[k][l];
                        b_sum += given_B[k][l];
                    }
                }
                given_scaled_R[i][j] = r_sum / (given_row_times * given_col_times);
                given_scaled_G[i][j] = g_sum / (given_row_times * given_col_times);
                given_scaled_B[i][j] = b_sum / (given_row_times * given_col_times);
            }
        }
        int mx1 = 0;
        int idx1 = -1;
        int mx2 = 0;
        int idx2 = -1;
        for (int it = 1; it <= 404; it++) {
            String add;
            add = Integer.toString(it);
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("knowledge_store\\rgb_" + add + ".txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            int [][] R = new int [52][52];
            int [][] G = new int [52][52];
            int [][] B = new int [52][52];
            String s;
            int row = 0;
            try {
                while ((s = br.readLine()) != null) {
                    int col = 0;
                    int sz = s.length();
                    int r_val = -1;
                    int g_val = -1;
                    int b_val = -1;
                    int temp = 0;
                    for (int i = 0; i < sz; i++) {
                        if (s.charAt(i) == ' ') {
                            b_val = temp;
                            R[row][col] = r_val;
                            G[row][col] = g_val;
                            B[row][col] = b_val;
                            col++;
                            r_val = -1;
                            g_val = -1;
                            b_val = -1;
                            temp = 0;
                            continue;
                        }
                        if (s.charAt(i) == ',') {
                            if (r_val == -1) {
                                r_val = temp;
                            } else {
                                g_val = temp;
                            }
                            temp = 0;
                        } else {
                            temp = temp * 10 + s.charAt(i) - '0';
                        }
                    }
                    b_val = temp;
                    R[row][col] = r_val;
                    G[row][col] = g_val;
                    B[row][col] = b_val;
                    col++;
                    r_val = -1;
                    g_val = -1;
                    b_val = -1;
                    temp = 0;
                    row++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            int cnt = 0;
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 50; j++) {
                    if (abs(R[i][j] - given_scaled_R[i][j]) < 7 && abs(G[i][j] - given_scaled_G[i][j]) < 7 && abs(B[i][j] - given_scaled_B[i][j]) < 7) {
                        cnt++;
                    }
                }
            }
//            System.out.println(it + "   " + cnt);
            if (cnt > mx2) {
                if (cnt > mx1) {
                    mx2 = mx1;
                    idx2 = idx1;
                    mx1 = cnt;
                    idx1 = it;
                } else {
                    mx2 = cnt;
                    idx2 = it;
                }
            }
        }
        if (mx1 < 40) {
            jLabel5.setText("Given Image");
            ImageIcon logo = new ImageIcon(filename);
            Image image = logo.getImage();
            Image newimg = image.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            logo = new ImageIcon(newimg);
            given_label.setIcon(logo);
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"This image is not suitable for matching !!");
        } else if (mx1 - mx2 <= 5 && abs(idx1 - idx2) <= 50) {
            jLabel5.setText("Given Image");
            ImageIcon logo = new ImageIcon(filename);
            Image image = logo.getImage();
            Image newimg = image.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            logo = new ImageIcon(newimg);
            given_label.setIcon(logo);
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"This image has ambiguity for more than one image !!");
        } else {
            int img_idx = idx1;
            BufferedReader br1 = null;
            try {
                br1 = new BufferedReader(new FileReader("knowledge_store\\range_map.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            String s;
            int id,l,r;
            try {
                while ((s = br1.readLine()) != null) {
                    int sz = s.length();
                    int i = 0;
                    int num = 0;
                    while (i < sz && s.charAt(i) != ' ') {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    i++;
                    id = num;
                    num = 0;
                    while (i < sz && s.charAt(i) != ' ') {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    i++;
                    l = num;
                    num = 0;
                    while (i < sz && s.charAt(i) != ' ') {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    r = num;
                    if (idx1 >= l && idx1 <= r) {
                        idx1 = id;
                        break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br2 = null;
            try {
                br2 = new BufferedReader(new FileReader("knowledge_store\\location_map.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while ((s = br2.readLine()) != null) {
                    int sz = s.length();
                    int i = 0;
                    int num = 0;
                    while (i < sz && s.charAt(i) != ' ') {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    i++;
                    if (num == idx1) {
                        String ans = "";
                        while (i < sz) {
                            ans = ans + s.charAt(i);
                            i++;
                        }
                        location.setText(ans);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader br3 = null;
            try {
                br3 = new BufferedReader(new FileReader("knowledge_store\\gps_map.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while ((s = br3.readLine()) != null) {
                    int sz = s.length();
                    int i = 0;
                    int num = 0;
                    while (i < sz && s.charAt(i) != ' ') {
                        num = num * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    i++;
                    if (num == idx1) {
                        String s1 = "";
                        while (i < sz && s.charAt(i) != ' ') {
                            s1 = s1 + s.charAt(i);
                            i++;
                        }
                        i++;
                        String s2 = "";
                        while (i < sz && s.charAt(i) != ' ') {
                            s2 = s2 + s.charAt(i);
                            i++;
                        }
                        s1 = process(s1);
                        s2 = process(s2);
                        String ans = s1 + " , " + s2;
                        gps_val.setText(ans);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(Level.SEVERE, null, ex);
            }
            jLabel5.setText("Given Image");
            jLabel6.setText("Matched Image");
            ImageIcon logo = new ImageIcon(filename);
            Image image = logo.getImage();
            Image newimg = image.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            logo = new ImageIcon(newimg);
            given_label.setIcon(logo);
            String img = "C:\\Users\\m17\\Desktop\\Mini Project\\training_set\\img_";
            String add = Integer.toString(img_idx);
            String ext;
            if ((img_idx >= 1 && img_idx <= 96) || (img_idx >= 143 && img_idx <= 176) || (img_idx >= 239 && img_idx <= 313)) {
                ext = ".jpg";
            } else {
                ext = ".png";
            }
            img = img + add + ext;
            ImageIcon iconLogo = new ImageIcon(img);
            image = iconLogo.getImage();
            newimg = image.getScaledInstance(400,400,Image.SCALE_SMOOTH);
            iconLogo = new ImageIcon(newimg);
            image_label.setIcon(iconLogo);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        location.setText("");
        gps_val.setText("");
        jLabel5.setText("");
        jLabel6.setText("");
        given_label.setIcon(null);
        image_label.setIcon(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    public String process (String s) {
        String temp = "";
        for (int i = 0; i < 3; i++) {
            temp = temp + s.charAt(i + 11);
        }
        s = s + temp;
        return s;
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
            java.util.logging.Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Place_and_GPS_Finder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Place_and_GPS_Finder().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser File_Chooser;
    private javax.swing.JLabel given_label;
    private javax.swing.JTextField gps_val;
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField location;
    // End of variables declaration//GEN-END:variables
}
