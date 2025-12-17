pipeline {
    agent {
        docker {
            image 'docker:24.0.5'
            args '--entrypoint="" -u root -v /var/run/docker.sock:/var/run/docker.sock'
        }
    }

    environment {
        DOCKER_CONFIG = "${WORKSPACE}/.docker"
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
                    mkdir -p $DOCKER_CONFIG
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
            echo "✅ Jenkins + Docker pipeline executed successfully"
        }
        failure {
            echo "❌ Pipeline failed"
        }
    }
}
