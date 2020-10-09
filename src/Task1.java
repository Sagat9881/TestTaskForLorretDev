import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        String [] test = {"Тест: роль первая: Слова пьесы",
                          "Тест: роль вторая",
                          "Тест2: роль третья",
                          "Тест2: роль четвертая",
                          "Тест: роль пятая"};

        System.out.println(Task1.sortThePlay(test));

    }

    public static String sortThePlay (String [] source) {

        Map <String, String> map = new HashMap<>();


        for (int i = 0; i < source.length; i++) {
            String [] bufString = source[i].split(":",2);
            if (map.containsKey(bufString[0])){
                map.replace(bufString[0],map.get(bufString[0]), map.get(bufString[0])+(i+1)+") "+bufString[1]+"\n");
                }else map.put(bufString[0],(i+1)+") "+bufString [1]+"\n");
           }
        StringBuilder buf = new StringBuilder();
        for (Map.Entry<String,String> entry : map.entrySet()){
            buf.append(entry.getKey()).append(":\n").append(entry.getValue());
        }
        return buf.toString();

    }

}
