package Tasks6.Task63;
import Interfaces.TransformText;
import static java.lang.System.*;

/**
 * Created by pavlo.balyuk on 10/3/2017..
 * Implement some MyString over String class, name it  MyString, add feature to show capital symbols in string: myString.capitalyzeSymbols().
 * Note:
 * Add constructor for String parameter and implement function: capitalyzeSymbols() which makes all symbols capital, e.g. food ->FOOD. In main function call this function to show it works.
 */
public class MyString {

        public static void main(String... aArgs){
            TransformText transformer = new BaseWrapper(new Echo());
            out.println(transformer.render("blah.")); // 'blah.'

            transformer = new Capitalize(new Echo());
            out.println(transformer.render("blah.")); // 'BLAH.'
        }

        private static final class Echo implements TransformText{
            public String render(String aText) {
                return aText;
            }
        }

        /**
         This class both implements the interface AND is constructed
         with an implementation of the same interface.
         */
        private static class BaseWrapper implements TransformText {
            BaseWrapper(TransformText aTransformText){
                fShowText = aTransformText;
            }
            /** Template method, calls 'before' and 'after' methods. */
            public final String render(String aText) {
                String text = before(aText);
                text = fShowText.render(text); //call-forward
                return after(text);
            }
            /** This default implementation does nothing.*/
            String before(String aText){
                return aText;
            }
            /** This default implementation does nothing.*/
            String after(String aText){
                return aText;
            }
            private TransformText fShowText;
        }

        private static final class Capitalize extends BaseWrapper {
            Capitalize(TransformText aTransformText){
                super(aTransformText);
            }
            @Override String before(String aText) {
                String result = aText;
                if (aText != null){
                    result = result.toUpperCase();
                }
                return result;
            }
        }
    }

