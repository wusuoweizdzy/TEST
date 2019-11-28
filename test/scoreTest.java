import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class scoreTest {

    @Test
    public void setS() {
        score score1 = new score();
        score1.setS(101);
        score1.check(score1.s);
    }

    @Test
    public void check() {
        score score2 = new score();
        score2.setS(90);
        boolean result = score2.check(score2.s);
        Assert.assertEquals("error!",result,true);
    }

    @Test
    public void score() {
        score score3= new score();
        char result;
        score3.setS(91);
        result = score3.Score(score3.s);
        Assert.assertEquals("error!",result,'A');

        score3.setS(81);
        result = score3.Score(score3.s);
        Assert.assertEquals("error!",result,'B');

        score3.setS(71);
        result = score3.Score(score3.s);
        Assert.assertEquals("error!",result,'C');

        score3.setS(61);
        result = score3.Score(score3.s);
        Assert.assertEquals("error!",result,'D');
    }

    @Test
    public void main() {
        score score4= new score();
        score4.main(score4.s);
    }
}