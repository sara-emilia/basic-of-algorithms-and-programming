public static int matriisiSumma(int[][] m){
    int summa = 0;
    for (int i = 0; i < m.length; i++){
        for (int j = 0; j < m[i].length; j++){
            summa = summa + m[i][j];
        }
    }
    return summa;
}