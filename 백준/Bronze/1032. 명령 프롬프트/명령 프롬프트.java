import java.io.*;
import java.util.*;

public class Main {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int N = Integer.parseInt(br.readLine());
      String result = "";
      String[] str = new String[N];
      for(int i=0;i<N;i++) {
    	  str[i] = br.readLine();
      }
      
      for(int i=0; i < str[0].length(); i++) {
    	  Set<String> str_set = new HashSet<>();
    	  String s = "";
    	  for(int j=0; j < N; j++) {
    		  s = String.valueOf( str[j].charAt(i) );
    		  str_set.add( s );
    	  }
    	  if( str_set.size() == 1) {
    		  result += s ;
    	  } else {
    		  result += "?";
    	  }
      }
      
      bw.write(result+"\n");
      
      bw.flush();
      bw.close();
      br.close();
   }   
}
