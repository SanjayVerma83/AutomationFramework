pipeline {

```
agent any

tools {
    jdk 'JDK21'
    maven 'Maven-3.9'
}

stages {

    stage('Checkout Code') {

        steps {

            git branch: 'main',
                url: 'https://github.com/SanjayVerma83/AutomationFramework.git'
        }
    }

    stage('Build & Test') {

        steps {

            bat 'mvn clean test'
        }
    }
}

post {

    always {

        // TestNG Results
        junit 'target/surefire-reports/*.xml'

        // Allure Report
        allure(
            includeProperties: false,
            jdk: '',
            results: [[path: 'allure-results']]
        )

        // Extent Report
        publishHTML([
            allowMissing: false,
            alwaysLinkToLastBuild: true,
            keepAll: true,
            reportDir: 'Reports',
            reportFiles: 'AutomationReport.html',
            reportName: 'Automation Execution Report'
        ])
    }

    success {

        emailext(
            subject: 'Automation Framework Build SUCCESS',
            body: 'All test cases executed successfully.',
            to: 'sanjay.july@gmail.com'
        )
    }

    failure {

        emailext(
            subject: 'Automation Framework Build FAILED',
            body: 'Please check Jenkins console logs.',
            to: 'sanjay.july@gmail.com'
        )
    }
}
```

}
