public static String luoSarja(int n){
    String numerosarja = "";
    for (int i = 1; i <= n; i++){
        for (int p = 1; p <= i; p++){
            int luku = (int)Math.pow(i, p);
            numerosarja = numerosarja + luku + ",";
        }
    }
    numerosarja = numerosarja.substring(0, numerosarja.length() - 1);
    return numerosarja;
}