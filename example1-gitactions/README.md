- Exposed endpoint:
	- http://localhost:8080/dummy
	
	
- Git Actions (on push)
	- 1 - echo example workflow.yml: Ejecuta el comando echo
	
	- 2 - mvn example workflow.yml: Ejecuta un mvn package
		
	- 3 - get version from pom workflow.yml: un job extrae la version del pom para que se utilice tanto en otros jobs como en steps posteriores.
	
	- 4 - env get version from pom workflow.yml: en un job se estrae la version del pom y la mete en el environment. Se puede ver como se puede utlizar en los steps posteriores pero no en otros jobs
	