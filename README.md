# Spring Prolog Server

A Spring application to run eclipse prolog queries from the web.

To run the application you need to have eclipse installed in your system and specify the path
with the -Declipse.directory parameter set to the location eclipse is installed.

The application exposes the endpoint "/" which, when accessed, executes a predefined
query and returns the result to the user.
