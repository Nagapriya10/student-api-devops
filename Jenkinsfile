pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t student-app .'
            }
        }
        stage('Docker Run') {
            steps {
                bat 'docker stop student-app-container || true'
                bat 'docker rm student-app-container || true'
                bat 'docker run -d -p 8080:8081 --name student-app-container student-app'
            }
        }
    }
 }