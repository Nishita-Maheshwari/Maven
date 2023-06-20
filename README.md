# Maven

# => Maven :-
	-> Maven is the powerful open source "Project Automation Build Tool"  i.e. it automates everything related to building the project
	-> NOTE : Ant is also a build tool but do not compare them both because maven is very much advanced as compared to ant tool
	-> It was developed by "Apache Spftware Foundation" for "Jarkarta Turbine Project"
	-> Maven is written in java (so we must install java in order to use maven)
	-> It is mostly used for java projects but can also be used to build and manage the projects written in other technologies i.e. C#, Ruby, Scala etc
	
# 	-> Maven can perform following tasks :-
		1. Creates the default project structure
		2. Download the required dependencies (jar files)
		3. Prepares the documentation
		4. Compiles the source code
		5. Packaging the project i.e. .jar or .war or .ear file
		6. Install the packaged code on the server
		7. Starts and stops the server
		8. Build and deploy the project
		9. Performs the test execution
		10. Performs the test reports
		    etc
			
# 	-> Advantages / Objectives of Maven :-
		1. Makes the build process easy
		2. Enhances the project performance
		3. Easy to migrate to newer or older version
		4. Strong error and integrity reporting
		5. Integrate with version control tools like GIT
		   etc
		   
# 	-> Working of Maven :-
		= Diagram
		= NOTE : Maven is controlled by "pom.xml" file
		
# 	-> How to download and install maven :-
		1. Download maven zip from apache official website i.e. "https://maven.apache.org/download.cgi"
		2. Extract zip file
		3. Provide maven path in system variables
		4. In CMD, check if maven path is set or not (mvn -version)
		
# 	-> How to create maven project using CMD :-
		1. mvn archetype:generate
		2. choose archetype: 2001 [quickstart]
		3. Provide maven project details as follows :-
			= groupId: in.smartprogramming
			= artifactId: FirstMavenProject
			= version: 1.0
			= package: in.smartprogramming
		4. Press Y for confirm
		
# 	-> How to compile and run maven project from CMD :-
		1. Go to the project folder [cd ProjectFolderName]
		2. Compile the project [mvn compile]
		3. Run the project [mvn exec:java -Dexec.mainClass="in.smartprogramming.App"]
		
# 	-> How to create maven project package (jar) and execute it :-
		1. mvn package
		2. set classpath= -------- [path of project jar file]
		3. java packagename.MainClassName
		
============

# => archetype : It is the project template or project model where other projects can be created (normally we will create quickstart archetype project)

# => groupid : It is the unique group or company or organization that creates the project

# => artifactId : It is the unique project name

====



# MAVEN_FLOW
![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/e6e6ec39-893e-4bcd-9d14-668cec32895a)








# => How to create Maven project in IDE (eclipse)

# => POM (pom.xml) :-
	-> Full form of POM is "Project Object Model"
	-> It is an xml file which contains the information about the project and configuration details  which is used (read) by Maven to build the project
	-> It is also known as "heart" of Maven
	-> In maven1, this xml file was known as project.xml but from maven2 name was changed to pom.xml
	
	-> Some configurations that can be specified in pom.xml file are :-
		1. Project Description
		2. Property References
		3. Repositories
		4. Dependencies
		5. Build Configuration
		6. Build Profiles
		   etc
		   
===========

# 1. Project Description :-
	=> It contains the project details like version, groupid, artifactid, name, url etc
	=> Syntax :-
		<modelVersion>4.0.0</modelVersion>

		<groupId>in.smartprogramming</groupId>
		<artifactId>MavenProjectOne</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>MavenProjectOne</name>

		<url>http://www.example.com</url>
		

# 2. Property References :-
	=> It provides the flexibility to the build tool to avoid hardcode values for eg version numbers
	=> Syntax :-
	
		<properties>
			<junit-version>4.11</junit-version>
		</properties>
		
		<dependencies>
			<dependency>
				<version> ${junit-version} </version>	//calling the junit version number
			</dependency>
		</dependencies>
		


# 3. Repositories :-
	=> It is the location (local/server) from where maven download the project required dependencies (jar files)
	=> There are 3 types of repositories :-
		1. Local Repository
			-> It is the location in our system (computer) where maven stores the dependencies
			-> Path : C:/User/PcName/.m2/--dependencies--
		2. Central Repository [Online Repository]
			-> It is the location on the server from where maven download the dependencies
			-> It is the default repository
			-> Path :
				= https://mvnrepository.com/repos/central
				= https://repo.maven.apache.org/maven2/
				  etc
			-> NOTE : While downloading the dependencies from central repository, maven will also store those dependencies in local repository so that next time it can be directly used.
		3. Remote Repository
			-> It is the location of any organization repository.
			-> Path : https://organizationname.com
	=> Syntax :-
	`	<repositories>
			<repository>
				<id> -- </id>
				<name> -- </name>
				<url> ---- </url>
			</repository>
		</repositories>
		





# POM
![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/49e135ea-9acc-4be5-ac5b-0d086fd08044)



# Repository Flow
![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/1785ac03-4554-4570-97ec-0af46843a9ea)
















# => How to create Maven project in IDE (eclipse)

# => POM (pom.xml) :-
	-> Full form of POM is "Project Object Model"
	-> It is an xml file which contains the information about the project and configuration details  which is used (read) by Maven to build the project
	-> It is also known as "heart" of Maven
	-> In maven1, this xml file was known as project.xml but from maven2 name was changed to pom.xml
	
# 	-> Some configurations that can be specified in pom.xml file are :-
		1. Project Description
		2. Property References
		3. Repositories
		4. Dependencies
		5. Build Configuration
		6. Build Profiles
		   etc
		   


# 1. Project Description :-
	=> It contains the project details like version, groupid, artifactid, name, url etc
	=> Syntax :-
		<modelVersion>4.0.0</modelVersion>

		<groupId>in.smartprogramming</groupId>
		<artifactId>MavenProjectOne</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>MavenProjectOne</name>

		<url>http://www.example.com</url>
		

# 2. Property References :-
	=> It provides the flexibility to the build tool to avoid hardcode values for eg version numbers
	=> Syntax :-
	
		<properties>
			<junit-version>4.11</junit-version>
		</properties>
		
		<dependencies>
			<dependency>
				<version> ${junit-version} </version>	//calling the junit version number
			</dependency>
		</dependencies>
		
=========

# 3. Repositories :-
	=> It is the location (local/server) from where maven download the project required dependencies (jar files)
	=> There are 3 types of repositories :-
		1. Local Repository
			-> It is the location in our system (computer) where maven stores the dependencies
			-> Path : C:/User/PcName/.m2/--dependencies--
		2. Central Repository [Online Repository]
			-> It is the location on the server from where maven download the dependencies
			-> It is the default repository
			-> Path :
				= https://mvnrepository.com/repos/central
				= https://repo.maven.apache.org/maven2/
				  etc
			-> NOTE : While downloading the dependencies from central repository, maven will also store those dependencies in local repository so that next time it can be directly used.
		3. Remote Repository
			-> It is the location of any organization repository.
			-> Path : https://organizationname.com
	=> Syntax :-
	`	<repositories>
			<repository>
				<id> -- </id>
				<name> -- </name>
				<url> ---- </url>
			</repository>
		</repositories>
		
======

# 4. Dependencies :-
	=> Dependencies are the jar files or libraries which are required in our project
	=> Maven will automatically download the dependencies which we have configured in pom.xml file. We dont need to download and add dependencies (jars) in our project manually
	=> Syntax :-
		<dependencies>
			<dependency>
				<groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
				<version>8.0.31</version>
				<scope>test</scope>
			</dependency>
			---
			---
		</dependencies>
	=> NOTE : By default all dependencies have "compile" scope
	
-----------------------------------------------

# => Scope of Dependencies :-
	1. compile :-
		= This scope will make the dependencies available for all the phases of project lifecycle i.e. compile, test, runtime
		= This is default scope of dependencies
	2. provided :-
		= This scope will make the dependencies available for compile and test but not for runtime
		= For example : servlet API (in this case dependencies are provided by servlet container at runtime)
	3. runtime :-
		= This scope will make the dependencies available for test and runtime but not for compile
	4. test :-
		= This scope will make the dependencies available only for test, not for compile and runtime
	5. system :-
		= This scope will make the dependencies available to the system path
		= This scope is depricated
	6. import :-
		= This scope is only used when dependencies is of pom type. This scope indicates that the specified POM should be replaced with the dependencies in that POM's section <dependencyManagement>
	
======

# => Build :-
	-> Build is the process of converting the application compilation version to the executable [binary] version
	-> Build is the process which contains the following phases :-
		- compilation
		- linking
		- production of distributed packages (installers)
		- generating documentation
		- execution of automated test
		- generating reports
		- deployment of disptributed packages
		(above phases can be said as build lifecycle)

# => Deploy :-
	-> Deploy is the process when we install the application on an environment for eg server

# => Release :-
	-> Release is the process of making the application available to the end users

--------------------------------------------------------------------------

# 5. Build Configuration :-
	=> It contains the configuration of the building process (build lifecycle) of the application
	=> There are 2 types of build configurations :-
		-> Plugin Configuration
		-> Resource Configuration
	=> Build configurations are provided in <build> tag
		
--------------------------------------------------------------------------

# => Plugin Configuration :-
	-> Maven is actually a collection of plugin which can be used to perform many tasks as follows :
		= create jar or war or ear file
		= compile code files
		= unit testing of code
		= create project documentation
		= create project reports
		  etc
	-> Maven has as internal framework i.e. "Maven Plugin Execution Framework" which is responsible to perform all above tasks
	-> There are 2 types of plugins :-
		1. Build Plugin
			= These plugins are executed during the build process i.e. clean, compile, deploy, install etc
			= They are configured in <plugins> and <plugin> tag
		2. Reporting Plugin :-
			= These plugins are executed when our web site displays the current state of the project for example issue tracking, maling lists, project team etc
			= They are configured in <reporting> tag

--------------------------------------------------------------------------

# => Resource Configuration :-
	-> The resources plugin copy the files from input resource directory to an output resource directory
	-> For example, maven by default look for our project resources under src/main/resources directory. however, all our resources may  not be available under this directory. Then we can specify those directories in resource configuration
	-> Syntax :-
		<resources>
			<resource>
				<directory> ---src/xyz--- </directory>
			</resource>
		</resources>

=========

# 6. Build Profiles :-
	=> A build profile is a set of configuration values, which can be used to set or override default values of maven build.
	=> Using build profile, we can customize build for different environments such as development (dev), testing (test), production environment
	=> Syntax :-
		<profiles>
			<profile>
				<id>----</id>
				<activation>
					<activeByDefault>true</activeByDefault>
				</activation>
				<properties>
					<project>--------</project>
				</properties>
			</profile>
		</profiles>
		
----------------------------------------


# POM_File

![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/e032c99e-6ef0-474b-b6f4-1531adf7d103)


# Dependencies_Scope
![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/1897b5f6-b660-46ab-b98a-481cdbde7bc8)




# MVC

![image](https://github.com/Nishita-Maheshwari/Maven/assets/47790697/a8ed96ce-d8cb-4ee5-a8ef-463b6c689f1d)



