# 
# First set a config and key file containing credentials.
# Run: wlst src/main/wlst/setupCredentials.py http://wls:7001
# 
#Then you can run a deploy with:
# 
import sys

configFile='./src/main/wlst/.config'
keyFile='./src/main/wlst/.key'
adminUrl=sys.argv[1]

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

connect(userConfigFile=configFile, userKeyFile=keyFile, url=adminUrl)
stopAndUndeploy()
deployAndStart()
disconnect()
exit()
