package day44_drawme_project;

import java.awt.Color;

public class DrawFlag {

	public static void drawFlag(Grid grid, int countryCode) {

		switch (countryCode) {
		case 1:
			france(grid);
			break;
		case 2:
			argentina(grid);
			break;

		case 3:
			austria(grid);
			break;
		case 4:
			ukraine(grid);
			break;
		case 5:
			russia(grid);
			break;
		case 6:
			Uyghuria(grid);
			break;
		case 7:
			mycountry(grid);
			break;
		default:
			ErrorFlag(grid);
			break;
		}
	}
	
	public static void Turkmenistan(Grid grid) {
		for (int i=0; i<grid.getWd(); i++) {
            for (int j=0; j<grid.getHt(); j++) {
                grid.setColor(j, i, Color.GREEN);
            }
        }
        
        for (int i=1; i<6; i++) {
            for (int j=0; j<grid.getHt(); j++) {
                grid.setColor(j, i, Color.RED);
            }
        }
        
        grid.setColor(2, 8, Color.WHITE);
        grid.setColor(2, 10, Color.WHITE);
        grid.setColor(3, 9, Color.WHITE);
        grid.setColor(4, 8, Color.WHITE);
        grid.setColor(4, 10, Color.WHITE);
        
        grid.setColor(1, 13, Color.WHITE);
        grid.setColor(2, 12, Color.WHITE);
        grid.setColor(2, 13, Color.WHITE);
        grid.setColor(2, 14, Color.WHITE);
        grid.setColor(3, 14, Color.WHITE);
        grid.setColor(3, 15, Color.WHITE);
        grid.setColor(4, 14, Color.WHITE);
        grid.setColor(4, 15, Color.WHITE);
        grid.setColor(5, 14, Color.WHITE);
        grid.setColor(5, 13, Color.WHITE);
        grid.setColor(5, 12, Color.WHITE);
        grid.setColor(6, 13, Color.WHITE);
	}
	
	public static void Colombia(Grid grid) {
		for(int j=0; j<grid.getWd(); j++) {
            for(int i=0 ; i<5; i++) {
            grid.setColor(i, j, Color.ORANGE);
            }
        }
        
        
        for(int j=0; j<grid.getWd(); j++) {
            for(int i=5 ; i<8; i++) {
            grid.setColor(i, j, Color.blue);
            }
        }
        
        for(int j=0; j<grid.getWd(); j++) {
            for(int i=8 ; i<grid.getHt(); i++) {
            grid.setColor(i, j, Color.RED);
            }
        }
	}
	
	public static void Serbia(Grid grid) {
		for (int i = 0 ; i<grid.getHt();i++) {
			for ( int j = 0 ; j < grid.getWd();j++) {
				if (i <= (grid.getHt()/3))
				grid.setColor(i, j, Color.RED);
				else if (i <= (grid.getHt()/3)*2)
					grid.setColor(i, j, Color.blue);
				else 
					grid.setColor(i, j, Color.WHITE);
				
					
			}
		}

	}
	
	public static void EastTurkestan(Grid grid) {
		for(int i = 0;i< grid.getHt();i++) {
			for(int z = 0; z<grid.getWd();z++) {
				grid.setColor(i, z, Color.BLUE);
			}	
		}		
		grid.setColor(1, 7, Color.WHITE);
		grid.setColor(1, 6, Color.WHITE);
		grid.setColor(2, 6, Color.WHITE);
		grid.setColor(2, 5, Color.WHITE);
		grid.setColor(3, 4, Color.WHITE);
		grid.setColor(3, 5, Color.WHITE);
		grid.setColor(4, 5, Color.WHITE);
		grid.setColor(4, 4, Color.WHITE);
		grid.setColor(5, 5, Color.WHITE);
		grid.setColor(5, 4, Color.WHITE);
		grid.setColor(6, 5, Color.WHITE);
		grid.setColor(6, 6, Color.WHITE);
		grid.setColor(7, 6, Color.WHITE);
		grid.setColor(7, 7, Color.WHITE);
		grid.setColor(7, 8, Color.WHITE);
		grid.setColor(1, 8, Color.WHITE);
		
		grid.setColor(4, 13, Color.WHITE);
		grid.setColor(4, 10, Color.WHITE);
		grid.setColor(4, 11, Color.WHITE);
		grid.setColor(4, 12, Color.WHITE);
		grid.setColor(4, 9, Color.WHITE);
		grid.setColor(3, 11, Color.WHITE);
		grid.setColor(5, 11, Color.WHITE);
		grid.setColor(5, 10, Color.WHITE);
		grid.setColor(5, 12, Color.WHITE);
		grid.setColor(6, 10, Color.WHITE);
		grid.setColor(6, 12, Color.WHITE);


	}
	
	public static void Germany(Grid grid) {
		for (int r = 0; r < grid.getHt()/3; r++) {
			for (int c = 0; c < grid.getWd(); c++) {
				grid.setColor(r, c, Color.BLACK);
			}
		}

		for (int r = grid.getHt()/3; r < (grid.getHt()/3)*2; r++) {
			for (int c = 0; c < grid.getWd(); c++) {
				grid.setColor(r, c, Color.RED);
			}
		}

		for (int r = (grid.getHt()/3)*2; r < grid.getHt(); r++) {
			for (int c = 0; c < grid.getWd(); c++) {
				grid.setColor(r, c, Color.YELLOW);
			}
		}
	}
	
	public static void Turkey(Grid grid) {
		for(int i=0;i<grid.getHt();i++) {
			for(int j=0;j<grid.getWd();j++) {
		grid.setColor(i,j,Color.RED);
			}
			}

		grid.setColor(3,4,Color.WHITE);
		grid.setColor(3,5,Color.WHITE);
		grid.setColor(3,6,Color.WHITE);
		grid.setColor(3,7,Color.WHITE);
		grid.setColor(2,5,Color.WHITE);
		grid.setColor(2,6,Color.WHITE);
		grid.setColor(4,4,Color.WHITE);
		grid.setColor(5,4,Color.WHITE);
		grid.setColor(6,4,Color.WHITE);
		grid.setColor(6,5,Color.WHITE);
		grid.setColor(6,6,Color.WHITE);
		grid.setColor(6,7,Color.WHITE);
		grid.setColor(7,5,Color.WHITE);
		grid.setColor(7,6,Color.WHITE);

		grid.setColor(7,6,Color.WHITE);
		grid.setColor(7,6,Color.WHITE);
		grid.setColor(2,13,Color.WHITE);
		grid.setColor(3,12,Color.WHITE);
		grid.setColor(4,11,Color.WHITE);
		grid.setColor(5,11,Color.WHITE);
		grid.setColor(6,12,Color.WHITE);
		grid.setColor(7,13,Color.WHITE);
		grid.setColor(3,14,Color.WHITE);
		grid.setColor(4,15,Color.WHITE);
		grid.setColor(5,15,Color.WHITE);
		grid.setColor(6,14,Color.WHITE);
	}

	public static void Azerbaijan(Grid grid) {
		for (int i = 0; i < grid.getWd(); i++) {
			for (int n = 0; n < 30; n++) {
				grid.setColor(n, i, Color.blue);
			}
		}
		for (int i = 0; i < grid.getWd(); i++) {
			for (int n = 30; n < 61; n++) {
				grid.setColor(n, i, Color.red);
			}
		}
		for (int i = 0; i < grid.getWd(); i++) {
			for (int n = 61; n < 90; n++) {
				grid.setColor(n, i, Color.green);
			}
		}
		for (int i = 80; i < 95; i++) {
			grid.setColor(32, i, Color.white);
		}
		for (int i = 79; i < 96; i++) {
			grid.setColor(33, i, Color.white);
			grid.setColor(34, i, Color.white);
			grid.setColor(35, i, Color.white);
		}
		for (int i = 79; i < 96; i++) {
			grid.setColor(56, i, Color.white);
			grid.setColor(57, i, Color.white);
			grid.setColor(55, i, Color.white);

		}
		grid.setColor(54, 77, Color.white);
		grid.setColor(56, 78, Color.white);
		grid.setColor(57, 78, Color.white);
		grid.setColor(34, 78, Color.white);
		grid.setColor(33, 78, Color.white);
		grid.setColor(32, 80, Color.white);

		for (int i = 80; i < 95; i++) {
			grid.setColor(58, i, Color.white);

		}
		for (int i = 80; i > 76; i--) {
			for (int n = 55; n > 34; n--) {
				grid.setColor(n, i, Color.white);
			}
		}
		grid.setColor(32, 79, Color.white);

		for (int i = 36; i < 55; i++) {
			grid.setColor(i, 76, Color.white);
		}
		for (int i = 37; i < 54; i++) {
			grid.setColor(i, 75, Color.white);
		}
		for (int i = 37; i < 54; i++) {
			grid.setColor(i, 80, Color.red);
		}
		for (int i = 38; i < 53; i++) {
			grid.setColor(i, 79, Color.red);
		}
		for (int i = 42; i < 51; i++) {
			for (int n = 100; n < 110; n++)
				grid.setColor(i, n, Color.white);
		}

	}



	public static void Uzbekistan(Grid grid) {
		for (int i = 0; i < grid.getWd(); i++) {
			for (int j = 0; j < grid.getHt(); j++) {
				if (j < grid.getHt() / 3) {
					grid.setColor(j, i, Color.BLUE);
				} else if (j > grid.getHt() / 3 && j < grid.getHt() - grid.getHt() / 3) {
					grid.setColor(j, i, Color.WHITE);
				} else {
					grid.setColor(j, i, Color.GREEN);
				}
			}
		}

		for (int i = 0; i < grid.getWd(); i++) {
			grid.setColor(grid.getHt() / 3, i, Color.RED);
		}

		for (int i = 0; i < grid.getWd(); i++) {
			grid.setColor(grid.getHt() / 3 * 2 + 1, i, Color.RED);
		}

		grid.setColor(1, 3, Color.WHITE);
		grid.setColor(2, 2, Color.WHITE);
		grid.setColor(3, 1, Color.WHITE);
		grid.setColor(4, 2, Color.WHITE);
		grid.setColor(5, 3, Color.WHITE);
		grid.setColor(5, 5, Color.WHITE);
		grid.setColor(1, 9, Color.WHITE);
		grid.setColor(1, 11, Color.WHITE);
		grid.setColor(1, 13, Color.WHITE);
		grid.setColor(3, 7, Color.WHITE);
		grid.setColor(3, 9, Color.WHITE);
		grid.setColor(3, 11, Color.WHITE);
		grid.setColor(5, 7, Color.WHITE);
		grid.setColor(5, 9, Color.WHITE);
		grid.setColor(5, 11, Color.WHITE);
		grid.setColor(5, 13, Color.WHITE);
		grid.setColor(3, 13, Color.WHITE);
	}

	public static void Afghanistan(Grid grid) {
		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 0, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 1, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 2, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 3, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 4, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 5, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 6, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 7, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 8, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 9, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 10, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 11, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 12, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 13, Color.BLACK);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 14, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 15, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 16, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 17, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 18, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 19, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 20, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 21, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 22, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 23, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 24, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 25, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 26, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 27, Color.RED);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 28, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 29, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 30, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 31, Color.GREEN);

		}
		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 32, Color.GREEN);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 33, Color.GREEN);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 34, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 35, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 36, Color.green);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 37, Color.GREEN);

		}
		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 38, Color.GREEN);

		}

		for (int idx = 0; idx < grid.getHt(); idx++) {

			grid.setColor(idx, 39, Color.GREEN);

		}

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 1, Color.white);
		}

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 4, Color.white);
		}

		grid.setColor(7, 3, Color.white);
		grid.setColor(7, 2, Color.white);
		grid.setColor(10, 3, Color.white);
		grid.setColor(10, 2, Color.white);

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 6, Color.white);
		}

		grid.setColor(7, 7, Color.WHITE);
		grid.setColor(7, 8, Color.WHITE);
		grid.setColor(7, 9, Color.WHITE);

		grid.setColor(10, 7, Color.WHITE);
		grid.setColor(10, 8, Color.WHITE);
		grid.setColor(10, 9, Color.WHITE);

		for (int idx = 9; idx < grid.getHt() - 6; idx++) {

			grid.setColor(idx, 11, Color.white);
		}

		grid.setColor(7, 13, Color.WHITE);
		grid.setColor(7, 14, Color.WHITE);
		grid.setColor(8, 12, Color.WHITE);
		grid.setColor(14, 12, Color.WHITE);
		grid.setColor(14, 13, Color.WHITE);
		grid.setColor(14, 14, Color.WHITE);
		grid.setColor(13, 14, Color.WHITE);
		grid.setColor(12, 14, Color.WHITE);
		grid.setColor(11, 14, Color.WHITE);
		grid.setColor(11, 13, Color.WHITE);

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 16, Color.white);
		}

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 19, Color.white);
		}

		grid.setColor(10, 17, Color.WHITE);
		grid.setColor(10, 18, Color.WHITE);

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 21, Color.WHITE);
		}

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 24, Color.WHITE);
		}

		grid.setColor(7, 22, Color.white);
		grid.setColor(7, 23, Color.white);
		grid.setColor(10, 22, Color.white);
		grid.setColor(10, 23, Color.white);

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 26, Color.WHITE);
		}

		for (int idx = 7; idx < grid.getHt() - 5; idx++) {

			grid.setColor(idx, 33, Color.WHITE);
		}

		grid.setColor(8, 27, Color.white);
		grid.setColor(9, 28, Color.white);
		grid.setColor(10, 29, Color.white);
		grid.setColor(11, 30, Color.white);
		grid.setColor(12, 31, Color.white);
		grid.setColor(13, 32, Color.white);

	}

	public static void ErrorFlag(Grid grid) {

		for (int i = 0; i < grid.getHt(); i++) {
			grid.setColor(i, 0, Color.RED);
		}

		for (int i = 1; i < grid.getWd(); i++) {
			grid.setColor(0, i, Color.RED);
		}

		for (int i = 0; i < grid.getHt(); i++) {
			grid.setColor(i, grid.getWd() - 1, Color.RED);
		}

		for (int i = 1; i < grid.getWd(); i++) {
			grid.setColor(grid.getHt() - 1, i, Color.RED);
		}

	}

	private static void france(Grid grid) {
		// TO DO
		// Draw France flag
		// Hint: grid.setColor(row, col, Color.RED); will change the color of
		// one cell at (row,col) to red

		// France flag is three vertical stripes of blue, white and red

		int height = grid.getHt();
		int width = grid.getWd();

		for (int i = 0; i < width; i++) {

			for (int t = 0; t < height; t++) {
				if (i < width / 3) {
					grid.setColor(t, i, Color.red);
				} else if (i >= width / 3 && i < width - width / 3) {
					grid.setColor(t, i, Color.white);
				} else {
					grid.setColor(t, i, Color.blue);
				}

			}
		}

	}

	public static void USA(Grid grid) {
		for (int i = 0; i < grid.getHt(); i++)
			for (int n = 0; n < grid.getWd(); n++) {
				if (i % 2 == 0) {
					grid.setColor(i, n, Color.red);
				} else {
					grid.setColor(i, n, Color.white);
				}
			}

		for (int i = 0; i < (grid.getHt() / 2) + 1; i++)
			for (int n = 0; n < (grid.getWd() / 2) + 1; n++) {
				grid.setColor(i, n, Color.blue);
			}

		for (int i = 0; i < (grid.getHt() / 2); i++) {
			for (int n = 0; n < (grid.getWd() / 2); n++) {
				if (i % 2 == 0 && n % 2 == 0) {
					grid.setColor(i + 1, n + 1, Color.white);
				}
			}
		}
	}

	private static void argentina(Grid grid) {

	}

	private static void austria(Grid grid) {

	}

	public static void ukraine(Grid grid) {

		for (int i = 0; i < grid.getHt() / 2; i++) {
			for (int j = 0; j < grid.getWd(); j++) {
				grid.setColor(i, j, Color.blue);
			}
		}
		for (int i = grid.getHt() / 2; i < grid.getHt(); i++) {
			for (int j = 0; j < grid.getWd(); j++) {
				grid.setColor(i, j, Color.YELLOW);
			}
		}

	}

	public static void russia(Grid grid) {

	}

	private static void Uyghuria(Grid grid) {

	}

	private static void mycountry(Grid grid) {

	}
}
