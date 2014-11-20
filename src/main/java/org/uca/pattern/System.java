package org.uca.pattern;

import org.uca.pattern.manydb.FilmManager;
import org.uca.pattern.manydb.UserManager;

/**
 * Created by daniel on 20/11/14.
 */
public class System {

    public static void main(String[] args) {
        UserManager userManager;
        FilmManager filmManager;

        String userId = "U01";

        userManager = new UserManager();
        userManager.saveAge(userId, 18);

        filmManager = new FilmManager();

        filmManager.removeAll();

    }


}
