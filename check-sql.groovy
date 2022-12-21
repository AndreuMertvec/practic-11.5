pipeline {
    agent any
    stages {
        stage('TEST'){
            steps {
                script{
                    sh "./sql-request.sh"
                }
            }
        }
    }
}
