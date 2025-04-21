pipeline {
    agent any

    tools {
        maven 'maven-3.9.9' // This refers to the name you gave in Global Tool Configuration
        jdk 'Java21'
    }

    stages {
        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t devops-two .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8080:8081 --name devops-container devops-two'
            }
        }
    }
}