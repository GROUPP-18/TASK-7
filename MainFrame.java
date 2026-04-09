import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Tabbed Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTabbedPane tabbedPane = new JTabbedPane();

        TabsContent tabs = new TabsContent();

        tabbedPane.addTab("User", tabs.createUserTab());
        tabbedPane.addTab("Calculator", tabs.createCalcTab());
        tabbedPane.addTab("Message", tabs.createMessageTab());
        tabbedPane.addTab("Settings", tabs.createSettingsTab());
        tabbedPane.addTab("About", tabs.createAboutTab());

        add(tabbedPane);

        setVisible(true);
    }
}
