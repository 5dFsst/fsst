package shift;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BitShift extends JFrame{

    private static final long serialVersionUID = 1L;
    
    private JLabel prompt, status;
    private JTextField value, bits;
    private JButton multiply, divide;
    
    public BitShift() {
	prompt=new JLabel("Enter integer to shift: ");
	status=new JLabel("");
	value=new JTextField(8);
	bits=new JTextField(22);
	bits.setEditable(false);
	
	multiply=new JButton("<< (Multiply by 2)");
	divide=new JButton(">> (Divide by 2)");
	
	multiply.addActionListener(new ActionListener() {	//anonymous inner class
	    @Override
	    public void actionPerformed(ActionEvent event) {
		int number=Integer.parseInt(value.getText());
		/*
		 * Mit Bitoperator number manipulieren, um gewÅnschte Operation zu erreichen
		 */
		value.setText(Integer.toString(number));
		bits.setText(Integer.toBinaryString(number)); //statt getBits()
	    }
	});
	divide.addActionListener(new ActionListener() {	//anonymous inner class
	    @Override
	    public void actionPerformed(ActionEvent event) {
		int number=Integer.parseInt(value.getText());
		/*
		 * Mit Bitoperator number manipulieren, um gewÅnschte Operation zu erreichen
		 */
		value.setText(Integer.toString(number));
		bits.setText(Integer.toBinaryString(number)); //statt getBits()
	    }
	});
	
	Container container=getContentPane();
	container.setLayout(new FlowLayout());
	container.add(prompt);
	container.add(value);
	container.add(multiply);
	container.add(divide);
	container.add(bits);
	container.add(status);
	
	setSize(260,300);
	setVisible(true);
    }
    
    public static void main(String[] args) {
	BitShift bs=new BitShift();
	bs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
