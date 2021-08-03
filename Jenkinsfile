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
                sh "docker build . -t downeys/bcpa-location-crud:latest"
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([string(credentialsId: 'DOCKERHUB_CREDENTIALS', variable: 'DOCKERHUB_CREDENTIALS')]) {
                    sh "docker login -u downeys -p ${DOCKERHUB_CREDENTIALS}"
                }
                sh "docker push downeys/bcpa-location-crud"
            }
        }
        stage('Deploy Image to K8S'){
            steps {
                sh 'kubectl -n default delete pod --all'
                sh "kubectl apply -f 'locationCrud.yml'"
            }
        }
    }
}