package readlearncode.session1.subsection5;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class NoEncapsulation {

    public long score;

    public void setScore(long score){
        this.score = score;
    }

    public static void main(String...args){
        new NoEncapsulation().score = 10;
    }

}