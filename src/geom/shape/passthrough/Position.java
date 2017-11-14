package geom.shape.passthrough;

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
public class Position {
        private int x, y;
        
        public synchronized void changeBoth() {
                this.x += this.x * 0.1;
                this.y -= this.y * 0.2;
        }
        
        public synchronized void changeOne() {
                this.y += this.y * 0.4;
        }
        
        public int x() {
        	return this.x;
        }
        
        public int y() {
        	return this.y;
        }
        
        public void x(int newValue) {
        	this.x = newValue;
        }
        
        public void y(int newValue) {
        	this.y = newValue;
        }
}
