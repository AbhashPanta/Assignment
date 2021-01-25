import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Q45 {

    public static void main(String[] args) {

        String fileName = "duplicateWorld";
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello world how world welcome to this new world of hello.");
            fw.close();
            System.out.println("Wrote to the file.");
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader br = null;
        Map<String,Integer> map = new HashMap<>();
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("([,.\\s]+)");
        Integer count = 0;
        String line;
        try {
            while (true) {
                assert br != null;
                if (!((line = br.readLine()) != null)) break;
                String[] tokens = pattern.split(line.toLowerCase());
                for (String s : tokens)
                {
                    s = s.toLowerCase();
                    if (map.containsKey(s))
                    {
                        map.put(s,map.get(s) + 1);
                    }
                    else
                    {
                        map.put(s,1);
                    }
                }
            }
        } catch (IOException ioExp) {
            ioExp.printStackTrace();
        }

        System.out.println();
        System.out.println("Duplicate Words are: ");

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " ==>" + entry.getValue());
            }
        }

    }
}
