void call(app_env){
  stage('Deploying to ${app_env}'){
    echo "Im deploying to ${app_env.eks_cluster} cluster."
  }
}
