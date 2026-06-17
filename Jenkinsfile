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

    post {

        success {

            emailext(
                subject: 'Automation Framework Build SUCCESS',
                body: 'All test cases executed successfully.',
                to: 'skkverma83@gmail.com'
            )
        }

        failure {

            emailext(
                subject: 'Automation Framework Build FAILED',
                body: 'Please check Jenkins console logs.',
                to: 'skkverma83@gmail.com'
            )
        }
    }
}