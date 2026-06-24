package codealpha_javaapp_gradle;

import org.apache.commons.lang3.StringUtils;

public class App {

    public String capitalizeName(String name) {
        return StringUtils.capitalize(name);
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(
                app.capitalizeName("krish patil")
        );
    }
}