import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class swingB extends JFrame {

	public swingB() {

        initUI();
    }

    private void initUI() {
    	
    	var redButton = new JButton("Red");
    	var blueButton = new JButton("Blue");
    	var greenButton = new JButton("Green");

        redButton.addActionListener((event) -> System.exit(0));
        blueButton.addActionListener((event) -> System.exit(0));
        greenButton.addActionListener((event) -> System.exit(0));

        createLayout(redButton, blueButton, greenButton);
        
        setTitle("Pick your favorite color");
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
                .addComponent(arg[1])
                .addComponent(arg[2])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[2])
                .addComponent(arg[1])
                .addComponent(arg[0])
        );
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new swingB();
            ex.setVisible(true);
        });
    }
}