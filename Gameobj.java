package Ã∞≥‘…ﬂ;
import java.awt.*;
public class Gameobj {
	Image img;
	int x,y;
	int width=30,height=30;
	Game frame;
	public Image getImg() {
		return img;
	}
	public int  height() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void getframe(Game frame) {
		this.frame=frame;
	}
	public Gameobj() {
		
	}
	public Gameobj(Image img,int x,int y,Game frame) {
		this.img=img;
		this.x=x;
		this.y=y;
		this.frame=frame;
	}
	public Gameobj(Image img,int x,int y,int width,int height,Game frame) {
		this.img=img;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.frame=frame;
	}
	//ªÊ÷∆◊‘…Ì
	public void paintSelf(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
}
