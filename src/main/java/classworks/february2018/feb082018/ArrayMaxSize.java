package classworks.february2018.feb082018;

import java.util.Arrays;

public class ArrayMaxSize {
    public static void main(String[] args) {
        int count = 0;
        int[][][][][][][][][][][][][][][][][] array = new int[2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            for (int n = 0; n < 2; n++) {
                                for (int o = 0; o < 2; o++) {
                                    for (int p = 0; p < 2; p++) {
                                        for (int q = 0; q < 2; q++) {
                                            for (int r = 0; r < 2; r++) {
                                                for (int s = 0; s < 2; s++) {
                                                    for (int t = 0; t < 2; t++) {
                                                        for (int u = 0; u < 2; u++) {
                                                            for (int v = 0; v < 2; v++) {
                                                                for (int w = 0; w < 2; w++) {
                                                                    for (int x = 0; x < 2; x++) {
                                                                        for (int y = 0; y < 2; y++) {
                                                                            array[i][j][k][l][m][n][o][p][q][r][s][t][u][v][w][x][y] = 1;
                                                                            count++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
