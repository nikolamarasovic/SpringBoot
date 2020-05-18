pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                bat 'mvn -f C:/Users/enimara/Downloads/app/app_new/pom.xml clean package'
            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }

        stage('Create Docker Image'){
            steps {
                
                bat "cd C:/Users/enimara/Downloads/app/app_new/target/app-0.0.1-SNAPSHOT.jar"
                bat "docker build ./ -t springapp:${env.BUILD_ID}"
            }
        }
    }
    }