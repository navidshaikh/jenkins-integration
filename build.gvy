#!groovy

pipeline {
    agent {
        node {
            label 'master'
        }
    }
    stages {
        stage("test") {
            steps {
              script {
                  checkout scm
                  sh "env"
              }
        }
     }
}
}
          
