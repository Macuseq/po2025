import java.util.Random;
public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int Tab[] = new int[6];
        int Tab2[] = new int[50];

		
		for(int i = 0; i<6; i++){
                int tmp=0;
				while(tmp==0) {
                    int liczba;
                    liczba = random.nextInt(50);
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

        int Typy[] = new int[6];
        for(int i = 0; i<6; i++) {
            Typy[i] = Integer.parseInt(args[i]);
        }

        int ile=0;
        for(int i = 0; i<6; i++) {
            for(int j = 0; j<6; j++) {
                if(Tab[i]==Typy[j]) {
                    ile = ile+1;
                }
            }
        }

        System.out.println("\nLiczba trafien: " + ile);
	}
}