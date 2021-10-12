/*
Write a Java method to check whether a string is a valid password.
        Password rules:
        • A password must have at least eight characters.
        • A password consists of only letters and digits.
        • A password must contain at least three digits.
        • A password must contain at least two upper case letter
 */
package Day2;

import java.util.Scanner;

public class PasswordRule {
    public static void main(String[] args) {
        System.out.println("Please Enter Password: ");
        Password p = new Password();
        Check c = new Check();

        p.getPassword();
        c.length(p);
        //set required length
        c.specialCharacters(p);
        //check if password contains any special character or a number of special characters
        c.digits(p);
        //check if password contains a digit or a number of digits
        c.alphabetUppercase(p);
        //check if password contains specific letter or letters
        //check if password begins with uppercase
        c.alphabetLowercase(p);
        c.result(p);

    }


}
class Password
{
    String password;
    Scanner in = new Scanner(System.in);

    void getPassword()
    {
        try
        {
            password = in.nextLine();
        } catch(Exception e)
        {
            System.out.println("Input Error");
            e.printStackTrace();
        }
    }
}

class Check
{
    boolean length, special, digit, letterUpperCase,letterLowerCase;

    void length(Password p)
    {
        if(p.password.length() >=8) //enter required length
        {
            length = true;
        }
    }

    void specialCharacters(Password p)
    {
        char [] characters = {'~','@', '!', '#', '$', '%', '^', '&', '*', '`'}; //enter special characters here
        for(int i = 0; i < p.password.length(); i++)
        {
            for(int j = 0; j < characters.length; j++)
            {
                if(p.password.charAt(i) == characters[j])
                {
                    special = true;
                }
            }
        }
        //if you require more than one special character in password
		/*
		int charCount;
		for(int i = 0; i < p.password.length(); i++)
		{
			for(int j = 0; j < characters.length; j++)
			{
				if(p.password.charAt(i) == characters[j])
				{
					charCount++;
				}
			}
		}
		if(charCount >= 0)//insert required amount
		{
			special = true;
		}
		*/
    }

    void digits(Password p)
    {
        for(int k = 0; k < p.password.length(); k++)
        {
            if(Character.isDigit(p.password.charAt(k)))
            {
                digit= true;
            }
        }
        //if you require more than one number in password
		/*
		int digitCount;
		for(int k = 0; k < p.password.length(); k++)
		{
				if(Character.isDigit(p.password.charAt(k)))
				{
					digitCount++;
				}
			}
		}
		if(digitCount >= 0)//insert required amount
		{
			digit = true;
		}
		*/
    }

    void alphabetUppercase(Password p)
    {
        char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; //enter letters here
        for(int l = 0; l < p.password.length(); l++)
        {
            for(int m = 0; m < letters.length; m++) //&& Character.isUpperCase(p.password.charAt(0)) //if first character should be uppercase
            {
                if(p.password.charAt(l) == letters[m])
                {
                    letterUpperCase = true;
                }
            }
        }
        //if you require more than one specific letter
		/*
		int letterCount;
		for(int l = 0; l < p.password.length(); l++)
		{
			for(int m = 0; m < letters.length; m++) //&& Character.isUpperCase(p.password.charAt(0)) //if first character should be uppercase
			{
				if(p.password.charAt(l) == letters[m])
				{
					letterCount++;
				}
			}
		}
		if(letterCount > 0)//insert required amount
		{
			letter = true;
		}
		*/
    }
    void alphabetLowercase(Password p) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; //enter letters here
        for (int l = 0; l < p.password.length(); l++) {
            for (int m = 0; m < letters.length; m++) //&& Character.isUpperCase(p.password.charAt(0)) //if first character should be uppercase
            {
                if (p.password.charAt(l) == letters[m]) {
                    letterLowerCase = true;
                }
            }
        }
    }

    void result(Password p)
    {
        if(length == true && special == true && digit == true && letterUpperCase == true && letterLowerCase == true)
        {
            System.out.println("Password Is Valid");
        }

        else
        {
            System.out.println("Password Is Invalid");
        }
    }
}