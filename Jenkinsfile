pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                git 'https://github.com/SanjayVerma83/AutomationFramework.git'
            }
        }

        stage('Build & Test') {

            steps {

                bat 'mvn clean test'
            }
        }
    }
}