pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                sh './mvnw clean package'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t student-app .'
            }
        }
        stage('Docker Run') {
            steps {
                sh 'docker stop student-app-container || true'
                sh 'docker rm student-app-container || true'
                sh 'docker run -d -p 8080:8081 --name student-app-container student-app'
            }
        }
    }
 }