package StructuralDesignPattern.Facade;


public class TestFacade {

	public static void main(String[] args) {
		ShapeMaker shapeMaker= new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
