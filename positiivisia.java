public static int positiivisia(double[] t){
    int count = 0;
    for (double alkio : t){
        if (alkio >= 0){
            count = count + 1;
        }
    }
return count;
}