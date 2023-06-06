pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr:'5'))    
    }
  
        stages {
          stage ('Test with SonarQube'){
            steps {
                withSonarQubeEnv(installationName: 'sq1') {
                    sh './mvnw clean org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
                }
            }
            }
        }
    }

