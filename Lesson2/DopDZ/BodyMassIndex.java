package HW.DopDZ.BMI;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BodyMassIndex {
    String bmi = "118 2.05\n" +
            "106 1.77\n" +
            "87 1.83\n" +
            "45 1.12\n" +
            "70 1.87\n" +
            "54 1.57\n" +
            "105 1.76\n" +
            "50 1.96\n" +
            "114 1.76\n" +
            "72 2.45\n" +
            "53 2.10\n" +
            "66 2.25\n" +
            "54 1.50\n" +
            "95 1.62\n" +
            "86 1.72\n" +
            "62 1.57\n" +
            "65 2.24\n" +
            "72 1.43\n" +
            "93 2.01\n" +
            "109 3.01\n" +
            "106 2.97\n" +
            "77 1.69\n" +
            "114 2.09\n" +
            "98 1.72\n" +
            "85 2.46\n" +
            "113 1.94\n" +
            "53 1.77\n" +
            "106 2.30\n";
    Pattern p = Pattern.compile("^*\\d\\d\\d?\\s\\d[.]\\d\\d[\n]*");
    Matcher m = p.matcher(bmi);


    int count = 0;
    while(m.find())

    {
        String[] mass = m.group().split(" ");
        double res = Double.parseDouble(mass[0]) / Double.parseDouble(mass[1]) * Double.parseDouble(mass[1]);
        if (res < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= res && res <= 25.0) {
            System.out.println("Normal weight");
        } else if (25.0 <= res && res <= 30.0) {
            System.out.println("Overweight");
        } else if (30.0 <= res) {
            System.out.println("Obesity");
        }
        count++;
    }

}
