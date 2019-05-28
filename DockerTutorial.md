# Quick Docker Tutorial:

  ### Terminology:
    * Image: a file that specifies instructions for creating a docker container
    * Container: an (running or not) instance of an image
  ### Other Resources:
  * A more detailed overview Docker concepts can be found in the [Docker docs](https://docs.docker.com/engine/docker-overview/)
  * This is just the tip of the iceberg! More Docker commands can be found [here](https://docs.docker.com/engine/reference/commandline/docker/)
  * Another docker tutorial can also be found [here](https://github.com/docker/labs/tree/master/beginner/)
  ### Docker Mac Installation Resources:
  * Docker for Mac (aka Docker Desktop) can be installed from [here](https://hub.docker.com/editions/community/docker-ce-desktop-mac) or using steps listed [here](https://stackoverflow.com/questions/40523307/brew-install-docker-does-not-include-docker-engine/43365425#43365425)

## Docker Commands:
  * The `docker run` command in the setup step will start the docker image in interactive mode. However one may wish to 1) print information about the docker images and containers once they are setup 2) exit, 3) restart, 4) deattach, 5) reattach to a container

### 1. Print Docker Info
  ```docker images```


will list all of the images available


```docker ps -as```


will list all of the containers (both running and not, as we
ll as their size)


```docker ps```


will only list the running containers.
  all of the above commands will also provide the container and image ids fo
r the docker entities present.

### 2. Exit Container:
  ```exit```


when in an interactive docker session this command will terminate the running process.
  
### 3. Restart Container:
  ```docker start <Container-ID>```


will start a stopped container


```docker start -ai <Container-ID>```


can be used to both start and attach at the same time.

### 4. Dettach from Container:
  The escape sequence:


```Ctrl-p , Ctrl-q```


dettachs from a container (this will leave the container running)

### 5. Reattach to Container:
```docker attach <Container-ID>```


attachs to a running container
  
## Cleanup
  * After the session you may choose to remove the docker images and containers that were setup. This can be done with the following:

To remove a container:
```
   docker rm <Container-ID>
```  
To remove an image:
```
   docker rmi <Image-ID>
```

  * If the `docker build ...` step of the demo setup fails, beware that a container and an image will be leftover from the attempt. If this occurs let us know, and we will remedy the error, however you will likely wish to cleanup the image/container from the corresponding failed build attempt.