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

    // TODO: status should be a union type
    // eg. status is one of:
    // -- PRE-SUBMISSION
    // -- POST-SUBMISSION
    private String status;      // case status

    // case user with their information
    private User caseUser;


    // Constructor
    Case(String caseName, String status, User caseUser)
    {
        // initialize case
        this.caseName = caseName;
        this.status = status;
        this.caseUser = caseUser;
    }


    // Gets and Sets for Case Class
    // return case name
    public String getCaseName()
    {
        return caseName;
    }
    // return the case status
    public String getStatus()
    {
        return status;
    }



}
