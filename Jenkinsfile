pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                 sh './gradlew clean test --no-daemon' //run a gradle task
            }
        }
    }
}
