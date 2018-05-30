node {   
    stage ('Checkout'){
        checkout scm
    	    }
    stage ('Build'){
        sh "D://\app//\apache-maven-3.5.0//\bin//\mvn clean package"
        //sh 'D\:\app\apache-maven-3.5.0\bin\mvn clean package'
    }
}
