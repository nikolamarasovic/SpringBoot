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
                
                
                // scm {
                //     git {
                //         remote {
                //         name('remote')
                //         url ('https://github.com/nikolamarasovic/demo.git')
                //         }
                //         branch 'master'
                //         }
                // }
                          
            }
            post {
                success {
                    echo "Now Archiving the Artifacts...."
                    archiveArtifacts artifacts: '**/*.jar'
                }
            }
        }

        // stage('Create Docker Image'){
        //     steps {
                
        //         bat "cd C:/Users/enimara/Downloads/app/app_new/"
        //         bat "docker build -t springapp:${env.BUILD_ID} ."
        //     }
        // }
    }
}
