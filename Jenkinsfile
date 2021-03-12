#!/usr/bin/env groovy
node('jdk11') {
    if (env.jobType == "pipeline") {
        echo 'Pipeline steps called'
    } else if (env.jobType == "production") {
        echo 'Production steps called'
    } else {
        echo 'Pull Request steps called!'
        stage("Unit Test") {
            sh "echo Maven Version && mvn --version"
            sh "echo Java Version && java -version"
        }
    }
}
