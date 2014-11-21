package org.uca.pattern;

import org.uca.pattern.manydb.FilmManager;
import org.uca.pattern.manydb.UserManager;

/**
 * Created by daniel on 20/11/14.
 */
public class SystemTest {

    public static void main(String[] args) {
        UserManager userManager;
        FilmManager filmManager;

        String userId = "U01";

        userManager = new UserManager();
        userManager.saveAge(userId, 18);

        filmManager = new FilmManager();

        filmManager.removeAll();
        printHelloMsg();
    }

	private static void printHelloMsg() {
		String name = "Pepe";
        String despedida = "me tengo que marchar";
        System.out.println("Hola, " +name +" que tal estás?" +", bueno, "+despedida );
   
        StringBuilder msg;
        
        msg = new StringBuilder();
        msg.append("Hola ");
        msg.append(name);
        msg.append(", que tal estás?");
        msg.append(", bueno, ");
        msg.append(despedida);
        System.out.println(msg.toString());
	}


}
