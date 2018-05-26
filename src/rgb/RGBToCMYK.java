package rgb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RGBToCMYK {
    public static void main(String[] args) throws Exception {
        File dataFile = new File("//Users//saikv//Desktop//saikumar//Practice projects//practice//src//rgb//colors.txt");
        BufferedReader br = new BufferedReader(new FileReader(dataFile));
        String st;
        int RGB[] = new int[3];
        double CMYK[] = new double[4];
        while ((st = br.readLine()) != null) {
            String rgb[] = st.split(" ");
            RGB[0] = Integer.parseInt(rgb[0]);
            RGB[1] = Integer.parseInt(rgb[1]);
            RGB[2] = Integer.parseInt(rgb[2]);
            System.out.println("RGB VALUES: ");
            printRGB(RGB);
            System.out.println("validateRGB: "+validateRGB(RGB));
            System.out.println("Maximum of RGB: "+maximum(RGB));
            RGBtoCMYK(RGB, CMYK);
            System.out.println("CMYK VALUES: ");
            printCMYK(CMYK);
            System.out.println();
        }
    }
    public static boolean validateRGB(int RGB[]){
        //if all r, g, b values are valid pixel values, then only return true. Otherwise return false.
        return isValidPixel(RGB[0]) && isValidPixel(RGB[1]) && isValidPixel(RGB[2]);
    }
    private static boolean isValidPixel(int pixelValue){
        //if pixel value is between 0 and 255, then it is valid. Otherwise not valid.
        return pixelValue>=0 && pixelValue <= 255;
    }
    public static int maximum(int x[]){
        int max = x[0];
        for (int value : x) {
            max = Math.max(max, value);
        }
        return max;
    }
    public static void RGBtoCMYK(int RGB[], double CMYK[]){
        int r = RGB[0], g = RGB[1], b = RGB[2];

        //w = max(r/255, g/255, b/255)
        double w = Math.max(r/255.0 , g/255.0);
        w = Math.max(w, b/255.0);

        //c = (w-(r/255))/w
        double c = (w - (r/255.0))/w;

        //m = (w-(g/255))/w
        double m = (w - (g/255.0))/w;

        //y = (w-(b/255))/w
        double y = (w - (b/255.0))/w;

        //k = 1-w
        double k = 1-w;

        //taking absolute values and storing into CMYK Array
        CMYK[0] = Math.abs(c);
        CMYK[1] = Math.abs(m);
        CMYK[2] = Math.abs(y);
        CMYK[3] = Math.abs(k);
    }
    public static void printRGB(int RGB[]){
        System.out.println("Red: "+RGB[0]);
        System.out.println("Green: "+RGB[1]);
        System.out.println("Blue: "+RGB[2]);
    }
    public static void printCMYK(double CMYK[]){
        System.out.println("Cyan: "+CMYK[0]);
        System.out.println("Magenta: "+CMYK[1]);
        System.out.println("Yellow: "+CMYK[2]);
        System.out.println("Black: "+CMYK[3]);
    }
}
