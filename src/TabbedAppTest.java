import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class TabbedAppTest {

    private TabsContent tabs;
    private MainFrame frame;

    @BeforeEach
    void setUp() {
        tabs = new TabsContent();
        frame = new MainFrame();
    }

    @AfterEach
    void tearDown() {
        if (frame != null) {
            frame.dispose();
        }
    }

    @Test
    void testTabsContentIndividually() {
        // 1. Unit Testing: Testing the tabs
        JPanel userTab = tabs.createUserTab();
        JPanel calcTab = tabs.createCalcTab();

        assertNotNull(userTab, "User tab should not be null");

        boolean hasAddButton = false;
        for (Component c : calcTab.getComponents()) {
            if (c instanceof JButton && "Add".equals(((JButton) c).getText())) {
                hasAddButton = true;
            }
        }
        assertTrue(hasAddButton, "Calculator tab must contain an 'Add' button");
    }

    @Test
    void testMainFrameIntegration() {
        JTabbedPane tabbedPane = null;
        for (Component c : frame.getContentPane().getComponents()) {
            if (c instanceof JTabbedPane) {
                tabbedPane = (JTabbedPane) c;
            }
        }

        assertNotNull(tabbedPane, "JTabbedPane was not found!");
        assertEquals(5, tabbedPane.getTabCount(), "There should be exactly 5 tabs");
        assertEquals("User", tabbedPane.getTitleAt(0));
    }
}