pipeline {
    agent { label 'linux' }
    options {
        buildDiscarder(logRotator(numTokeepStr:'5'))    
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

