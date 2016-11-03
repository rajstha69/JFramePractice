package JavaClass.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class tuna extends JFrame{

	private JLabel item1;
	
	public tuna(){
		super("The title bar");
		setLayout(new FlowLayout());
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("This is gonna show up on hover");
		JLabel item2 = new JLabel();
				//("apple",SwingConstants.CENTER);
		item2.setText("Apple");
		item2.getFont();
		item2.setFont(item2.getFont().deriveFont(2,111f));
		item2.setVerticalAlignment(WIDTH/2);
		item2.setForeground(Color.green);
		int a =item2.getVerticalTextPosition();
		item2.setVerticalTextPosition(JLabel.BOTTOM);
		//item2.repaint();
		item2.setVerticalAlignment(HEIGHT/2);
		item1.setFont(item1.getFont().deriveFont(64f));;
		//item1.setMaximumSize(getMaximumSize());;;
		
		add (item2);
		add (item1);
		
	}

	
}

