void call(){
  stage('my stage'){
    node{
      echo "building from echo groovy"
      println "building from groovy"
    }
  }
}
