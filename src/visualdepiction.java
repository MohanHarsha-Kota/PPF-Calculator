import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;

public class visualdepiction extends JFrame {

int amt;
float interest;
public visualdepiction(String Title, int amtPaid, float totInterest)
{
    super(Title);
    amt = amtPaid;
    interest = totInterest;
    JFreeChart chart = createChart(Dataset());
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private PieDataset Dataset()
{
    DefaultPieDataset data = new DefaultPieDataset();
    data.setValue("Total Amount Paid", amt);
    data.setValue("Interest Received", interest);
    return data;
}

private JFreeChart createChart(PieDataset dataset)
{
    JFreeChart chart = ChartFactory.createPieChart("Division of Total Maturity Amount", dataset, true, true, true);
    PiePlot plot = (PiePlot)chart.getPlot();
    return chart;
}
}
