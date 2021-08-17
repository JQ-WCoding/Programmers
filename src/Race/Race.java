package Race;

import java.util.Vector;

public class Race {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for ( String s : participant ) {

            int count = 0;

            for ( String value : completion ) {
                if ( s.equals( value ) ) {
                    count++;
                }
            }

            if ( count != 1 ) {
                if ( !answer.equals( s ) ) {
                    answer += s;
                }
            }

        }

        return answer;
    }
}
