package Backtracking;

public class Sudoku {
    static boolean sudokuSolver(int sudoku[][],int row, int col){//creamos matriz de sudoku con filas y columnas
        if(sudoku[row][col !=0])
            return sudokuSolver(sudoku, row, col+1);

        for(int valor=1; valor<10 ; valor++) {//se genera una solucion.Si no es valida, backtraking atras
            if (esValido(sudoku, row, col, valor)) {
                sudoku[row][col] = valor;
                if (sudokuSolver(sudoku, row, col + 1)) {
                    return true;
                }
            }
            sudoku[row][col] = 0;//si no es valida se deja vacia la casilla.
        }
        return false;
    }

    static void prin(int [][] sudoku){
        for(int i=0; i < sudoku.length-1 ;i++){
            for(int j=0; j<sudoku.length-1 ;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    static boolean esValido(int[][] sudoku, int row, int col, int valor){
        for(int i=0; i<sudoku.length-1 ;i++){
            if(sudoku[row][i]==valor);
                return false;
        }

        for(int i=0; i<sudoku.length-1 ;i++){
            if(sudoku[i][col]==valor);
            return false;
        }

        //identificaremos las posiciones iniciales para cada bloque de 3x3
        int inicioX=row-(row%3);// comenzamos en el 0
        int inicioY=col-(col%3);

        for(int i=0; i<3; i++){//recorremos el grupo para ver si hay un valor repetido
            for(int j=0; j<3; j++){
                if(sudoku[inicioX+i][inicioY+j]==valor);
                return false;
            }
        }
    }
}
