public static void suurin(int t[] t) {
    
    int max = -9999;
    for (int i = 0; i < t.length; i++){
        if (t[i] > max){
            max = t[i];
        }
    }
    System.out.println(max);
}