package CiccioBurgerv1;

import java.util.HashMap;

public interface CanWriteReadFile {

    void writeDown(String string);

    HashMap<String, Double> readFile(String string);
}
