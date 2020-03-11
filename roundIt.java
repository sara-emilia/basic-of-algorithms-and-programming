public static int[] roundIt(double[] liukuTaulu) {
    int[] uusiTaulu = new int[liukuTaulu.length];
    for (int i = 0; i < liukuTaulu.length; i++){
        int a = (int)Math.round(liukuTaulu[i]);
        uusiTaulu[i] = a;
        }
    return uusiTaulu;
}