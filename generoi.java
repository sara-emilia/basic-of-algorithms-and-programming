public static double[] generoi(int pituus, double arvo) {
    double[] taulu = new double[pituus];
    double a = arvo;
    for (int i = 0; i < pituus; i++){
        taulu[i] = a;
    }
    return taulu;
}