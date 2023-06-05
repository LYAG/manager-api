pipeline {
    agent { label 'linux' }
    options {
        builDiscarder(logRotator(numTokeepStr:'5'))    
    }
    
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
                withSonarQubeEnv(installationName: 'sq1') {
                    sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar'
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
