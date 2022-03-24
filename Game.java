package 贪吃蛇;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Game extends JFrame{
	//蛇头对象
	Headobj headobj=new Headobj(GameUtils.upImg,30,400,this);
	public void launch() throws InterruptedException
	{
		this.setVisible(true);
		this.setSize(600, 600);
		//this.setLocationRelativeTo(null);//位置居中
		this.setTitle("贪吃蛇");
		while(true)	{
			repaint();
			Thread.sleep(100);
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.BLACK);
		
		for(int i=0;i<20;i++) {
		g.drawLine(0, 30*i, 600, 30*i);//绘制表格线
		g.drawLine(30*i,0,30*i,600 );
		}
		//绘制蛇头
		headobj.paintSelf(g);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Game ga=new Game();
		ga.launch();
		}

}
