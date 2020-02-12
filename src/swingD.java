import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.EventQueue;

public class swingD extends JFrame {

    public swingD() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        setTitle("Submenu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        var menuBar = new JMenuBar();

        var menu = new JMenu("Menu");
        var menu1 = new JMenu("Menu");
        var menu2 = new JMenu("Menu");
        var menu3 = new JMenu("Menu");

        var menuCeption = new JMenuItem("Menu-ception: are you sure you're in a menu??");
        var exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setToolTipText("Exit application");

        exitMenuItem.addActionListener((event) -> System.exit(0));

        menu.add(menu1);
        menu1.add(menu2);
        menu2.add(menu3);
        menu3.add(menuCeption);
        menu3.add(exitMenuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new swingD();
            ex.setVisible(true);
        });
    }
}