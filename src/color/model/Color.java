package color.model;

import java.util.Arrays;
import java.util.Properties;

public class Color {
    int red;
    int green;
    int blue;
    String HexValue;



    public Color(String hexValue) {
        this.setHexValue(hexValue);
    }

    public Color(int red, int green, int blue) {
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);

        this.HexValue = "#"+ Integer.toHexString(red) + Integer.toHexString(green) + Integer.toHexString(blue);

    }

    /**
     * Setters
     *
     */
    public void setRed(int red) {
        if(red >= 0 && red <= 255){
            this.red = red;
        }else {
            throw new IllegalArgumentException("Put a value between 0 and 255, you have assigned for red :" + red);
        }
    }

    public void setGreen(int green) {
        if(green >= 0 && green <= 255){
            this.green = green;
        }else {
            throw new IllegalArgumentException("Put a value between 0 and 255, you have assigned for green :" + green);
        }
    }

    public void setBlue(int blue) {
        if(blue >= 0 && blue <= 255){
            this.blue = blue;
        }else {
            throw new IllegalArgumentException("Put a value between 0 and 255, you have assigned for blue :" + blue);
        }
    }

    public void setHexValue(String hexValue) {
        String[] hexCode = hexValue.split("");
        System.out.println(hexCode.length);
        System.out.println(Arrays.toString(hexCode));
        String hashtag = hexCode[0];
        System.out.println(hashtag);
        String[] red = Arrays.copyOfRange(hexCode,1,3) ;
        String[] green = Arrays.copyOfRange(hexCode,3,5);
        String[] blue = Arrays.copyOfRange(hexCode,5,7) ;


        setGreen(hexToDecimal(green));
        setBlue(hexToDecimal(blue));
        setRed(hexToDecimal(red));

        System.out.println(red);
        if(hexCode.length == 7){
            if (hashtag == "#") {
                throw new IllegalArgumentException("The hex Code must start with a hashtag #");
            }

        }

//        String re = new String(red);
//        System.out.println(re);
//        System.out.println(red.length);
//        System.out.println(Integer.parseInt(re,16));


        HexValue = hexValue;
    }


    /**
     * Getters
     *
     *
     * **/
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getHexValue() {
        return HexValue;
    }

    @Override
    public String toString() {
        return "[" +
                " Value=" + HexValue +
                ", r=" + red +
                ", g=" + green +
                ", b=" + blue +
                ']';
    }

    public int hexToDecimal(String[] hexPair){
        String hashToNum = "";
        for (int i = 0; i < hexPair.length; i++) {
            System.out.println(hexPair[i]);
            hashToNum = hashToNum + hexPair[i] ;
            System.out.println("hashToNum value : " + hashToNum);
        }
        int conv;
        try {
            conv = Integer.parseInt(hashToNum,16);

        } catch (IllegalArgumentException i){
            throw new IllegalArgumentException("Hex code contains letters from A to F, including numbers 0-9 " +
                    " the error is on :" + hashToNum);
        }

        System.out.println(conv);
        return  conv;

    }
}
