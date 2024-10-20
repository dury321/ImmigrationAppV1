//--------------------------------------------------------------------------------------------------
//File Name:        User.java
//Associated File:
//Contains:
//  Constructors:	Default:
//  Access:
//   Get -
//   Set -
//   Print -
//
// Other Methods -
//--------------------------------------------------------------------------------------------------

package models;
import org.mindrot.jbcrypt.BCrypt;

// Class User: Stores data for the user's information
public class User
{
    // private variables for user's information
    private String name;
    private String userName;
    private String streetAddress;
    private String cityAddress;
    private String zipCode;
    private int phoneNumber;
    private String email;

    // private String for password
    private String hashedPassword;

    // ------- Gets and Sets for the User class -----------
    // return user's name
    public String getName()
    {
        return name;
    }
    // return the user's userName
    public String getUserName()
    {
        return userName;
    }
    // return the user's street address
    public String getStreetAddress()
    {
        return streetAddress;
    }
    // return the user's city address
    public String getCityAddress()
    {
        return cityAddress;
    }
    // return the user's zip code
    public String getZipCode()
    {
        return zipCode;
    }
    // return the user's
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }

    // -------- Sets for User ----------
    public void setUserName(String userNameTemp)
    {
        this.userName = userNameTemp;
    }
    public void setName(String nameTemp)
    {
        this.name = nameTemp;
    }
    public void setStreetAddress(String streetAddressTemp)
    {
        this.streetAddress = streetAddressTemp;
    }
    public void setCityAddress(String cityAddressTemp)
    {
        this.cityAddress = cityAddressTemp;
    }
    public void setZipCode(String zipCodeTemp)
    {
        this.zipCode = zipCodeTemp;
    }
    public void setPhoneNumber(int phoneNumberTemp)
    {
        this.phoneNumber = phoneNumberTemp;
    }
    public void setEmail(String emailTemp)
    {
        this.email = emailTemp;
    }
    public void setHashedPassword(String hashedPasswordTemp)
    {
        this.hashedPassword = hashPassword(hashedPasswordTemp);
    }





    // Functions for password input
    // Constructor
    public User(String userName, String password)
    {
        // set the users userName
        setUserName(userName);
        // set the users password through hashing it in BCrypt
        setHashedPassword(password);
    }

    // private
    // function to hash the user's password
    private String hashPassword(String password)
    {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    // public
    // function to check the user's password
    public boolean checkPassword(String password)
    {
        return BCrypt.checkpw(password, this.hashedPassword);
    }








}
