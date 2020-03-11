public static void poistaVokaalit(StringBuilder sb){
    for (int j = 0; j < sb.length(); j++){
       
        if (sb.charAt(j) == 'a' || sb.charAt(j) == 'e' || sb.charAt(j) == 'i' || sb.charAt(j) == 'o' || sb.charAt(j) == 'u' || sb.charAt(j) == 'y'){
            sb.deleteCharAt(j);
            j--;
            
        }
    }
}