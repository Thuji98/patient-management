pipeline{
    agent any
    stages {
        stage ('Checkout Source') {
            steps {
                checkout scm
            }
        }
        stage ('Build and Prepare Release') {
            steps {
                sh 'git config --global user.email "thujithaponnuthurai@gmail.com"'
                sh 'git config --global user.name "Thuji98"'
                withCredentials([gitUsernamePassword(credentialsId: 'GIT_HUB_CREDENTIALS')]) {
                    sh 'mvn release:prepare -Dresume=false'
                    sh 'mvn dockerfile:push'
                }
            }
        }
        stage ('Kubernetes Deployment') {
            steps {
                 withKubeConfig([credentialsId: 'kubeconfig1']) {
                      sh 'kubectl apply -f deployment.yml'
                 }
            }
        }
    }
}