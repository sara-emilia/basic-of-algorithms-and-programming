public static double keskiarvo(int[] t){
    double summa = 0;
    for (int alkio : t){
        summa = summa + alkio;
    }
    double ka = summa/t.length;
    return ka;
}