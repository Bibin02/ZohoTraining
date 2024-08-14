import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PasswordValidatorTag extends TagSupport {

    private String password;

    public void setpassword(String password) {
        this.password = password;
    }

    @Override
    public int doStartTag() throws JspException {
        boolean isValid = validatePassword(password);
        try {
            pageContext.getOut().write(isValid ? "Password is valid" : "Password is invalid");
        } catch (java.io.IOException e) {
            throw new JspException(e.getMessage());
        }
        return SKIP_BODY;
    }

    private boolean validatePassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
        }

        return hasDigit && hasUpperCase && hasLowerCase;
    }
}
