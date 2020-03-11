public static BigInteger jyviaLaudalla(){
    BigInteger b = new BigInteger("0");
    BigInteger b2 = new BigInteger("1");
    for (int i = 0; i < 64; i++){
        b = b.add(b2);
        b2 = b2.multiply(BigInteger.valueOf(2));
    }
    return b;
}