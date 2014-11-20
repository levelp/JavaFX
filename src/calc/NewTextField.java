package calc;
import javafx.scene.control.TextField;
/**
 * Created by darya on 21/11/14.
 */
public class NewTextField extends TextField{

    @Override
    public void replaceText(int start, int end, String text) {
        String oldValue = getText();
        if (!text.matches("[a-z]") && !text.matches("[\\\\!\"#$%&()*+-,./:;<=>?@\\[\\]^_{|}~]+")) {
            super.replaceText(start, end, text);
        }
        if (getText().length() > 10 ) {
            setText(oldValue);
        }
    }

    @Override public void replaceSelection(String text) {
        String oldValue = getText();
        if (!text.matches("[a-z]") && !text.matches("[\\\\!\"#$%&()*+-,./:;<=>?@\\[\\]^_{|}~]+")) {
            super.replaceSelection(text);
        }
        if (getText().length() > 10 ) {
            setText(oldValue);
        }

    }
}
