pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                //git branch: 'main', url: 'https://github.com/iyyappan24/Devops.git'

                // To run Maven on a Windows agent, use
                bat 'mvn -Dmaven.test.failure.ignore=true clean compile test package'
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                always {
                    junit 'target/surefire-reports/*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
