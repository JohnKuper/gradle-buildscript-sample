## Sample of Gradle buildscript for supporting different app domains

Gradle build script that uses dynamic approach for creating and setup flavors from the configuration map.

This approach can be helpful on the projects that contain a lot of domains each of which, in turn, has slightly different configuration in terms of backend endpoints, app name, domain-id and the whole slew of other possible properties.

The main idea is to create the basic configuration and use inheritance for creating similar ones. Moreover, it allows adding additional logic during the parsing of the configuration map.
