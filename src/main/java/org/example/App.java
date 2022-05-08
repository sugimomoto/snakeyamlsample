package org.example;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class App {

    public static void main(String[] args) {

        /*
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Pushkin");
        map.put("name2w", "Pushkin");
        Yaml yaml = new Yaml();
        String output = yaml.dump(map);
        System.out.println(output);

        yaml = new Yaml();
        String document = "\n- Hesperiidae\n- Papilionidae\n- Apatelodidae\n- Epiplemidae";
        List<String> list = (List<String>) yaml.load(document);
        System.out.println(list);

         */

        /*

        Map<String, Object> data = new HashMap<String,Object>();
        data.put("name", "Silenthand Olleander");
        data.put("traits", new String[] { "ONE_HAND", "ONE_EYE" });
        Yaml yaml = new Yaml();
        String output = yaml.dump(data);

        System.out.println(output);
         */


        // Resourceから取得
        User user = (User)new Yaml().load(App.class.getResourceAsStream("/user.yaml"));

        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());


        /*
        Map map = new Yaml().load(App.class.getResourceAsStream("/sample.yaml"));

        System.out.println(map.get("name"));
        */



    }
}
