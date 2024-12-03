Cd archetype Once the archetype matches what we want. It’s time to install it locally and generate a sample project.

From the archetype root run mvn install
Create a new project directory /Users/pranathi/projects/new_sample
Run the generate command mvn archetype:generate -DarchetypeCatalog=local. Local tells maven to look to the local repo for all archetypes and present with a list to pick one.
Enter the required parameters and the project is created.
cd into the project directory and run mvn spring-boot:run
Preview the new app
