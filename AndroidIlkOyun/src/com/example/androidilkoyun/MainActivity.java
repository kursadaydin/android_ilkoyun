package com.example.androidilkoyun;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.anddev.andengine.engine.options.resolutionpolicy.IResolutionPolicy;
import org.anddev.andengine.entity.primitive.Line;
import org.anddev.andengine.entity.primitive.Rectangle;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.opengl.view.RenderSurfaceView;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseGameActivity {
	private static final int CAMERA_WIDTH = 800;
	private static final int CAMERA_HEIGHT = 480;
	private Camera camera;
	private Engine engine;
	private Scene scene;

	@Override
	public Engine onLoadEngine() {
		// TODO Auto-generated method stub

		camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		final EngineOptions engineOptions = new EngineOptions(true,
				ScreenOrientation.PORTRAIT, new FillResolutionPolicy(), camera);

		engineOptions.getTouchOptions().setRunOnUpdateThread(true);
		
		engine = new Engine(engineOptions);
		return engine;
	}

	@Override
	public void onLoadResources() {
		// TODO Auto-generated method stub

	}

	@Override
	public Scene onLoadScene() {
		// TODO Auto-generated method stub
		engine.registerUpdateHandler(new FPSLogger());
		scene = new Scene();
		scene.setBackground(new ColorBackground(0.0984f, 0.6274f, 0.8784f));

		Line line = new Line(20, 20, 780, 20);
		line.setColor(154780, 875102, 987541);

		Rectangle rectangle = new Rectangle(20, 40, 760, 420);

		scene.attachChild(line);
		scene.attachChild(rectangle);

		return scene;
	}

	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub

	}

}
