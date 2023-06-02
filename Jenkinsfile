pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/LYAG/manager-api.git'
                sh 'mvn clean package'
            }
        }
        
        stage('Run') {
            steps {
                sh 'java -jar target/app.jar'
            }
        }
        
        stage('Test with SonarQube') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
    
    post {
        always {
            deleteDir()
        }

        success {
            echo 'Pipeline succeeded !'
            emailext body: 'Le pipeline Jenkins a réussi !', subject: 'Pipeline Jenkins réussi', to: 'yessiloukou@gmail.com'
        }

        failure {
            echo 'Pipeline failed !'
            emailext body: 'Le pipeline Jenkins a échoué !', subject: 'Pipeline Jenkins en échec', to: 'yessiloukou@gmail.com'
        }
    }
}
