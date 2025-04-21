pipeline {
    agent any

    stages {
        stage('Build with Maven') {
            steps {
                bat '"C:\Users\nagap\Downloads\apache-maven-3.9.9-bin\apache-maven-3.9.9\bin\\mvn" clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t devopsTwo .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8080:8081 --name devopsContainer devopsTwo'
            }
        }
    }
}