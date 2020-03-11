public static boolean equals(int[] t1, int[] t2) {
    boolean valid = true;
    if (t1.length == t2.length){
        valid = true;
    }
    else{
        valid = false;
    }
    for (int i = 0; i < t1.length; i++){
        if (t1[i] == t2[i]){
        }
        else{
            valid = false;
        }
    }
    return valid;
}