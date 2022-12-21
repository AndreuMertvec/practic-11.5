pipeline {
    agent {label 'docker'}
    stages {
        stage('check-site'){
            steps {
                script{
                    sh './scripts/check-site.sh'
                }
            }
        }
    }
    post {
        failure {
            mail to: 'kirill.tokar2014@yandex.ru',
            subject: "Pipeline failed: ${currentBuild.fullDisplayName}",
            body: "Build failed ${env.BUILD_URL}"
        }
    }
}
