# PanathonExampleMaterials
  * This repo contains materials to setup an environment for a demonstration that is to take place in [Panathon](https://2019.ecoop.org/home/panathon-2019) session 3. This demo showcases an integration of [CogniCrypt](https://github.com/CROSSINGTUD/CryptoAnalysis) and [OpenJ9](https://github.com/eclipse/openj9) that delivers dynamicism to a popular static analysis tool, as well as Crypto-API security to a well known JVM environment.
  * This demo relies upon [docker](https://www.docker.com/resources/what-container) in order to provide a standard self contained demo environment
  * New to docker? Docker commands relevant to the demo can be found [here](https://github.com/knewbury01/PanathonExampleMaterials/blob/master/DockerTutorial.md)
  * The configuration of the DockerfileCogni file is (Architecture)x86_64, (OS) UBUNTU 18.04, but see [this](https://github.com/knewbury01/PanathonExampleMaterials/blob/master/DockerTutorial.md#docker-macwindows-installation-resources) note for x86_64 machines running other OS's.
  
## Demo Instructions:

### Setup:
  * first we want to build the environment for the demonstration. This should be done with the following commands:

```
   docker build -t openj9-jdk8-extended -f DockerfileCogni .
   docker run --name=PanathonDemo -it openj9-jdk8-extended
```
