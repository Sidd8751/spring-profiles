pipeline {
    agent any 
    stages {
        stage('Gradle build') {
           if (isUnix()) {
            sh './gradlew clean build'
            } else {
            bat 'gradlew.bat clean build'
        }
       }
    }
}
