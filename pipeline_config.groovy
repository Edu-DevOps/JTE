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

steps{
    unit_test{
        stage = "Unit Test"
        image = "maven"
        command = "echo 'TESTING'"
    }
}
