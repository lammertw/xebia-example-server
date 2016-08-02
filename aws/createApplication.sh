if [ $# -eq 1 ]
then
    aws elasticbeanstalk create-application --application-name $1
else
    echo "Please specify the application name, for example: aws elasticbeanstalk create-application --application-name "XebiaExampleAPI""
fi