pipeline{
    agent any
    tools {
        maven 'maven3'
        jdk 'jdk10'
    }
       stages {
           stage('build'){
               steps{
                   echo " Building the maven project"
                   sh  'mvn compile'
               }
               
           }   
           
      stage('test'){
               steps{
                   echo " test the maven project"
                   sh  'mvn test'
               }
               
           }   
    }
}
