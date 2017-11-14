package geom.shape.locksplitting;

import geom.shape.Shape;

/**
 * Geometry Simulation Environment (GSE)
 * November 2017
 * 
 * Solution
 * 
 * @author Pascal Gadient (gadient@inf.unibe.ch) 
 * 
 * SCG University of Bern, Concurrency Course
 * 
 */
public class LockSplittingShape implements Shape {
        private int x, y, width, height;
        
        private final Object positionLock, dimensionLock;
        
        public LockSplittingShape() {
                this.positionLock = new Object();
                this.dimensionLock = new Object();
        }
        
        @Override
        public void changePosition() {
                synchronized(this.positionLock) {
                        this.x += this.x * 0.1;
                        this.y -= this.y * 0.2;
                }
        }
        
        @Override
        public void changeDimension() {
                synchronized(this.dimensionLock) {
                        this.width += this.width * 0.5;
                        this.height -= this.height * 0.7;
                }
        }
        
        @Override
        public void changePositionAndDimension() {
                synchronized(this.positionLock) {
                        synchronized(this.dimensionLock) {
                                this.y += this.y * 0.4;
                                this.height -= this.height * 0.6;
                        }
                }       
        }

		@Override
		public int getX() {
			return this.x;
		}

		@Override
		public int getY() {
			return this.y;
		}

		@Override
		public int getWidth() {
			return this.width;
		}

		@Override
		public int getHeight() {
			return this.height;
		}

		@Override
		public void setRectangle(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
}
