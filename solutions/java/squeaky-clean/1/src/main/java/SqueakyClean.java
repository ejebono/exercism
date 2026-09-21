public class SqueakyClean {
    public static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {
            // 1. Szóköz cseréje alulvonásra
            if (c == ' ') {
                result.append('_');
                capitalizeNext = false;
            } 
            // 2. Kebab-case kezelése
            else if (c == '-') {
                capitalizeNext = true;
            } 
            else {
                // 3. Leetspeak átalakítás
                if (c == '4') c = 'a';
                else if (c == '3') c = 'e';
                else if (c == '0') c = 'o';
                else if (c == '1') c = 'l';
                else if (c == '7') c = 't';

                // 4. Csak a betűket engedjük át (és a korábban szóközből lett alulvonás automatikusan átmegy az 1. ágon)
                if (Character.isLetter(c)) {
                    if (capitalizeNext) {
                        result.append(Character.toUpperCase(c));
                        capitalizeNext = false;
                    } else {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}