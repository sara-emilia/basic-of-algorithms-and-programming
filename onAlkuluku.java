public static void onAlkuluku(int luku) {
    for (int i = 2; i < luku; i++){
        if (luku%i==0){
            System.out.println("ei");
            break;
        }
        if (luku%i != 0){
            System.out.println("on");
            break;
        }
    }
}