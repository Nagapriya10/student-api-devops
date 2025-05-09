// pipeline {
//     agent any
//
//     tools {
//         maven 'maven-3.9.9' // This refers to the name you gave in Global Tool Configuration
//         jdk 'Java21'
//     }
//
//     stages {
//         stage('Build with Maven') {
//             steps {
//                 bat 'mvn clean package'
//             }
//         }
//
//         stage('Build Docker Image') {
//             steps {
//                 bat 'docker build -t devops-two .'
//             }
//         }
//
//         stage('Run Docker Container') {
//             steps {
//                 bat 'docker run -d -p 8080:8081 --name devops-container devops-two'
//             }
//         }
//     }
// }

pipeline {
    agent any

    tools {
        maven 'maven-3.9.9'
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
                // Replace this path with your actual Docker path if different
                bat '"C:\\Program Files\\Docker\\Docker\\resources\\bin\\docker.exe" build -t devops-two .'
            }
        }

        stage('Trivy Scan Docker Image') {
            steps {
                // Replace with the actual Trivy installed path
                bat '"C:\\ProgramData\\Trivy\\trivy.exe" image --scanners vuln --timeout 10m devops-two'
            }
        }

        stage('Run Docker Container') {
            steps {
                // Replace this path with your actual Docker path if different
                bat '"C:\\Program Files\\Docker\\Docker\\resources\\bin\\docker.exe" run -d -p 8080:8081 --name devops-container devops-two'
            }
        }
    }
}
