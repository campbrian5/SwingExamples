import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class swingA extends JFrame {

	public swingA() {

        initUI();
    }

    private void initUI() {
    	
    	var quitButton = new JButton("click me to stop looking");

        quitButton.addActionListener((event) -> System.exit(0));

        createLayout(quitButton);
        
        setTitle("Stop looking at me!");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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

            var ex = new swingA();
            ex.setVisible(true);
        });
    }
}