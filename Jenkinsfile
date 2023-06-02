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
}
