
username='weblogic'
password='Welkom01'
adminUrl='http://localhost:7001'

deploymentName='jackson-project'
deploymentTarget='cluster_wls'
deploymentFile='target/jackson-project-0.0.1-SNAPSHOT.war'

def stopAndUndeploy():
    try:
        stopApplication(deploymentName, targets=deploymentTarget)
        undeploy(deploymentName, targets=deploymentTarget)
    except:
        print 'Failed to undeploy application'

def deployAndStart():
    try:
        deploy(deploymentName, deploymentFile, targets=deploymentTarget, upload='true')
        startApplication(deploymentName)
    except:
        print 'Failed to deploy application'


connect(username, password, adminUrl)
stopAndUndeploy()
deployAndStart()
disconnect()
exit()
