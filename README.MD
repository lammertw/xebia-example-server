# API template
Voer in de root van het project uit: ``./gradlew createApi -PapiName=ExampleAPI -PpackageName=example``
Je krijgt dan een nieuw project dat je meteen kunt runnen.


Hierin zit:
- meest gebruikte dependencies
- 404.html
- Hystrix request filter voor monitoring
- logback configuratie voor verschillende omgevingen (lokaal, acc, prod) inclusief Kibana configuratie
- configuratie framework voor verschillende omgevingen
- BootListener welke configuratie/omgeving configureert
- HealthResource
- Basic auth op Hystrix stream
- Swagger
- AWS extensions voor: basic auth en gzip op Apache
- AWS create application scripts voor acc/prod
- Root Application resource