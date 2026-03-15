public class OOPSBanner {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    static String[] getSPattern() {
        return new String[]{
                " ****** ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        };
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characters = {
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S', getSPattern())
        };

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            line.append(characters[0].getPattern()[i]).append(" ");
            line.append(characters[0].getPattern()[i]).append(" ");
            line.append(characters[1].getPattern()[i]).append(" ");
            line.append(characters[2].getPattern()[i]);

            banner[i] = line.toString();
        }

        for (String row : banner) {
            System.out.println(row);
        }
    }
}