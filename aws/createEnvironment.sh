if [ $# -eq 3 ]
then
    aws elasticbeanstalk create-environment --application-name "XebiaExampleAPI" --environment-name $1 --version-label $2 --solution-stack-name "64bit Amazon Linux 2015.09 v2.1.3 running Tomcat 8 Java 8" --option-settings $3
else
    echo "Please add the environment name, application version label and config file label as arguments, example: ./createEnvironment com.xebia.example-acc com.xebia.example-v1 file://accept/config.json"
fi