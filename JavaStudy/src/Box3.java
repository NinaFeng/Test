import javax.swing.*;
//import java.awt.*;

public class Box3 extends JApplet
{
	private final static long serialVersionUID = 0l;
			
	public void init()
	{
		Box bv = Box.createVerticalBox();
		bv.add(new JLabel("Hello"));
		bv.add(Box.createVerticalGlue());
		bv.add(new JLabel("Applet"));
		bv.add(Box.createVerticalGlue());
		bv.add(new JLabel("World"));
		Box bh = Box.createHorizontalBox();
		bh.add(new JLabel("Hello"));
		bh.add(Box.createHorizontalGlue());
		bh.add(new JLabel("Applet"));
		bh.add(Box.createHorizontalGlue());
		bh.add(new JLabel("World"));
		bv.add(Box.createVerticalGlue());
		bv.add(bh);
		bv.add(Box.createVerticalGlue());
		getContentPane().add(bv);
	}
	
	public static void main(String[] args)
	{
		Console.run(new Box3(), 450, 300);
	}
}
