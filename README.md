# Bug reproduction

1. Install JDK 11 and Maven 3.5.4
2. Clone this repository and create an IntelliJ IDEA project from it, ensuring it uses the proper JDK and Maven.
3. Create a folder with a long directory path, e.g. D:/longName/longName/.../longName
4. Go to the Maven settings for this project and overwrite the local repository to use the folder you just created. This will prepend all dependencies with the folder path and really helps create a long enough classpath.
5. Run the main class in this repository. If your folder path is long enough, options for command line shortening will be suggested. Pick the "@argFiles (java 9+)"  option
6. *Running* it like this should be fine. The main class prints the length of the classpath; make sure it's around 55,000 characters (mine is 58,000). 
7. Now *debug* with the *same* run configuration. An exception should be thrown.