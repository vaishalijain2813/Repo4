Feature: Automate Keka Tool

  Scenario Outline: Login to the application and verify  Home page components along with Left Pane links
    Given open the link
    Then click on Login with keka password
    Then Enter credentials in "<email>" and "<password>"
    Then verify left pane link and home components
    Examples:
      | email                         | password  |
      | vaishali.jain@successe.co | 12345678 |

    Scenario: Click on Link Me and select "Attendance" and verify "Attendance Log functionality" by verifying Last 30 and month wise data.
      Given Click on Me and select Attendance.
      Then verify attendance data.

