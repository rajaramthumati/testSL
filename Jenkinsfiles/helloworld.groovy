@Library('testSL@master') _

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                HelloWorld 'testing'
            }
        }
    }
}
