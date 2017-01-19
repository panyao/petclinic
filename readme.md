#Spring PetClinic
This is a fork of the project "PetClinic" (https://github.com/spring-projects/spring-petclinic/). The project is used for RSMT experiments.

#To run the project with Java Agent:

1) Import the project to Eclipse or IntelliJ with Maven

2) Configure the VM options as follows
```
-javaagent:rsmt-agent-tracer-shaded.jar
-Drsmt.logEverything=false
-Drsmt.buildCallGraph=false
-Drsmt.buildCallTrace=true
-Drsmt.callTraceDepth=10
-Drsmt.printPrefixes=org/springframework/samples/petclinic
-Drsmt.ignorePrefixes=java,org/junit,org/eclipse,com/sun,sun
-Drsmt.entryPoints="org/springframework/samples/petclinic/owner/OwnerController initCreationForm,
processCreationForm,initFindForm,processFindForm,initUpdateOwnerForm,
processUpdateOwnerForm,showOwner"
```

Drsmt.entryPoints defines the functions that you want to set as entry points. 

3) Run the project. The web service will be available in http://localhost:8080.

4) The traces will be outputed under threads directory.
