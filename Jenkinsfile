pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                 bat './gradlew clean test --no-daemon' //run a gradle task
            }
        }
    }
}
