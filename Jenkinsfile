pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                sh 'mvn -f C:/Users/enimara/Downloads/app/app_new/pom.xml clean package'
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
                sh "pwd"
                sh "ls -a"
                sh "docker build  -t SpringApp:${env.BUILD_ID}"
            }
        }
    }
    }