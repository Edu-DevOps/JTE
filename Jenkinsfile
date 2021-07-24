pipeline{
  environment{
    MYVAR = "text from my variable"
  }
  agent any
  stages{
    stage('build'){
      steps{
        script{
          build()
        }
      }
    }
  }
}
