public static void jarjestaParilliset(int[] taulu){
    int[] posTaulu = new int[taulu.length];
    int temp;
    for (int i = 0; i < taulu.length - 1; i++){
        for (int j = i + 1; j < taulu.length; j++){
            if (taulu[i] > taulu[j] && taulu[i]%2 == 0 && taulu[j]%2 == 0){
                temp = taulu[i];
                taulu[i] = taulu[j];
                taulu[j] = temp;
                posTaulu = taulu;
            }
        }
    }
}