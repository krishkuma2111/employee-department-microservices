pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
        jdk 'JDK-17'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/krishkuma2111/employee-department-ms.git'
            }
        }

        stage('Build Employee Service') {
            steps {
                dir('employee-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Department Service') {
            steps {
                dir('department-service') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Docker Images') {
            steps {
                sh 'docker build -t employee-service ./employee-service'
                sh 'docker build -t department-service ./department-service'
            }
        }
    }

    post {
        success {
            echo 'Build Successful!'
        }
        failure {
            echo 'Build Failed!'
        }
    }
}
