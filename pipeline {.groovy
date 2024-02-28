pipeline {
    agent {
        label 'Agent2'
    }
    stages{
        stage("git pull"){
            steps{
                git ''
                sh'''sudo bash ./nginx-.sh'''
            }
        }
    }
}