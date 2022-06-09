# Spring Prolog Server
A Spring server to execute [ECLiPSe](http://www.eclipseclp.org/) Prolog predicates from the web.

# Prerequisites
To run this application you need to:
- have ECLiPSe installed in your computer,
- add *eclipse.jar* (located at `<eclipse_dir>/lib/eclipse.jar` ) in a maven repository
- have a file called `program.ecl` in the root directory of the project (or in the same directory with the jar file, if you build the project it into a jar)

# Running
To run the application is important to have the VM option `-Declipse.directory` pointing to the directory where ECLiPSe is installed (e.g. `-Declipse.directory="C:\Program Files\ECLiPSe 7.1"`).

A default *program.ecl* file is provided which returns only the following list `[1, 2, 3, 4, 5]`

# Endpoints
This application exposes only one endpoint (`/*`) which when accessed with a GET request executes a hardcoded prolog predicated and returns the result.

### Side note: Adding eclipse.jar to maven
To add the *eclipse.jar* file in your local maven repository you can use the following command:

`mvn install:install-file -Dfile=<path-to-file> -DgroupId="com.parctechnologies.eclipse" -DartifactId=eclipse -Dversion=7.1 -Dpackaging=jar`