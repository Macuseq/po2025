import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
        int tr = 50;
        Random random = new Random();
        int Tab[] = new int[6];
        int Tab2[] = new int[tr];


        for(int i = 0; i<6; i++){
            int tmp=0;
            while(tmp==0) {
                int liczba;
                liczba = random.nextInt(tr);
                if (Tab2[liczba] == 0) {
                    Tab2[liczba] = 1;
                    Tab[i] = liczba;
                    tmp = 1;
                }
            }
        }

        System.out.println("Wylosowane Liczby: ");
        for(int i = 0; i<6; i++) {
            System.out.print(Tab[i] + " ");
        }


        int liczba_losowan=0;

        long startTime = System.currentTimeMillis();


        int ile=0;

        while(ile!=6){
            ile=0;

            for(int i = 0; i<tr; i++){
                Tab2[i] = 0;
            }

            int Typy[] = new int[6];
            for(int i = 0; i<6; i++) {
                int tmp=0;
                while(tmp==0) {
                    int liczba;
                    liczba = random.nextInt(tr);
                    if (Tab2[liczba] == 0) {
                        Tab2[liczba] = 1;
                        Typy[i] = liczba;
                        tmp = 1;
                    }
                }
            }

            liczba_losowan++;

            for(int i = 0; i<6; i++) {
                for(int j = 0; j<6; j++) {
                    if(Tab[i]==Typy[j]) {
                        ile = ile+1;
                    }
                }
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\nLiczba losowan: " + liczba_losowan);
        System.out.println("Czas dzialania " + (endTime - startTime) + " ms") ;
    }
}
