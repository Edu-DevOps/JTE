void call(){
  stage('my stage'){
    steps{
      script(
        //echo "building from echo groovy"
        sh "echo 'building from groovy'"
      )
    }
  }
}
