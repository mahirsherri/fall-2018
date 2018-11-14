package day44_drawme_project;

import java.awt.Color;

public class PracticeDraw {

	public static void main(String[] args) {

		Grid grid = new Grid(11);
		DrawFlag.Turkmenistan(grid);
		//DrawFlag.Serbia(grid);
		//DrawFlag.EastTurkestan(grid);
		//DrawFlag.Turkey(grid);
		//DrawFlag.Uzbekistan(grid);
		//DrawFlag.Azerbaijan(grid);
//		int parts =  grid.getWd()/3;
//		for (int row = 0; row < grid.getHt(); row++) {
//			for (int i = 0; i < grid.getWd(); i++) {
//				grid.setColor(row, i, i<=parts?Color.BLUE:i<=parts*2?Color.WHITE:Color.RED);
//			}
//		}
		
	//	DrawFlag.USA(grid);
		//DrawFlag.ukraine(grid);
		//DrawFlag.Afghanistan(grid);
		
		
		
	//	Color.red;
		
//		for (int i = 0; i < grid.getHt(); i++ )
//			for (int n= 0; n <grid.getWd(); n++) {
//				if (i % 2 == 0) {
//					grid.setColor(i,n, Color.red);
//				} else {
//					grid.setColor(i, n, Color.white);
//				}
//			}
//		
//		for (int i = 0; i < (grid.getHt()/2)+1; i++)
//			for (int n = 0; n <(grid.getWd()/2)+1;n++) {
//				grid.setColor(i, n, Color.blue);
//			}
//		
//		for (int i = 0; i <(grid.getHt()/2); i++) {
//			for (int n = 0; n<(grid.getWd()/2); n++) {
//				if( i % 2 == 0 && n % 2 == 0) {
//					grid.setColor(i+1, n+1, Color.white);
//				}
//			}
//		}

//		for(int i = 0; i < grid.getHt(); i++) {
//			grid.setColor(i, 0, Color.RED);
//		}
//		
//		for(int i = 1; i < grid.getWd(); i++) {
//			grid.setColor(0, i, Color.RED);
//		}
//		
//		for(int i = 0; i < grid.getHt(); i++) {
//			grid.setColor(i, grid.getWd()-1, Color.RED);
//		}
//		
//		for(int i = 1; i < grid.getWd(); i++) {
//			grid.setColor(grid.getHt()-1, i, Color.RED);
//		}
		/* FRANCE FLAG VERSION 1
		for(int row =0; row <10; row++) {
			for(int col=0; col<10; col++) {
				if(col>=0 && col<=7) {
					grid.setColor(row, col, Color.BLUE);
				}
			}
		}
		for(int row =0; row <10; row++) {
			for(int col=7; col<14; col++) {
				if(col>=7 && col<=14) {
					grid.setColor(row, col, Color.WHITE);
				}
			}
		}
		for(int row =0; row <10; row++) {
			for(int col=14; col<20; col++) {
				if(col>=14 && col<=20) {
					grid.setColor(row, col, Color.red);
				}
			}
		}
		*/
//		int height = grid.getHt();
//		int width = grid.getWd();
//		
//		for(int i = 0; i < width; i++) {
//			
//			for(int t = 0; t < height; t++) {
//				if(i < width / 3) {
//					grid.setColor(t, i, Color.red);
//				}else if(i >= width / 3 && i < width - width / 3) {
//					grid.setColor(t, i, Color.white);
//				}else {
//					grid.setColor(t,i,Color.blue);
//				}
//				
//			}
//		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
