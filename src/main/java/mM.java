import java.io.*;
import java.net.URISyntaxException;

public class mM {
    public void change(String x) throws URISyntaxException, IOException {
        String str;
        BufferedReader br = null;
        if (x == null) {
            br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/KLSadd.tex")));
            PrintStream out = new PrintStream(new FileOutputStream("output.tex"));
            System.setOut(out);
            while ((str = br.readLine()) != null) {
                mM(str);
                System.out.println();
            }
        } else {
            mM(x);
        }
    }
    public char[] mM(String str) {
        char [] result = new char[str.length()];
        for ( int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'm') {
                result[i] = 'M';
            }
            else if(str.charAt(i) == 'M'){
                result[i] = 'm';
            } else{
                result[i] = str.charAt(i);
            }
        }
        for(int j = 0; j<result.length; j++) {
            System.out.print(result[j]);
        }
        return result;
    }

    public String charToString(char[] x) {
        String out = String.valueOf(x);
        return out;
    }

    public static void main(String[]args) throws  IOException, URISyntaxException {
        mM x= new mM();
        x.change(null);

    }
}
