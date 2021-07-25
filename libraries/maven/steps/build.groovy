void call(String message){
  stage('my stage'){
    node{
      echo "building from echo groovy with my ${message}"
    }
  }
}
