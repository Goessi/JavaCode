
import java.awt.*;
import javax.swing.*;



public class MyDrawPanel extends JPanel{

	public void paintComponent(Graphics g) {
//		g.setColor(Color.orange);
//		g.fillRect(20, 50, 100, 100);
		
//		Image image = new ImageIcon("").getImage();
//		g.drawImage(image, 3, 4, this);
		
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		int red = (int)(Math.random()*225);
		int green = (int)(Math.random()*225);
		int blue = (int)(Math.random()*225);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);
	}
}
