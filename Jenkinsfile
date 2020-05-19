pipeline {
    agent any

    triggers {
                    githubPush()
                }
    git url: 'https://github.com/nikolamarasovic/demo.git'
    
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
    }
}