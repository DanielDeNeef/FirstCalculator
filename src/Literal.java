import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Literal extends Expression {

    public Integer value;

    public Literal(Integer value) {
        this.value = value;
    }

    @Override
    int getValue() {

            return value;
    }
}
