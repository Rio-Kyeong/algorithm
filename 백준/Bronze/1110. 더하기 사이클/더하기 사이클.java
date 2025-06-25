
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		
		int i, j , p, q;
		int cnt = 0;
		int b = n;
		
		while(true) {
			if(n < 10) {
				i = 0;
			}
			
			i = (b/10); 
			j = (b%10); 
			
			p = i+j; 
			
			if(p > 9) {
				p = p%10;
			}
			
			q = (j*10)+p;
			b = q;
			
			cnt++;
			
			if(n == b){
				System.out.println(cnt);
				break;
			}	
		}
		
	}

}