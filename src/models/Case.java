//--------------------------------------------------------------------------------------------------
//File Name:        Case.java
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

public class Case
{
    // private variables for case information
    private String caseName;    // case name
    private String status;      // case status


    private User caseUser;      // case user with their information



    Case(String caseName, String status, User caseUser)
    {
        // initialize case
        this.caseName = caseName;
        this.status = status;
        this.caseUser = caseUser;
    }


}
