package week4.password_randomiser_81;

import java.security.SecureRandom;

public class Rand {
    private  int value;

    public Rand(int length) {
        // Format the variable here
        this.value = length;
    }

    public String createPassword() {

        //  alphanumeric range (0-9, a-z, A-Z)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(this.value);

        // each iteration randomly chooses an element from given variable "chars"
        for (int i = 0; i < this.value; i++)
            sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();


    }


}
