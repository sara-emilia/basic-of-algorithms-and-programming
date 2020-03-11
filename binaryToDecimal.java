public static void binaryToDecimal(String binary){
    int j = (binary.length() - 1);
    int c = 0;
    double luku = 0;
    double dec = 0;
    char tes = '1';
    char test = '0';
    for (int i = 0; i <= j; i++){
        if (binary.charAt(i) == test){
            luku = 0*(Math.pow(2, (j-c)));
        }
        else if (binary.charAt(i) == tes){
            luku = 1*(Math.pow(2, (j-c)));
        }
        dec = dec + luku;
        c = c + 1;
        }
    System.out.println((int)dec);