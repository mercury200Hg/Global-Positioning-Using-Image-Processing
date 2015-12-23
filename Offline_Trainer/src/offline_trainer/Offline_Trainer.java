
package offline_trainer;

import java.awt.image.BufferedImage;
import java.io.*;
import static java.lang.Integer.min;
import javax.imageio.*;

public class Offline_Trainer {
    
    public static void main(String[] args) throws IOException {
        for (int it = 1; it <= 404; it++) {
            String add;
            add = Integer.toString(it);
            String ext;
            if ((it >= 1 && it <= 96) || (it >= 143 && it <= 176) || (it >= 239 && it <= 313)) {
                ext = ".jpg";
            } else {
                ext = ".png";
            }
            String IMG = "C:\\Users\\m17\\Desktop\\Mini Project\\training_set\\img_" + add + ext;
            BufferedImage img = ImageIO.read(new File(IMG));
            int r = img.getHeight();
            int c = img.getWidth();
//          System.out.println(r + " " + c);
            int [][] R = new int [r][c];
            int [][] G = new int [r][c];
            int [][] B = new int [r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int rgb = img.getRGB(j, i);
                    R[i][j] = (rgb >> 16) & 0xff;
                    G[i][j] = (rgb >> 8 ) & 0xff;
                    B[i][j] = (rgb      ) & 0xff;
                }
            }
            int [][] scaled_R = new int [50][50];
            int [][] scaled_G = new int [50][50];
            int [][] scaled_B = new int [50][50];
            int row_times = r / 50;
            int col_times = c / 50;
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 50; j++) {
                    int r_sum = 0;
                    int g_sum = 0;
                    int b_sum = 0;
                    for (int k = i * row_times; k < min(r,(i + 1) * row_times); k++) {
                        for (int l = j * col_times; l < min(c,(j + 1) * col_times); l++) {
                            r_sum += R[k][l];
                            g_sum += G[k][l];
                            b_sum += B[k][l];
                        }
                    }
                    scaled_R[i][j] = r_sum / (row_times * col_times);
                    scaled_G[i][j] = g_sum / (row_times * col_times);
                    scaled_B[i][j] = b_sum / (row_times * col_times);
                }
            }
            File file = new File("C:\\Users\\m17\\Desktop\\Mini Project\\knowledge_store\\rgb_" + add + ".txt");
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 50; j++) {
                    bw.write(scaled_R[i][j] + "," + scaled_G[i][j] + "," + scaled_B[i][j] + " ");
                }
                bw.write("\r\n");
            }
            bw.close();
        }
    }
    
}
