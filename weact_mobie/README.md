Android Application With Robotium Test(s)
==================================

This template provides a default Android Project with a separate Android Test Project. The test project includes the robotium library and examples on how to use this.

# How to use this template
1. Create a new workspace. (This is good practice!)
2. Find a suitable location to clone the project and clone it!
3. Go to Eclipse and choose File -> Import ... -> General -> Existing Projects into Workspace -> Select root directory
4. Now specify the just cloned directory and you should import 2 projects.
5. Optionally, clean your project. (Project -> Clean ...)

From here you should now rename your project and packagename.

# Creating your own repository
The easiest way to make this repo your own is to change the "remote branch" to your own repository. To do this, you need to change your current "origin" server (default name) to something else (e.g. github). Next you add a new origin branche refering to your own repo and finally delete the github server.

From the terminal in your github repository, type the following commands:

  1. git remote rename origin github
  2. git remote add origin \<your_repository_url\>
  3. git push -u origin master
  4. NOTE: If you have any issues at this point, do not perform step 5.
  5. git remote rm github

# Enable and use FindBugs and Checkstyle

- To use Checkstyle and FindBugs you need to install the Eclipse plugins:
	- Open Eclipse Market ( Help -> Eclipse Market )
	- Find the CheckStyle Plug-in package and install it
	- Find the FindBugs Eclipse Plugin package and install it
	- Restart Eclipse and refresh your project settings (F5)

- CheckStyle should be enabled by default. Check it's settings by right clicking on your project and choose Properties -> Checkstyle and find out if "Checkstyle active for this project" is checked. Checkstyles uses the supplied not-so-strict-checkstyle.xml file for it's checks. Feel free to change it.

- To run FindBugs right click on your project and choose Find Bugs -> Find Bugs.

