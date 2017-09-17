import java.util.*;
import javax.swing.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.*;
import org.jfree.ui.*;
public class Main {

    static float rate = 8.1f;
    public static void main(String[] args) {
    int depositAmt, tempAmt;
    float interest;
    float totalInterest = 0.0f;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the deposit amout between 500 to 150000");
    depositAmt = obj.nextInt();
    tempAmt = depositAmt;
    for(int i = 0;i < 15; i++)
    {
        interest = (tempAmt * rate )/ 100;
        tempAmt += depositAmt + interest;
        totalInterest+= interest;
    }

    System.out.println("Total Maturity amount after 15 years at "+rate+" is "+(tempAmt-depositAmt));
    System.out.println("Total Interest Earned is "+totalInterest);

    visualdepiction depict = new visualdepiction("Comparison", depositAmt*15, totalInterest);
    depict.setSize(600, 400);
    RefineryUtilities.centerFrameOnScreen(depict);
    depict.setVisible(true);
    }

}

