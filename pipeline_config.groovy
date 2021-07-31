libraries{
  merge = true
  ansible{
    deploy_to
  }
}

application_environments{
  dev{
    eks_cluster = "eks_lab01"
  }
  pre{
    eks_cluster = "eks_pre"
  }
}
