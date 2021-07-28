#!groovy

pipeline {
    agent {
        node {
            label 'master'
        }
    }
    parameters {
        string(description: 'test_param', name: 'TEST', defaultValue: 'test value 1')
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
          
