public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
        String[] bowlingString = bowlingCode.split("\\|");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < bowlingString.length; i++)
        {
            sb. append(bowlingString[i]);
        }
        String s = sb.toString();
        char[] bowlingChar = s.toCharArray();
        int i = 0;
        int num = 0;
        int sum = 0;
        while (num < 10) {
            if (bowlingChar[i] == 'X' && bowlingChar[i + 1] == 'X') {
                sum += 20;
                if (bowlingChar[i + 2] == 'X') sum += 10;
                else if (bowlingChar[i + 2] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i + 2]));
                i++;
            } else if (bowlingChar[i] == 'X' && bowlingChar[i + 2] == '/') {
                sum += 20;
                i++;
            } else if (bowlingChar[i] == 'X') {
                sum += 10;

                if (bowlingChar[i + 1] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i + 1]));

                if (bowlingChar[i + 2] == 'X') sum += 10;
                else if (bowlingChar[i + 2] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i + 2]));

                i++;
            } else if (bowlingChar[i + 1] == '/') {
                sum += 10;
                if (bowlingChar[i + 2] == 'X') sum += 10;
                else if (bowlingChar[i + 2] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i + 2]));
                i = i + 2;
            } else {
                if (bowlingChar[i] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i]));

                if (bowlingChar[i + 1] == '-') ;
                else sum += Integer.parseInt(String.valueOf(bowlingChar[i + 1]));

                i = i + 2;
            }
            num++;
        }
        return sum;
    }
}
