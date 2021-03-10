import java.util.*;
public class Cars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d = sc.nextInt();
		int i=sc.nextInt();
		int s = sc.nextInt();
		int v = sc.nextInt();
		int f = sc.nextInt();
		String graph[][] = new String[i][i];
		for(int j=0;j<i;j++) {
			for(int k=0;k<i;k++) {
				graph[j][k]=" ";
			}
		}
		ArrayList<String[]> carPaths = new ArrayList<>();
		for(int j = 0; j<s ; j++) {
			int b=sc.nextInt();
			int e=sc.nextInt();
			String street = sc.next();
			graph[e][b]=street;
			int l=sc.nextInt();
		}
		for(int j = 0; j < v; j++) {
			int p=sc.nextInt();
			String[] temp = new String[p];
			for(int k = 0; k < p; k++) {
				temp[0] = sc.next();
			}
			carPaths.add(temp);
		}
		int numOfLights = i % 2 == 0 ? i / 2 : i / 2 + 1;
		System.out.println(numOfLights);
		for(int j = 0; j < i; j += 2) {
			int streetId = j;
			System.out.println(streetId);
			ArrayList<String> validStreets= new ArrayList<>();
			for(int k = 0; k < i; k++) {
				if(graph[j][k] != " ") {
					validStreets.add(graph[j][k]);
				}
			}
			// hihi
			int numOfStreets = validStreets.size() % 2 == 0 ? validStreets.size() / 2 : validStreets.size() / 2 + 1;
			System.out.println(numOfStreets);
			int k = 0, count = 0;
			while(k < validStreets.size() && count <= d) {
				System.out.println(validStreets.get(k) + " 1");
				k += 2;
			}
		}
		sc.close();
	}
}
