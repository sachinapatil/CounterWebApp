//node {   
//     tools { 
//        maven 'Maven 3.3.9' 
//        jdk 'jdk8' 
//    }
//   stage ('Checkout'){
//        checkout scm
//    	    }
//    stage ('Build'){
//        sh "D:/\app/\apache-maven-3.5.0\bin\mvn clean package"
//        //sh 'D\:\app\apache-maven-3.5.0\bin\mvn clean package'
//    }
//}
pipeline {
    agent any
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
            }
        }
    }
}
