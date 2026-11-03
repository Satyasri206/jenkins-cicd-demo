
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh '''
                        mvn sonar:sonar \
                        -Dsonar.projectKey=jenkins-cicd-demo \
                        -Dsonar.projectName=jenkins-cicd-demo
                    '''
                }
            }
        }
    }
}
