package com.connections.view_controller;

import javafx.scene.paint.Color;
import javafx.scene.shape.FillRule;
import javafx.scene.shape.SVGPath;

public class ProfileMenuButton extends SVGButton {
	public ProfileMenuButton(GameSessionContext gameSessionContext) {
		super(gameSessionContext);
		
		SVGPath profileIconSVG = new SVGPath();
		profileIconSVG.setContent(
				"M8,16 C12.4183,16 16,12.4183 16,8 C16,3.58172 12.4183,0 8,0 C3.58172,0 0,3.58172 0,8 C0,12.4183 3.58172,16 8,16 Z M12.9533,11.387 C13.6137,10.4231 14,9.25665 14,8 C14,4.68629 11.3137,2 8,2 C4.68629,2 2,4.68629 2,8 C2,9.25665 2.38632,10.4231 3.04668,11.387 C3.25368,10.0411 4.13147,8.91649 5.32791,8.36519 C5.11827,7.95568 5,7.49165 5,7 C5,5.34315 6.34315,4 8,4 C9.65685,4 11,5.34315 11,7 C11,7.49165 10.8817,7.95568 10.6721,8.36519 C11.8685,8.91649 12.7463,10.0411 12.9533,11.387 Z M11,13.1973 L11,12 C11,10.8954 10.1046,10 9,10 L7,10 C5.89543,10 5,10.8954 5,12 L5,13.1973 C5.88252,13.7078 6.90714,14 8,14 C9.09286,14 10.1175,13.7078 11,13.1973 Z M8,8 C8.55228,8 9,7.55228 9,7 C9,6.44772 8.55228,6 8,6 C7.44772,6 7,6.44772 7,7 C7,7.55228 7.44772,8 8,8 Z");
		profileIconSVG.setFillRule(FillRule.EVEN_ODD);
		profileIconSVG.setScaleX(1.8);
		profileIconSVG.setScaleY(1.8);
		profileIconSVG.setTranslateX(7);
		profileIconSVG.setTranslateY(10);
		
		setSVG(profileIconSVG);
		refreshStyle();
	}
	
	@Override
	public void refreshStyle() {
		svgPath.setFill(gameSessionContext.getStyleManager().colorText());
	}
} 