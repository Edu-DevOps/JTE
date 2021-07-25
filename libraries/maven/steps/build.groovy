void call(){
  stage('my stage'){
    node{
      echo "building from echo groovy with my ${config.message}"
    }
  }
}
