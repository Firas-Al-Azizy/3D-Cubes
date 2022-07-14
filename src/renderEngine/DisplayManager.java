package renderEngine;

//light weight java graphics library
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;


public class DisplayManager {
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	
// open the display when you start the program	
	public static void createDisplay(){	
		
		//version of opengl we will use
		ContextAttribs attribs = new ContextAttribs(3,2)
		.withForwardCompatible(true)
		.withProfileCore(true);
		
		try {
			//display size
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.create(new PixelFormat(), attribs);
			Display.setTitle("3d cube");
			
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		 //tells opengl to use the desired display for rendering the program   
		GL11.glViewport(0,0, WIDTH, HEIGHT);
	}
	
//update display frame per second	
	public static void updateDisplay(){
		
		Display.sync(FPS_CAP);
		Display.update();
		
	}
	
//EXIT Display	
	public static void closeDisplay(){
		
		Display.destroy();
		
	}

}
