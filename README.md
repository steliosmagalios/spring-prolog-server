# Spring Prolog Server

A Spring application to run [eclipse](http://www.eclipseclp.org/) prolog queries from the web.

**Important**: To run the application you need to have the eclipse jar file (it comes with eclipse) added to
the local maven repository. You can use the following command for that purpose.

`mvn install:install-file -Dfile=<path-to-file> -DgroupId="com.parctechnologies.eclipse" -DartifactId=eclipse -Dversion=7.1 -Dpackaging=jar`

To run the application you need to have eclipse installed in your system and specify the path
with the -Declipse.directory parameter set to the location eclipse is installed.

The application exposes the endpoint "/" which, when accessed, executes a predefined
query and returns the result to the user.
