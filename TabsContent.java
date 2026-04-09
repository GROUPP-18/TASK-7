import javax.swing.*;

public class TabsContent {

    public JPanel createUserTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Name:"));
        panel.add(new JTextField(10));
        return panel;
    }

    public JPanel createCalcTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Calculator"));
        panel.add(new JButton("Add"));
        return panel;
    }

    public JPanel createMessageTab() {
        JPanel panel = new JPanel();
        panel.add(new JTextArea(5, 20));
        return panel;
    }

    public JPanel createSettingsTab() {
        JPanel panel = new JPanel();
        panel.add(new JCheckBox("Enable Option"));
        return panel;
    }

    public JPanel createAboutTab() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("This is a tabbed app"));
        return panel;
    }
}
