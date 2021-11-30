package com.phillipgardner.sudokugame.computationlogic;

import com.phillipgardner.sudokugame.problemdomain.SudokuGame;

import static com.phillipgardner.sudokugame.problemdomain.SudokuGame.GRID_BOUNDARY;

public class SudokuUtilities {
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xIndex++){
            for (int yIndex = 0; yIndex < GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }

    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = createNewGrid();
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xIndex++){
            for (int yIndex = 0; yIndex < GRID_BOUNDARY; yIndex++) {
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
        return newArray;
    }

    public static int[][] createNewGrid() {
        return new int[GRID_BOUNDARY][GRID_BOUNDARY];
    }
}
