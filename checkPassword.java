public class checkPassword {

    public static void main(String[] args) {

        Password testPassword = new Password("Janhei4561237a");
        System.out.println(testPassword.checkLenght());
        System.out.println(testPassword.checkForOnlyDigitsAndLetters());
        System.out.println(testPassword.checkThatContainsAtLeastThreeDigits());
    }

}
    class Password {
        private String password;

        Password() {
            password = "";
        }

        public Password(String newPassword) {
            password = newPassword;
        }

        public boolean checkLenght() {
            if (password.length() >= 10)
                return true;
            else
                return false;
        }

        public boolean checkForOnlyDigitsAndLetters() {
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isLetterOrDigit(password.charAt(i)))
                    return false;
            }
            return true;
        }

        public boolean checkThatContainsAtLeastThreeDigits() {
            int numberOfDigits = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    numberOfDigits++;
                }
                if (numberOfDigits >= 3)
                    return true;

            }
            return false;
        }
}

