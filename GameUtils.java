package ̰����;
import java.awt.*;
public class GameUtils {
	//ͷ��
	public static Image upImg=Toolkit.getDefaultToolkit().getImage("up.png");
	//����
	public static Image bodyImg=Toolkit.getDefaultToolkit().getImage("body.png");
	//ʳ��
	public static Image foodImg=Toolkit.getDefaultToolkit().getImage("food.png");
	public static void drawword(Graphics g,String str,Color color,int size,int x,int y) {
		g.setColor(color);
		g.setFont(new Font("����",Font.BOLD,size));
		g.drawString(str, x, y);
	}
}
