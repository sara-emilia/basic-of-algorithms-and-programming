public static void tulostaKertoma(int n){
    int kertoma = 1;
    int i = 0;
    while (i < n){
        kertoma = kertoma*(n - i);
        i++;
    }
    System.out.println(kertoma);
}