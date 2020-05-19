pipeline {
    agent any
    stages {
        stage('Build Application') {

            steps {
                git'https://github.com/nikolamarasovic/demo.git'
                triggers {
                    githubPush()
                }
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