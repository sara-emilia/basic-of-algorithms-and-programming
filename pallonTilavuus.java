public static double pallonTilavuus(double halkaisija){
    double r = halkaisija/2;
    double tilavuus = 0;
    tilavuus = (4.0/3)*Math.PI*(Math.pow(r, 3));
    return tilavuus;
}