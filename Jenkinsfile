pipeline {
    agent any

    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/Downeys/product-availability-location-crud.git'
            }
        }
        stage('Clean Build') {
            steps {
                withGradle(){
                    sh "./gradlew clean build"
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                sh "docker build . -t downeys/bcpa-location-crud"
            }
        }
    }
}