pipeline {
    agent any
    tools {
        gradle 'GRADLE'
    }
    stages {
        stage('Build') {
            steps {
                bat "gradle clean build"
            }
        }   
    }
}
