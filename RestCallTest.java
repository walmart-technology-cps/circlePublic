import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestCallTest {

    public void gitPush() throws IOException{

         Runtime rt = Runtime.getRuntime();
        rt.exec("echo start script");
        rt.exec("git remote add upstream git@github.com:walmart-technology-cps/circlePublic.git");
        rt.exec("git add .");
        rt.exec("git commit -m hi");
        rt.exec("git push upstream");
        rt.exec("echo end script");

    }

    public static void main(String[] args) {

        try {

            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();
            RestCallTest restCallTest = new RestCallTest(); 

            restCallTest.gitPush();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
