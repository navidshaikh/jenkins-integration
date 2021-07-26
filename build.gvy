#!groovy

pipeline {
    agent {
        node {
            master
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
          
