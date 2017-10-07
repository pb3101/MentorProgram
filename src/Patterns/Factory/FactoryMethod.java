package Patterns.Factory;
import java.io.File;
import org.w3c.dom.Document;

/**
 * Created by pavlo.balyuk on 10/7/2017.
 */

public class FactoryMethod {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXMLWriter();
        }
        return writer;
    }
}
