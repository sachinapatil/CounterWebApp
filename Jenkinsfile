pipeline {
    agent any
 	parameters {
	def myChoices = "DEV\nDelphix"
 	properties([
   	parameters([
      	choice(choices: myChoices, description: 'Please select an environment', name: 'Environment'),
      	string(description: 'Please enter your Name', name: 'User'),
      	string(description: 'Please enter the reason for deployment', name: 'Message')
   	])
	])
	}
    tools {
        maven 'jenkins_maven'
        jdk 'JAVA_1.8'
    }
    stages {
        stage ('Checkout'){
            steps {
            checkout scm
            }
   	    }
        stage('Build') {
            steps {
               sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://127.0.0.1:9000/ -DproxySet=true -DproxyHost=www-proxy.us.oracle.com -DproxyPort=80'
		  //sh 'mvn clean package -DproxySet=true -DproxyHost=www-proxy.us.oracle.com -DproxyPort=80'
		   	nexusArtifactUploader(
    			nexusVersion: 'nexus3',
    			protocol: 'http',
    			nexusUrl: '10.180.84.255:9081',
    			groupId: 'com.mkyong',
    			version: '1.0-SNAPSHOT',
    			repository: 'maven-snapshots',
    			credentialsId: 'Mum_Nexus_server',
    			artifacts: [
        		[artifactId: 'CounterWebApp',
         		classifier: '',
         		file: 'target/CounterWebApp.war',
         		type: 'war']
    			]
 		)
            
   	    }
            
        }
		
		
    }
}
