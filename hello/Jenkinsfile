pipeline {
    agent {
        docker {
            image 'docker:24.0.5'
            args '--entrypoint="" -v /var/run/docker.sock:/var/run/docker.sock'
        }
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('hello-world') {
                    sh '''
                    docker build -t hello-java-app .
                    '''
                }
            }
        }

        stage('Run Java Application') {
            steps {
                sh '''
                docker run --rm hello-java-app
                '''
            }
        }
    }

    post {
        success {
            echo "✅ Java Hello World executed successfully inside Docker"
        }
        failure {
            echo "❌ Pipeline failed"
        }
    }
}
