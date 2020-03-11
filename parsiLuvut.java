public static int[] parsiLuvut(String[] s) {
    int[] taulu = new int[s.length];
    for (int i = 0; i < s.length; i++){
        try {
            taulu[i] = Integer.parseInt(s[i]);
            }
        catch (NumberFormatException nfe) {
            taulu[i] = -1;
        }
    }
    return taulu;
}