pipeline {
    agent any
    tools {
        gradle 'GRADLE_HOME'
    }
    stages {
        stage('Build') {
            steps {
                bat "gradle clean build"
            }
        }   
    }
}
