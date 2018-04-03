# Android Lifecycle Notes

This project goal is to log and organize some core information about the android lifecycle.

#### Diagram
The diagram shows the possible states that the application could stay, the events that trigger the state transition and the lifecycle callbacks called between them.

#### The Events.
These are the events that trigger the event transition.

##### \#Return
This event occurs when the activity is returning to the foreground:
* Close a dialog covering the current activity;
* Close an activity covering the current one;
* Open the application from the recent apps list.


##### \#Result
This event occurs when the activity is returning to the foreground and receiving a result:
* Close a dialog started for result;
* Close an activity started for result;
* Close the permission dialog


##### \#Killed
This event occurs when the system or the user kills the application process:
* The system kill the process to [free up RAM](https://developer.android.com/guide/components/activities/activity-lifecycle.html#asem);
* The use user kill the process by removing it from the recent apps list or by terminating it on the android settings.


##### \#Covered
This event occurs when the current activity is being covered by a [translucent](https://developer.android.com/reference/android/R.styleable.html#Theme_windowIsTranslucent) activity:
* A [translucent](https://developer.android.com/reference/android/R.styleable.html#Theme_windowIsTranslucent)  activity is started (usually a dialog activity).


##### \#Hidden
This event occurs when the current activity is sent to the background.
* Open a new activity;
* Switch to another application (Note: The recent apps list counts as another app);
* Touch the home button.


##### \#Finished
This event occurs when the current activity is finished.
* Touch the back button;
* Call finish programmatically.

![alt text](/doc/Lifecycle.png "Android Lifecycle")

##### \#Possible flows:

* Non-Existent -> Active
* Active -> Visible
* Active -> Not Visible
* Active -> Active (Configuration change)
* Active -> Non-Existent (Finished)
* Visible -> Not Visible
* Visible -> Visible (Configuration Change)
* Visible -> Active (No Result)
* Visible -> Active (With Result)
* Visible -> Non-Existent (Killed)
* Not Visible -> Active (With Result)
* Not Visible -> Active (No Result)
* Not visible -> Paused (With or Without Result)
* Not Visible -> Non-Existent (Killed)

##### \#conditional cases:
* Not Visible -> Paused (with/without cfg change)
* Non-Existent -> Paused
