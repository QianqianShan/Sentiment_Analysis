import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.*;

public class JSONConverter {

    public static void main(String[] args) throws IOException, JSONException {

        JSONArray jsonArray = new JSONArray();

        /*BufferedReader br = new BufferedReader(new FileReader("*_part-r-00000"));*/
        BufferedReader br = new BufferedReader(new FileReader("/home/qshan/Dropbox/Big_Data_Projects/Sentiment_Analysis/outputs/part-r-00000"));
        String line = br.readLine();
        /*FileWriter fileWriter = new FileWriter("");*/
        FileWriter fileWriter = new FileWriter("/home/qshan/Dropbox/Big_Data_Projects/Sentiment_Analysis/result.json");



        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while (line != null) {
            JSONObject article = new JSONObject();
            String[] title_emotion_count = line.split("\t");
            JSONObject emotionList = new JSONObject();

            emotionList.put(title_emotion_count[1], title_emotion_count[2]);
            article.put("title", title_emotion_count[0]);
            for (int i = 0; i < 2; i++) {
                line = br.readLine();
                title_emotion_count = line.split("\t");
                emotionList.put(title_emotion_count[1], title_emotion_count[2]);
            }
            article.put("data", emotionList);
            jsonArray.put(article);

            line = br.readLine();
        }

        bufferedWriter.write(jsonArray.toString());

        br.close();
        bufferedWriter.close();

    }
}
