import java.io.*;
import java.net.URISyntaxException;

public class mM {
    public void change() throws URISyntaxException {
        BufferedReader br = null;

        try {

            String str;

            br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/KLSadd.tex")));
            PrintStream out = new PrintStream(new FileOutputStream("output.tex"));
            System.setOut(out);
            while ((str = br.readLine()) != null) {
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
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[]args) throws NumberFormatException, IOException, URISyntaxException {
        mM x= new mM();
        x.change();


    }
}
