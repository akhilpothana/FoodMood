# FoodMood
A list of each implemented design pattern along with the classes that implement this design and the person that wrote the code

Achievements [Max Hamill] - This design pattern is implemented in the Achievements class. The class has checks for milestones for a few areas of progress that the user can make in the app. The persistent data was not quite ready when I coded this so I just need to link up the variables to the persisted data for the checks to be valid and the achievements will be fully complete.

Chart Prototype [Max Hamill] - This design pattern is implemented in the PieChartModel class. This class is a JavaFX application that is currently launched by calling the createChart() method in the chartsController class. When the class is launched it stages a Pie Chart prototype split 50/50 into 2 default values. The prototype data can be accessed using getChart() method that I implemented so we can use this prototype as a base for all of our pie charts. Still trying to learn JavaFX but to see my current model just create a chartsController and call createChart().

Drop-down Menu[Shawn Foreman] - This design pattern is located in the MainMenuUI class. This pattern allows the user to move across the screens of the application through a single bar located at the top of the application. There are a few pages within the application, but they are not yet fully developed or processed. The group will need to talk more about these pages and how the application will be divided still, and then more pages for the menu will be able to be created.

Object Oriented Pattern: CHECKS [Ed Reinoso]
For this pattern, I decided to implementation this in the CRUD User section. This is specifically shown in the Sign Up view when the user is trying to create a new profile. The way it works is that when users try to input something that is erroneous, then the application will check whether the input is valid depending on certain parameters. Those parameters are the following:
1.	Password: it should be longer than 5 characters to make it secure
2.	Username: it should also be longer than 5 characters.
3.	Email: it needs to valid email address
Some of the examples shown in the pattern would be Echo Back. This is one of the characteristics of CHECKS, and it is about reporting the errors that users make, for instance if they do not fulfill the requirements of the parameters.
It is important to mention that these parameters are subjected to change as we start developing more our application. As for now, we decided to have the bare minimum for this submission to show a working example of what we are trying to 

Design Pattern: Input Prompt [Ed Reinoso]
For this pattern, I decided to change the original implementation which was the Notification use case. This pattern was about creating a clear interface for the users to understand what they should be notified about. 
However, as the focus of the assignment for this week was mostly about CRUD User, CRUD Food and Mood then I decided that it would be best to implement a pattern that would go best with these use cases. So, Input Prompt is about having enough information in the text fields so that users understand what they have to input. These prompting string for information often begins with a call to action that the users have to do based on what the field is about. Therefore, some of the examples that this can be seen in the application are:
1.	Login View
a.	Username
b.	Password
2.	Sign Up View
a.	Name
b.	Last Name
c.	Email Address
d.	Username
e.	Password