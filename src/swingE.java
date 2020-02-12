
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.EventQueue;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class swingE extends JFrame {

    public swingE() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        var quitButton = new JButton("not a button");

        quitButton.addActionListener((event) -> System.exit(0));

        createLayout(quitButton);
        
        setTitle("3 options, the button, ctrl-m, ctrl-n");
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

        var menuCeption = new JMenuItem("Menu-ception: are you"
        		+ " sure you're in a menu??");
        menuCeption.setMnemonic(KeyEvent.VK_M);
        menuCeption.setToolTipText("Exit application");
        menuCeption.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,
        		InputEvent.CTRL_DOWN_MASK));
        var exitMenuItem = new JMenuItem("Exit");
        
        exitMenuItem.setMnemonic(KeyEvent.VK_N);
        exitMenuItem.setToolTipText("Exit application");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                InputEvent.CTRL_DOWN_MASK));

        menuCeption.addActionListener((event) -> System.out.println("Spin the top to find out, Leo"));
        exitMenuItem.addActionListener((event) -> System.exit(0));

        menu.add(menu1);
        menu1.add(menu2);
        menu2.add(menu3);
        menu3.add(menuCeption);
        menu3.add(exitMenuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);
        
    }
    
    private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );
    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new swingE();
            ex.setVisible(true);
        });
    }
}