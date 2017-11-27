package geom.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import geom.shape.Shape;
import geom.shape.locksplitting.LockSplittingShape;
import geom.shape.passthrough.PassThroughShape;

public class TestGeom {
	private int x = 500;
	private int y = 1000;
	private int height = 350;
	private int width = 650;
	
	@Test
	public void test_LS_position() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changePosition();
		
		assertEquals("LockSplitting -> Change Position Issue with X", ls_shape.getX(), (int) (x * 1.1));
		assertEquals("LockSplitting -> Change Position Issue with Y", ls_shape.getY(), (int) (y * 0.8));
		assertEquals("LockSplitting -> Change Position Issue with Width", ls_shape.getWidth(), width);
		assertEquals("LockSplitting -> Change Position Issue with Height", ls_shape.getHeight(), height);
	}
	
	@Test
	public void test_LS_dimension() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changeDimension();
		
		assertEquals("LockSplitting -> Change Dimension Issue with X", ls_shape.getX(), x);
		assertEquals("LockSplitting -> Change Dimension Issue with Y", ls_shape.getY(), y);
		assertEquals("LockSplitting -> Change Dimension Issue with Width", ls_shape.getWidth(), (int) (width * 1.5));
		assertEquals("LockSplitting -> Change Dimension Issue with Height", ls_shape.getHeight(), (int) (height * 0.3));
	}
	
	@Test
	public void test_LS_dimension_position() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changePositionAndDimension();
		
		assertEquals("LockSplitting -> Change PositionAndDimension Issue with X", ls_shape.getX(), x);
		assertEquals("LockSplitting -> Change PositionAndDimension Issue with Y", ls_shape.getY(), (int) (y * 1.4));
		assertEquals("LockSplitting -> Change PositionAndDimension Issue with Width", ls_shape.getWidth(), width);
		assertEquals("LockSplitting -> Change PositionAndDimension Issue with Height", ls_shape.getHeight(), (int) (height * 0.4));
	}
	
	@Test
	public void test_PT_position() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changePosition();
		
		assertEquals("PassThrough -> Change Position Issue with X", ls_shape.getX(), (int) (x * 1.1));
		assertEquals("PassThrough -> Change Position Issue with Y", ls_shape.getY(), (int) (y * 0.8));
		assertEquals("PassThrough -> Change Position Issue with Width", ls_shape.getWidth(), width);
		assertEquals("PassThrough -> Change Position Issue with Height", ls_shape.getHeight(), height);
	}
	
	@Test
	public void test_PT_dimension() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changeDimension();
		
		assertEquals("PassThrough -> Change Dimension Issue with X", ls_shape.getX(), x);
		assertEquals("PassThrough -> Change Dimension Issue with Y", ls_shape.getY(), y);
		assertEquals("PassThrough -> Change Dimension Issue with Width", ls_shape.getWidth(), (int) (width * 1.5));
		assertEquals("PassThrough -> Change Dimension Issue with Height", ls_shape.getHeight(), (int) (height * 0.3));
	}
	
	@Test
	public void test_PT_dimension_position() {
		Shape ls_shape = new LockSplittingShape();
		ls_shape.setRectangle(x, y, width, height);
		
		ls_shape.changePositionAndDimension();
		
		assertEquals("PassThrough -> Change PositionAndDimension Issue with X", ls_shape.getX(), x);
		assertEquals("PassThrough -> Change PositionAndDimension Issue with Y", ls_shape.getY(), (int) (y * 1.4));
		assertEquals("PassThrough -> Change PositionAndDimension Issue with Width", ls_shape.getWidth(), width);
		assertEquals("PassThrough -> Change PositionAndDimension Issue with Height", ls_shape.getHeight(), (int) (height * 0.4));
	}
}
