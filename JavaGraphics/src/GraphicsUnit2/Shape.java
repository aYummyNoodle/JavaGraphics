package GraphicsUnit2;
//(c) A+ Computer Science

//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	private ShapeData data = new ShapeData();
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

	/*
	 * The constructor is used to initialize all instance variables. The constructor
	 * makes the object.
	 */
	public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		data.setxPos(x);
		// finish this constructor
		data.setyPos(y);
		data.setWidth(wid);
		data.setHeight(ht);
		data.setColor(col);
		data.setxSpeed(xSpd);
		data.setySpeed(ySpd);
	}

	/*
	 * The draw method draws the shape on the screen.
	 */
	public void draw(Graphics window) {
		window.setColor(data.getColor());
		window.fillRect(data.getxPos(), data.getyPos(), data.getWidth(), data.getHeight());

		// draw whatever you want
		// ^
		// [ :: ]
		// ()

		window.fillOval(data.getxPos(), data.getyPos(), data.getWidth(), data.getHeight() / 2);
		window.fillOval(data.getxPos(), data.getyPos() + data.getHeight(), data.getWidth(), data.getWidth());
		window.fillRect(data.getxPos(), data.getyPos() + data.getHeight() + data.getWidth(), data.getWidth(), data.getWidth());
		window.fillOval(data.getxPos(), data.getyPos() + 2 * data.getHeight(), data.getWidth(), data.getWidth());
		window.fillRect(data.getxPos(), data.getyPos() + 2 * data.getHeight() + data.getWidth(), data.getWidth(), data.getWidth());
	}

	/*
	 * This draw method will be used to erase the shape.
	 */
	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(data.getxPos(), data.getyPos(), data.getWidth(), data.getHeight());
	}

	public void moveAndDraw(Graphics window) {
		setxPos(data.getxPos() + data.getxSpeed());
		setyPos(data.getyPos() + data.getySpeed());
		
		draw(window);
	}

	// add in set and get methods for xPos, yPos, xSpeed, and ySpeed
	
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return data.getxPos() + " " + data.getyPos() + " " + data.getWidth() + " " + data.getHeight() + " " + data.getColor() + " " + data.getxSpeed() + " " + data.getySpeed();
	}
}