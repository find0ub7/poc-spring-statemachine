#!/usr/bin/env groovy
node {
    if (env.jobType == "pipeline") {
        echo 'Pipeline steps called'
    } else if (env.jobType == "production") {
        echo 'Production steps called'
    } else {
        echo 'Pull Request steps called!'
        stage("Unit Test") {
            sh "export MAVEN_HOME=/opt/maven
            sh "export PATH=$PATH:$MAVEN_HOME/bin"
            sh "echo Maven Version && mvn --version"
            sh "echo Java Version && java -version"
        }
    }
}
