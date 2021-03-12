#!/usr/bin/env groovy

if (env.jobType == "pipeline") {
    echo 'Pipeline steps called'
} else if (env.jobType == "production") {
    echo 'Production steps called'
} else {
    echo 'Pull Request steps called!'
    stage("Build PR") {
        sh "echo Maven Version && mvn --version"
        sh "echo Java Version && java -version"
        sh "mvn clean install"
    }
}