# PanathonExampleMaterials
  * This repo contains some materials to setu an environment for a demonstration that is to take place in [Panathon](https://2019.ecoop.org/home/panathon-2019) session 3, which focuses on demonstrating the integration of [CogniCrypt](https://github.com/CROSSINGTUD/CryptoAnalysis) and [OpenJ9](https://github.com/eclipse/openj9)
  * This demo relies upon [docker](https://www.docker.com/resources/what-container) in order to provide a standard self contained demo environment
  * The configuration of the DockerfileCogni file is (Architecture)x86_64, (OS) UBUNTU 18.04

## Demo Instructions:

### Setup:
  * first we want to build the environment for the demonstration. This should be done with the following commands:

```
   docker build -t openj9-jdk8-extended -f DockerfileCogni .
   docker run --name=PanathonDemo -it openj9-jdk8-extended
```

## Quick Docker Info:

  * Terminology:
    * Image: a file that specifies instructions for creating a docker container
    * Container: an (running or not) instance of an image
  * A more detailed overview can be found in the [Docker docs](https://docs.docker.com/engine/docker-overview/)

### Docker Commands:
  * The `docker run` command in the setup step will start the docker image in interactive mode. However one may wish to 1) exit, 2) restart, 3) deattach, 4) reattach to a container, and 5) print information about the docker images and containers.

1) when in an interactive docker session simply type `exit` to terminate the running process.
  
2) `docker start <Container-ID>` will start the container, however `docker start -ai <Container-ID>` can be used to both start and attach at the same time.

3)

4) docker attach <Container-ID>

5) `docker images` will list all of the images available
   `docker ps -as` will list all of the containers (both running and not, as well as their size)
   `docker ps` will only list the running containers.


### Cleanup:
  * After the session you may choose to remove the docker images and containers that were setup. This can be done with the following:

To remove a container:
```
   docker rm <Container-ID>
```  
To remove an image:
```
   docker rmi <Image-ID>
```