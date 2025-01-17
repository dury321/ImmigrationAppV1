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
    private String stateAddress;
    private String zipCode;
    private String phoneNumber;
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
    public String getStreetAddress() { return streetAddress; }
    // return the user's city address
    public String getCityAddress()
    {
        return cityAddress;
    }
    // return the user's state address
    public String getStateAddress()
    {
        return stateAddress;
    }
    // return the user's zip code
    public String getZipCode()
    {
        return zipCode;
    }
    // return the user's
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getEmail()
    {
        return email;
    }
    public String getHashedPassword()
    {
        return hashedPassword;
    }

    // -------- Sets for User ----------
    public void setUserName(String userNameTemp)
    {
        this.userName = userNameTemp;
    }
    public void setName(String nameTemp) { this.name = nameTemp; }
    public void setStreetAddress(String streetAddressTemp)
    {
        this.streetAddress = streetAddressTemp;
    }
    public void setCityAddress(String cityAddressTemp)
    {
        this.cityAddress = cityAddressTemp;
    }
    public void setStateAddress(String stateAddressTemp)
    {
        this.stateAddress = stateAddressTemp;
    }
    public void setZipCode(String zipCodeTemp)
    {
        this.zipCode = zipCodeTemp;
    }
    public void setPhoneNumber(String phoneNumberTemp)
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


    // Constructor (overloaded) -- userName and password input
    public User(String userName, String password)
    {
        // set the users userName
        setUserName(userName);
        // set the users password through hashing it in BCrypt
        setHashedPassword(password);
    }

    // Constructor (overloaded) -- set fields for user
    public User(String name, String streetAddress, String cityAddress,
                String stateAddress, String zipCode, String phoneNumber, String email)
    {
        // set the user's information
        setName(name);
        setStreetAddress(streetAddress);
        setCityAddress(cityAddress);
        setStateAddress(stateAddress);
        setZipCode(zipCode);
        setPhoneNumber(phoneNumber);
        setEmail(email);
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
