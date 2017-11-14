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
public class Dimension {
        private int width, height;
        
        public synchronized void changeBoth() {
                this.width += this.width * 0.5;
                this.height -= this.height * 0.7;
        }
        
        public synchronized void changeOne() {
                this.height -= this.height * 0.6;
        }
        
        public int width() {
        	return this.width;
        }
        
        public int height() {
        	return this.height;
        }
        
        public void width(int newValue) {
        	this.width = newValue;
        }
        
        public void height(int newValue) {
        	this.height = newValue;
        }
}
