pipeline {
    agent any
    triggers {
                    githubPush()
                }
    stages {
        stage('Build Application') {

            steps {
                git'https://github.com/nikolamarasovic/demo.git'
                
                bat 'mvn -f C:/Users/enimara/Downloads/app/app_new/pom.xml clean package'
            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }
    }
}