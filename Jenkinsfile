pipeline {
    agent any

    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/Downeys/product-availability-location-crud.git'
            }
        }
        stage('Build') {
            steps {
                withGradle(){
                    sh "./gradlew build"
                }
            }
        }
    }
}