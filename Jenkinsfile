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

        junit 'target/surefire-reports/*.xml'

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
            body: '''
```

Build Status : SUCCESS

All test cases executed successfully.

Please check Jenkins for detailed reports.
''',
to: '[sanjay.july@gmail.com](mailto:sanjay.july@gmail.com)'
)
}

```
    failure {

        emailext(
            subject: 'Automation Framework Build FAILED',
            body: '''
```

Build Status : FAILED

Please check Jenkins console logs and reports.
''',
to: '[sanjay.july@gmail.com](mailto:sanjay.july@gmail.com)'
)
}
}
}
