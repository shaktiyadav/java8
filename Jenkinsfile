def workspace;
node {
   stage('Checkout') {
       checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/AuthorizeNet/sample-code-java.git']]])
        workspace =pwd()
   }
   stage('Code Static') {
        echo " Code stitc"
    }
   stage('UT test Case') {
        echo " UT test Case"
    }
    
   stage('Docker build') {
        echo " Code stitc"
    }
    
   stage('Deployment') {
        echo " Code stitc"
    }
    
    
}