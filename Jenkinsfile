pipeline {

    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {

        stage('Build & Test') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}