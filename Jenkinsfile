pipeline{
    agent any
    
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
