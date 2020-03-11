public static void jarjesta(int[] taulu){
    int temp;
    int koko = taulu.length -1;
    for (int i = 0; i < koko; i++){
        if (taulu[i] > taulu[i+1]){
            temp = taulu[i];
            taulu[i] = taulu[i+1];
            taulu[i+1] = temp;
            i = -1;
        }
    }
}