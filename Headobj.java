package ̰����;

import java.awt.*;

public class Headobj extends Gameobj{
	//����
	private String direction="right";
	public String  getDirection() {
		return direction;
	}
	public Headobj(Image img,int x,int y,Game frame) {
		super(img,x,y,frame);
	}
	//�ߵ��ƶ�
	public void move() {
		switch(direction) {
		case "up":y-=height;break;
		case "down":y+=height;break;
		case "left":x-=width;break;
		case "right":x+=width+10;break;
		default:break;
		}
	}
	public void paintSlf(Graphics g)
	{
		super.paintSelf(g);
		move();
	}
}
