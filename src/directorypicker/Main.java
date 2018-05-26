package directorypicker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TestJFilePicker frame = new TestJFilePicker("Shows Image Icons");

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        frame.setVisible(true);
        frame.add(chooser);
        if(chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            File[] files = selectedFile.listFiles(
                    new FileFilter() {
                        @Override
                        public boolean accept(File pathname) {
                            return pathname.getName().toLowerCase().endsWith(".jpg");
                        }
                    }
            );
            for (File file : files) {
                System.out.println(file.getName());
                Image resizedImage = ImageIO.read(file).getScaledInstance(50,50, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(resizedImage);
                frame.add(new JLabel(icon));
                frame.setVisible(true);
            }
        }
        frame.setVisible(true);

    }
}
