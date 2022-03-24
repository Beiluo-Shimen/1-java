package 贪吃蛇;
import java.awt.*;
public class GameUtils {
	//头部
	public static Image upImg=Toolkit.getDefaultToolkit().getImage("up.png");
	//身体
	public static Image bodyImg=Toolkit.getDefaultToolkit().getImage("body.png");
	//食物
	public static Image foodImg=Toolkit.getDefaultToolkit().getImage("food.png");
	public static void drawword(Graphics g,String str,Color color,int size,int x,int y) {
		g.setColor(color);
		g.setFont(new Font("仿宋",Font.BOLD,size));
		g.drawString(str, x, y);
	}
}
