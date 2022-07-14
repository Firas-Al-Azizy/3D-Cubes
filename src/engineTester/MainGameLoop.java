package engineTester;

import models.RawModel;
import models.TexturedModel;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.Renderer;
import shaders.StaticShader;
import textures.ModelTexture;
import entities.Camera;
import entities.Entity;
import entities.Light;

public class MainGameLoop {

	public static void main(String[] args) {

		DisplayManager.createDisplay();
		Loader loader = new Loader();
		StaticShader shader = new StaticShader();
		Renderer renderer = new Renderer(shader);
	
		float[] vertice1 = {			
				-0.5f,0.5f,0,	
				-0.5f,-0.5f,0,	
				0.5f,-0.5f,0,	
				0.5f,0.5f,0,		
				-0.5f,0.5f,1,	
				-0.5f,-0.5f,1,	
				0.5f,-0.5f,1,	
				0.5f,0.5f,1,
				0.5f,0.5f,0,	
				0.5f,-0.5f,0,	
				0.5f,-0.5f,1,	
				0.5f,0.5f,1,
				-0.5f,0.5f,0,	
				-0.5f,-0.5f,0,	
				-0.5f,-0.5f,1,	
				-0.5f,0.5f,1,
				-0.5f,0.5f,1,
				-0.5f,0.5f,0,
				0.5f,0.5f,0,
				0.5f,0.5f,1,
				-0.5f,-0.5f,1,
				-0.5f,-0.5f,0,
				0.5f,-0.5f,0,
				0.5f,-0.5f,1
				
		};
		
		//translation by (2,2) to vertice1
		float[] vertice2 = {			
				1.5f,2.5f,0,	
				1.5f,1.5f,0,	
				2.5f,1.5f,0,	
				2.5f,2.5f,0,	
				1.5f,2.5f,1,	
				1.5f,1.5f,1,	
				2.5f,1.5f,1,	
				2.5f,2.5f,1,
				2.5f,2.5f,0,	
				2.5f,1.5f,0,	
				2.5f,1.5f,1,	
				2.5f,2.5f,1,
				1.5f,2.5f,0,	
				1.5f,1.5f,0,	
				1.5f,1.5f,1,	
				1.5f,2.5f,1,
				1.5f,2.5f,1,
				1.5f,2.5f,0,
				2.5f,2.5f,0,
				2.5f,2.5f,1,
				1.5f,1.5f,1,
				1.5f,1.5f,0,
				2.5f,1.5f,0,
				2.5f,1.5f,1
				
		};
		
		//translation by (-3.5,-3.5) to vertice2
		float[] vertice3 = {			
				-2f,-1f,0,	
				-2f,-2f,0,	
				-1f,-2f,0,	
				-1f,-1f,0,	
				-2f,-1f,1,	
				-2f,-2f,1,	
				-1f,-2f,1,	
				-1f,-1f,1,
				-1f,-1f,0,	
				-1f,-2f,0,	
				-1f,-2f,1,	
				-1f,-1f,1,
				-2f,-1f,0,	
				-2f,-2f,0,	
				-2f,-2f,1,	
				-2f,-1f,1,
				-2f,-1f,1,
				-2f,-1f,0,
				-1f,-1f,0,
				-1f,-1f,1,
				-2f,-2f,1,
				-2f,-2f,0,
				-1f,-2f,0,
				-1f,-2f,1
				
		};
	
		float[] textureCoord1= {
				
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,	
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,			
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,	
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,	
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,	
				0,0,
				0,0.6f,
				0.6f,0.6f,
				0.6f,0,	

				
		};

		int[] indice1 = {
				0,1,3,	
				3,1,2,	
		};
		int[] indice2 = {
				4,5,7,
				7,5,6,
		};
		int[] indice3 = {
				8,9,11,
				11,9,10,
		};
		int[] indice4 = {
				12,13,15,
				15,13,14,
		};
		int[] indice5 = {
				16,17,19,
				19,17,18,
		};
		int[] indice6 = {
				20,21,23,
				23,21,22
				

		};
		
		RawModel model1 = loader.loadToVAO(vertice1,textureCoord1,indice1);
		RawModel model2 = loader.loadToVAO(vertice1,textureCoord1,indice2);
		RawModel model3 = loader.loadToVAO(vertice1,textureCoord1,indice3);
		RawModel model4 = loader.loadToVAO(vertice1,textureCoord1,indice4);
		RawModel model5 = loader.loadToVAO(vertice1,textureCoord1,indice5);
		RawModel model6 = loader.loadToVAO(vertice1,textureCoord1,indice6);
		
		RawModel model11 = loader.loadToVAO(vertice2,textureCoord1,indice1);
		RawModel model22 = loader.loadToVAO(vertice2,textureCoord1,indice2);
		RawModel model33 = loader.loadToVAO(vertice2,textureCoord1,indice3);
		RawModel model44 = loader.loadToVAO(vertice2,textureCoord1,indice4);
		RawModel model55 = loader.loadToVAO(vertice2,textureCoord1,indice5);
		RawModel model66 = loader.loadToVAO(vertice2,textureCoord1,indice6);
		
		RawModel model111 = loader.loadToVAO(vertice3,textureCoord1,indice1);
		RawModel model222 = loader.loadToVAO(vertice3,textureCoord1,indice2);
		RawModel model333 = loader.loadToVAO(vertice3,textureCoord1,indice3);
		RawModel model444 = loader.loadToVAO(vertice3,textureCoord1,indice4);
		RawModel model555 = loader.loadToVAO(vertice3,textureCoord1,indice5);
		RawModel model666 = loader.loadToVAO(vertice3,textureCoord1,indice6);
		
		TexturedModel staticModel1 = new TexturedModel(model1,new ModelTexture(loader.loadTexture("6")));
		TexturedModel staticModel2 = new TexturedModel(model2,new ModelTexture(loader.loadTexture("2")));
		TexturedModel staticModel3 = new TexturedModel(model3,new ModelTexture(loader.loadTexture("3")));
		TexturedModel staticModel4 = new TexturedModel(model4,new ModelTexture(loader.loadTexture("4")));
		TexturedModel staticModel5 = new TexturedModel(model5,new ModelTexture(loader.loadTexture("5")));
		TexturedModel staticModel6 = new TexturedModel(model6,new ModelTexture(loader.loadTexture("1")));
		
		TexturedModel staticModel11 = new TexturedModel(model11,new ModelTexture(loader.loadTexture("6")));
		TexturedModel staticModel22 = new TexturedModel(model22,new ModelTexture(loader.loadTexture("2")));
		TexturedModel staticModel33 = new TexturedModel(model33,new ModelTexture(loader.loadTexture("3")));
		TexturedModel staticModel44 = new TexturedModel(model44,new ModelTexture(loader.loadTexture("4")));
		TexturedModel staticModel55 = new TexturedModel(model55,new ModelTexture(loader.loadTexture("5")));
		TexturedModel staticModel66 = new TexturedModel(model66,new ModelTexture(loader.loadTexture("1")));
		
		
		TexturedModel staticModel111 = new TexturedModel(model111,new ModelTexture(loader.loadTexture("6")));
		TexturedModel staticModel222 = new TexturedModel(model222,new ModelTexture(loader.loadTexture("2")));
		TexturedModel staticModel333 = new TexturedModel(model333,new ModelTexture(loader.loadTexture("3")));
		TexturedModel staticModel444 = new TexturedModel(model444,new ModelTexture(loader.loadTexture("4")));
		TexturedModel staticModel555 = new TexturedModel(model555,new ModelTexture(loader.loadTexture("5")));
		TexturedModel staticModel666 = new TexturedModel(model666,new ModelTexture(loader.loadTexture("1")));
		
		
		Entity entity1 = new Entity(staticModel1, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity2 = new Entity(staticModel2, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity3 = new Entity(staticModel3, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity4 = new Entity(staticModel4, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity5 = new Entity(staticModel5, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity6 = new Entity(staticModel6, new Vector3f(0,0,-5),0,0,0,1);

		Entity entity11 = new Entity(staticModel11, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity22 = new Entity(staticModel22, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity33 = new Entity(staticModel33, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity44 = new Entity(staticModel44, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity55 = new Entity(staticModel55, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity66 = new Entity(staticModel66, new Vector3f(0,0,-5),0,0,0,1);
		
		Entity entity111 = new Entity(staticModel111, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity222 = new Entity(staticModel222, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity333 = new Entity(staticModel333, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity444 = new Entity(staticModel444, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity555 = new Entity(staticModel555, new Vector3f(0,0,-5),0,0,0,1);
		Entity entity666 = new Entity(staticModel666, new Vector3f(0,0,-5),0,0,0,1);
		
		Light light = new Light(new Vector3f(0,0,0.5f),new Vector3f(1,0,1));
		
		Camera camera = new Camera();
		
		while(!Display.isCloseRequested()){
			entity1.increaseRotation(1, 0, 0);
			entity2.increaseRotation(1, 0, 0);
			entity3.increaseRotation(1, 0, 0);
			entity4.increaseRotation(1, 0, 0);
			entity5.increaseRotation(1, 0, 0);
			entity6.increaseRotation(1, 0, 0);

			entity11.increaseRotation(0, 1, 0);
			entity22.increaseRotation(0, 1, 0);
			entity33.increaseRotation(0, 1, 0);
			entity44.increaseRotation(0, 1, 0);
			entity55.increaseRotation(0, 1, 0);
			entity66.increaseRotation(0, 1, 0);
			
			entity111.increaseRotation(0, 0, 1);
			entity222.increaseRotation(0, 0, 1);
			entity333.increaseRotation(0, 0, 1);
			entity444.increaseRotation(0, 0, 1);
			entity555.increaseRotation(0, 0, 1);
			entity666.increaseRotation(0, 0, 1);
			
			camera.move();
			renderer.prepare();
			shader.start();
			shader.loadViewMatrix(camera);
			if(Keyboard.isKeyDown(Keyboard.KEY_L)){
			shader.loadLight(light);}
			
			renderer.render(entity1,shader);
			renderer.render(entity2,shader);
			renderer.render(entity3,shader);
			renderer.render(entity4,shader);
			renderer.render(entity5,shader);
			renderer.render(entity6,shader);
			
			renderer.render(entity11,shader);
			renderer.render(entity22,shader);
			renderer.render(entity33,shader);
			renderer.render(entity44,shader);
			renderer.render(entity55,shader);
			renderer.render(entity66,shader);
			
			renderer.render(entity111,shader);
			renderer.render(entity222,shader);
			renderer.render(entity333,shader);
			renderer.render(entity444,shader);
			renderer.render(entity555,shader);
			renderer.render(entity666,shader);
			
			shader.stop();
			DisplayManager.updateDisplay();
		}
			
			

		shader.cleanUp();
		loader.cleanUp();
		DisplayManager.closeDisplay();

	}

}
