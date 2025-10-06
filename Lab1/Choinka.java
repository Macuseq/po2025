public class Choinka {
	public static void main(String[] args) {
		int ile = Integer.parseInt(args[0]);
		int ile2 = ile;
		while(ile > 0){
			ile = ile - 1;
			System.out.println("\n");
			for(int i = ile; i < ile2; i++){
				System.out.print("* ");
			}
		}
	}
}