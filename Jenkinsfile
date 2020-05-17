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

        stage('Create Tomcat Docker Image'){
            steps {
                
                bat "dir"
                bat "docker build  -t springapp:${env.BUILD_ID}"
            }
        }
    }
    }