public class Laskin{
	
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Anna parametriksi kaksi kokonaislukua ja haluttu laskutoimitus!");
            System.exit(0);
        }

        int luku1 = Integer.parseInt(args[0]);
        int luku2 = Integer.parseInt(args[2]);
        String merkki = args[1];
        
        if (merkki.equals("-")){
            int erotus = luku1 - luku2;
            //tulostetaan erotus
            System.out.println("Lukujen " + luku1 + " ja " + luku2 + " erotus on: " + erotus);
        }
        if (merkki.equals("+")){
            int summa = luku1 + luku2;
            //tulostetaan summa
            System.out.println("Lukujen "+ luku1 + " ja " + luku2 +" summa on: " + summa);
        }
        if (merkki.equals("/")){
            int osamaara = luku1/luku2;
            //tulostetaan osamäärä
            System.out.println("Lukujen " + luku1 + " ja " + luku2 + " osamaara on: " + osamaara);
        }
        if (merkki.equals("x")){
            int tulo = luku1*luku2;
            //tulostetaan tulo
            System.out.println("Lukujen " + luku1 + " ja " + luku2 + " tulo on: " + tulo);
        }
    }
}